package com.training.ifaces;

import com.training.exception.ElementNotFoundException;
import com.training.model.Student;
import java.util.*;

public interface CrudRepository<Type> {
	// only working for Student when we are not maiking a <>
	public boolean save(Type obj);
//	public List<Type> findAll();
	public Collection<Type> findAll();
	public boolean delete(Type obj) throws ElementNotFoundException;
}
