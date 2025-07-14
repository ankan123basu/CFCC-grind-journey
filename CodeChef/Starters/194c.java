package CodeChef.Starters;

//  Chef Bakes Cake 3

// https://www.codechef.com/problems/BAKECAKE3


import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception       // O(T × N × max(A[i]))
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0){
		    int N = sc.nextInt();
		    int A[] = new int[N];  // Count customer count per day
		    int maxiA = 0;     // Maximum customer count on any day
		    for(int i=0; i<N; i++){
		        A[i] = sc.nextInt();
		        if(A[i] > maxiA){
		            maxiA = A[i];
		        }
		    }
		    