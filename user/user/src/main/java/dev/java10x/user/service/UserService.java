package dev.java10x.user.service;

import dev.java10x.user.domain.UserModel;
import dev.java10x.user.producer.UserProduce;
import dev.java10x.user.respository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;
    private final UserProduce userProduce;

    public UserService(UserRepository userRepository, UserProduce userProduce) {
        this.userRepository = userRepository;
        this.userProduce = userProduce;
    }

    @Transactional
    public UserModel saveAndPublish(UserModel userModel){
        userModel = userRepository.save(userModel);
        userProduce.publishEvent(userModel);
        return userModel;

    }
}
