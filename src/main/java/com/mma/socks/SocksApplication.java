package com.mma.socks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SocksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocksApplication.class, args);
	}

}
