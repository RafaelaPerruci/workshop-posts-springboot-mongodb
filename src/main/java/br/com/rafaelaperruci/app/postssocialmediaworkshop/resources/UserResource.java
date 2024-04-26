package br.com.rafaelaperruci.app.postssocialmediaworkshop.resources;

import br.com.rafaelaperruci.app.postssocialmediaworkshop.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User user1 = new User("1", "Maria Brown", "maria.silva@gmail.com");
        User user2 = new User("2", "John Smith", "john.silva@gmail.com");
        List<User> users = new ArrayList<>();
        users.addAll(Arrays.asList(user1, user2));
        return ResponseEntity.ok().body(users);  //o .ok() é o construtor do objeto ResponseEntity que dentro
    }                                            //do body da resposta tem a lista users

}
