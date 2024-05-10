package com.view;
import java.util.List;
import java.util.Scanner;

import com.info.Info;

import com.service.*;

public class Test {
public static void main(String[] args) {
	add();
	getAll();
	delete();
	getAll();
}

//add patient 
  static void add() {
	  Scanner sc = new Scanner(System.in);
	  HospitalService h = new HospitalServiceimpl();
	  Info i = new Info();
	  char flag = 'y';
	  i.setId(245);
	  i.setName("Bardan");
	  i.setAddress("Ass");
	  i.setDept("Gastic");
	  
	  h.addPatient(i);
	//  flag  = sc.next().charAt(0);
  }

  
//delete patient
  static void delete() {
	  HospitalService h = new HospitalServiceimpl();

	  h.deletePatient(0);
  }

//view 
  static void getAll() {
	  HospitalService h = new HospitalServiceimpl();
	  List<Info> list = h.getAllName();
	  
	  System.out.println(list);
  }
  
}
