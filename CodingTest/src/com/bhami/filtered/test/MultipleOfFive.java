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

public class MultipleOfFive {
	
	public static void main(String[] args) throws Exception{
		
		//String FILE_PATH = "C:/Users/Bhami/git/LocalCodingTest/CodingTest/src/file2.txt";
		String FILE_PATH = "src/multiple5.txt";
		List<Integer> list =  new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
		String[] NS = br.readLine().split("\\s");
		int n1=Integer.parseInt(NS[0]);
		int n2=Integer.parseInt(NS[1]);
		for(int i= n1; i<=n2; i++){
			if((i%5) == 0)
				list.add(i);
		}
		//list.forEach(System.out::print);
		list.forEach(t -> System.out.print(t + " "));
		
			
	}
}
