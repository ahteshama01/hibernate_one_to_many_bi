package fetch;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import EntityClass.Author1;
import EntityClass.Book1;

public class Fetch1 {
		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_one_to_many_bi");
			EntityManager em=emf.createEntityManager();
			
			Author1 a=em.find(Author1.class, 1);
				List<Book1> books=a.getBooks();
				for(Book1 b:books) {
					System.out.println(b);
				}
		}
}
