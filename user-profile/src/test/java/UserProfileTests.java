import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.userprofile.User;
import com.cg.userprofile.controller.UserProfileController;

public class UserProfileTests {
	@Autowired
	UserProfileController userController;
	
	@Test
	public void testAdduser()
	{
		User user =new User();
		user.setFirstName("shah");
		
		User user1= userController.createUser(user);
		assertEquals(user.getFirstName(), user1.getFirstName());
	}
	

	@Test
	public void testFindbyId()
	{
		User user =new User();
		user.setFirstName("shah");
		
		User user1= userController.createUser(user);
		//User user2= userController.getUserById(String.valueOf(user1.getUserId()));
		//assertEquals(user.getFirstName(),user2.getFirstName());
	}
	
	@Test
	public void testCredit() {
		
		User user = new User();
		user.setBalance(1000);
		
		User user1= userController.createUser(user);
		User user2= userController.credit(String.valueOf(user1.getUserId()), "500");
		assertEquals(1500, user2.getBalance());
	}
	
	@Test
	public void testDebit() {
		
		User user = new User();
		user.setBalance(200);
		User user1 = userController.createUser(user);
		User user2 = userController.debit(String.valueOf(user1.getUserId()), "150");
		assertEquals(50, user2.getBalance());
	}
	
}
