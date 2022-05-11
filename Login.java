import java.util.*;
class Login{

	int count=0;
	static String username,password;
	Scanner sc=new Scanner(System.in);



	void adminLogin(){
		while(count<3){

			System.out.println("Enter username");
			username=sc.next();

			System.out.println("Enter password");
			password=sc.next();

			if(username.equals("admin")&&password.equals("12345678"))
				break;
			else {

				count++;
				System.out.println("wrong username or password");
				continue;

			}

		}
		if(count==3){

			System.out.println("You have completed your maximum attempts\ntry again later :)");
		}

		else{

			Admin a=new Admin();

		}


	}


	void userLogin(){

		while(count<3){

			System.out.println("Enter username");
			username=sc.next();

			System.out.println("Enter password");
			password=sc.next();

			if(username.length()<4||password.length()<8){
				System.out.println("username must be of 4 characters and password must be of 8 characters");
				count++;
				continue;

			}
			else {

				break;

			}
		}
		if(count==3){

			System.out.println("You have completed your maximum attempts\ntry again later :)");
		}
		else{

			User us=new User();

		}

		User.file(username);

	}
}