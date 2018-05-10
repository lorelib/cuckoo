package com.lorelib.cuckoo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author listening
 * @description
 * @date 2018-05-08 10:49
 * @since 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@ComponentScan("com.lorelib")
public class ServiceStarterApplication {
  public static void main(String[] args) {
    SpringApplication.run(ServiceStarterApplication.class, args);
  }
}
