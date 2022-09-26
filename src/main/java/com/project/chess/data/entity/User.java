package com.project.chess.data.entity;

import com.project.chess.data.AbstractEntity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
public class User extends AbstractEntity {
   public enum Role {
      USER, ADMIN
   }

   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Setter(AccessLevel.NONE)
   private Long id;
   private String username;
   @Getter(AccessLevel.NONE)
   @Setter(AccessLevel.NONE)
   private String password;
   private String email;
   private int xCoord;
   private int yCoord;
   private Role role;
}
