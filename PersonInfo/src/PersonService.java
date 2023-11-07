
public class PersonService {
//	declaration of the variable 
	private int id;
	private String ename;
	private int salary;
	private int mobnum;
	
// declaration of the default constructor
	public PersonService() {
//		id=0;
//		ename=null;
//		salary=0;
//		mobnum=0;
		this(0,null,0,0);
	}
// declaration of the constructor
	public PersonService(int id,String ename,int salary,int mobnum) {
		this.id=id;
		this.ename=ename;
		this.salary=salary;
		this.mobnum=mobnum;
		
	}
// setter method
	public void setId(int id) {
		this.id=id;
	}
	public void setename(String ename) {
		this.ename=ename;
	}
	public void setsalary(int salary) {
		this.salary=salary;
	}
	public void setmobnum(int mobnum) {
		this.mobnum=mobnum;
	}
// getter method
	
	public int getId() {
		 return id;
	}
	public String getename() {
		return ename;
	}
	public int getsalary() {
		return salary;
	}
	public int getmobnum() {
		return mobnum;
	}
	
// to string 
	public String toString() {
		return "id:"+this.id+"\nename:"+this.ename+"\nsalary:"+this.salary+"\nmobnum:"+this.mobnum ;
	}
}
	


