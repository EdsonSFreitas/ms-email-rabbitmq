package io.github.edsonsfreitas.msemail.repository.email;

import io.github.edsonsfreitas.msemail.models.email.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Edson da Silva Freitas
 * {@code @created} 31/10/2023
 * {@code @project} msemail-rabbitmq
 */

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}