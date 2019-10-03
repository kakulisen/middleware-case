package client.jedis;

import redis.clients.jedis.Jedis;

public class ConnectToRedis {

  public static void main(String[] args) {
    // 通过uri创建Jedis对象
    Jedis jedis = new Jedis("localhost");

    // 设置密码
    jedis.auth("password");

    // 下发命令
    jedis.set("foo", "bar");
    String value = jedis.get("foo");
    System.out.println(value);
  }
}
