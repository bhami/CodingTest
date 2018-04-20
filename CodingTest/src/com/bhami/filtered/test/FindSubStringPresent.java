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
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FindSubStringPresent {
	
	public static void main(String[] args) throws Exception{
		
		//String FILE_PATH = "C:/Users/Bhami/git/LocalCodingTest/CodingTest/src/file2.txt";
		String FILE_PATH = "src/stringList.txt";
		List<String> list =  new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
		String S1 = br.readLine().substring(2);
		//System.out.println(S1);
		String[] S2 = br.readLine().substring(2).split("\\s");
		//System.out.println(Arrays.toString(S2));
		for(int i=0; i<S2.length; i++){
			//System.out.println(S2[i]);
			boolean status =S1.contains(S2[i])? true:false;
			System.out.println(status);
			
		}
		
		
		
		//java8 way to print each element in seperate line
		//list.forEach(System.out::println);
		//list.forEach(t -> System.out.println(t));
        
	}
}
