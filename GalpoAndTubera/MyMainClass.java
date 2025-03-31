package GalpoAndTubera;
import java.awt.EventQueue;
import java.util.ArrayList;
import MyFirstGUIGalpoTubera.PasswordWindow;
import MyFirstGUIGalpoTubera.SignUp;
public class MyMainClass {
	static ArrayList<PersonClass> userProfile;
	public static void main(String[] args) {
		userProfile = new ArrayList<PersonClass>();
		userProfile.add(new PersonClass("admin", 55));
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordWindow frame = new PasswordWindow(userProfile);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
