package com.example.courseapiii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


//@ComponentScan(basePackages="com.base.package")
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })




//@EnableJpaRepositories("com.example.courseapiii.Controller.repository")
public class CourseapiiiApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CourseapiiiApplication.class, args);
	}
}
