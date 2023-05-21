package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
//Esta annotation configura que en esta clase habra endpoints
/*Se necesita una conexion con bases de datos 
 * spring.datasource.url=jdbc:mysql://localhost:3306/mydb*/
@RestController
@SpringBootApplication
public class DemoCrudSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCrudSpringBootApplication.class, args);
	}
	
	/*Annotactíon para decirle que tipo de request va a ser el 
	metodoRequest de tipo get*/
	@GetMapping("/hello") // This means URL's start with /hello (after Application path)
	public String welcome() {
		return "Hello World!";
	}
	
	//Create path param
	@GetMapping("/{name}")
	public String nameFunction(@PathVariable String name){
		return "Hola " + name.toUpperCase();	
	}
	
	//Create a query param 
	@GetMapping("/name")
	public String nameFunction2(@RequestParam(value="name")String name) {
		return "Hello "+ name;	
	}
	
	
	
	
	//Create a Post Request
//	@PostMapping("/post")
//	public Customer postCustomer(@RequestBody Customer cliente) {
//		cliente.name= cliente.name + " updated";
//		cliente.lastName= cliente.lastName + " updated";
//		
//		return cliente;
//	}
}

