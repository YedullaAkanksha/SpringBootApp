package demo.utils;

import java.util.List;
import demo.model.User;
public class UserDataUtils {
	public static List<User> getUsers(){
		List<User> users=new Arraylist<>();
		users.add(new User("john","wilson","j@123","1"));
		users.add(new User("Alex","will","a@123","2"));
		users.add(new User("Bin","gale","b@123","3"));
		return users;
	}

}
