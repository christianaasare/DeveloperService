package io.turnatabl.DevelopersService.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.turnatabl.DevelopersService.dao.DevDAO;
import io.turnatabl.DevelopersService.transferObjects.DevTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Api
@RestController

public class DevDaoImpl implements DevDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ApiOperation("GET ALL DEVELOPERS")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/Dev")
    @Override
    public List<DevTO> getAllDev(){
        return this.jdbcTemplate.query("select * from developers", BeanPropertyRowMapper.newInstance(DevTO.class));
    }

//    @ApiOperation("GET DEVELOPERS BY ID")
//    @CrossOrigin(origins = "*", allowedHeaders = "*")
//    @GetMapping("/DevSearch")
//    @Override
//    public List<DevTO> getDevByID(){
//        return
//    }

    @ApiOperation("ADD DEVELOPERS")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/AddDev")
    @Override
    public void addDev(Map<String, String> addDev) {

    }

    @ApiOperation("DELETE DEVELOPERS")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/DeleteDev")
    @Override
    public void deleteDev(Integer DevId) {

    }



}
