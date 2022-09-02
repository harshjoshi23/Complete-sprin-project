package com.training;

public class ExceptionHandling {

public static void print() {
        
        try {
            
            //Object strMark = "hundred";
            Integer strMark = Integer.valueOf(100);
            
            Integer mark = (Integer)strMark; // When there is an exception, this line will not get executed
            
            System.out.println(mark);
            
        } catch(ClassCastException e) {
            
            System.err.println("ERR-102 - Illegal Casting");
            
            //e.printStackTrace();
        }

       System.out.println("Done!");
    }

public static void multiCatch() {
    
    try {
        
        Object strMark = "hundred";
        //Integer strMark = Integer.valueOf(100);
        
        String strAge = "20";
        int age = Integer.parseInt(strAge);
        
        System.out.println("Age := " +age);
        
        Integer mark = (Integer)strMark; // When there is an exception, this line will not get executed
        
        System.out.println("Mark := " +mark);
        
    } catch(ClassCastException e) {
        
        System.err.println("ERR-102 - Illegal Casting");
        
        //e.printStackTrace();
        
    } catch(NumberFormatException e) {
        System.out.println("ERR-103 - Value of Age should be a number");
    }
}

public static void multiCatchAnotherWay() {
    
    try {
        
        Object strMark = "hundred";
        //Integer strMark = Integer.valueOf(100);
        
        String strAge = "twenty";
        int age = Integer.parseInt(strAge);
        
        System.out.println("Age := " +age);
        
        Integer mark = (Integer)strMark; // When there is an exception, this line will not get executed
        
        System.out.println("Mark := " +mark);
        
    } catch(ClassCastException | NumberFormatException e) {  // pipe symbol can store more than one kind of exception
        
        System.err.println(e.getClass());
        
    }
}

	    
	    public static void main(String[] args) {
	        
//	        print();
//	        multiCatch();
	        multiCatchAnotherWay();
	        
	    }

}
