import java.util.*;
import java.io.*;

class SubCipher
{
public static void main(String args[])
{

int i;
int temp;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the statement to be sent");
  String str=s.nextLine();
  char c[]=str.toCharArray();
 
System.out.println("Enter the key");
int k=s.nextInt();
 

for(i=0;i<c.length;i++)
		{
       
			int b=((int)c[i])+k;

                        if(b>90 && b<97)
                      {  b=b%91;
			 b=b+65;
                         c[i]=(char)b;
                       }
                    
                    else if(b>122)
                   {b=b%123;
                    b=b+97;
                    c[i]=(char)b;
                   }

                    else
                    c[i]=(char)b;	
	       	}

System.out.println("Encrypted statement");
for(char ch:c)
  System.out.print(ch);
System.out.println();

System.out.println("Enter the statement to be decrypted");
String string=s.next();
char d[]=string.toCharArray();

System.out.println("Enter the key");
int l=s.nextInt();


for(i=0;i<d.length;i++)
		{
       
			int b=((int)d[i])-k;

                        if(b<65)
                      {  b=b%91;
			 b=b+26;
                         d[i]=(char)b;

                       }
                    
                    else if(b>90 && b<97)
                   {b=b%123;
                    b=b+26;
                    d[i]=(char)b;

                   }

                    else
                    d[i]=(char)b;
	
	       	}


System.out.println("Decrypted statement");
for(char ch:d)
  System.out.print(ch);

}
}