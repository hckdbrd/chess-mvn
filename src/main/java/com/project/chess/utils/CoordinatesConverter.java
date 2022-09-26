package com.project.chess.utils;

import javax.persistence.AttributeConverter;

public class CoordinatesConverter implements AttributeConverter<Coordinates, String> {
   @Override
   public String convertToDatabaseColumn(Coordinates coordinates) {
      if (coordinates == null) {
         throw new IllegalArgumentException();
      }
      return String.valueOf(coordinates.getX()) + coordinates.getY();
   }

   @Override
   public Coordinates convertToEntityAttribute(String s) {
      if (s == null || s.length() != 2) {
         throw new IllegalArgumentException();
      }
      Coordinates coords = new Coordinates();
      int x = Integer.parseInt(String.valueOf(s.charAt(0)));
      int y = Integer.parseInt(String.valueOf(s.charAt(1)));
      coords.setX(x);
      coords.setY(y);
      return coords;
   }
}
