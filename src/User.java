/**
 * represents a user of system(doctor / patient / researcher)
 * @author alireza
 * @version 1.0.0
 */
public class User {
	
	//oauth
	private String userName;
	private String password;
	
	private String firstName;
	private String lastName;
	
	//true if male
	private boolean gender;
	
	//type of degree
	private Degree degree;
	
	//geographical data
	private Region region;
	
	//all setter and getter methods for this user
	
	/**
	 * getting all personal information of this user
	 */
	@Override
	public String toString(){
		
	}
	
	
}
