package com.training.ifaces;

import com.training.exception.ElementNotFoundException;
import com.training.model.Student;
import java.util.*;

public interface CrudRepository<T> {
	// only working for Student when we are not maiking a <>
	public boolean save(T obj);
//	public List<Type> findAll();
	public Collection<T> findAll();
	public boolean delete(T obj) throws ElementNotFoundException;
	public T findById(int key) throws ElementNotFoundException;
}
