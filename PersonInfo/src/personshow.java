import java.util.Scanner;

public class personshow {
	static PersonService[] parr;
	static int cnt=0;
	static {
		parr=new PersonService[10];
		 
	}
//addnewperson------------------------------------------------
	public static void addNewPerson()
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the person name");
		String ename=sc.nextLine();
		System.out.println("enter salary of person");
		int salary=sc.nextInt();
		System.out.println("enter mobnum of person");
		int mobnum=sc.nextInt();
		parr[cnt]=new PersonService(id,ename,salary,mobnum);
		cnt++;
	}
//display-------------------------------------------
	public static void display() {
		for(int i=0;i<parr.length;i++) {
			System.out.println(parr[i]);
		}
	}
	
//	searchid------------------------------------------
	public static PersonService searchid(int id) {
		int i=0;
		for(i=0;i<parr.length;i++) {
			if(parr[i]!=null) {
			if(parr[i].getId()==id){
			return parr[i];
		   }
			
		}

			
	}
		 return null;
	}

//get name


public static PersonService getbyname(String ename) {
	int i=0;
	for(i=0;i<parr.length;i++) 
	{
		if(parr[i]!=null) 
		{
			if(parr[i].getename().equals(ename))
			{
				return parr[i];
	        }
		
	    }
		

	}
	 return null;
}
}

