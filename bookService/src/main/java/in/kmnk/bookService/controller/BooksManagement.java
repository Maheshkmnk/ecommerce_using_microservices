package in.kmnk.bookService.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BooksManagement {

    @Value("${msg:config server not working as expected in book}")
    private String message;

    @GetMapping("/home")
    public ResponseEntity<String> getBook(){
        return new ResponseEntity<>("RichDad and PoorDad", HttpStatus.OK);
    }

    @GetMapping("/get/profile")
    public ResponseEntity<String> getProfile(){
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
