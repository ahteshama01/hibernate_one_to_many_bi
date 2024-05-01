package remove;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import EntityClass.Author;
import EntityClass.Book;

public class RemoveAuthor {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_one_to_many_bi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	//with ID ?
	Author a=em.find(Author.class, 1);
	List<Book> books=a.getBooks();
	
	for(Book b:books) {
		b.setAuthor(null);
	}
	
	et.begin();
	for(Book b:books) {
		em.merge(b);
	}
	em.remove(a);
	et.commit();
	
}
}
