package com.lick.controller;

import com.lick.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description：
 * @author: lick@hsyuntai.com
 * @date: 2017年11月21日 10:40
 * @copyright: 版权归hsyuntai 所有
 */
@RestController
public class IndexController {
    @Autowired
    private IndexService indexService;
    @RequestMapping("/")
    public String index(){
        return indexService.getIndexInfo();
    }
}
