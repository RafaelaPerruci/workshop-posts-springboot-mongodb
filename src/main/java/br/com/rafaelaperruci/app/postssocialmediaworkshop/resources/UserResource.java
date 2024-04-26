package br.com.rafaelaperruci.app.postssocialmediaworkshop.resources;

import br.com.rafaelaperruci.app.postssocialmediaworkshop.domain.User;
import br.com.rafaelaperruci.app.postssocialmediaworkshop.dto.UserDTO;
import br.com.rafaelaperruci.app.postssocialmediaworkshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll(){
        List<User> users = userService.findAll();
        List<UserDTO> usersDTOs = users.stream().map(UserDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(usersDTOs);  //o .ok() é o construtor do objeto ResponseEntity que dentro
    }                                            //do body da resposta tem a lista users

}
