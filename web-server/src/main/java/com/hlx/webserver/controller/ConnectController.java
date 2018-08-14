package com.hlx.webserver.controller;

import com.hlx.webserver.model.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 服务器连接测试
 * @author: hlx 2018-08-14
 **/
@RestController
@RequestMapping("/connect")
public class ConnectController {

    private static final Logger logger = LoggerFactory.getLogger(ConnectController.class);

    @RequestMapping(value="/test",method= RequestMethod.GET)
    public ApiResponse<String> test(){
        ApiResponse<String> apiResponse = new ApiResponse<>();
        apiResponse.setText("Connect Success");
        logger.info("测试接成功");
        return apiResponse;
    }

}