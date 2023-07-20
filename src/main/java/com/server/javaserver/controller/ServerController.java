package com.server.javaserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

        @RequestMapping("/")
        public String index() {
            return "Server is running!";
        }
}
