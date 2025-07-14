package CodeChef.Starters;

// Chef Bakes Cake 1

//https://www.codechef.com/problems/BAKECAKE1
import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception     // O(n) and O(1)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
        int c = N * 30;
        int r = M * 50;
        int m = r - c;
        System.out.println(m);
        sc.close();
	}
}
