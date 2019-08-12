package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("Shivam", "Gupta");

//		em1.setMailBoxCapacity(100);
//		System.out.println(em1.getMailBoxCapacity());
//		
//		em1.setAlternateEmail("shivamgupta@gmail.com");
//		System.out.println(em1.getAlternateEmail());
// 		
//		em1.changePassword("1122334455");
//		System.out.println(em1.getPassword());
		
		System.out.println(em1.showInfo());
		

		Email em2 = new Email("Ayushi", "Gupta");
		System.out.println(em2.showInfo());

	}

}
