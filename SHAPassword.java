/* Creating Log in credentials in a file using SHA encryption and checking if the entered credentials are correct or not */

import java.util.*;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class SHAPassword
{
	public static void main(String args[]) throws IOException
	{
 System.out.println("Creating the file with log in credentials:");
  PrintWriter pw=new PrintWriter("hash.txt"); //contains usernames and passwords
	Scanner s=new Scanner(System.in);
  String user="";
  String stop="no";
  String str="";
  String pass="";
     
     while(stop.equals("no")) //adding usernames and passwords to hash.txt
      {
        stop=makeData(pw);
        }

pw.close();

 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("hash.txt")));
 System.out.println();
 System.out.println("Checking log in crdentials:");
   System.out.println("Enter username");
	 user=s.nextLine();
	System.out.println("Enter password");
	String password=s.nextLine();
    
        String enpass=getPassword(password,"abcde12345");
        int flag=0;
        while((str=br.readLine())!=null)
     {  
       if(str.equals(user))
     {    flag=1;
         if((pass=br.readLine()).equals(enpass))
       {
         System.out.println("Log in credentials correct");
         System.exit(1);
       }
       if(flag==1)
       {
         System.out.println("Password incorrect");
         System.exit(1);
       }   
        }
    }
      System.out.println("Log in credentials incorrect");
	}

  
  public static String makeData(PrintWriter pw)
{ 
String stop="";
String user="";
 Scanner s=new Scanner(System.in);
 System.out.println("Enter username");
	 user=s.nextLine();
   pw.println(user);
 System.out.println("Enter password");
	 String password=s.nextLine();
   String enpass=getPassword(password,"abcde12345"); //salt = abcde12345
 pw.println(enpass);	      
       System.out.println("Stop? Type 'yes' if you want to stop else type 'no'");
       stop=s.next();
       return stop;    
 }

	
	public static String getPassword(String passwordToHash, String   salt)
 {
   String generatedPassword = null;
    try {
         MessageDigest md = MessageDigest.getInstance("SHA-512");
         md.update(salt.getBytes("UTF-8"));
         byte[] bytes = md.digest(passwordToHash.getBytes("UTF-8"));
         StringBuilder sb = new StringBuilder();
         for(int i=0; i< bytes.length ;i++){
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
         }
         generatedPassword = sb.toString();

        } 
       catch (NoSuchAlgorithmException e){
        e.printStackTrace();
       }
	   catch (UnsupportedEncodingException e){
        e.printStackTrace();
       }
    return generatedPassword;
  }
	
	


}
