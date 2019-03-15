import info.gridworld.actor.ActorWorld;

// How to Draw Grid https://slideplayer.com/slide/6000781/
public class Sudoku 
{
   public static int rowSize, colSize;
   
   public static void main(String args[])
   {
      rowSize = colSize = 9;
      ModifiedGrid world = new ModifiedGrid(rowSize, colSize);
      world.add(new One());
      world.show();
   }
}