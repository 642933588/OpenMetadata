package org.openmetadata.service.config;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import io.dropwizard.lifecycle.Managed;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.commons.util.InetUtilsProperties;

import java.net.InetAddress;
import java.util.Properties;

public class NacosServiceDiscovery implements Managed {

    private NamingService namingService;
    private NacosConfig nacosConfig;

    public NacosServiceDiscovery(NacosConfig nacosConfig) throws NacosException {
        this.nacosConfig = nacosConfig;
        this.namingService = NacosFactory.createNamingService(getNacosProperties());
    }

    private Properties getNacosProperties() {
        Properties properties = new Properties();
        properties.put("serverAddr", nacosConfig.getServerAddr());
        properties.put("namespace", nacosConfig.getNamespace());
        return properties;
    }

    public Instance getServiceInstance(String serviceName) throws NacosException {
        return namingService.selectOneHealthyInstance(serviceName);
    }

    @Override
    public void start() throws Exception {

        // 注册服务
        namingService.registerInstance("ruoyi-metadata", getIp(), 8585);
    }

    @Override
    public void stop() throws Exception {
        // 取消注册
        namingService.deregisterInstance("ruoyi-metadata", getIp(), 8585);
    }

    private String getIp() {
        InetUtilsProperties properties = new InetUtilsProperties();
        InetUtils inetUtils = new InetUtils(properties);
        String realIpAddress = inetUtils.findFirstNonLoopbackHostInfo().getIpAddress();
        return realIpAddress;
    }
}

