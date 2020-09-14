package com.itlize.resourcemanager.controller.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @GetMapping(value = "/")
    public ResponseEntity<?> getTest (){
        return new ResponseEntity<String>("hello world", HttpStatus.ACCEPTED);
    }

    @GetMapping (value = "/user")
    public ResponseEntity<?> getUser (){
        return new ResponseEntity<String>("hello User", HttpStatus.ACCEPTED);
    }

    @GetMapping (value = "/admin")
    public ResponseEntity<?> getAdmin (){
        return new ResponseEntity<String>("hello Admin", HttpStatus.ACCEPTED);
    }
}
