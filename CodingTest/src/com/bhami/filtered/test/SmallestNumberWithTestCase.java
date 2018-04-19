package com.bhami.filtered.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SmallestNumberWithTestCase {
	
	public static void main(String[] args) throws Exception{
		//String FILE_PATH = "C:\\Users\\Bhami\\git\\LocalCodingTest\\CodingTest\\src\\file2.txt";
		//String FILE_PATH = "C:/Users/Bhami/git/LocalCodingTest/CodingTest/src/file2.txt";
		String FILE_PATH = "src/file2.txt";
		String [] codes = new String[99];
		BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for(int i= 0; i<N; i++){
        	 line=br.readLine();
             int k=Integer.parseInt(line);
             line=br.readLine();
             String[] str = line.split(" ");
             //System.out.println("str:" + Arrays.toString(str));
             //java8 way to convert string aray to integer array
             int[] array = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
             System.out.println( FindSmallest(array));
     		
     			
             

        }

		//String[] yourArray = Arrays.toString(); //.split(", ");
		
		
		//int[] in = {3,20,4,9,100};
		//System.out.printf( "Smallest number from( %s) is %d", Arrays.toString(in), FindSmallest(in));
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
