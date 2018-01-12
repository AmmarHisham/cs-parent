package com.capgemini.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.services.ClickStreamServiceImpl;

/**
 * @author dimehta
 *
 */
@RestController
public class RedisController {
	
	@Autowired
	ClickStreamServiceImpl clickStreamServiceImpl;
	@RequestMapping(value = "/saveUrl", method = RequestMethod.POST, produces = "application/json")
	public void saveUrl(@RequestParam (value="userId") String userId,@RequestParam (value="userUrl") String userUrl) {
		clickStreamServiceImpl.saveUrl(userId, userUrl);
		System.out.println(userId);
		System.out.println(userUrl);

	}
	@RequestMapping(value = "/getById", method = RequestMethod.GET, produces = "application/json",consumes = "application/*")
	public void getByUserId(@RequestParam (value="userId") String userId) {
		System.out.println(userId);
		clickStreamServiceImpl.getByUserId(userId);
		//return null;

	}
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json",consumes = "application/json")
	public String getAllUser() {
		System.out.println("hello");
		System.out.println("hello");
		return null;
	}
		
}
