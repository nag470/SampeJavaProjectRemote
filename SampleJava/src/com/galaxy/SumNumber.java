package com.galaxy;

public class SumNumber {

	public static void main(String[] args) {
		int n=1462;
		int sum=0;
		while(n>0){
			int t=n%10;
			sum=sum+t;
			n=n/10;
		}
		System.out.println(sum);
		
		int k=143;
		int rev=0;
		while(k>0){
			int r=k%10;
			rev=rev*10+r;
			k=k/10;
		}
		System.out.println(rev);

	}

}
