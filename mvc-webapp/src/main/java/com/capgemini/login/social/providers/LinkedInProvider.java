package com.capgemini.login.social.providers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.linkedin.api.LinkedIn;
import org.springframework.social.linkedin.api.LinkedInProfileFull;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.capgemini.bean.Catalog;
import com.capgemini.bean.UseDetails;
import com.capgemini.login.model.UserBean;
import com.capgemini.serviceimpl.CartServiceimpl;

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

	
	public String getLinkedInUserData(Model model, UserBean userForm) {

		ConnectionRepository connectionRepository = socialLoginBean.getConnectionRepository();
		if (connectionRepository.findPrimaryConnection(LinkedIn.class) == null) {
			return REDIRECT_LOGIN;
		}
		populateUserDetailsFromLinkedIn(userForm);
		Collection<Catalog> cat = cartServiceimpl.getDetails();
		model.addAttribute("catalog", cat);
		model.addAttribute("name", userForm.getFirstName());
		return "index";
	}

	private void populateUserDetailsFromLinkedIn(UserBean userForm) {
		LinkedIn linkedIn = socialLoginBean.getLinkedIn();
		LinkedInProfileFull linkedInUser = linkedIn.profileOperations().getUserProfileFull();
		userForm.setEmail(linkedInUser.getEmailAddress());
		userForm.setFirstName(linkedInUser.getFirstName());
		userForm.setLastName(linkedInUser.getLastName());
		userForm.setImage(linkedInUser.getProfilePictureUrl());
		userForm.setProvider(LINKED_IN);
	}

}
