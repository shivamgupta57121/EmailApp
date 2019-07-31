package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "selfapp.com";
	
	//Constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
//		System.out.println("Email created : "+this.firstName+" "+this.lastName);
		
		//call a method asking for department and return department
		this.department = setDepartment();
		
		System.out.println("Department : "+this.department);
		
		//call a method that returns a random password 
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password : "+this.password);
		
		//combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix.toLowerCase();

//		System.out.println("Your email is : "+email);

	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("DERARTMENT CODES\n1 for sales \n2 for Development\n3 for Accounting\n0 for None\nEnter department code : ");
		Scanner in = new Scanner(System.in);
		int deptCh = in.nextInt();
		
		if(deptCh==1)  return "sales";
		else if(deptCh==2) return "dev";
		else if(deptCh==3) return "acc";
		else return "";
		
//		String r="";
//		switch (in.nextInt()) {
//			case 1: r="sales";break;
//			case 2: r="dev";break;
//			case 3: r="acc";break;
//			case 0: r="";
//		}
//		return r;
		
		
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity 
	public void setMailBoxCapacity(int capacity){
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	public String showInfo() {
		return "DISPLAY NAME : " + firstName + " " + lastName +
				"\nCOMPANY EMAIL : " + email +
				"\nMAILBOX CAPACITY : " + mailboxCapacity + " MB";
	}
	
}
