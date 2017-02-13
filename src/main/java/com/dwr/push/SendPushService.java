package com.dwr.push;

import java.util.Collection;

import org.directwebremoting.Browser;
import org.directwebremoting.ScriptBuffer;
import org.directwebremoting.ScriptSession;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.proxy.dwr.Util;
import org.springframework.stereotype.Service;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月12日 下午8:33:34 
 * @Description:
 */
@Service
public class SendPushService {
	
	public void send(String msg) throws InterruptedException {
		Runnable run = new Runnable(){
			private ScriptBuffer script = new ScriptBuffer();
			public void run() {
				//设置要调用的 js及参数
				script.appendCall("dwrTest", msg + "huaronghao");
				//得到所有ScriptSession
				Collection<ScriptSession> sessions = Browser.getTargetSessions();
				//遍历每一个ScriptSession
				for (ScriptSession scriptSession : sessions){
					scriptSession.addScript( script);
				}
			}
		};
		//执行推送
		Browser. withAllSessions(run);
	}
}
