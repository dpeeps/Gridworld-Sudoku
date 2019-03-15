import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.BoundedGrid;

public class ModifiedGrid extends ActorWorld
{
   public ModifiedGrid(int rowSize, int colSize)
   {
      super(new BoundedGrid<Actor>(rowSize, colSize));
      drawGrid();
   }
}