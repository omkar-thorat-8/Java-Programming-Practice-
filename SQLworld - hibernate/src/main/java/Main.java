import java.sql.Ref;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		//Section 1:JPA code (Java Persistence API)
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<City> jpaQuery = builder.createQuery(City.class);
		Root<City> base = jpaQuery.from(City.class);
		
		//select * from city
		jpaQuery.select(base); // This is NOT execution of the query
		
		//select * from city where population >10000
		//jpaQuery.select(base).where(builder.gt("population", 1000000));
		
		//select city ,countrycode from city
		//jpaQuery.multiselect(base.get("cityName"),base.get("code"));
		
		//Section 2 : Hibernate code
		
		Query<City> ormQuery = session.createQuery(jpaQuery);
		List<City> cities = ormQuery.getResultList(); // This is where the query will be execute
		
		for(City ref:cities)
		{
			System.out.println(ref.getName());
		}
		System.out.println("size :"+ cities.size());
		
	}

}
