package client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

import io.lettuce.core.ReadFrom;

@Configuration
public class AppConfig {

  @Bean
  public LettuceConnectionFactory redisConnectionFactory() {

    LettuceClientConfiguration clientConfig = LettuceClientConfiguration.builder()
        .readFrom(ReadFrom.SLAVE)
        .build();
    RedisStandaloneConfiguration serverConfig = new RedisStandaloneConfiguration("localhost", 6379);
    serverConfig.setPassword("password");
    return new LettuceConnectionFactory(serverConfig, clientConfig);
  }
//
//  @Bean
//  public RedisTemplate redisTemplate() {
//    RedisTemplate redisTemplate = new RedisTemplate();
//    redisTemplate.setConnectionFactory(redisConnectionFactory());
//    return redisTemplate;
//  }

//  @Bean
//  public JedisConnectionFactory redisConnectionFactory2() {
//    RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("localhost", 6379);
//    return new JedisConnectionFactory();
//  }
}
