package productManagement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
	public static void productManagement() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------Welcome to Product Management----------");
		ArrayList<Product> productlist = new ArrayList<>();
		

		while (true) {
			System.out.println("what would you like to do today!!!");
			System.out.println("1.Add Product");
			System.out.println("2.Update Product");
			System.out.println("3.Delete Product");
			System.out.println("4.Search Product");
			System.out.println("5.Display Product");
			System.out.println("9.Quit");

			int option = sc.nextInt();
			switch (option) {
			case 1:
				Product product = new Product();
				System.out.println("\tEnter Product Name:");
				product.ProductName = sc.next();

				System.out.println("\tENter Product Quantity");
				product.Productquentity = sc.next();

				System.out.println("\tEnter Product Price:");
				product.ProductPrice = sc.next();

				productlist.add(product);
				break;
			case 2:
				System.out.println("Update Product To Be Implemented......");
				break;
			case 3:
				System.out.println("Delete Product:");
				System.out.println("Enter Nme to Delete:");
				String Remove = sc.next();

				for (int i = 0; i < productlist.size(); i++) {
					if (productlist.get(i).ProductName.equals(Remove)) {
						productlist.remove(i);
						System.out.println("Product Deleted Successfully.");

					}
				}
				break;
			case 4:
				System.out.println("Search Product");
				System.out.println("Enter product Name to Search");
				String ProductToSeaarch = sc.next();

				for (Product data : productlist) {
					if (data.ProductName.contains(ProductToSeaarch)) {
						System.out.println("Product Found Successfully");
						System.out.println("Product Name:" + data.ProductName);
						System.out.println("Product Price :" + data.ProductPrice);
						System.out.println("Product Quantity:" + data.Productquentity);

					} else {
						System.out.println("Product Not Found!");

					}
				}
				break;
			case 5:
				System.out.println("Print Product....\n");
				String Line = null;
				  {
					String[] str = Line.split(",");
					for (String data : str) {
						System.out.println(data);
					}
					System.out.println("product Name=" + str[0]);
					System.out.println("Product Price=" + str[1]);
					System.out.println("Product Quintity=" + str[2]);
					System.out.println("\n");

				}
				break;
			case 9:
				
				System.out.println("------Exit the Application------");
				return;
			default:
				System.out.println("Invalid Option");
			}
		}
	}
}
