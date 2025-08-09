import java.util.Scanner;

class Arrayelements {
    int i, j, temp;int A[]=e Int[];
    Scanner sc = new Scanner(System.in);
    System.out.println("How many elements you want?");
    int no=sc.nextInt();
    System.out.println("Enter array elements");
    for(i=0;i<no;i++)
    {
        A[i]=sc.nextInt();
    }   
    for(i=0;i<no;i++)
    {
         for(j=i+1;j<no;j++)
         {
          if(A[i]>A[j])
          {
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;
          }
        }
    }
    System.out.println("Array Elements are: ");
    for(i=0;i<no;i++)
    {
    System.out.print(A[i]+" ");
    }
}
