import java.util.Scanner;

public class persondata {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();

		do {
			
		    personshow.addNewPerson();
		    i++;
		}while(i<4);
		personshow.display();
//		searchbyid
		PersonService ob=personshow.searchid(2);
		System.out.println(ob);
//		getbyname
		PersonService ob1=personshow.getbyname("tejal");
		System.out.println(ob1);
	}
	
	

   }
