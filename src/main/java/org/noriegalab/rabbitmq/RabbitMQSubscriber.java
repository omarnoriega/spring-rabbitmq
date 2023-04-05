package org.noriegalab.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQSubscriber {

    @RabbitListener(queues = { "${proyecto.queue.name}" })
    public void receiveMessage(String message) {
        System.out.println("Mensaje recibido: " + message);
    }
}
