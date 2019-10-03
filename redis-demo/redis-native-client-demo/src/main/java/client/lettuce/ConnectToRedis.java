package client.lettuce;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

public class ConnectToRedis {

  public static void main(String[] args) {

    // 第一步： 获取 RedisClient对象
    // Syntax: redis://[password@]host[:port][/databaseNumber]
    RedisClient redisClient = RedisClient.create("redis://password@localhost:6379/0");

    // 第二步： 进行连接
    StatefulRedisConnection<String, String> connection = redisClient.connect();

    // 第三步： 通过已建立的连接获取同步命令对象
    RedisCommands<String, String> syncCommands = connection.sync();

    // 第四步： 发起各种redis命令
    syncCommands.set("key", "Hello, Redis!");
    String key = syncCommands.get("key");
    System.out.println(key);
    connection.close();
    redisClient.shutdown();
  }
}
