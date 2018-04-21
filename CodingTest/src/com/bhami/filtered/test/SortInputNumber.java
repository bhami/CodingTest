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

public class SortInputNumber {
	
	public static void main(String[] args) throws Exception{
		//String FILE_PATH = "C:\\Users\\Bhami\\git\\LocalCodingTest\\CodingTest\\src\\file2.txt";
		//String FILE_PATH = "C:/Users/Bhami/git/LocalCodingTest/CodingTest/src/file2.txt";
		String FILE_PATH = "src/sort.txt";
		List<Integer> list =  new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
		while(true){
			int N = Integer.parseInt(br.readLine());
	        if (N == 42)
	        	break;
	        list.add(N);
		}
		Collections.sort(list);
		//java8 way to print each element in seperate line
		list.forEach(System.out::println);
		list.forEach(t -> System.out.println(t));
        
	}
}
