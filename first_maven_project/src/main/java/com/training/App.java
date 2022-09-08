package com.training;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // If we use it neednot use 7 constructors
        
        Gson obj = new GsonBuilder().setPrettyPrinting().create();
        
        Employee ram = new Employee(101,"Ramu",54000);
        Employee stud2 = new Employee(102,"Stud2",14000);
        Employee stud3 = new Employee(103,"Stud3",24000);
        Employee stud4 = new Employee(104,"Stud4",34000);
        Employee stud5 = new Employee(105,"Stud5",44000);
        List<Employee> emplist = new ArrayList<>() ;
        
        emplist.add(ram);
        emplist.add(stud2);
        emplist.add(stud3);
        emplist.add(stud4);
        emplist.add(stud5);

        System.out.println(obj.toJson(emplist));
        
        String jsonStr = "{\r\n"
        		+ "    \"employeeID\": 105,\r\n"
        		+ "    \"employeeName\": \"Stud5\",\r\n"
        		+ "    \"salary\": 44000.0\r\n"
        		+ "  }";

        System.out.println(obj.fromJson(jsonStr, Employee.class));
        
        
    }
}
