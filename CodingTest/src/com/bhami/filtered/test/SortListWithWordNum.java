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

public class SortListWithWordNum {
	
	public static void main(String[] args) throws Exception{
		
		//String FILE_PATH = "C:/Users/Bhami/git/LocalCodingTest/CodingTest/src/file2.txt";
		String FILE_PATH = "src/sortList.txt";
		List<String> list =  new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
		int N = Integer.parseInt(br.readLine());
		int lines = N;
	    while(lines-- !=0){
	    	String line = br.readLine();
	    	list.add(line);
		}
		//Collections.sort(list);
	    System.out.println("Before sort:");
	    list.forEach(System.out::println);
		Collections.sort(list, new Comparator<String>() {
		    @Override
		    public int compare(String o1, String o2) {              
		    	if (o1.toLowerCase().equals(o2.toLowerCase())) {
                    if (o1.toLowerCase().equals(o1)) 
                        return -1;
                    else 
                        return  1;
                    
		    	} else 
                    return o1.toLowerCase().compareTo(o2.toLowerCase());

            }
		    
		});
		System.out.println("\nAfter sort:");
	    list.forEach(System.out::println);

		
		//java8 way to print each element in seperate line
		//list.forEach(System.out::println);
		//list.forEach(t -> System.out.println(t));
        
	}
}
