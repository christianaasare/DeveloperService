package io.turnatabl.DevelopersService.controllers;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.turnatabl.DevelopersService.dao.ProjectLoggingDAO;
import io.turnatabl.DevelopersService.models.Develop;
import io.turnatabl.DevelopersService.models.ProjectLogging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
public class ProjectLoggingDaoImpl implements ProjectLoggingDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ApiOperation("ADD HOURS")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/addHours")
    @Override
    public void addHours(@RequestBody ProjectLogging projectLogging) {
        this.jdbcTemplate.update(
                "insert into projectlogging(hours,date) values(?,?)",
                 projectLogging.getHours(), projectLogging.getDate()
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
