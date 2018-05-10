package com.lorelib.cuckoo.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author listening
 * @description
 * @date 2018-05-08 13:31
 * @since 1.0
 */
@SpringBootApplication
@EnableTransactionManagement
@ComponentScan("com.lorelib")
public class OrderServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(OrderServiceApplication.class, args);
  }
}
