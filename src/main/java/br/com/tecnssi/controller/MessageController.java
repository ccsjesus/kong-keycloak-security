package br.com.tecnssi.controller;

import br.com.tecnssi.security.roles.PermittedForAdmin;
import br.com.tecnssi.security.roles.PermittedForStudents;
import br.com.tecnssi.security.roles.PermittedForTeachers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messages")
public class MessageController {

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity getMessages(){
       return ResponseEntity.ok().body("OK");
    }

    @PermittedForStudents
    @GetMapping("/students")
    public ResponseEntity <String> getUser () {
        return ResponseEntity. ok ( "Endpoint students" );
    }

    @PermittedForAdmin
    @GetMapping("/admin")
    public ResponseEntity <String> getAdmin () {
        return ResponseEntity. ok ( "Endpoint admin" );
    }

    @PermittedForTeachers
    @GetMapping("/teachers")
    public ResponseEntity <String> getAllUser () {
        return ResponseEntity. ok ( "Endpoint all teachers" );
    }
}
