
public class test_Login {

	public static void main(String[] args) {

		Login l1 = new Login();
		Login l2 = new Login();
		
		
		l1.setMeuLogin("luana00", "luana@56569" , "444");
		
		System.out.println(l1.getName());
		System.out.println(l1.getLogin());
		System.out.println(l1.getSenha());
		
		
		l2.setMeuLogin("luana001", "luana@5656592" , "444777");
		
		System.out.println(l2.getName());
		System.out.println(l2.getLogin());
		System.out.println(l2.getSenha());
		
		l1.authentic("l", "444");
		l2.authentic("luana@5656592", "444777");
	}

}

