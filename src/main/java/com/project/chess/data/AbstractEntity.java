package com.project.chess.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@EqualsAndHashCode
@Getter
@Setter
public abstract class AbstractEntity {

   @Id
   @GeneratedValue
   private Integer id;

   public boolean isPersisted() {
      return id != null;
   }
}