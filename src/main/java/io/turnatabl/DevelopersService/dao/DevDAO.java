package io.turnatabl.DevelopersService.dao;

import io.turnatabl.DevelopersService.transferObjects.DevTO;

import java.util.List;
import java.util.Map;

public interface DevDAO {
 List<DevTO> getAllDev();
// List<DevTO> getDevByID();
 void addDev(Map<String, String> addDev);
 void deleteDev(Integer DevId);

}
