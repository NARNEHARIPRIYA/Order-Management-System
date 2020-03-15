package service;
import java.io.*;

import controller.Login;
import controller.SignUp;

public class User 
{

	public String name;
	
	public  String email;
	public  String password;
	

	public User(String name, String email, String password)
	{
		super();
		this.name = name;
		
		this.email = email;
		this.password = password;
	}
	public User()
	{
		
	}


	public boolean start() throws IOException
	{
		
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int choice;
		
		
		boolean b=true;
	while(b)
	{
		System.out.println("1.Enter 1 for signup");
		System.out.println(" 2.Enter 2 for login");
		System.out.print("Enter your choice = ");
		
		choice=Integer.parseInt(br.readLine());
		
	switch(choice) 
	{
	case 1 :  SignUp s = new SignUp();
	          boolean b1=s.registration();
	          if(b1)
	          {
	        	  System.out.println("Successfully registered");
	        	  System.out.println("please login to continue");
	        	  System.out.println("\n");
	        	  System.out.println("\n");
	        	  
	        	  Login log=new Login(email,password);
	           boolean b2=log.check();
	          System.out.println(b2);
	          b=false;
	          }
	          else
	          b=true;
	          break;
		      
		
	case 2 :   Login log=new Login(email,password);
	           
               boolean c=log.check();
               //System.out.println(c);
               if(c)
               {
            	   b=false;
            	   
            	  }
               else
               b=true;
               break;
		
		
		default: System.out.println("Invalid,choose correct option");
		            b=true;
		           break;
		
	}
	
	}
	
	return true;
	}

}
