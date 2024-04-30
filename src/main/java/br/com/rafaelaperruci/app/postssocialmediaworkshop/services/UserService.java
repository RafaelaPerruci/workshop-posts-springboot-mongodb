package br.com.rafaelaperruci.app.postssocialmediaworkshop.services;

import br.com.rafaelaperruci.app.postssocialmediaworkshop.domain.User;
import br.com.rafaelaperruci.app.postssocialmediaworkshop.dto.UserDTO;
import br.com.rafaelaperruci.app.postssocialmediaworkshop.repository.UserRepository;
import br.com.rafaelaperruci.app.postssocialmediaworkshop.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findById(String id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
    public User insert(User user) {
        return userRepository.insert(user);
    }
    public User fromDTO(UserDTO objDTO){
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }
    public void delete(String id) {
        findById(id);
        userRepository.deleteById(id);
    }
}
