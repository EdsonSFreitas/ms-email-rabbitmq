package io.github.edsonsfreitas.msemail.enums;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

/**
 * @author Edson da Silva Freitas
 * {@code @created} 31/10/2023
 * {@code @project} msemail-rabbitmq
 */

public enum StatusEmail {
  ERROR("ERROR"),
  PENDING("PENDING"),
  SENT("SENT");

  private String value;

  private StatusEmail(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}