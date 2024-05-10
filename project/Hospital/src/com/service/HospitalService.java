package com.service;
import java.util.List;

import com.info.Info;

public interface HospitalService {
   void addPatient(Info i);
   void deletePatient(int index);
   List<Info> getAllName();
}
