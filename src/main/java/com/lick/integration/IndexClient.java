package com.lick.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @description： 首页获取接口
 * @author: lick
 * @date: 2017年11月30日 13:55
 * @copyright: 版权归 lick 所有
 */
@Component
@PropertySource(value = {"classpath:config/service.properties"},encoding = "utf-8")
public class IndexClient {
    @Value("${service.base-ervice}")
    private String BaseServiceUrl;
    @Autowired
    private RestTemplate restTemplate;

    public String getIndexInfo(){
        return restTemplate.getForEntity(BaseServiceUrl+"index",String.class).getBody();
    }
}

