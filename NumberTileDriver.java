public class NumberTileDriver
   {
   public static void main( String[] args )
      {
      NumberTile t1 = new NumberTile(1, 2, 3, 4);
      
      System.out.println( "Left side is: " + t1.getLeft() );
      System.out.println( "Right side is: " + t1.getRight() );
      System.out.println( t1 );
      t1.rotate();
      System.out.println( t1 );
      } // end method main
       
   } // end class NumberTileDriver