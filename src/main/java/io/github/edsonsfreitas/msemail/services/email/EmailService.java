package io.github.edsonsfreitas.msemail.services.email;

import io.github.edsonsfreitas.msemail.models.email.EmailModel;

/**
 * @author Edson da Silva Freitas
 * {@code @created} 31/10/2023
 * {@code @project} msemail-rabbitmq
 */

public interface EmailService {

    EmailModel saveEmail(EmailModel email);
}