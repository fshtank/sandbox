package com.fshtank.sanbox.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ErrorController {

    @RequestMapping(value = "/error",
            method = RequestMethod.GET,
            produces = {"application/vnd.status.v1+json;version=1.0",
                    "application/vnd.status.v1+xml;version=1.0"}
    )
    public String returnErrorResponse() {
        return "An error occurred processing your request";
    }

}
