import java.util.Scanner;
public class TeamService {
	

		static Team[] tarr;
		static int cnt;
		
		static {
			tarr=new Team[10];
			cnt=0;
		}
		
		public static void addnewteam() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enetr TeamNo");
			int tno=sc.nextInt();
			sc.nextLine();
			System.out.println("enter Team's Name");
			String tname=sc.nextLine();
			//accept captain details
			System.out.println("captain's player number");
			int pno=sc.nextInt();
			sc.nextLine();
			System.out.println("enter caption's name");
			String pname=sc.nextLine();
			System.out.println("enter skill");
			String skill=sc.nextLine();
			Player c=new Player(pno,pname,skill);

			Player[] plist=new Player[3];
			for(int i=0;i<plist.length;i++) {
				System.out.println("player number");
				pno=sc.nextInt();
				sc.nextLine();
				System.out.println("enter player name");
				pname=sc.nextLine();
				
				System.out.println("enter skill");
				skill=sc.nextLine();
				plist[i]=new Player(pno,pname,skill);
			}
			tarr[cnt]=new Team(tno,tname,c,plist);
			cnt++;
			
		}
		public static void displayall() {
			for(int i=0;i<cnt;i++) {
				System.out.println(tarr[i]);
			}
			
		}
		public static Team searchByCName(String nm) {
			for(int i=0;i<cnt;i++) {
				
				Player c=tarr[i].getCaptain();
				if(c.getPname().equals(nm)) {
					return tarr[i];
				}
			}
			return null;
		}
		public static Team searchByPlayerName(String nm) {
			for(int i=0;i<cnt;i++) {
				
				Player[] parr=tarr[i].getPlist();
				for(int j=0;j<parr.length;j++) {
					if(parr[i].getPname().equals(nm)) {
						return tarr[i];
					}
				}
				
			}
			return null;
		}

	}

