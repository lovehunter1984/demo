package com.hbuild.demo.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.awt.*;

@RestController
@RequestMapping("/api")
public class DemoController {

    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginResponse> login(HttpSession session, @RequestBody LoginRequest request) {
        System.out.println("aaaaa");
        String errorCode = "";
        String errorMessage;
        LoginResponse response = new LoginResponse();

        response.setLoginStatus("Test is success");
        response.setErrorMessage("No error wor");
        response.setErrorCode("No Code");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
