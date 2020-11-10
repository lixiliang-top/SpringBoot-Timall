package cn.kgc.timall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TimallApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimallApplication.class, args);
	}

}
