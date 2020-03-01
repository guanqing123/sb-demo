package com.guanqing.properties.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guanqing.properties.property.AliOnsProperty;
import com.guanqing.properties.property.ApplicationProperty;
import com.guanqing.properties.property.DeveloperProperty;

import cn.hutool.core.lang.Dict;

/**
* create by guanqing
* 2020年2月25日 上午10:59:02
*/
@RestController
public class PropertyController {
	private final ApplicationProperty applicationProperty;
	private final DeveloperProperty developerProperty;
	private final AliOnsProperty aliOnsProperty;
	
	@Autowired
	public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty, AliOnsProperty aliOnsProperty) {
		this.applicationProperty = applicationProperty;
		this.developerProperty = developerProperty;
		this.aliOnsProperty = aliOnsProperty;
	}
	
	@GetMapping("/property")
	public Dict index() {
		return Dict.create().set("applicationProperty", applicationProperty)
				.set("developerProperty", developerProperty)
				.set("aliOnsProperty", aliOnsProperty.getTags());
	}
}
