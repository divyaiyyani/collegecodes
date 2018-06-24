                                   //FIFO page replacement

#include<stdio.h>
#include <conio.h>

void main()
{
int i,j,n,a[50],frame[10],no,k,avail,count=0;
 printf("\n Enter the no. of pages:");
 scanf("%d",&n);

 printf("\n Enter the page numbers:");
  for(i=1;i<=n;i++)
    scanf("%d",&a[i]);

 printf("\n Enter the no. of frames:");
 scanf("%d",&no);

for(i=0;i<no;i++)
  frame[i]= -1;
                        
    j=0;

for(i=1;i<=n;i++)
   {
      printf("For - %d\t\t",a[i]);
      avail=0;
                                    
      for(k=0;k<no;k++)
        if(frame[k]==a[i])
           avail=1;
                                   
        if (avail==0)
          {
              frame[j]=a[i];
              j=(j+1)%no;
              count++;

                printf("Frame - ");                                
                for(k=0;k<no;k++)
                  printf("%d\t",frame[k]);
          }
                                    printf("\n");
     }
                        printf("Page Fault is %d",count);
                        getch();
}
