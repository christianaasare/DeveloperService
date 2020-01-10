package io.turnatabl.DevelopersService.controllers;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.turnatabl.DevelopersService.dao.ReportDAO;
import io.turnatabl.DevelopersService.models.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
public class ReportDaoImp implements ReportDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ApiOperation("GET ALL REPORT")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/report")
    @Override
    public List<Report> getAllReport(){
        return this.jdbcTemplate.query("select * from report",
                BeanPropertyRowMapper.newInstance(Report.class));
    }



}
