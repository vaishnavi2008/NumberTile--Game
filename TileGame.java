import java.util.ArrayList;
public class TileGame
{
    // instance variables:
    private NumberTile[] myTiles;
    private ArrayList<NumberTile> gameboard;
    
    public TileGame()
    {
        // read the lab directions carefully
        myTiles = new NumberTile[2];
        myTiles[0] = new NumberTile( 4,2,9,2 );
        myTiles[1] = new NumberTile( 4,2,9,8 );
        
        gameboard = new ArrayList <NumberTile>();
        gameboard.add(new NumberTile(4,3,7,4));
        gameboard.add(new NumberTile(6,4,3,3));
        gameboard.add(new NumberTile(1,2,3,4));
        gameboard.add(new NumberTile(3,2,5,2));
        gameboard.add(new NumberTile(5,9,2,2));
        
        // keep the following line of code - it will help with the driver class later on
        System.out.print( "Done constructing TileGame" );   
    } // end constructor TileGame

    public int getIndexForFit( NumberTile tile )
    {
        // read the lab directions carefully to write the code for this method.
        for(int i = 1; i < gameboard.size(); i++)
        {
            if( tile != null)
            {
                if( tile.getLeft() == gameboard.get(i-1).getRight() && tile.getRight() == gameboard.get(i).getLeft() )
               {
                   return i;
               }
                
                else if (i == gameboard.size()-1)
                {
                    if(gameboard.get(i).getLeft() == tile.getRight())
                    {
                        return i;
                    }
                }
                else if ( i == 0)
                {
                   if ( gameboard.get(i).getRight() == tile.getLeft())
                   {
                       return i;
                   }
                }
            }
         }
        if( gameboard.size() == 0)
          {
                 return 0;
          }    
       
       return -1;

        // erase the line of code below! I included it so that the class would compile.

    } // end method getIndexForFit

    public boolean insertTile()
    {
        // read the lab directions carefully to write the code for this method.
        for ( int i = 0; i< myTiles.length; i++)
        {
             if( this.getIndexForFit(myTiles[i])!= -1)
            {
                gameboard.add( this.getIndexForFit(myTiles[i]), myTiles[i] );
                myTiles[i] = null;
                return true;
           }
           else 
           {
                for ( int y = 0; y<4; y++)
                {
                   if (myTiles[i] != null)
                 {
                    myTiles[i].rotate();
                       if( this.getIndexForFit(myTiles[i])!= -1)
                       {
                         gameboard.add( this.getIndexForFit(myTiles[i]), myTiles[i] );
                         myTiles[i] = null;
                         return true;
                       }
                  }
                }
            } 
       }
       // erase the line of code below! I included it so that the class would compile.
       return false;
    } // end method insertTile

    public String toString()
    {
        // read the lab directions carefully to write the code for this method.
        String TileInfo = " ";
        System.out.println("Gameboard Tiles: ");
        for ( int i = 0; i< gameboard.size(); i++ )
        {
             TileInfo += "Tile: " + i + "\n" + gameboard.get(i).toString() ;
        }
        
        
        for ( int i = 0; i < myTiles.length; i++ )
        {
            if(i == 0)
            {
                TileInfo+= "My Tile: " + "\n" +  "Tile: " + i + "\n" + myTiles[i];
            }
            else
            {
                TileInfo += "Tile: " + i + "\n" + myTiles[i];
            }
        }
        
        
        return TileInfo;
        
       // erase the line of code below! I included it so that the class would compile.
 
    } // end method toString
} // end class TileGame

