package dev.java10x.user.producer;

import dev.java10x.user.domain.UserModel;

import dev.java10x.user.dto.EmailDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserProduce {

    final RabbitTemplate rabbitTemplate;

    private final String routingKey = "email-queue";



    public UserProduce(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;

    }

    public void publishEvent(UserModel userModel){
        var emailDto = new EmailDto();
        emailDto.setUserId(userModel.getUserID());
        emailDto.setEmailTo(userModel.getEmail());
        emailDto.setEmailSubject("Bem vindo");
        emailDto.setBody("helloo" + userModel.getName());
                rabbitTemplate.convertAndSend(
               "",
               routingKey,
               emailDto
       );
    }

}
