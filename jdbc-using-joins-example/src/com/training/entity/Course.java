package com.training.entity;

import java.time.LocalDate;
import java.util.Set;

public class Course {
	private int courseId;
	private String courseName;
	private LocalDate startDate;
	
	private Set<Participant> list;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String courseName, LocalDate startDate) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.startDate = startDate;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public Set<Participant> getList() {
		return list;
	}
	public void setList(Set<Participant> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", startDate=" + startDate + "]";
	}
	
	
}
