package com.bhami.filtered.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HighestPrimeInRange {
	
	public static void main(String[] args) throws Exception{
		
		//String FILE_PATH = "C:/Users/Bhami/git/LocalCodingTest/CodingTest/src/file2.txt";
		String FILE_PATH = "src/primeRange.txt";
		List<Integer> list =  new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
		//int N1 = Integer.parseInt(br.readLine());
		String[] NS = br.readLine().split("\\s");
		int n1=Integer.parseInt(NS[0]);
		int n2=Integer.parseInt(NS[1]);
		for(int i= n1; i<n2; i++){
			int p = isPrime(i);
			if(p != 0)
				list.add(p);
		}
		//list.forEach(System.out::print);
		if(list.isEmpty())
			System.out.println("-1");
		else{
			System.out.println(list.get(list.size()-1));
		}
			
	}
	public static int  isPrime(int i){
		for(int cnt=2; cnt< i; cnt++){
			if((i%cnt)== 0){
				return 0;
			}
		}
		//list.add(i);
		return i;
		
		
	}
}
