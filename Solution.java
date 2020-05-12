package helloworld;
import java.io.*;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.trim();
        if(s.equals("")==true)
        System.out.println("0");
        else
        {
            StringTokenizer st=new StringTokenizer(s,"[A-Z !,?._'@]+");
            System.out.println(st.countTokens());
            while(st.hasMoreTokens())
            System.out.println(st.nextToken());
        }
	}
}