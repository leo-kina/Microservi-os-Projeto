package dev.java10x.user.service;

import dev.java10x.user.domain.UserModel;
import dev.java10x.user.respository.UserRepository;
import jakarta.transaction.Transactional;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Transactional
    public UserModel save(UserModel userModel){
        return userModel = userRepository.save(userModel);
    }
}
