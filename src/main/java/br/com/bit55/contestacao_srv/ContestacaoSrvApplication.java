package br.com.bit55.contestacao_srv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"controller", "service", "feign", "config", "metrics"})
@EnableFeignClients(basePackages = "feign")
public class ContestacaoSrvApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContestacaoSrvApplication.class, args);
	}

}
