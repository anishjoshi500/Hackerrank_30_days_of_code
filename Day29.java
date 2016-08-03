import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcases = in.nextInt();
        for(int i = 0; i < testcases; i++){
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(maxander(n, k));
        }
	}

	static int maxander(int n, int k) {
		int max= 0;
		for (int x = 1; x <= n; x++)
        {
			for (int y = x+1; y <= n; y++)
            {
				int runmax = x & y;
				if (runmax > max && runmax < k)
                {
				 max = runmax;
				}
			}
		}
		return max;
	}
}
