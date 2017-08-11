public class NumberTile
   {
   private int[] numbers;
   
   // counting clockwise, indices/number relationship
   // is shown below
   // index 0 = top
   // index 1 = right
   // index 2 = bottom
   // index 3 = left
   
   public NumberTile()
      {
      numbers = new int[4];
      numbers[0] = (int)( Math.random() * 10 );
      numbers[1] = (int)( Math.random() * 10 );
      numbers[2] = (int)( Math.random() * 10 );
      numbers[3] = (int)( Math.random() * 10 );
      } // end zero-constructor NumberTile

   public NumberTile( int top, int right, int bottom, int left )
      {
      numbers = new int[4];
      this.numbers[0] = top;
      this.numbers[1] = right;
      this.numbers[2] = bottom;
      this.numbers[3] = left;
      } // end four-argument constructor
      
   public void rotate()
      {
      int temp = numbers[0];    
      this.numbers[0] = numbers[3];
      this.numbers[3] = numbers[2];
      this.numbers[2] = numbers[1];
      this.numbers[1] = temp;
      } // end method rotate
      
   public int getLeft()
      {
      return numbers[3];    
      } // end method getLeft
      
   public int getRight()
      {
      return numbers[1];        
      } // end method getRight
   
   public String toString()
      {
      
      String cube = "  "        + numbers[0]              + "\n" +
                    numbers[3]  + "   "      + numbers[1] + "\n" +
                    "  "        + numbers[2]              + "\n";
        
      return cube;   
      } // end method toString
       
   } // end class NumberTile
