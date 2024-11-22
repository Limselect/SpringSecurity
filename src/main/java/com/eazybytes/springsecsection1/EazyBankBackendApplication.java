package com.eazybytes.springsecsection1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.eazybytes.springsecsection1.controller")
//main 외부의 패키지를 식별하고자 할때 ComponentScan과 같은 어노테이션을 사용함.
public class EazyBankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyBankBackendApplication.class, args);
	}

}
