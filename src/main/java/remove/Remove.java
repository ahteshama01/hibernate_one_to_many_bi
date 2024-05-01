package remove;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import EntityClass.Author;
import EntityClass.Book;

public class Remove {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_one_to_many_bi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Book b=em.find(Book.class, 103);
		Author a= b.getAuthor();
		List<Book> books=a.getBooks();
		
		Iterator<Book> itr=books.iterator();
		
		while(itr.hasNext()) {
			Book temp=itr.next();
			if(temp.getId()==103) {
				itr.remove();
			}
		}
		
		et.begin();
		em.merge(a);
		em.remove(b);
		et.commit();
	}
}
