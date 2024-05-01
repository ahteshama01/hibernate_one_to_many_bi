package EntityClass;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Author1 {
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy="author")
	private List<Book1> books;

	public Author1() {
		
	}

	public Author1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book1> getBooks() {
		return books;
	}

	public void setBooks(List<Book1> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author1 [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
