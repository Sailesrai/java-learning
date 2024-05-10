package com.service;

import java.util.ArrayList;
import java.util.List;

import com.info.Info;

public class HospitalServiceimpl implements HospitalService {

	static List<Info> list = new ArrayList<>();
	
	@Override
	public void addPatient(Info i) {
		list.add(i);
		
	}

	@Override
	public void deletePatient(int index) {
		list.remove(index);
	}

	@Override
	public List<Info> getAllName() {
	
		return list;
	}

	

	
}
