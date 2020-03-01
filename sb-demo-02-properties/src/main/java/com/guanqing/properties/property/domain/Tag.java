package com.guanqing.properties.property.domain;
/**
* create by guanqing
* 2020年2月28日 下午2:03:04
*/

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Lists;

import lombok.Data;

@Data
public class Tag {
	String thing;
	List<String> pks;
	
	public String getTag() {
		return thing + "." + StringUtils.join(pks, "||" + thing + ".");
	}
	
	public static void main(String[] args) {
		List<String> pk = Lists.newArrayList("A1","A2","A3");
		String thin = "GQ";
		System.out.println(thin +"."+ StringUtils.join(pk, "||" + thin + "."));
	}
}
