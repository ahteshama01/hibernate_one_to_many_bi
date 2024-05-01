package fetch;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import EntityClass.Author;
import EntityClass.Book;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_one_to_many_bi");
		EntityManager em=emf.createEntityManager();
		
		Author a=em.find(Author.class, 2);
			List<Book> books=a.getBooks();
				
				for(Book b:books) {
				System.out.println(b);
				
				}
		Book b=em.find(Book.class, 102);
			Author a1=b.getAuthor();
			System.out.println(b);
			System.out.println(a1);
	}
}
