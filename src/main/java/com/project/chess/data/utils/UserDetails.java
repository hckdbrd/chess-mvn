package com.project.chess.data.utils;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@EqualsAndHashCode
public class UserDetails {

   @NotBlank
   private String firstName;

   @NotBlank
   private String lastName;

   @NotBlank
   @Email
   private String email;

   // FIXME Passwords should never be stored in plain text!
   @Size(min = 8, max = 64, message = "Password must be 8-64 char long")
   private String password;
}