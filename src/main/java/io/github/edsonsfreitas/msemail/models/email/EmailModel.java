package io.github.edsonsfreitas.msemail.models.email;

import io.github.edsonsfreitas.msemail.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Edson da Silva Freitas
 * {@code @created} 31/10/2023
 * {@code @project} msemail-rabbitmq
 */

@Getter
@Setter
@Entity
@Table(name = "TB_EMAILS")
public class EmailModel implements Serializable {
  @Serial
  private static final long serialVersionUID = 2L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "email_id", nullable = false)
  private UUID emailId;

  private UUID userId;
  private String emailFrom;
  private String emailTo;
  private String subject;

  @Column(columnDefinition = "TEXT")
  private String emailBody;

  private LocalDateTime sendDateEmail;

  @Enumerated(value = EnumType.STRING)
  private StatusEmail statusEmail;

}