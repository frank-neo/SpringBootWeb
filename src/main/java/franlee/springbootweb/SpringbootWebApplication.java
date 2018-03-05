package franlee.springbootweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("franlee.springbootweb.mapper")
//扫描并且启动filter
@ServletComponentScan
public class SpringbootWebApplication {
	
	//入口
	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}
}