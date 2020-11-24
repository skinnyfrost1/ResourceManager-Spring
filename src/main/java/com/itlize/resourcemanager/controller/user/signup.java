package com.itlize.resourcemanager.controller.user;

import com.itlize.resourcemanager.entity.User;
import com.itlize.resourcemanager.models.SignupRequest;
import com.itlize.resourcemanager.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Slf4j
@Controller
public class signup {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/signup")
    public ResponseEntity<?> postSignup(@RequestBody SignupRequest requestBody){

        Optional<User> user = userRepository.findByUsername(requestBody.getUsername());
        System.out.println(user.toString());
        if(user.isPresent()){
            log.warn("username is exist");
//            log.debug("username is " + user.toString());
            return ResponseEntity.badRequest().body( "username is exist.");
        }
        System.out.println("username is not exist");
        if (!requestBody.getPassword().equals(requestBody.getConfirmPassword())){
            return ResponseEntity.badRequest().body("password and confirm password not the same.\n"+requestBody.getPassword()+"\n"+requestBody.getConfirmPassword());
        }
        String password = passwordEncoder.encode(requestBody.getPassword());

        User newUser = new User();
        newUser.setUsername(requestBody.getUsername());
        newUser.setPassword(password);
        newUser.setEmail(requestBody.getEmail());
        newUser.setFirst_name(requestBody.getFirst_name());
        newUser.setLast_name(requestBody.getLast_name());
        newUser.setRoles("ROLE_USER");
        newUser.setActive(true);
        userRepository.save(newUser);
        log.info("log success");
        return ResponseEntity.ok("Success");
    }
//    @PostMapping("/register")
//    AuthResponse register(@RequestBody UserEntity userEntity)
//            throws NoSuchAlgorithmException, InvalidKeySpecException {
//
//        AuthResponse authResponse = new AuthResponse();
//        String username = userEntity.getUsername();
//
//        if (userRepository.existsByUsername(username)) {
//            throw new Error("User '" + username + "' already exists!");
//        }
//
//        String salt = passwordEncryption.generateSalt();
//        String password = passwordEncryption.getEncryptedPassword(userEntity.getPassword(), salt);
//
//        userEntity.setSalt(salt);
//        userEntity.setPassword(password);
//        userEntity.setJoined(new Date());
//        userEntity.setRoles(Arrays.asList(Role.ROLE_CLIENT));
//        userEntity = userRepository.save(userEntity);
//        authResponse.setUserEntity(userEntity);
//
//        String token = jwtTokenProvider.createToken(userEntity.getUsername(), userEntity.getRoles());
//        authResponse.setToken(token);
//
//        return authResponse;
//    }



}
