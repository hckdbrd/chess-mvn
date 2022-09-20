package com.project.chess.data.entity;

import com.project.chess.data.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class User extends AbstractEntity {
   @Getter
   private String username;
   private String passwordSalt;
   private String passwordHash;
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
