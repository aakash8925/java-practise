package practise;

import java.util.*;
import java.util.Scanner;

class Product{
	int productId, stockQuantity;
	String name, category, brand;
	double price;
	Product(int productId, int stockQuantity, String name, String category, String brand, double price
			){
		this.productId = productId;
		this.stockQuantity = stockQuantity;
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.price = price;
	}
	public int getProductId() { return productId; }
	public int getStockQuantity() { return stockQuantity; }
    public String getName() { return name; }
    public String getCategory() {return category;}
    public String getBrand() {return brand;}
    public double getPrice() { return price; }
    
    
	@Override
	public int hashCode() {
	    return Objects.hash(productId);
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Product other = (Product) obj;
	    return productId == other.productId;
	}
}
public class ComputerStore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Product> Products = new HashMap<>();

		// Laptops
		Products.put(101, new Product(101, 50, "MacBook M3", "Laptop", "Apple", 120000));
		
		Products.put(102, new Product(102, 30, "ThinkPad X1 Carbon", "Laptop", "Lenovo", 145000));
		Products.put(103, new Product(103, 20, "ROG Strix", "Laptop", "ASUS", 95000));
		Products.put(104, new Product(104, 15, "HP Spectre x360", "Laptop", "HP", 110000));

		// Monitors
		Products.put(201, new Product(201, 25, "UltraSharp 27", "Monitor", "Dell", 35000));
		Products.put(202, new Product(202, 40, "Odyssey G7", "Monitor", "Samsung", 45000));
		Products.put(203, new Product(203, 10, "ProArt Display", "Monitor", "ASUS", 55000));

		// Keyboards & Mice
		Products.put(301, new Product(301, 100, "MX Master 3S", "Mouse", "Logitech", 9000));
		Products.put(302, new Product(302, 80, "DeathAdder V3", "Mouse", "Razer", 6500));
		Products.put(303, new Product(303, 60, "Keychron K2", "Keyboard", "Keychron", 8000));
		Products.put(304, new Product(304, 50, "SteelSeries Apex Pro", "Keyboard", "SteelSeries", 18000));

		// Internal Components
		Products.put(401, new Product(401, 12, "RTX 4080 Super", "GPU", "NVIDIA", 115000));
		Products.put(402, new Product(402, 25, "Core i9-14900K", "CPU", "Intel", 58000));
		Products.put(403, new Product(403, 45, "Vengeance 32GB RAM", "RAM", "Corsair", 12000));
		Products.put(404, new Product(404, 70, "990 Pro 2TB SSD", "Storage", "Samsung", 16000));
		System.out.println(Products.get(101).getBrand());
		List<Product> cart = new ArrayList<>();
		
		while(true) {
			// --- THE SEARCH FEATURE ---
	        System.out.println("\n--- Welcome to Computer Store ---");
	        System.out.println("1 - search a Product");
	        System.out.println("2 - view All Products");
	        System.out.println("3 - Update a Product");
	        System.out.println("4 - Remove Product");
	        System.out.println("5 - View Cart");
	        
	        int choice = sc.nextInt();
	        sc.nextLine();	        
	        if(choice == 0) {System.out.println("Thanks for Visiting!!"); break;}
	        switch(choice) {
	        case 1:
	        	System.out.print("Enter Product ID to search: ");
	        	int searchId = sc.nextInt();
	        	
		        if (Products.containsKey(searchId)) {
		            Product product = Products.get(searchId);
		            System.out.println("Product Found!");
		            System.out.println("Name: " + product.getName());
		            System.out.println("Price: ₹" + product.getPrice());
		            System.out.println("In Stock: " + product.getStockQuantity());
		            
		            System.out.println(" yes to Add to Cart");
		            String orderconf = sc.next();
		            if(orderconf.equals("y") || orderconf.equals("yes")) {
		            	if(product.getStockQuantity() != 0) {
		            		cart.add(product);
		            		
		            	}else {
		            		System.out.println("Sorry! Product is out of stock");
		            	}
		            }else {
		            	System.out.println("Returning to main menu...");
		            	continue;
		            }
		        } else {
		            System.out.println("Error: Product ID " + searchId + " not found.");
		        }
		        break;
	        case 2:
	        	boolean stayInViewAll = true;
	        	while (stayInViewAll) {
		            System.out.println("\n\t===== ALL AVAILABLE PRODUCTS =====");
		            System.out.printf("%-5s | %-20s | %-10s | %-10s | %-5s%n", "ID", "Name", "Brand", "Price", "Stock");
		            System.out.println("----------------------------------------------------------------------");
		            
		            // inventory.values() gives us all the Product objects inside the Map
		            for (Product p : Products.values()) {
		                System.out.printf("%-5d | %-20s | %-10s | ₹%-9.2f | %-5d%n", 
		                    p.getProductId(), 
		                    p.getName(), 
		                    p.getBrand(), 
		                    p.getPrice(), 
		                    p.getStockQuantity());
		            }
		            System.out.println("----------------------------------------------------------------------");
		            System.out.print("Enter Product ID to buy (or 0 to go back): ");
		            int pid = sc.nextInt();
		            sc.nextLine();

		            if (pid == 0) {
		                stayInViewAll = false; 
		            } else if (Products.containsKey(pid)) {
		                Product product = Products.get(pid);
		                System.out.print("Add to Cart? (y/n): ");
		                String orderconf = sc.nextLine();
		                
		                if (orderconf.equalsIgnoreCase("y")) {
			            	if(product.getStockQuantity() <= 0) {
			            		System.out.println("Sorry! Product is out of stock");
			            	}else {
			            		System.out.println("Selected: " + product.getName() + " | Available: " + product.getStockQuantity());
			                    System.out.print("How many do you want to buy? ");
			                    int qty = sc.nextInt();
			                    sc.nextLine();
			                    
			                    if (qty <= 0) {
			                        System.out.println("❌ Invalid quantity. Please enter at least 1.");
			                    } else if (qty > product.getStockQuantity()) {
			                        System.out.println("❌ Not enough stock! We only have " + product.getStockQuantity() + " left.");
			                    } else {
			                        // 3. Add to cart multiple times based on quantity
			                        for (int i = 0; i < qty; i++) {
			                            cart.add(product);
			                        }

			                        // 4. Update the Master Stock in the HashMap
			                        product.stockQuantity -= qty; 
			                        
			                        System.out.println("✅ " + qty + " units of " + product.getName() + " added to cart!");
			                    }
			            	}
		                }
		            } else {
		                System.out.println("Invalid ID.");
		            }
		        }
		        break;
	        case 3:
	        	System.out.print("Enter Product ID to update: ");
	        	int uId = sc.nextInt();
	        	sc.nextLine();	        	
		        if (Products.containsKey(uId)) {
		        	Product product = Products.get(uId);
		        	System.out.println("Old name :"+ product.getName() +"\nEnter new Name (Leave blank to keep current):");
		            String uName = sc.nextLine();
		            
		            System.out.println("Old Stockquantity:\t" + product.getStockQuantity() + "\nEnter the new stockQuantity to update:");
		            int uquantity = sc.nextInt();
		            sc.nextLine();
		            
		            System.out.println("Old Catrgory:\t" + product.getCategory() + "\nEnter the new category (Leave blank to keep current)");
		            String ucategory = sc.nextLine();
		            
		            System.out.println("Old Brand: \t" + product.getBrand() + "\nEnter new brand (Leave blank to keep current):");
		            String ubrand = sc.nextLine();

		            System.out.println("Old Price:\t" + product.getPrice() + "\nEnter new price (Enter -1 to keep current):");
		            double uprice = sc.nextDouble();
		            sc.nextLine();
		            
		            if (!uName.trim().isEmpty()) {
		            	product.name = uName;
		            }
		            if(uquantity != -1) {
		            	product.stockQuantity = uquantity;
		            }
		            if(!ucategory.trim() .isEmpty()) {
		            	product.category = ucategory;
		            }
		            if(!ubrand.trim().isEmpty()) {
		            	product.brand = ubrand;
		            }
		            if (uprice != -1) {
		            	product.price = uprice;
		            }
		            
		            
		        } else {
		            System.out.println("Error: Product ID " + uId + " not found.");
		        }
		        break;
		        
	        case 4:
	        	System.out.print("Enter Product ID to Delete: ");
	        	int remId = sc.nextInt();
	        	sc.nextLine();
	        	
	        	if (Products.containsKey(remId)) {
	        		Product removedProduct = Products.remove(remId);
	        		System.out.println("SUCCESS: " + removedProduct.getName() + " has been removed from the store.");
	        		
	        	} else {
	            	System.out.println("Error: Product ID " + remId + " not found.");
	            }
	        	
	        	break;
	        case 5:
	        	if(cart.isEmpty()) {
	                System.out.println("Your Cart is empty!");
	            } else {
	                double total = 0;
	                for(Product item : cart) {
	                    System.out.println("- " + item.getName() + " (₹" + item.getPrice() + ")");
	                    total += item.getPrice();
	                }
	                System.out.println("Total Amount: ₹" + total);
	            }break;
	        }  
		}
		
	}
}
