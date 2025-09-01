package com.singletondesignpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternsApplication {

  public static void main(String[] args) {
     Singleton instance = Singleton.getInstance();
      Singleton instance2 = Singleton.getInstance();

      System.out.println( instance.hashCode());
    System.out.println( instance2.hashCode());
  }

}
