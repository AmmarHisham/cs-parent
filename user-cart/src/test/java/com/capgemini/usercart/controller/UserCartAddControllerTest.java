
package com.capgemini.usercart.controller;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import com.capgemini.usercart.model.UserCartModel;
import com.capgemini.usercart.services.AddProductCartService;

/**
 * The class <code>UserCartAddControllerTest</code> contains tests for the class <code>{@link UserCartAddController}</code>.
 *
 * @generatedBy CodePro at 1/30/18 10:28 AM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class UserCartAddControllerTest {
	/**
	 * Run the UserCartAddController() constructor test.
	 *
	 * @generatedBy CodePro at 1/30/18 10:28 AM
	 */
	
	@InjectMocks
	UserCartAddController userCartAddController;
	

    @Mock
    AddProductCartService addProductCartService;
	
	
	 @Before
	    public void setupMock() {
	        MockitoAnnotations.initMocks(this);
	    }
	
	@Test
	public void testUserCartAddController_1()
		throws Exception {
		UserCartAddController result = new UserCartAddController();
		assertNotNull(result);
		// add additional test code here
	}

	
	@Test
	public void testCreate_1()
		throws Exception {
		
		  Mockito.when(addProductCartService.addProduct(Mockito.isA(String.class),Mockito.isA(String.class),Mockito.isA(String.class))).thenReturn(new UserCartModel());
		  UserCartModel userCartModel = userCartAddController.create("xyz", "abc", "3");
          assertNotNull(userCartModel);
	}

	
	
}
