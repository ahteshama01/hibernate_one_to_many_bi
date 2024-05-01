package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import EntityClass.Author1;
import EntityClass.Book1;

public class insert1 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_one_to_many_bi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Book1 b1=new Book1(101,"Book1",145.50);
		Book1 b2=new Book1(102,"Book2",221);
		Book1 b3=new Book1(103,"Book3",160);
		
		Author1 a1=new Author1(1,"Rahul");
		Author1 a2=new Author1(2,"Bhagat");
		
		b1.setAuthor(a1);
		b2.setAuthor(a1);
		b3.setAuthor(a2);
		
		et.begin();
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		em.persist(a1);
		em.persist(a2);
		et.commit();
		
	}
}
