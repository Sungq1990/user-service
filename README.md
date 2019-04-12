# 用户服务

## 前提
* 数据库配置正确
* ZooKeeper连接信息正确 

## 快速启动
```
mvn clean install -Dmaven.test.skip=true
cd user-service-provider
mvn spring-boot:run
```
## 打包运行
```
mvn clean install -Dmaven.test.skip=true
cd user-service-provider
mvn package -Dmaven.test.skip=true
java -jar target/user-service-provider-1.0-SNAPSHOT.jar
```

启动后，控制台会有输出，看到`started`表示启动成功。
启动失败，会有错误日志，根据日志，排查错误。

## 导入IDEA
直接使用file--> open 即可