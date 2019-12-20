
import java.util.Scanner;

public class ProdMain {

	public static void main(String[] args) {
		long id;
		String productName;
		String supplierName;
		Scanner sc = new Scanner(System.in);
		ProdDetails pro = new ProdDetails();
		
		System.out.println("Enter the product id");
		id=Long.parseLong(sc.nextLine());
		pro.setId(id);
		
		System.out.println("Enter the product name");
		productName=sc.nextLine();
		pro.setProductName(productName);
		
		System.out.println("Enter the supplier name");
		supplierName=sc.nextLine();
		pro.setSupplierName(supplierName);
		
		pro.display();
		

	}

}

