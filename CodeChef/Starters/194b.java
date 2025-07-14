package CodeChef.Starters;

//  Chef Bakes Cake 2

// https://www.codechef.com/problems/BAKECAKE3

import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int N = sc.nextInt();
		    int A[] = new int[N];
		    int B[] = new int[N];
		    
		    for(int i = 0; i<N; i++){
		        A[i] = sc.nextInt();
		    }
		    for(int i =0; i<N; i++){
		        B[i] = sc.nextInt();
		    }
		    
		    int c = 0;
		    for(int i =0; i<N; i++){
		        if(B[i]<A[i]){      // to handle the case where B[i] is less than A[i], if not handled, it would lead to negative profit
		            c += A[i] - B[i];
		        }
		    }
		    System.out.println(c);
		}

	}
}
