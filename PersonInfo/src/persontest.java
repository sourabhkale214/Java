
public class persontest {

	public static void main(String[] args) {
          PersonService p1=new PersonService(1,"tejal",14500,43564);
          System.out.println(p1);
          PersonService p2=new PersonService();
          p2.setId(10);
          System.out.println(p2);
          System.out.println(p2.getId());

	}

}
