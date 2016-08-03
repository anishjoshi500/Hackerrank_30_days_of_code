import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        String s;
        
        for(int i=0;i<n;i++)
        {
        s=sc.next();
        char c[]=s.toCharArray();
        for(int j=0;j<c.length;j=j+2)
        {
            System.out.print(c[j]);
        }
        System.out.print(" ");
            for(int k=1;k<c.length;k=k+2)
        {
            System.out.print(c[k]);
        }
        System.out.println();
        }
    }
}
