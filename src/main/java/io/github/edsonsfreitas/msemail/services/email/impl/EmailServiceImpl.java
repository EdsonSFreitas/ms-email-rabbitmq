package io.github.edsonsfreitas.msemail.services.email.impl;

import io.github.edsonsfreitas.msemail.enums.StatusEmail;
import io.github.edsonsfreitas.msemail.models.email.EmailModel;
import io.github.edsonsfreitas.msemail.repository.email.EmailRepository;
import io.github.edsonsfreitas.msemail.services.email.EmailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * @author Edson da Silva Freitas
 * {@code @created} 31/10/2023
 * {@code @project} msemail-rabbitmq
 */

@Service
@Transactional(readOnly = true)
public class EmailServiceImpl implements EmailService {

    private final EmailRepository emailRepository;
    private final JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String emailFrom;

    public EmailServiceImpl(EmailRepository emailRepository, JavaMailSender javaMailSender) {
        this.emailRepository = emailRepository;
        this.javaMailSender = javaMailSender;
    }

    @Transactional
    @Override
    public EmailModel saveEmail(EmailModel emailToSave) {
        try {
            emailToSave.setSendDateEmail(LocalDateTime.now());
            emailToSave.setEmailFrom(emailFrom);

            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(emailToSave.getEmailTo());
            message.setSubject(emailToSave.getSubject());
            message.setText(emailToSave.getEmailBody());

            javaMailSender.send(message);

            emailToSave.setStatusEmail(StatusEmail.SENT);
        } catch (MailException e) {
            emailToSave.setStatusEmail(StatusEmail.ERROR);
        } finally {
            return emailRepository.save(emailToSave);
        }
    }

}