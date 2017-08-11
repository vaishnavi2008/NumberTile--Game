public class TileGameDriver
{
   public static void main( String[] args )
   {
      System.out.println( "Parts 1 and 2: TileGame constructor..." );
      TileGame myGame = new TileGame();
      
      
     System.out.println( "\n\nPart 3: Testing toString..." );
     System.out.println( myGame );
     
     System.out.println( "\n\nPart 4: Testing getIndexForFit..." );
     NumberTile testTile1 = new NumberTile( 4, 2, 9, 2 );
     NumberTile testTile2 = new NumberTile( 4, 2, 9, 8 );
     System.out.println( "Result of calling getIndexForFit with test tile 1: " + 
                          myGame.getIndexForFit( testTile1 ) );
     System.out.println( "Result of calling getIndexForFit with test tile 2: " + 
                          myGame.getIndexForFit( testTile2 ) );
      
      System.out.println( "\n\nPart 5: Testing insertTile..." );
      System.out.println( "Result of calling myGame.insertTile: " + 
                           myGame.insertTile() );
      System.out.println( myGame );
      System.out.println( "Result of calling myGame.insertTile again: " + 
                           myGame.insertTile() );
      System.out.println( myGame );    
   } // end method main
      
} // end class TileGameDriver