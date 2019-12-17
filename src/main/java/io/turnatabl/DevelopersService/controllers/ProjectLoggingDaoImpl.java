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
                "insert into projectlogging(project_hours,date, emp_id, project_id,volunteering_hours) values(?,?::date,?,?,?)",
                 projectLogging.getProject_hours(), projectLogging.getDate(), projectLogging.getEmp_id(), projectLogging.getProject_id(), projectLogging.getVolunteering_hours()
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


    @ApiOperation("ADD SICK")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/addSick")
    @Override
    public void addSick(@RequestBody ProjectLogging projectLogging) {
        this.jdbcTemplate.update(
                "insert into projectlogging(project_hours,date, emp_id,volunteering_hours,sick) values(0,?::date,?,0,'SICK')",
                projectLogging.getProject_hours(), projectLogging.getDate(), projectLogging.getEmp_id(), projectLogging.getVolunteering_hours(), projectLogging.getSick()
        );
    }

    @ApiOperation("ADD VACATION")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/addVacation")
    @Override
    public void addVacation(@RequestBody ProjectLogging projectLogging) {
        this.jdbcTemplate.update(
                "insert into projectlogging(project_hours,date, emp_id, project_id,volunteering_hours,vacation) values(0,?::date,?,0,0,'VACATION')",
                projectLogging.getProject_hours(), projectLogging.getDate(), projectLogging.getEmp_id(), projectLogging.getProject_id(), projectLogging.getVolunteering_hours(), projectLogging.getVacation()
        );
    }

}
