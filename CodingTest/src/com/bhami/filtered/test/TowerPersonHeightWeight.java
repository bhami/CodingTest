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

public class TowerPersonHeightWeight {
	private static class Person {
		private Integer height;
		private Integer weight;
		public Person(int h, int w){
			height = h;
			weight =w;
		}
		
		public Integer getHeight() {
			return height;
		}

		
		public Integer getWeight() {
			return weight;
		}

		

		public String toString(){
			return "(" + height + "," + weight + ")";
		}
		
	}
	public static void main(String[] args) throws Exception{
		
		//String FILE_PATH = "C:/Users/Bhami/git/LocalCodingTest/CodingTest/src/file2.txt";
		String FILE_PATH = "src/tower.txt";
		List<String> list =  new ArrayList<>();
		List<Person> persons = new ArrayList<Person>();
		String line = null;
		BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
		while((line=br.readLine()) != null){
			String[] personDetails = line.split(",");
			int height = Integer.parseInt(personDetails[0]);
			int weight = Integer.parseInt(personDetails[1]);
			Person person = new Person(height,weight);
			//System.out.println(person);
			persons.add(person);
			
		}
		//System.out.println(persons);
		System.out.println("Before sorting:");
		persons.forEach(t -> System.out.println(t.getHeight() + "," + t.getWeight()));
		Collections.sort(persons, new Comparator<Person>(){
			public int compare(Person p1, Person p2){
				int hflag = p1.getHeight().compareTo(p2.getHeight());
				if (hflag == 0){
					return p1.getWeight().compareTo(p2.getWeight());
				}else if(hflag > 0)
					return 1;
				else
					return -1;
			}
		});
		//System.out.println(persons);
		System.out.println("After sorting:");
		persons.forEach(t -> System.out.println(t.getHeight() + "," + t.getWeight()));
	
	}
}
