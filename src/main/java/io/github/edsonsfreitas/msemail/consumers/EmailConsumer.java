package io.github.edsonsfreitas.msemail.consumers;

import io.github.edsonsfreitas.msemail.dto.EmailRecordDTO;
import io.github.edsonsfreitas.msemail.models.email.EmailModel;
import io.github.edsonsfreitas.msemail.services.email.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @author Edson da Silva Freitas
 * {@code @created} 30/10/2023
 * {@code @project} msemail-rabbitmq
 */

@Component
public class EmailConsumer {

    private final EmailService emailService;

    public EmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    /**
     * Listens to the email queue and saves the received email message.
     *
     * @param  emailMessage  the email message received from the queue
     */
    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailRecordDTO emailMessage) {
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailMessage, emailModel);
        emailService.saveEmail(emailModel);
    }

}