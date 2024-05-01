package merge;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import EntityClass.Author;
import EntityClass.Book;

public class Update {
		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_one_to_many_bi");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			
			Author a=em.find(Author.class, 2);
			
			Book b=em.find(Book.class,105);
			
			a.getBooks().add(b);
			b.setAuthor(a);
			et.begin();
			em.merge(a);
			em.merge(b);
			et.commit();
		}
}
