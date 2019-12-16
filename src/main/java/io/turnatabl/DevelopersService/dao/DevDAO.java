package io.turnatabl.DevelopersService.dao;

import io.turnatabl.DevelopersService.models.Develop;

import java.util.List;


public interface DevDAO {

 List<Develop> getAllDev();

 Develop getDevByID(Integer emp_id);

 void addDev(Develop develop);

 void deleteDev(Integer emp_id);

 void updateDev(Integer id, Develop dev);

 List<Develop> searchDev(String emp_name);

 void logHours(Integer emp_id, Integer project_id);

 List<Develop> getDevByEmail(String emp_email);

}
