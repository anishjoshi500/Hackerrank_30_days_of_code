import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int ard[]=new int[3];
        int erd[]=new int[3];
        for(int i=0;i<3;i++)
        {
            ard[i]=sc.nextInt();
        }
        for(int j=0;j<3;j++)
        {
            erd[j]=sc.nextInt();
        }
        if(((ard[0]==erd[0])&&(ard[1]==erd[1])&&(ard[2]==erd[2]))||((ard[0]<erd[0])||(ard[1]<erd[1])||(ard[2]<erd[2])))
        {
            System.out.println("0");
        }
        else if((ard[0]>erd[0])&&((ard[1]==erd[1])&&(ard[2]==erd[2])))
        {
            System.out.println((15*(ard[0]-erd[0])));
        }
        else if((ard[1]>erd[1])&&(ard[2]==erd[2]))
        {
            System.out.println((500*(ard[1]-erd[1])));
        }
        else if(ard[3]>erd[3])
        {
            System.out.println("10000");
        }
        //else if((ard[0]<erd[0])||(ard[1]<erd[1])||(ard[2]<erd[2]))
        //{
            //System.out.println("0");
        //}
    }
}
