package io.turnatabl.DevelopersService.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.turnatabl.DevelopersService.dao.DevDAO;
import io.turnatabl.DevelopersService.models.Develop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController

public class DevDaoImpl implements DevDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ApiOperation("GET ALL DEVELOPERS")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/dev")
    @Override
    public List<Develop> getAllDev(){
        return this.jdbcTemplate.query("select * from employees where emp_role = 'admin' is unknown", BeanPropertyRowMapper.newInstance(Develop.class));
    }


    @ApiOperation("ADD DEVELOPERS")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/add")
    @Override
    public void addDev(@RequestBody Develop dev) {
            this.jdbcTemplate.update(
                    "insert into employees(emp_name,emp_phone,emp_address,emp_email) values(?,?,?,?) where emp_role = 'admin' is unknown",
                    dev.getEmp_name(), dev.getEmp_phone(), dev.getEmp_email(), dev.getEmp_address()
            );

    }

    @ApiOperation("DELETE DEVELOPERS BY ID")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/dev/deleteDev/{emp_id}")
    @Override
    public void deleteDev(@PathVariable("emp_id") Integer emp_id) {
        jdbcTemplate.update(
                "delete from employees where emp_id = ?", emp_id);
    }

    @ApiOperation("UPDATE A DEVELOPER")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/dev/update/{emp_id}")
    @Override
    public void updateDev(Integer developer_id, Develop dev){
        this.jdbcTemplate.update(
                "update employees set emp_name = ?, emp_phone = ?, emp_address = ?, emp_email = ?, where emp_id = ?",
                dev.getEmp_name(), dev.getEmp_phone(), dev.getEmp_address(), dev.getEmp_email()
        );
    }


    @ApiOperation("GET A DEVELOPER BY ID")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/dev/{emp_id}")
    @Override
    public Develop getDevByID(@PathVariable("emp_id") Integer emp_id) {
        List<Develop> develops = jdbcTemplate.query("select * from employees where emp_id = ?",
                new Object[]{emp_id},
                BeanPropertyRowMapper.newInstance(Develop.class));
        return develops.get(0);
    }



    @ApiOperation("SEARCH FOR DEVELOP")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/dev/search/{emp_name}")
    @Override
    public List<Develop> searchDev(@PathVariable String emp_name) {
        return this.jdbcTemplate.query("select * from employees where emp_name like ?",
                new Object[]{emp_name + "%"},
                BeanPropertyRowMapper.newInstance(Develop.class));
    }

}
