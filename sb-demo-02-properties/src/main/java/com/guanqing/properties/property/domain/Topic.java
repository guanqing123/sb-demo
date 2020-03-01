package com.guanqing.properties.property.domain;
/**
* create by guanqing
* 2020年2月28日 下午2:02:39
*/

import java.util.List;
import lombok.Data;

@Data
public class Topic {
	String topic;
	List<Tag> tags;
	
	public String getExpression() {
		StringBuilder sb = new StringBuilder();
		for (Tag tag : tags) {
			if (sb.length() == 0) {
				sb.append(tag.getTag());
			} else {
				sb.append("||").append(tag.getTag());
			}
		}
		return sb.toString();
	}
}
