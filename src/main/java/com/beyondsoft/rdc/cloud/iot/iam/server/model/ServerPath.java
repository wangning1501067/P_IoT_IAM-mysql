package com.beyondsoft.rdc.cloud.iot.iam.server.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ServerPath {

    //服务端ip
    @Value("${websocket.server.ip}")
    public static String ip;

    //服务端端口
    @Value("${websocket.server.port}")
    public static String port;
}
