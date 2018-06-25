#include<stdio.h>
#include<math.h>
#include<conio.h>
void main()
{
  int i,k,r,x[100];
   clrscr();
      printf("Enter the value of k:");
      scanf("%d",&k);
      printf("\nEnter the value of r:");
      scanf("%d",&r);

	if((k+r+1)>pow(2,r))
	   printf("Hamming code cannot be created\n");
	else
	   printf("Hamming code can be created\n");

	printf("Enter the data:\n");
	 for(i=1;i<=11;i++)
	  {
	    if(i==1||i==2||i==4||i==8)
	       continue;
	    else
	       scanf("%d",&x[i]);
	}
	   x[1]=x[3]^x[5]^x[7]^x[9]^x[11];
	   x[2]=x[3]^x[6]^x[7]^x[10]^x[11];
	   x[4]=x[5]^x[6]^x[7];
	   x[8]=x[9]^x[10]^x[11];
	   printf("Hamming code:\n");
	   for(i=1;i<=11;i++)
       {
	  printf("%d  ",x[i]);
       }
       printf("\nParity bits:\n%d %d %d %d ",x[1],x[2],x[4],x[8]);
	 getch();
}





                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                










                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
