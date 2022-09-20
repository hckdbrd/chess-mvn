package com.project.chess.data.entity;

import com.project.chess.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Person extends AbstractEntity {
   private String firstName;
   private String lastName;
   private String email;
   private String phone;
}
