import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum[][]=new int[5][5];
        int i;
        int j;
        int maximum=-1000;
        for(i=0; i < 6; i++){
            for(j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
                //System.out.print(arr[1][1]);
            }
        }
            for(i=1; i < 5; i++){
            for(j=1; j < 5; j++){
                sum[i][j]= arr[i][j]+arr[i-1][j]+arr[i+1][j]+arr[i-1][j-1]+arr[i-1][j+1]+arr[i+1][j-1]+arr[i+1][j+1];
                //System.out.println(sum[i][j]);
            }
            }
            for (i = 1; i < 5; i++) {
            for (j = 1; j < 5; j++)
            if (sum[i][j] > maximum) {
            maximum = sum[i][j];
            }
            }
            System.out.println(maximum);
    
    }
}
