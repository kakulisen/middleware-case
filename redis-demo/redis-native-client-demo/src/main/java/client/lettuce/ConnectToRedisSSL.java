package client.lettuce;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;

public class ConnectToRedisSSL {

  public static void main(String[] args) {

    /*
        redis本身并没有提供 SSL的特性，所以如果需要SSL需要其它的方案
        比如使用 stunnel
     */

    // SSL 调用只需要在 连接字符s串中把 redis协议换成 rediss协议
    // Syntax: rediss://[password@]host[:port][/databaseNumber]
    RedisClient redisClient = RedisClient.create("rediss://password@localhost:6379/0");
    StatefulRedisConnection<String, String> connect = redisClient.connect();
    System.out.println("Connect to Redis using SSL");
    connect.close();
    redisClient.shutdown();
  }

}
