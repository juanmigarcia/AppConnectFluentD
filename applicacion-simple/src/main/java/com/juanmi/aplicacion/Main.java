package com.juanmi.aplicacion;

import java.util.HashMap;
import java.util.Map;
import org.fluentd.logger.FluentLogger;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	
public class Main {

	private static FluentLogger LOG = FluentLogger.getLogger("app", "fluentd-ui-persistent-noel.192.168.99.100.nip.io", 24224);
	//LOCAL DOCKER: private static FluentLogger LOG = FluentLogger.getLogger("app", "192.168.99.101", 24224);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("from", "userA");
        data.put("to", "userB");
        LOG.log("follow", data);
	}
}
