package com.project.chess.data.entity;

import com.project.chess.data.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity

@NoArgsConstructor
public class User extends AbstractEntity {
   public enum Role {
      USER, ADMIN
   }

   @Setter
   @Getter
   @NotNull
   @NotEmpty
   private String firstName;

   @Setter
   @Getter
   @NotNull
   @NotEmpty
   private String lastName;

   @Setter
   @Getter
   @Email
   @NotNull
   @NotEmpty
   private String email;

   @Setter
   @Getter
   @NotNull
   @NotEmpty
   private String phone;

   @Setter
   @Getter
   @NotNull
   @NotEmpty
   private String username;
   private String passwordSalt;
   private String passwordHash;
   @Setter
   @Getter
   private Role role;
   public User(String username, String password, Role role) {
      this.username = username;
      this.passwordSalt = RandomStringUtils.random(32);
      this.passwordHash = DigestUtils.sha1Hex(password + passwordSalt);
      this.role = role;
   }

   public boolean checkPassword(String password) {
      return DigestUtils.sha1Hex(password + passwordSalt).equals(passwordHash);
   }

}
