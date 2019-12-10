package io.turnatabl.DevelopersService.dao;

import io.turnatabl.DevelopersService.models.Develop;

import java.util.List;
import java.util.Map;

public interface DevDAO {

 List<Develop> getAllDev();

 Develop getDevByID(Integer developer_id);

 void addDev(Develop develop);

 void deleteDev(Integer developer_id);

 void updateDev(Integer developer_id, Develop dev);

 List<Develop> searchDev(String name);

}
