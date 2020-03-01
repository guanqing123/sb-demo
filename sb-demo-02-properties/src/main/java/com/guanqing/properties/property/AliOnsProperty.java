package com.guanqing.properties.property;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;
import com.guanqing.properties.property.domain.Subscription;
import com.guanqing.properties.property.domain.Topic;

import lombok.Data;

/**
* create by guanqing
* 2020年2月28日 下午1:57:08
*/
@Data
@Component
@ConfigurationProperties(prefix = AliOnsProperty.ALIONS_PREFIX)
public class AliOnsProperty {
	
	public static final String ALIONS_PREFIX = "aliyun.ons";

	List<Topic> topics;
	
	public List<Subscription> getTags() {
		List<Subscription> list = Lists.newArrayList();
		for (Topic topic : topics) {
			Subscription sub = new Subscription();
			sub.setTopic(topic.getTopic());
			sub.setExpression(topic.getExpression());
			list.add(sub);
		}
		return list;
	}
}
