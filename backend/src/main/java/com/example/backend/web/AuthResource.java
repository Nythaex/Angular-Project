package com.example.backend.web;

import com.example.backend.models.binding.LoginBinding;
import com.example.backend.models.binding.RegisterBinding;
import com.example.backend.models.entitie.User;
import com.example.backend.models.view.LogOutView;
import com.example.backend.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin()
@RestController()
public class AuthResource {
    private  final UserService userService;

    public AuthResource(UserService userService) {
        this.userService = userService;
    }



    @PostMapping("/auth/register")
    public ResponseEntity<RegisterBinding> registerUser(@RequestBody RegisterBinding registerBinding){


        if (userService.existByEmail(registerBinding.getEmail())){
            return ResponseEntity.badRequest().build();
        }

        User user = new User();
        user.setEmail(registerBinding.getEmail());
        user.setPassword(registerBinding.getPassword());

       userService.saveUser(user);


        return ResponseEntity.ok(registerBinding);

    }


    @PostMapping("/auth/login")
    public ResponseEntity<User> registerUser(@RequestBody LoginBinding loginBinding){
        User user=userService.getUserByEmail(loginBinding.getEmail());
        if (user==null){
            return ResponseEntity.badRequest().build();
        }

        Boolean checked=userService.checkLogin(loginBinding.getEmail(),loginBinding.getPassword());
        System.out.println(checked);
        if (!checked){

            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(user);

    }
    @ResponseStatus( HttpStatus.OK )
    @PostMapping("/auth/logout")
    public void logoutUser(){

    }

    @ResponseStatus( HttpStatus.OK )
    @PostMapping("/auth/email-exists")
    public ResponseEntity<Boolean> existsEmail(@RequestBody LoginBinding loginBinding){

        return ResponseEntity.ok(userService.existByEmail(loginBinding.getEmail()));
    }

}
