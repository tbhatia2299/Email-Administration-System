package emailapp;
import java.util.Scanner;

public class Email{
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private String companySuffix="company.com";
	private int mailboxCapacity=525;
	private int defaultPasswordLength=8;
	private String alternateEmail;



	public Email (String firstName, String lastName){
		this.firstName= firstName;
		this.lastName= lastName;
		System.out.println("Email Created: "+this.firstName + this.lastName);

		this.department= setDepartment();
		System.out.println("Department: " + this.department);
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Password is: " + this.password);

		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;

	}
	private String setDepartment(){
		System.out.print("Enter the department\n1 for Sales\n2 for development\n3 for Accounting\n0 for none\n Enter Department code: ");
		Scanner in =new Scanner(System.in);
		int depChoice=in.nextInt();
		if (depChoice==1){return "Sales";}
		else if (depChoice==2){return "dev";}
		else if (depChoice==3){return "acct";}
		else {return "";}

	}
	private String randomPassword(int length){
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ@$%&*!";
		char[] password= new char[length];
		for(int i=0;i<length;i++){
			int rand =(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);

	}
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity=capacity;

	
	}
	public void setAlternateEmail(String AltEmail){

		this.alternateEmail=AltEmail;
	
	}

	public void ChangePassword(String Password){
		this.password=Password;
	
	}

	public int getMailboxCapacity(){
		return mailboxCapacity;
	
	}
	public String getAlternateEmail(){
		return alternateEmail;
	}
	public String getPassword{
		return password;
	
	}
	public String showInfor(){
		return "Display Name"+ firstName+ " " + lastName + " " + "Company Email"+ email + " "+ "Mailbox Capacity"+ mailboxCapacity;
	}









}

