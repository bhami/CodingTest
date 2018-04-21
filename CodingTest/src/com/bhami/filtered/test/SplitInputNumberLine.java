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

public class SplitInputNumberLine {
	
	public static void main(String[] args) throws Exception{
		
		//String FILE_PATH = "C:/Users/Bhami/git/LocalCodingTest/CodingTest/src/file2.txt";
		String FILE_PATH = "src/splitNumberLine.txt";
		List<Integer> list =  new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
		int N1 = Integer.parseInt(br.readLine());
		String NS2 = br.readLine().replaceAll("\\s","").trim();
		int sLen = (N1 + 1)/2;
		String s1 = NS2.substring(0, sLen).replaceAll(".(?!$)", "$0 ");
		//System.out.println(s1.replaceAll(".(?!$)", "$0 "));
		String s2 = NS2.substring(sLen).replaceAll(".(?!$)", "$0 ");
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
