package com.training.services;
import java.io.*;

import com.training.Book;
import com.training.model.Student;


public class FileService {
	
	

	public boolean writeToTextFile(Student obj, File file) {
        boolean result = false;
        try(PrintWriter writer = new PrintWriter(new FileWriter(file,true))){
            writer.println(obj);
            result = true;
        }catch(IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public double findMaxMArks(File file) throws IOException {
        double maxMark = -1;
        String line = null;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while( (line = reader.readLine()) != null) {
            String[] value = line.split(",");
            double mark = Double.parseDouble(value[2]);
            maxMark = (mark>maxMark)?mark:maxMark;
        }
        return maxMark;
    }
	
	
	
	// Called a composition cons of one class new PrintWriter and its 
	// argument is also a constructor
//	public boolean writeToTextFile(Book obj, File file) {
//		
//		boolean result = false;
//		try(PrintWriter writer = 
//		new PrintWriter(new FileWriter(file,true))){
//		writer.println(obj);
//		result = true;
//		
//	}catch(IOException e) {
//		e.printStackTrace();
//	}
//		return result;
//
//	}

	public Book[] readFromTextFile(File file) throws IOException {
		
		Book[] bookList = new Book[2];
		String line = null;
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		int idx = 0;
		while((line = reader.readLine())!= null) {
			// readLine throws a checked io exception
			String[] values = line.split(",");
			//
			Book book = new Book(Integer.parseInt(values[0]),values[1],values[2],
					Double.parseDouble(values[3]));
			
			
			bookList[idx] = book;
			idx++;
		}
		
		reader.close();
		return bookList;
	}
	public boolean serialize(Book book, File file) {
		
		
		boolean result = false; 
		
		ObjectOutputStream outStream = null;
		try {
			
			outStream = new ObjectOutputStream(new FileOutputStream(file));
			outStream.writeObject(book);
			result = true;
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			// To close our stream
			try {
				outStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}

	// Our deserialize method
	
	public Book deserialize(File file) {
		Book book = null; 
		
		try(ObjectInputStream inStream =
				new ObjectInputStream(new FileInputStream(file))){
			
			book = (Book)inStream.readObject();
			
		}catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		return book; 
	}
	
}


