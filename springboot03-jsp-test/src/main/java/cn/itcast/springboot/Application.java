package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 转化成Spring Boot的启动类
public class Application {

	public static void main(String[] args) {

		/** 第二种方式：用run方法运行Spring Boot应用 (去掉Banner) */
		SpringApplication springApplication = new SpringApplication(Application.class);
		/** 设置横幅模式: 关闭 */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args);

	}

}
