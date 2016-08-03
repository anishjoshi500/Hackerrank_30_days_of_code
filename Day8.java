import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> PhoneBook= new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            PhoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(PhoneBook.containsKey(s))
            {
                int value = PhoneBook.get(s);
                System.out.println(s +"="+ value);
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
