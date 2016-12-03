package com.horseshoe.gorilla.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "commandOption")
public class CommandOption {

  @Id
  @GeneratedValue
  private Integer commandOptionId;
  @Column
  private Integer commandId;
  @Column
  private String option;
  @Column
  private String description;
}
