package io.turnatabl.DevelopersService.controllers;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.turnatabl.DevelopersService.dao.HoursDAO;
import io.turnatabl.DevelopersService.models.Develop;
import io.turnatabl.DevelopersService.models.Hours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class HoursDaoImpl implements HoursDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ApiOperation("ADD HOURS")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/addHours")
    @Override
    public void addHours(@RequestBody Hours hours) {
        this.jdbcTemplate.update(
                "insert into hours(title,activity,hours,date,comments) values(?,?,?,?,?)",
                 hours.getTitle(), hours.getActivity(), hours.getHours(),  hours.getDate(), hours.getComment()
        );

    }


}
