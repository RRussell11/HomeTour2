package game;
import java.util.List;

import fixtures.Room;
public class RoomManager {

//public Object startingRoom;

	///public void init() {
		// TODO Auto-generated method stub*/
	
	
	
	Room startingRoom;
	   Room[] rooms;
	public Room currentRoom;

	   @SuppressWarnings("unused")
	public void init() {
		   
		   Room Hall= new Room ("The Hall",
					"a small Hall or entry-porch",
					" This modern home has its entry-open space next to a Silvester flowers-garden, and a hall, the entryway of dream-house. Then, passing "
					+ "through it, the living room "
					+ "which is open to the south-east direction,"
					+ " where  coaches and other piceces of furniture "+ "can be seen." + "\n"
					+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
					+ "To the  north west  is the master bedroom room, open to a internal jacuzzi mini-pool, and at south east a library room, next to that: \"\r\n"
					+ "	Entertaiment room:+ \"mini home-theatre to watch movies.");
					
				
		   List<String> directions = Hall.getDirections();
	       rooms = new Room[directions.size()];
	       this.startingRoom = Hall;
	       Room dining = new Room("The Dining", "dining room",
	               "The dining for entertaining people , with tables and chairs . Its in the South direction, Crossing the open hall, is the dining room which "
	               + "is next to the living room and adjacent to the kitchen");
	       @SuppressWarnings("unused")
		List<String> directions1 = dining.getDirections();
	       rooms = new Room[directions.size()];
	       this.currentRoom= dining;
	        Room library = new Room("Small library", " library   ",
	               "The library-office room is locate north direction. There is computers, desks, bookshelves\n"
	                       + "elegant  office furnetiere, chairs and small couchs. Flooring are colorful,rugs and paints in the wall\n"
	                       + " Area design to a quiet reading, or office-home \n"
	                       + "large windows east side, next to this a sunny room, also available for storage of small items.");
	       
	       List<String> directions2 = Hall.getDirections();
	       rooms = new Room[directions.size()]; 
	       Room mini_Theater = new Room("mini_ Home Theater", "mini_Theater ", "+It is locate in the East" +"This is the entertaiment room,"
	       		+ "You're invite to watch movies" );
	       List<String> directions3 = Hall.getDirections();
	       rooms = new Room[directions.size()];
	       Room masterBedroom = new Room("masterBedroom", "bedroom","This masterBedroom locate West"+ "the vanish edition has access "
	       		+ "to a mini pool which is locate "+ "in the top roof edition , sunny room - artificial garden");
	      /* List<String> directions2 = Hall.getDirections();
	       rooms = new Room[directions.size()];
	       Room bedRoom = new Room("bedRoom", "bedroom","The bedroom  is locate north-west"+ " modern furniture ,bed, dresser "
	       		+ "lighting, two big windows "+ ");*/

	       rooms[directions.indexOf("South")] = dining;
	       rooms[directions.indexOf("North")] = library;
	       rooms[directions.indexOf("East")] = mini_Theater;
	       rooms[directions.indexOf("West")] = masterBedroom;
	       Hall.setExits(rooms);
	       rooms = new Room[directions.size()];
	       rooms[directions.indexOf("South")] = Hall;
	       rooms[directions.indexOf("West")] = masterBedroom;
	       rooms[directions.indexOf("East")] = mini_Theater;
	      /*  library.setExits(rooms);
	       rooms = new Room[directions.size()];
	       rooms[directions.indexOf("North")] = Hall;
	       rooms[directions.indexOf("West")] = masterBedroom;
	       rooms[directions.indexOf("East")] = mini_Theater;
	       rooms[directions.indexOf("South")] = dining;
	       dining.setExits(rooms);
	       rooms[directions.indexOf("North")] = Hall;
	       rooms[directions.indexOf("West")] = masterBedroom;
	       rooms[directions.indexOf("East")] = mini_Theater;
	       mini_Theater.setExits(rooms);
	       rooms[directions.indexOf("North")] = Hall;
	       rooms[directions.indexOf("West")] = masterBedroom;
	       rooms[directions.indexOf("South")] = dining;*/
	       
	       
	       
	       
	       
		   
	   }


		
	}


