package com.guanqing.properties.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
* create by guanqing
* 2020年2月25日 上午11:12:51
*/
@Data
@Component
@ConfigurationProperties(prefix = "developer")
public class DeveloperProperty {
	private String name;
	private String website;
	private String qq;
	private String phoneNumber;
}
