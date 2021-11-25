package hoop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "hoop.Mappers")
public class HoopApplication {

    public static void main(String[] args) {
        SpringApplication.run(HoopApplication.class, args);
    }

}
