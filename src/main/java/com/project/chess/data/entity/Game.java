package com.project.chess.data.entity;

import com.project.chess.data.AbstractEntity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Game extends AbstractEntity {

   public enum Type {
      $1M, $5M, $10M, $30M, $1H
   }

   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Setter(AccessLevel.NONE)
   private Long id;
   @Id
   @Setter(AccessLevel.NONE)
   private Long player1Id;
   @Id
   @Setter(AccessLevel.NONE)
   private Long player2Id;
   @Id
   @Setter(AccessLevel.NONE)
   private Long moveBookId;
   private Date date;
   private Type type;
}
