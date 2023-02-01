package com.unigrad.funiversedummyproject.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/group")
public class GroupController {
    @GetMapping("/hello")
    public ResponseEntity<String> getHelloGroup(){
        return ResponseEntity.ok("Helu");
    }
}
