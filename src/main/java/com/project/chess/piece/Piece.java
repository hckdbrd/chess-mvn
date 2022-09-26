package com.project.chess.piece;

import com.project.chess.utils.Coordinates;

public abstract class Piece {
   Coordinates coordinates;
   abstract Coordinates move( Coordinates coordinates );
}
