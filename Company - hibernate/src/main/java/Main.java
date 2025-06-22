import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

//		// Create Configuration object and configure using hibernate.cfg.xml
//		Configuration configuration = new Configuration().configure();
//
//		// Build SessionFactory from the configuration
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//
//		// Open a new session from the SessionFactory
//		Session session = sessionFactory.openSession();

		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = new Admin(1,"A",50000,123);
		Employee e2 = new Hr(2,"B",40000,123);
		Employee e3 = new Sales(3,"C",30000,105);

		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		
		transaction.commit();
		session.close();
		
		
	}

}
