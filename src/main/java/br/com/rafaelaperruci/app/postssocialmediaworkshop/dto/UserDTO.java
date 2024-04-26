package br.com.rafaelaperruci.app.postssocialmediaworkshop.dto;

import br.com.rafaelaperruci.app.postssocialmediaworkshop.domain.User;
import br.com.rafaelaperruci.app.postssocialmediaworkshop.repository.UserRepository;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String email;

    public UserDTO(){

    }
    public UserDTO(User obj){
        this.id = obj.getId();
        this.name = obj.getName();
        this.email = obj.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
