/**
 * 
 */
/**
 * @author jesus.chavez
 *
 */
package com.jchavez.microservices.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ApplicationConfigServer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationConfigServer.class, args);
	}
}