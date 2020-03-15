package Model;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Admin
{
	ArrayList<ProductDetails>  list=new ArrayList<ProductDetails>();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ArrayList<ProductDetails> cart=new ArrayList<ProductDetails>();
	 int i=1;
	 public void a()
	 {
	 ProductDetails p1=new ProductDetails("466","soap",50,2);
	 list.add(p1);
	 ProductDetails p2=new ProductDetails("789","kjgj",90,3);
	 list.add(p2);
	 ProductDetails p3=new ProductDetails("456","gbfch",87,2);
	 list.add(p3);
	 ProductDetails p4=new ProductDetails("4589","hath",120,3);
	 list.add(p4);
	 }
	 
	 
	 
	public ArrayList<ProductDetails> getList() {
		return list;
	}


	public void setList(ArrayList<ProductDetails> list) {
		this.list = list;
	}


	public void  addItems(String id,String name,int cost,int delivery) throws IOException
	{  
		System.out.println("enter password to add items");
		String password=br.readLine();
		if(password.equals("haripriya"))
				{
		ProductDetails pd=new ProductDetails(id,name,cost,delivery);
		
		list.add(pd);
		System.out.println("Items added successfully");
				}
		
	}
	
		
		
	
	public void remove() throws IOException
	{
		System.out.println("enter password to remove items");
		String password=br.readLine();
		if(password.equals("haripriya"))
		{	
			for(ProductDetails p:list)
			{
				System.out.println(p.getId()+"\t"+p.getName());
				
			}
			System.out.println("enter id to remove");
			String id=br.readLine();
			for(ProductDetails p:list)
			{
				if(p.getId().equalsIgnoreCase(id))
					list.remove(p);
				System.out.println("item removed from the list");
				
			}
			
		}
		
	}
	public void display() throws IOException
	{
      
      for(ProductDetails pd :list)
      {
    	  System.out.println(pd.getId()+"   \t"+pd.getName()    );            
      }
     
      
	 }
	public void order() throws IOException
	{
		 
	String choice="yes";
	while(choice.equalsIgnoreCase("yes"))
	{
		display();
		System.out.println("please add your item to the cart by entering id");
		String seleted=br.readLine();
		//list=admin.getList();
		for(ProductDetails pd:list)
		{// System.out.println(pd.getName());
			if(pd.getId().equalsIgnoreCase(seleted))
				cart.add(pd);
		}
		System.out.println("Do you want to continue shopping ?");
		System.out.println("enter yes");
		choice=br.readLine();
		
	}
	System.out.println("you ordered below products");
	
	for(ProductDetails pd:cart)
	{
		System.out.println("your oder was delivered in "+pd.getDelivery()+" days");
		System.out.println(pd.getId()+"\t"+     pd.getName()+   "\t"+pd.getCost()+"\t"+pd.getDelivery()+"days");
	}
	
	 System.out.println("Do you want to reemove element from cart ? enter YES for do it");
	String choice1= br.readLine();
	if(choice1.equalsIgnoreCase("yes"))
	{
		removeCart();
		
	}

	
	
	}
	public void removeCart() throws IOException
	{
		System.out.println("Enter itemid to delete");
		String id=br.readLine();
		for(ProductDetails pd:cart)
		{
			if(pd.getId().equalsIgnoreCase(id))
			{
				cart.remove(pd);
				for(ProductDetails p5:cart)
				{
					System.out.println(p5.getId()+"\t"+p5.getName());
				}
				return ;
			}
			
			
			
		}
	}
	}


