package com.training.maps;
import java.util.*;

import com.training.model.Student;

public class StudentHashMap {
	
//	public static void usingHashMap() {
//		HashMap<Integer, Student> map = new HashMap<>();
//		// Wrapper class do the autoboxing
//		Student ram = new Student(102,"Harsh",91);
//		System.out.println("Result:= " + map.put(ram.getRollNumber(),ram));
//		Student ramdu = new Student(102,"Ramdu",61); 
//		System.out.println("Response:= "+ map.put(ramdu.getRollNumber(),ramdu));
//		System.out.println(map.get(102));
//		
//	}

//	public static void usingHashTable() {
//		Hashtable<Integer, Student> map = new Hashtable<>();
//		
//		// Wrapper class do the autoboxing
//		Student harsh = new Student(102,"Harsh",91);
////		System.out.println("Result:= " + map.put(ram.getRollNumber(),ram));
//		Student ramdu = new Student(103,"Ramdu",61); 
////		System.out.println("Response:= "+ map.put(ramdu.getRollNumber(),ramdu));
////		System.out.println(map.get(102));
////		System.out.println("Result:= " + map.put(harsh.getRollNumber(),harsh));
////		System.out.println("Response:= "+ map.put(ramdu.getRollNumber(),ramdu));
//		map.put(ramdu.getRollNumber(),ramdu);
//		map.put(harsh.getRollNumber(),harsh);
//
//		
//		for(Map.Entry<Integer, Student> eachElement:map.entrySet()) {
//			System.out.println(eachElement.getKey()+","+ eachElement.getValue() );
//		}
//		
//	}
//	public static void usingTreeMap() {
//		TreeMap<Integer, Student> map = new TreeMap<>();
//		
//		// Wrapper class do the autoboxing
//		Student harsh = new Student(102,"Harsh",91);
////		System.out.println("Result:= " + map.put(ram.getRollNumber(),ram));
//		Student ramdu = new Student(103,"Ramdu",61); 
//		Student boxer = new Student(101,"Mike",12);
//
////		System.out.println("Response:= "+ map.put(ramdu.getRollNumber(),ramdu));
////		System.out.println(map.get(102));
////		System.out.println("Result:= " + map.put(harsh.getRollNumber(),harsh));
////		System.out.println("Response:= "+ map.put(ramdu.getRollNumber(),ramdu));
//		map.put(ramdu.getRollNumber(),ramdu);
//		map.put(harsh.getRollNumber(),harsh);
//		map.put(boxer.getRollNumber(),boxer);
//
//
//		
//		for(Map.Entry<Integer, Student> eachElement:map.entrySet()) {
//			System.out.println(eachElement.getKey()+","+ eachElement.getValue() );
//		}
//		
//	}
	
	public static void usingHashMapWithKeys() {
		HashMap<Integer, Student> map = new HashMap<>();
		
		// Wrapper class do the autoboxing
//		Student ramdu = new Student(104,"Ramdu",61); 

		Student harsh = new Student(102,"Harsh",91);
//		System.out.println("Result:= " + map.put(ram.getRollNumber(),ram));
		Student ramdu = new Student(103,"Ramdu",61); 
		Student boxer = new Student(101,"Mike",12);

//		System.out.println("Response:= "+ map.put(ramdu.getRollNumber(),ramdu));
//		System.out.println(map.get(102));
//		System.out.println("Result:= " + map.put(harsh.getRollNumber(),harsh));
//		System.out.println("Response:= "+ map.put(ramdu.getRollNumber(),ramdu));
		map.put(ramdu.getRollNumber(),ramdu);
		map.put(harsh.getRollNumber(),harsh);
		map.put(boxer.getRollNumber(),boxer);

		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
//		for(Map.Entry<Integer, Student> eachElement:map.entrySet()) {
//			System.out.println(eachElement.getKey()+","+ eachElement.getValue() );
//		}
		for(Integer eackKey:keys) {
			System.out.println(map.get(eackKey));
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		usingHashMap();
//		usingTreeMap();
		usingHashMapWithKeys();

	}

}
