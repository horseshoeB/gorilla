package com.horseshoe.gorilla.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "command")
public class Command {

  @Id
  @GeneratedValue
  private Integer commandId;
  @Column
  private String command;
  @Column
  private String overview;
  @Column
  private String description;
  @Column
  private String format;
  @Column
  private String example;
}
