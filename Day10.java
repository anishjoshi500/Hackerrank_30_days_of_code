import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b=Integer.toBinaryString(n);
        String[] s= b.split("0");
        Arrays.sort(s);
        int x = s[s.length - 1].length();
        System.out.println(x);
    }
}
