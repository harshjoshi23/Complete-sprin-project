package com.example.demo.utils;

import java.time.LocalDateTime;

import com.example.demo.entity.MobilePlan;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyExceptionHandler {
	
	LocalDateTime time;
	String message;
	String description;
	
//	Already adding all args constructor so no need for this line

//	public MyExceptionHandler(LocalDateTime now, String message, String description) {
//		// TODO Auto-generated constructor stub
//	}

}
