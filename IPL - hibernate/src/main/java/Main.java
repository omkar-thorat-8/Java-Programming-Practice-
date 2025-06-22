import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Player> players = new HashSet();
		
		Team t1 = new Team(1,"RCB",players);
		
		Player p1 = new Player(1,"Virat Kohli",18,t1);
		Player p2 = new Player(2,"Bhuvi Kumar",30,t1);
		
		t1.getAllPlayers().add(p1);
		t1.getAllPlayers().add(p2);
		System.out.println(t1.getAllPlayers().size());
		
		Session session = new Configuration().configure("config.xml").buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		//session.persist(t1);
		
		Team team1 = session.getReference(Team.class,1);
		//System.out.println(t.getAllPlayers().stream().toList().);
		
		System.out.println(team1);
		transaction.commit();
		session.close();
	}

}
