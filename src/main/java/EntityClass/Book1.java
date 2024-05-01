package EntityClass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book1 {
	@Id
	private int id;
	private String name;
	private double cost;
	@ManyToOne
	@JoinColumn
	private Author1 author;
	public Book1() {
		
	}
	public Book1(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Author1 getAuthor() {
		return author;
	}
	public void setAuthor(Author1 author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book1 [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
}
