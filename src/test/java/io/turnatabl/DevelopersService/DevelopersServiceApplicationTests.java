package io.turnatabl.DevelopersService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RunWith(SpringRunner.class)
@EnableSwagger2
@SpringBootTest
public class DevelopersServiceApplicationTests {
	public static void main(String[] args){
		SpringApplication.run(DevelopersServiceApplication.class, args);}

	@Test
	public void contextLoads() {
	}

}
