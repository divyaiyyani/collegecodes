/* Transposition Cipher that reads row by row and sends column by column according to key */


import java.io.*;
import java.util.*;
class TransCipher
{
	public static void main(String args[])throws IOException
	{
		Scanner s=new Scanner(System.in);
		int lkey,i,j,l,r,q,row=0,col=0;

		System.out.println("Enter length of key");
		lkey=s.nextInt();
		int key[]=new int[lkey];
		System.out.println("Enter key");

		for(i=0;i < key.length;i++)
		{
                       key[i]=s.nextInt();
		}

		System.out.println("Enter text to be sent without spaces");
		String text;
		text=s.next();
		l=text.length();
		q=l/lkey;  //3
		r=l%lkey;  //1

		if(r!=0)
		{
			q++;
		}


			char c[][]=new char[q][lkey];
			char t[][]=new char[q][lkey];
			for(i=0;i < l;i++)
			{
				if(col==lkey)
				{
					row++;
					col=0;
				}
				c[row][col]=text.charAt(i);
				col++;
			}
System.out.println();
		

		System.out.println("Cipher in matrix form:");
		for(i=0;i < q;i++)
		{
			for(j=0;j < lkey;j++)
			{
				System.out.print(c[i][j]  + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Cipher to be sent:");
		
		for(i=0;i<key.length;i++)
		{
			for(j=0;j<q;j++)
			{ 
				System.out.print(c[j][i]);

			}
			
		}
		   System.out.println();
		   System.out.println();
             System.out.println("After deciphering:");
         for(i=0;i < q;i++)
		{
			for(j=0;j < lkey;j++)
			{
				System.out.print(c[i][j]);
			}
			
		}
		
	}
}

