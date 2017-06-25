## multiple profile ##



```yaml
---
spring:
  application:
    name: eureka-server
---
spring:
  profiles: peer1
server:
  port: 8761
eureka:
  instance:
     hostname: peer1
  client:
     registerWithEureka: false
     fetchRegistry: false
     serviceUrl:
         defaultZone: http://peer2:8762/eureka/
---

spring:
  profiles: peer2
eureka:
  instance:
     hostname: peer2
  client:
     registerWithEureka: false
     fetchRegistry: false
     serviceUrl:
         defaultZone: http://peer1:8761/eureka/
server:
  port: 8762


```

```shell
java -jar -Dspring.profiles.active=peer1/peer2 app-name.jar
```

