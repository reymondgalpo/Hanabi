package GalpoAndTubera;
import java.util.ArrayList;
public class PersonClass {
	private String username;
	private String password;
	private String person;
	
	public PersonClass(String username, String password, String person) {
		super();
		this.username = username;
		this.password = password;
		this.person = person;
	}

	public PersonClass(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}
	public static void add (ArrayList<PersonClass> userlist, PersonClass newUser) {
		userlist.add(newUser);
	}
	
	@Override
	public String toString() {
		return "PersonClass [username=" + username + ", password=" + password + ", person=" + person + "]";
	}
}
