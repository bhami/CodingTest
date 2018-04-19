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

public class AnagramTest {
	
	public static void main(String[] args) throws Exception{
		//String FILE_PATH = "C:/Users/Bhami/git/LocalCodingTest/CodingTest/src/file2.txt";
		String FILE_PATH = "src/anagram.txt";
		BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
		char[] line1 = br.readLine().toLowerCase().toCharArray();
		char[] line2 = br.readLine().replaceAll("\\s","").toLowerCase().toCharArray();
		boolean status = false;
		status = line1.length==line2.length?true:false;
		Arrays.sort(line1);
		Arrays.sort(line2);
		//boolean status = Arrays.equals(line1, line2);
		if(status)
            System.out.println("True");
        else
            System.out.println("False");
        
        
	}
}
