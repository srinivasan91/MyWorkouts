package withoutLambda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product{
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

class NameComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.name.compareTo(p2.name);
	}
	
}

class IdComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
//		return p1.id == p2.id ? 0 : p1.id > p2.id ? 1 : -1;
		if(p1.id==p2.id)
			return 0;
		else if(p1.id>p2.id)
			return 1; 
		else  
			return -1;  
	}
	
}



public class WithoutLambdaComparator {
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		
		System.out.println("********Without Lambda********");

		// Adding Products
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 150f));

		System.out.println("Sorting on the basis of name...");

		// implementing lambda expression using name comparator
		Collections.sort(list, new NameComparator());
		
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
		
		System.out.println("**********************************************");
		
		// implementing lambda expression using ID Comparator
		Collections.sort(list, new IdComparator());
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
		

	}
}