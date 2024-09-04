package in.kmnk.orderService.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/orders")
public class OrderManagement {

    @Value("${msg:profile not working as expected in order}")
    private String message;

    @GetMapping("/home")
    public ResponseEntity<String> getOrder(){
        return new ResponseEntity<>("order created successfully", HttpStatus.OK);
    }

    @GetMapping("/get/profile")
    public ResponseEntity<String> getProfileData(){
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
