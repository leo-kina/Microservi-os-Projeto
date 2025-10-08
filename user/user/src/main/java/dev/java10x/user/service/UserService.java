package dev.java10x.user.service;

import dev.java10x.user.domain.UserModel;
import dev.java10x.user.respository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel save(UserModel userModel){
        //salvando o usuario no banco de dados
        return userModel = userRepository.save(userModel);
        //disparando evento   //disparando evento
    }
}
