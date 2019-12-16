package io.turnatabl.DevelopersService.controllers;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.turnatabl.DevelopersService.dao.ProjectLoggingDAO;
import io.turnatabl.DevelopersService.models.ProjectLogging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
public class ProjectLoggingDaoImpl implements ProjectLoggingDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ApiOperation("ADD HOURS")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/addHours")
    @Override
    public void addHours(@RequestBody ProjectLogging projectLogging) {
        this.jdbcTemplate.update(
                "insert into projectlogging(title,hours,date, emp_id, project_id) values(?,?,?::date,?,?)",
                 projectLogging.getTitle(), projectLogging.getHours(), projectLogging.getDate(), projectLogging.getEmp_id(), projectLogging.getProject_id()
        );
    }


    @ApiOperation("GET ALL PROJECTS LOGS")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/log")
    @Override
    public List<ProjectLogging> getAllProjectLogging(){
        return this.jdbcTemplate.query("select * from projectlogging",
                BeanPropertyRowMapper.newInstance(ProjectLogging.class));
    }

}
