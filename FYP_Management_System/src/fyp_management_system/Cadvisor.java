package fyp_management_system;
import java.io.Serializable;
import static java.time.Clock.system;
import java.util.ArrayList;



public class Cadvisor extends Cperson implements Iadvisor
{
    
    private ArrayList<String> Cstudent;
	public final ArrayList<String> getstudents()
	{
		return Cstudent;
	}
       public Cadvisor(String f_name, String l_name, String address, String contact_num, java.time.LocalDateTime dob, String email, Egender gender, int cnic, String username, String pass)
       {
           setfirstname(f_name);
		setlastname(l_name);
		this.setaddress(address);
		setcontactnumber(contact_num);
		setDOB(dob);
		setEmail(email);
		this.setgemder(getgemder());
		this.setcnic(cnic);
		this.setusername(username);
		this.setpassword(pass);
       }
      private ArrayList<String> notifications;
       public final ArrayList<String> getnotifications()
	{
		return notifications;
	}
	public final void setnotifications(ArrayList<String> value)
	{
		notifications = value;
	}
       public final void AcceptP()
       { 
           System.out.println("Accept Project");
           //...
       }
       
       public final void RejectP()
       { 
           System.out.println("Reject Project");
           //...
       }
       public final void Recommends()
       { 
           System.out.println("Provide recommandation on selected projects");
           //...
       }
      // private Cinternal frwd;
       public final void  ForwardToInternal()
       { 
           //adding student in list of internal
       }
       public final void StudentDetail()
	{
		
		//view student details
	}
       public final void feedback()
	{
		
		//feedback on projects which work perfectly
	}
       public final void Meeting()
	{
		
		//qarrange meeting with students
	}
       public final void StudentPerformance()
	{
		
		//check students performance for giving deserving marks
	}
       
       
       
       

}