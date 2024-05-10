package com.service;

import java.util.List;
import com.model.Data;
import com.model.Data2;
public interface CRUD {

	void addStudent(Data2 p); 
	void deleteStudent(int index);
	List<Data> getAllDetails();

	
}
