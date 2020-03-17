package com.guanqing.log.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.StrUtil;

/**
* create by guanqing
* 2020年3月17日 上午11:24:18
*/
@RestController
public class TestController {

	/**
	 * 测试方法
	 * @param who
	 * @return
	 */
	@GetMapping("/test")
	public Dict test(String who) {
		return Dict.create().set("who", StrUtil.isBlank(who) ?  "me" : who);
	}
	
}
