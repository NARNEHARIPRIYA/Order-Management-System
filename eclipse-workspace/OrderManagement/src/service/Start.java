package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Model.Admin;
import Model.ProductDetails;
import Model.Products;

public class Start
{

	public static void main(String[] args) throws IOException
	{
		User u= new User();
		u.start();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<ProductDetails> list=new ArrayList<ProductDetails>();
	    Admin admin=new Admin();
		
		ArrayList<ProductDetails> cart=new ArrayList<ProductDetails>();
		
		
		Products product=new Products();
		admin.a();
		    //product.addition();
		String  choice="yes";
		while(choice.equalsIgnoreCase("yes"))
		{
		
		System.out.println("Enter 1 for Add items");
		System.out.println("Enter 2 for remove items");
		System.out.println("Enter 3 for display items");
		System.out.println("Enter 4 for order items");
		
		System.out.println("enter your choice");
		int select=Integer.parseInt(br.readLine());
		switch(select)
		{
		case 1: System.out.println("enter item id");
		         String id=br.readLine();
		         System.out.println("enter item name");
		         String name=br.readLine();
		         System.out.println("enter item cost");
		          int cost=Integer.parseInt(br.readLine());
		         System.out.println("enter item delivery days");
		         int  delivery= Integer.parseInt(br.readLine());
		         admin.addItems(id, name, cost, delivery);
		          break;
		case 2:     admin.remove();
		              break;
		case 3:  admin.display();
		           break;
		case 4: admin.order();
		        break;
		default :System.out.println("You enter wrong input");
		           break;
		
		}
		System.out.println("Do you want to continue? enter yes ");
		choice=br.readLine();
		
	}
        
		
		  
	}

}
