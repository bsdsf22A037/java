import java.util.*;
import javax.swing.JOptionPane;

public class Product {
	int productid;
    	String productName;
    	int quantity;
    	int price;

    	static Product[] inventory;  

    	public Product(int id, String name, int qty, int price) 
	{
        	this.productid = id;
        	this.productName = name;
        	this.quantity = qty;
        	this.price = price;
    	}

    	public static void main(String[] args) 
	{
        	int noOfProd = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of inventory: "));
        	inventory = new Product[noOfProd];

        	while (true) {
            		String choice = JOptionPane.showInputDialog("Choose an option:\n1. Add Product\n2. View Product\n3. Delete Product\n4. Update Product\n5. Exit");
            		switch (choice) 
			{
                		case "1":
                    			addProduct();
                    			break;
                		case "2":
                    			viewProduct();
                    			break;
                		case "3":
                    			delProduct();
                    			break;
                		case "4":
                    			updateProduct();
                    			break;
                		case "5":
                    			JOptionPane.showMessageDialog(null, "Byeeee");
                    			return;
                		default:
                    			JOptionPane.showMessageDialog(null, "Invalid choice! Try again.");
            		}
       		}
    	}

    	static void addProduct() 
	{
        	int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Product ID: "));
        
       	
        	if (id < 0 || id >= inventory.length) {
            		JOptionPane.showMessageDialog(null, "Invalid Product ID! It must be between 0 and " + (inventory.length - 1));
            	return;
        }
        
        String name = JOptionPane.showInputDialog("Enter Product Name: ");
        int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity: "));
        int price = Integer.parseInt(JOptionPane.showInputDialog("Enter Price: "));

        inventory[id] = new Product(id, name, qty, price);
        JOptionPane.showMessageDialog(null, "Product added successfully!");
    	}

    	static void viewProduct() 
	{
        	int prodId = Integer.parseInt(JOptionPane.showInputDialog("Enter Product ID to view: "));

        	if (prodId < 0 || prodId >= inventory.length || inventory[prodId] == null) {
            		JOptionPane.showMessageDialog(null, "Error: Product not found!");
           		return;
        	}

        	Product p = inventory[prodId];
        	JOptionPane.showMessageDialog(null, "Product Details:\nID: " + p.productid + "\nName: " + p.productName + "\nQuantity: " + p.quantity + "\nPrice: " + p.price);
    	}

    	static void delProduct() 
	{
        	int prodId = Integer.parseInt(JOptionPane.showInputDialog("Enter Product ID to delete: "));

	        if (prodId < 0 || prodId >= inventory.length || inventory[prodId] == null) {
        	    JOptionPane.showMessageDialog(null, "Error: Product not found!");
            	return;
        	}

        inventory[prodId] = null; 
        JOptionPane.showMessageDialog(null, "Product deleted successfully!");
    	}

    	static void updateProduct() 
	{
        	int prodId = Integer.parseInt(JOptionPane.showInputDialog("Enter Product ID to update: "));

        	if (prodId < 0 || prodId >= inventory.length || inventory[prodId] == null) {
            		JOptionPane.showMessageDialog(null, "Error: Product not found!");
            		return;
        	}

        	Product p = inventory[prodId];

        	String name = JOptionPane.showInputDialog("Enter new name (or type NO to keep current name): ");
        	if (name != "NO") {
            		p.productName = name;
        	}

        	String quan = JOptionPane.showInputDialog("Enter new quantity (or -1 to keep current quantity): ");
        	int newQuantity = Integer.parseInt(quan);
        	if (newQuantity != -1) {
            		p.quantity = newQuantity;
        	}

        	String price = JOptionPane.showInputDialog("Enter new price (or -1 to keep current price): ");
        	int newPrice = Integer.parseInt(price);
        	if (newPrice != -1) {
            		p.price = newPrice;
        	}

        	JOptionPane.showMessageDialog(null, "Product updated successfully!");
    	}
}
