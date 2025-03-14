package fun.cyhgraph;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching // 开启缓存注解功能
@EnableScheduling // 开启定时调度功能11212121
@Slf4j
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
        log.info("server started successfully!");
    }

}
//yyyyyyyyyyyyyyyy
//hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
//hhhhhhhhhhhhh
//中途被叫出去开发新功能
//1
//2
//3
//4
//5
