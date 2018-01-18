package com.cg.userprofile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.userprofile.controller.UserProfileController;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class UserProfileTests {
	
	@Value("classpath:unit.json")
	private Resource addUser;
	
	@Value("classpath:unit1.json")
	private Resource userById;
	
	@Value("classpath:unit2.json")
	private Resource creditAmount;
	
	@Value("classpath:unit3.json")
	private Resource debitAmount;
	
	@Autowired
	private UserProfileController upcontrol;
	
	ObjectMapper objmapper=new ObjectMapper();
	
	Gson gson = new Gson();
	
	//@Test
	public void testAddUsers() throws JSONException {
		
		User user=new User();
		user.setFirstName("Bala");
		user.setLastName("Bharath");
		//user.setEmail("gbbr@gmail.com");
		user.setBalance(200);
		user.setMobileNo("9492080475");
		user.setRole("user");
		
		User user1=upcontrol.createUser(user);
		
		File file=new File("classpath:unit.json");
		try {
			objmapper.writeValue(file, user1);
		} catch (JsonGenerationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonMappingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			String str1=new String(Files.readAllBytes(addUser.getFile().toPath()));
			String str2= gson.toJson(user1);
			JSONAssert.assertEquals(new JSONObject(str1),new JSONObject(str2),true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//@Test
	/*public void testUserById() throws JSONException {
		User user = new User();
		user.setFirstName("Nathan");
		user.setLastName("Lyon");
		user.setEmail("lyon@gmail.com");
		user.setBalance(200);
		user.setMobileNo("9994080482");
		user.setRole("user");
		User user1=upcontrol.createUser(user);
		
		File file=new File("classpath:unit1.json");
		try {
			objmapper.writeValue(file, user1);
		} catch (JsonGenerationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonMappingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		User user2=upcontrol.getUserById(String.valueOf(user1.getUserId()));
		try {
			String str1 = new String(Files.readAllBytes(userById.getFile().toPath()));
			String str2= gson.toJson(user2);
			JSONAssert.assertEquals(new JSONObject(str1), new JSONObject(str2), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	//@Test
	public void testCreditAmount() throws JSONException {
		
		User user = new User();
		user.setFirstName("shahul");
		user.setLastName("hameed");
		//user.setEmail("shahul@gmail.com");
		user.setBalance(100);
		user.setMobileNo("8457902231");
		user.setRole("user");
		
		User user1 = upcontrol.createUser(user);
		
		File file=new File("classpath:unit2.json");
		try {
			objmapper.writeValue(file, user1);
		} catch (JsonGenerationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonMappingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			User user2=upcontrol.credit(String.valueOf(user1.getUserId()),"100");
			String str1 = new String(Files.readAllBytes(creditAmount.getFile().toPath()));
			String str2= gson.toJson(user2);
			JSONAssert.assertEquals(new JSONObject(str1), new JSONObject(str2), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//@Test
	public void testDebitAmount() throws JSONException {
		
		User user = new User();
		user.setFirstName("Rama");
		user.setLastName("Sumanth");
		//user.setEmail("sumanth@gmail.com");
		user.setBalance(300);
		user.setMobileNo("7638293317");
		user.setRole("user");
		
		User user1 = upcontrol.createUser(user);
		
		File file=new File("classpath:unit3.json");
		System.out.println("path="+file.getAbsolutePath());
		try {
			objmapper.writeValue(file, user1);
		} catch (JsonGenerationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonMappingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			User user2=upcontrol.credit(String.valueOf(user1.getUserId()),"100");
			String str1 = new String(Files.readAllBytes(debitAmount.getFile().toPath()));
			String str2= gson.toJson(user2);
			JSONAssert.assertEquals(new JSONObject(str1), new JSONObject(str2), true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}