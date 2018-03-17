//Day 2
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        double per=100;
        double tip,tax;
        int sum;
        tip=(tip_percent/per)*meal_cost;
        tax=(tax_percent/per)*meal_cost;
        
        sum=(int)Math.round(meal_cost+tax+tip);
        
        System.out.println("The total meal cost is "+sum+" dollars.");
        

        
        
        
    }
}
        
        

        
        
  
