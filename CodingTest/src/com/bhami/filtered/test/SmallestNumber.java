package com.bhami.filtered.test;

import java.util.Arrays;

public class SmallestNumber {
	public static void main(String[] args){
		int[] in = {3,20,4,9,100};
		System.out.printf( "Smallest number from( %s) is %d", Arrays.toString(in), FindSmallest(in));
		//int FindSmallest(Integer[] localIn){
			
	}
	

	private static int FindSmallest(int[] in) {
				
		// TODO Auto-generated method stub
		int size = in.length;
		//System.out.println("input array: "+ Arrays.toString(in));
		int min = 400;
		for(int i : in)
			min=(i<min)?i:min;
		return min;
	}
}
