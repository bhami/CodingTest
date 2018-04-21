package com.bhami.filtered.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReplaceSpaceWithFiller {
	public static void main(String[] args) throws Exception{
		
		//String FILE_PATH = "C:/Users/Bhami/git/LocalCodingTest/CodingTest/src/file2.txt";
		String FILE_PATH = "src/replaceSpace.txt";
		List<String> list =  new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
		String S1 = br.readLine().replaceAll("\\s", "%20");
		System.out.println(S1);
		
		
		
		
		//java8 way to print each element in seperate line
		//list.forEach(System.out::println);
		//list.forEach(t -> System.out.println(t));
        
	}
}

