import java.io.*;
import java.util.*;

public class Solution_day6 {

    public static void main(String[] args) {
        int i=0,j=0;
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        scan.nextLine();
       
        for(i=0;i<N;i++)
        {
            String s=scan.nextLine();
                char[] array=s.toCharArray();
                for( j=0;j<array.length;j++)
                {
                    if(j%2==0)
                        System.out.print(array[j]);
                }
                
            System.out.print(" ");
            for(j=0;j<array.length;j++)
            {
                if(j%2!=0)
                {
                    System.out.print(array[j]);
                }
            }
              System.out.println("");
        }
      
                
            
        }
        
        
        
    }

        
        

        
        
  