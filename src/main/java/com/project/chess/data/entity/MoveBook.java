package com.project.chess.data.entity;

import com.project.chess.data.AbstractEntity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

@Entity
@Data
public class MoveBook extends AbstractEntity {

   public enum Side {
      WHITE, DARK
   }
   public enum Piece {
      PAWN, KNIGHT, BISHOP, ROOK, QUEEN, KING
   }

   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Setter(AccessLevel.NONE)
   private Long id;
   @Id
   @Setter(AccessLevel.NONE)
   private Long game_id;
   private Side side;
   private Piece piece;
//   private Coordinates coordinates;
   private LocalTime time;
}
