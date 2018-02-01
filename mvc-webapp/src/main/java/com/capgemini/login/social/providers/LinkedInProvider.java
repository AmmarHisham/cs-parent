package com.capgemini.login.social.providers;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.linkedin.api.LinkedIn;
import org.springframework.social.linkedin.api.LinkedInProfileFull;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.capgemini.bean.ProductCatalog;
import com.capgemini.login.model.UserBean;
import com.capgemini.serviceimpl.CartServiceimpl;
import com.capgemini.serviceimpl.CatalogServiceImpl;

/**
 * @author dimehta
 *
 */
@Service
public class LinkedInProvider {

	private static final String LINKED_IN = "linkedIn";

	private static final String REDIRECT_LOGIN = "redirect:/login-auth";

	@Autowired
	BaseProvider socialLoginBean;
	@Autowired
	public CartServiceimpl cartServiceimpl;
	@Autowired
    public CatalogServiceImpl catalogService;
	
	UserBean userBean=new UserBean();
	

	
	public String getLinkedInUserData(Model model, UserBean userForm) {

		ConnectionRepository connectionRepository = socialLoginBean.getConnectionRepository();
		if (connectionRepository.findPrimaryConnection(LinkedIn.class) == null) {
			return REDIRECT_LOGIN;
		}
		populateUserDetailsFromLinkedIn(userForm);
		List<ProductCatalog> list=catalogService.getProduct();
		model.addAttribute("catalog", list);
		model.addAttribute("name", userForm.getFirstName());
		return "index";
	}

	public UserBean populateUserDetailsFromLinkedIn(UserBean userForm) {
		LinkedIn linkedIn = socialLoginBean.getLinkedIn();
		LinkedInProfileFull linkedInUser = linkedIn.profileOperations().getUserProfileFull();
		userForm.setEmail(linkedInUser.getEmailAddress());
		userForm.setFirstName(linkedInUser.getFirstName());
		userForm.setLastName(linkedInUser.getLastName());
		userForm.setProvider(LINKED_IN);
		return userForm;
	} 

		

}
