package controller;
import java.io.*;


import service.User;

public class Login 
{
	String email1;
	String password1;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public Login(String email, String password) 
	{
		email1=email;
		password1=password;
		// TODO Auto-generated constructor stub
	}
	public boolean check() throws IOException
	{
	
		//System.out.println(email1);
		System.out.println("\n");
		System.out.println("enter your email");
		String name=br.readLine(); 
		System.out.println("\n");
		System.out.println("enter your password");
		String password=br.readLine();
		System.out.println("\n");
		if((name.equals(email1))&&(password.equals(password1)))
		{
			return true;
			
		}
		else
			return false;
	}

}
