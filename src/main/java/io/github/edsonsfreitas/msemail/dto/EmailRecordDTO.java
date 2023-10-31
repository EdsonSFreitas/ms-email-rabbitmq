package io.github.edsonsfreitas.msemail.dto;

import java.util.UUID;

/**
 * @author Edson da Silva Freitas
 * {@code @created} 31/10/2023
 * {@code @project} msemail-rabbitmq
 */

public record EmailRecordDTO(UUID userId, String emailTo, String subject, String emailBody) {
}