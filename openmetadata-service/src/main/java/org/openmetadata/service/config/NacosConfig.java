package org.openmetadata.service.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NacosConfig {

    @JsonProperty("serverAddr")
    private String serverAddr;

    @JsonProperty("namespace")
    private String namespace;

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    // Getters and setters
    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

