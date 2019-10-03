package client;

import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RedisSpringbootDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(RedisSpringbootDemoApplication.class, args);
  }

  @Autowired
  ConnectToRedis connectToRedis;

  @Bean
  ApplicationRunner runner() {
    return args -> {
      System.out.println("程序启动了");
      connectToRedis.addLink("test", new URL("https://localhost"));
    };
  }
}
