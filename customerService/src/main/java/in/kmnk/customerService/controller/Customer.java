package in.kmnk.customerService.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
//@Profile("prod")
public class Customer {

    @Value("${msg:Config server not working as expected}")
    private String message;

    @GetMapping("/home")
    public ResponseEntity<String> getCustomer(){
        return new ResponseEntity<>("Hello welcome to customer service",HttpStatus.OK);
    }

//    @Profile("dev")
    @GetMapping("/get/profile")
    public ResponseEntity<String> getProfileData(){
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
