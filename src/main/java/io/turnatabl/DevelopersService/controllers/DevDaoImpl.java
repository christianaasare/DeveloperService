package io.turnatabl.DevelopersService.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.turnatabl.DevelopersService.dao.DevDAO;
import io.turnatabl.DevelopersService.transferObjects.DevTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

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


    @ApiOperation("ADD DEVELOPERS")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/Dev/AddDev")
    @Override
    public void addDev(@RequestBody Map<String, String> addDev) {
        try{
            jdbcTemplate.update(
                    "insert into developers(name,phone,address,email) values(?,?,?,?)",
                    addDev.get("name"),addDev.get("phone"), addDev.get("address"), addDev.get("email")
            );
        } catch (Exception e){
            System.out.println("Exeception Occured at | " + e.getMessage());
        }
    }

    @ApiOperation("DELETE DEVELOPERS BY ID")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/Dev/DeleteDev/{id}")
    @Override
    public void deleteDev(@PathVariable("id") Integer developer_id) {
        jdbcTemplate.update(
                "delete from develops where develop_id = ?", developer_id);
    }

    @ApiOperation("UPDATE A DEVELOPER")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/Dev/update/{id}")
    @Override
    public void updateDev(Integer developer_id, DevTO dev){
        this.jdbcTemplate.update(
                "update developers set name = ?, phone = ?, address = ?, email = ?, where developer_id = ?",
                dev.getDevName(), dev.getPhone(), dev.getAddress(), dev.getEmail()
        );
    }


}
