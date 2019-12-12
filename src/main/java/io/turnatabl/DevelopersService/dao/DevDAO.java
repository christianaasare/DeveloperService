package io.turnatabl.DevelopersService.dao;

import io.turnatabl.DevelopersService.models.Develop;

import java.util.List;


public interface DevDAO {

 List<Develop> getAllDev();

 Develop getDevByID(Integer id);

 void addDev(Develop develop);

 void deleteDev(Integer id);

 void updateDev(Integer id, Develop dev);

 List<Develop> searchDev(String name);

}
