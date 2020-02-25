package com.guanqing.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.hutool.core.util.StrUtil;

@SpringBootApplication
@RestController
public class SbDemo01HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbDemo01HelloworldApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam(required = false, name = "who") String who) {
		if (StrUtil.isBlank(who)) {
			who = "World";
		}
		return StrUtil.format("Hello, {}", who);
	}
	
}
