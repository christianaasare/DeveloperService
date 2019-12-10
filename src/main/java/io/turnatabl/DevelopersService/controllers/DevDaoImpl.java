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
        return this.jdbcTemplate.query("select * from developers", BeanPropertyRowMapper.newInstance(Develop.class));
    }


    @ApiOperation("ADD DEVELOPERS")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/dev/addDev")
    @Override
    public void addDev(@RequestBody Develop dev) {
            jdbcTemplate.update(
                    "insert into developers(name,phone,address,email) values(?,?,?,?)",
                    dev.getDevName(), dev.getPhone(), dev.getEmail(), dev.getAddress()
            );

    }

    @ApiOperation("DELETE DEVELOPERS BY ID")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/dev/deleteDev/{id}")
    @Override
    public void deleteDev(@PathVariable("id") Integer developer_id) {
        jdbcTemplate.update(
                "delete from developers where develop_id = ?", developer_id);
    }

    @ApiOperation("UPDATE A DEVELOPER")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/dev/update/{id}")
    @Override
    public void updateDev(Integer developer_id, Develop dev){
        this.jdbcTemplate.update(
                "update developers set name = ?, phone = ?, address = ?, email = ?, where developer_id = ?",
                dev.getDevName(), dev.getPhone(), dev.getAddress(), dev.getEmail()
        );
    }


    @ApiOperation("Get a project by Id")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/dev/{dev_id}")
    @Override
    public Develop getDevByID(@PathVariable Integer develop_id) {
        return (Develop) this.jdbcTemplate.query("select * from developers where developer_id = 1",
                new Object[]{develop_id},
                BeanPropertyRowMapper.newInstance(Develop.class));
    }



    @ApiOperation("SEARCH FOR DEVELOP")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/dev/search/{name}")
    @Override
    public List<Develop> searchDev(@PathVariable String name) {
        return this.jdbcTemplate.query("select * from developers where name like ?",
                new Object[]{name + "%"},
                BeanPropertyRowMapper.newInstance(Develop.class));
    }

}
