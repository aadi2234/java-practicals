import java.util.*;
import java.util.Scanner;
class Multi
{
public static void main(String args[])
{
    int[][] prod=new int[0][20]; 
    for (int i=10; i<=1;i--)
    {
        for (int j = 10; j<20;j++)
        {
            prod[i][j] =i*j;
            System.out.println( prod[i][j]); 
        }
    System.out.println(" ");
    }
}
}