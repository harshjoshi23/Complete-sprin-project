package com.example.set;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Doctor sehegal = new Doctor(101,"Sehegal","ENT",9834223);
//		Doctor titu = new Doctor(102,"Titu","Dermatologist",8131922);
//		Doctor doggy = new Doctor(103,"Doggy","PED",6534223);
//		Doctor cheems = new Doctor(104,"Cheems","Vet",6534223);
//		Doctor chems = new Doctor(104,"Cheems","Vet",6534223);
//
//
//		Set<Doctor> dicList = new HashSet<>();
//		// Returns a boolean value signifying it a successfull or 
//		// Unseccessful add
//		dicList.add(sehegal);
//		dicList.add(titu);
//		dicList.add(doggy);
//		dicList.add(cheems);
//		dicList.add(chems);
//
//		for(Doctor i: dicList) {
//			System.out.println(i);
//		}
//
//		
		
	Doctor sehegal = new Doctor(101,"Sehegal","ENT",9834223);
	Doctor titu = new Doctor(102,"Titu","Dermatologist",8131922);
	Doctor doggy = new Doctor(103,"Doggy","PED",6534223);
	Doctor cheems = new Doctor(104,"Cheems","Vet",6534223);
	Doctor chems = new Doctor(104,"Cheems","Vet",6534223);
	
	
	Set<Doctor> doctorSet = new TreeSet<>();
	doctorSet.add(sehegal);
	doctorSet.add(titu);
	doctorSet.add(doggy);
	doctorSet.add(cheems);
	doctorSet.add(chems);
	
	
	for(Doctor i: doctorSet) {
		System.out.println(i);
	}
	
	}

	

}
