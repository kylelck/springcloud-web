package com.lick.service.impl;

import com.lick.integration.IndexClient;
import com.lick.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description：
 * @author: lick
 * @date: 2017年11月30日 13:39
 * @copyright: 版权归 lick 所有
 */
@Service
public class IndexServiceImpl implements IndexService {
    private static final String BASE_URL = "http://web-service/";
    @Autowired
    private IndexClient indexClient;

    @Override
    public String getIndexInfo(){
        return indexClient.getIndexInfo();
    }
}
