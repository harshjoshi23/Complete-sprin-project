package org.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class School {
	@Autowired
	@Qualifier(value = "student")
	private String schoolName;

	public School() {
	    super();
	    // TODO Auto-generated constructor stub
	}

	public School(String schoolName) {
	    super();
	    this.schoolName = schoolName;
	}



	public String getSchoolName() {
	    return schoolName;
	}



	public void setSchoolName(String schoolName) {
	    this.schoolName = schoolName;
	}



	@Override
	public String toString() {
	    return "School [schoolName=" + schoolName + "]";
	}

}


