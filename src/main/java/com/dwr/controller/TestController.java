package com.dwr.controller;

import com.dwr.push.SendPushService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月12日 下午8:48:47 
 * @Description:
 */
@RestController
public class TestController {
	
	@Autowired
	private SendPushService sendPushService;
	
	@GetMapping("doIt")
	public void test(String content) throws InterruptedException {
		sendPushService.send(content);
	}
}
