package com.training.idaos;

import java.util.*;

import com.training.exception.ElementNotFoundException;
import com.training.ifaces.CrudRepository;
import com.training.model.Student;

public class StudentRepositoryImpl implements CrudRepository<Student> {
	
//	public boolean add(Type obj);
////	public List<Type> findAll();
//	public Collection<Type> findAll();
//	
//	
	private List<Student> studentList;
	
	
	
	public StudentRepositoryImpl() {
		super();
		// Declared and initialize the car
		this.studentList = new ArrayList<>();
		
	}
	

	@Override
	public boolean save(Student obj) {
		
//		this.studentList.add(obj);
		// Only obj can be pass
//		this.studentList.add(new String());
//		this.studentList.add(new Integer(),new String(),new Double());
		

		 return this.studentList.add(obj);
//		 return ;
		
	}

	@Override
	public Collection<Student> findAll() {
		// TODO Auto-generated method stub
		return this.studentList;
	}


	@Override
	public boolean delete(Student obj) throws ElementNotFoundException {
		if(this.studentList.contains(obj)) {
			return this.studentList.remove(obj);
		}else { 
			throw new ElementNotFoundException("ERR-106", "Element Not Found");
		}
		
	}
	

}
