package com.github.monkeywie.proxyee;

import com.github.monkeywie.proxyee.server.HttpProxyServer;

/**
 * @Author LiWei
 * @Description
 * @Date 2019/9/23 17:30
 */
public class HttpProxyServerApp {
    public static void main(String[] args) {

        int port = 9999;
        if (args.length > 0) {
            port = Integer.valueOf(args[0]);
        }

        System.out.println("start proxy server");
        System.out.println("proxy url -> http://127.0.0.1:" + port);

        new HttpProxyServer().start(port);
    }
}