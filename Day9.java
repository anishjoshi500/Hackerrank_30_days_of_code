import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public int factorial(int n)
        {
        if(n==0||n==1)
        return 1;
        else
        return(n*(factorial(n-1)));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s=new Solution();
        int fact=s.factorial(n);
        System.out.println(fact);
    }
}
