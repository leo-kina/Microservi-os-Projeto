package dev.java10x.user.producer;

import dev.java10x.user.domain.UserModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class UserProduce {

    final RabbitTemplate rabbitTemplate;

    public UserProduce(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendUserCreatedEvent(UserModel userModel){
        rabbitTemplate.convertAndSend("user.created", event);
    }

}
