package com.capgemini.usercart.controller;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
import com.capgemini.usercart.model.UserCartModel;
import com.capgemini.usercart.services.DeleteProductCartService;

/**
 * The class <code>UserCartDelteProductControllerTest</code> contains tests for the class <code>{@link UserCartDelteProductController}</code>.
 *
 * @generatedBy CodePro at 1/30/18 10:28 AM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class UserCartDelteProductControllerTest {
	
	
	@InjectMocks
	UserCartDelteProductController userCartDelteProductController;
	
	
	@Mock
	DeleteProductCartService deleteProductCartService;
	

	 @Before
	    public void setupMock() {
	        MockitoAnnotations.initMocks(this);
	    }
	

	
	@Test
	public void testDeleteProduct_1()
		throws Exception {
		
		  Mockito.when(deleteProductCartService.deleteProduct(Mockito.isA(String.class),Mockito.isA(String.class))).thenReturn(new UserCartModel());

		  UserCartModel userCartModel = userCartDelteProductController.deleteProduct("xyz","abc");
		  assertNotNull(userCartModel);
		//  assertEquals(null, userCartModel);
	}

	
}