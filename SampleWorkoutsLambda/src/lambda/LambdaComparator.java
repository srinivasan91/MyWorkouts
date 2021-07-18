package lambda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}


public class LambdaComparator {
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();

		System.out.println("*********Using Lambda**********");

		// Adding Products
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 150f));

		System.out.println("Sorting on the basis of name...");

		// implementing lambda expression using name comparator
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
		
		System.out.println("**********************************************");
		System.out.println("Sorting on the basis of Id...");
		// implementing lambda expression using ID Comparator
		Collections.sort(list, (p1, p2) -> {
			return p1.id == p2.id ? 0 : p1.id > p2.id ? 1 : -1;
		});
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
		

	}
}