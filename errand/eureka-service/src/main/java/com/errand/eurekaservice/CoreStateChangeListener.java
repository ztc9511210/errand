package com.errand.eurekaservice;

import com.netflix.appinfo.InstanceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
public class CoreStateChangeListener {
    private static final Logger logger = LoggerFactory.getLogger(CoreStateChangeListener.class);
    private static final String PREDESC = "!!!!!!!!!!!!!!!!!!!!!!!!!!";
    private static final String DESC = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    private static final String DESCQ = "##################################";

    /**
     * 监听eureka
     * @param eurekaInstanceCanceledEvent
     */
    @EventListener
    public void listen(EurekaInstanceCanceledEvent eurekaInstanceCanceledEvent) {
        String appName = eurekaInstanceCanceledEvent.getAppName();
        String serverId = eurekaInstanceCanceledEvent.getServerId();
        String ipAddr = this.getIpAddr();
        logger.info(PREDESC+ "{}"+PREDESC+"{}"+"已从注册中心下线"+DESC,ipAddr,appName);
        logger.info(PREDESC+ "{}"+PREDESC+"{}"+DESC,ipAddr,serverId);
    }

    /**
     * 获取ip地址
     * @return
     */
    public String getIpAddr() {
        String localIp = "";
        try {

            localIp = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            logger.error("------------UnknownHostException------------------:{}",e);
        }
        return localIp;
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent eurekaInstanceRegisteredEvent){
        String ipAddr = this.getIpAddr();
        InstanceInfo instanceInfo =  eurekaInstanceRegisteredEvent.getInstanceInfo();
        logger.info(DESCQ+ "{}"+DESCQ+"{}"+"注册到注册中心"+DESCQ,ipAddr,instanceInfo.getAppName());
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent eurekaInstanceRenewedEvent){
        eurekaInstanceRenewedEvent.getAppName();
        eurekaInstanceRenewedEvent.getServerId();
    }

//    @EventListener
//    public void listen(EurekaRegistryAvailableEvent eurekaRegistryAvailableEvent){
//
//        Long time = eurekaRegistryAvailableEvent.getTimestamp();
//        String ipAddr = this.getIpAddr();
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+ipAddr+"!!!!!!!!!!!!!!!@@@@@@@@@@@@@@@@@@@@@@@@@@@!!!!!!!!!!!!!!!!"+time+"注册中心"+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//    }
//
//    @EventListener
//    public void listen(EurekaServerStartedEvent eurekaServerStartedEvent){
//        Object source = eurekaServerStartedEvent.getSource();
//        String ipAddr = this.getIpAddr();
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+ipAddr+"!!!!!!!!!!!!!!!!!!!!#########################!!!!!!!!!!!!!!!!!!!"+source+"注册中心"+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//
//
//    }

}
