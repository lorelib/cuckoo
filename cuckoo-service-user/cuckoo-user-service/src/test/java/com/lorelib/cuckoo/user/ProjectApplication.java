package com.lorelib.cuckoo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
public class ProjectApplication {
  public static void main(String[] args) {
    SpringApplication.run(ProjectApplication.class, args);
  }
}
