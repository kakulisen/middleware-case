## Redis的java客户端

[官方网址](https://redis.io/clients#java)

官方推荐3种，Jedis, lettuce和Redisson

值得注意的是 `org.springframework.boot:spring-boot-starter-data-redis:2.1.8.RELEASE`使用的是lettuce

### lettuce
* 官方使用文档：https://lettuce.io/core/release/reference/
基于Netty实现
* 优势：
  * 线程安全的同步 - thread-safe sync
  * 支持异步 - async
  * 响应式编程 - reactive usage
  * 支持集群，哨兵，管道和编码 - Supports Cluster, Sentinel, Pipelining, and codecs
  * 支持自动重连 -  Auto-Reconnect 

自定义了redis的连接URI，具体定义请看 https://lettuce.io/core/release/reference/#basic.redisuri

### Jedis
* github主页： https://github.com/xetorthio/jedis  
* 文档是真滴少，建议直接查看其github项目的测试代码，可以发现很多示例 https://github.com/xetorthio/jedis/tree/master/src/test/java/redis/clients/jedis/tests
