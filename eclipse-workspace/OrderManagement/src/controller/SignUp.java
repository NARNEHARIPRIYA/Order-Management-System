package controller;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import service.User;

public class SignUp 
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
	private Pattern pattern;
	  private Matcher matcher1,matcher2;
	
	public boolean registration() throws IOException
	{
		System.out.println("enter your name");
		String name= br.readLine();
		
		System.out.println("enter your email");
		String email=br.readLine();
		System.out.println("enter your password");
		String password=br.readLine();
		System.out.println("enter confirm password");
		String confirmPassword=br.readLine(); 
		if((emailValidation(email))&&(passwordValidation(password,confirmPassword)))
		{
			User u=new User(name,email,password);
			//Login log=new Login(email,password);
			return true;
			
		}
		
		else
		{
			return false;
			
		}
		
		
	}
	
	public boolean emailValidation(String email)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
         Pattern pat = Pattern.compile(emailRegex); 
            if (email == null) 
           return false; 
          return pat.matcher(email).matches();
		
	}
	private boolean passwordValidation(String password, String confirmPassword) 
	{
		if(password.length()==0)
			return false;
			if(!(password.equals(confirmPassword)))
				return false;
			if(!((password.length()>=8)&&(password.length()<=20)))
	              return false;
	              char a[]=password.toCharArray();
	         int capital=0;
	         int lower=0;
	         int num=0;
	         int special=0;
	         for(int i=0;i<password.length();i++)
	         {
	        	 if((a[i]>=65)&&(a[i]<=90))
	        		 capital ++;
	        	 else if((a[i]>=97)&&(a[i]<=122))
	        		 lower ++;
	        	 else if((a[i]>=48)&&(a[i]<=58))
	        		 num ++;
	        	 else
	        		 special ++;
	        		 
	         }
	         if((capital>0)&&(lower>0)&&(num>0))
	        	 return true;
		      else
	        	 return false;
	
	}
	
}
