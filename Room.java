package fixtures;

import java.util.Arrays;
import java.util.List;
import fixtures.Fixtures;

@SuppressWarnings("unused")
public class Room extends Fixtures {
	
	 private Room[] exits;
	   private List<String> directions = Arrays.asList("East", "West", "North", "South");

	   public Room(String name, String shortDescription, String longDescription) {
	       super(name, shortDescription, longDescription);
	       this.exits = new Room[directions.size()];
	       // TODO Auto-generated constructor stub
	   }

	   public Room[] getExits() {
	       return exits;
	   }

	   public Room getExit(String direction) {
	       return exits[directions.indexOf(direction)];
	   }
	  

	   public List<String> getDirections() {
	       return directions;
	   }

	   public void setExits(Room[] exits) {
	       this.exits = exits;
	   }

	   @Override
	   public String toString() {
	       String exits = "";
	       for (String direction : this.directions) {
	           if(getExit(direction)!=null)
	           exits += (direction + ": " + getExit(direction).getShortDescription() + "\n");
	       }
	       return this.getName() + "\n\n" + this.getLongDescription() + "\n\n" + "Exits:\n" + exits;
	   }

	
}
