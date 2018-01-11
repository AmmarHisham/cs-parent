package com.capgemini.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dimehta
 *
 */
@RestController
public class RedisController {

	@Autowired
	// ClickStreamServiceImpl clickStreamServiceImpl;

	@RequestMapping(value = "/searchuser", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")

	public String saveUrl(@RequestBody UserUrl userUrl) {
		// clickStreamServiceImpl.saveUrl(userId,url);
		return null;

	}

}
