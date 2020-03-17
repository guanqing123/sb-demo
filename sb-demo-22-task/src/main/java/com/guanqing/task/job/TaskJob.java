package com.guanqing.task.job;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;

/**
* create by guanqing
* 2020年3月17日 下午4:05:34
*/
@Component
@Slf4j
public class TaskJob {

    /**
     * 按照标准时间来算，每隔 10s 执行一次
     */
    @Scheduled(cron = "0/10 * * * * ?")
    public void job1() {
        log.info("【job1】开始执行：{}", DateUtil.formatDateTime(new Date()));
    }
    
    /**
     * 从启动时间开始，间隔 2s 执行
     * 固定间隔时间
     */
    @Scheduled(fixedRate = 2000)
    public void job2() {
        log.info("【job2】开始执行：{}", DateUtil.formatDateTime(new Date()));
    }
	
    /**
     * 从启动时间开始，延迟 5s 后间隔 4s 执行
     * 固定等待时间
     */
    @Scheduled(fixedDelay = 4000, initialDelay = 5000)
    public void job3() {
        log.info("【job3】开始执行：{}", DateUtil.formatDateTime(new Date()));
    }
}
