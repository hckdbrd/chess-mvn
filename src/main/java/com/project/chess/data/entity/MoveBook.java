package com.project.chess.data.entity;

import com.project.chess.data.AbstractEntity;
import com.project.chess.utils.Coordinates;
import com.project.chess.utils.CoordinatesConverter;
import com.project.chess.utils.Piece;
import com.project.chess.utils.Side;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Data
public class MoveBook extends AbstractEntity {

   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Setter(AccessLevel.NONE)
   private Long id;
   @Id
   @Setter(AccessLevel.NONE)
   private Long game_id;
   private Side side;
   private Piece piece;
   @Convert(converter = CoordinatesConverter.class)
   private Coordinates coordinates;
   private LocalTime time;
}
