package game;


//Refactor(Test Class)


import java.io.Reader;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Main  {
	
	
	public static void main(String[]args) {
		
		RoomManager manager= new  RoomManager();
		manager.init();
		
		Player player= new Player(manager.startingRoom, null);
		 while (true) {
	           printRoom(player);
	           parse(collectInput(), player);
	           System.out.println(String.format("You're in the currentRoom")); 
	          
		
		
	}

}

	public static void parse(String[] input, Player player) {
		//String[] input, Player player
		
		switch (input[0]) {   	//switch- takes player to places.
	       case "go0":
	           player.setCurrentRoom(Player.getdirectionsRoom("room").getExit(input[0]));
	           break;
	           //current_room = rooms[current_room][move]
	           
	       case "go1" :
	    	   Player.getdirectionsRoom("1-dining").getExit(input[1]);
	    	   break;
	    	   
	       case "go2" :
	    	   Player.getdirectionsRoom("2-dining").getExit(input[2]); 
	    	   break;
	       case "go3" :
	    	   Player.getdirectionsRoom("3-mini_Theater").getExit(input[3]); 
	    	   break;
	    	   
	       case "go4" :
	    	   Player.getdirectionsRoom("4-bedroom").getExit(input[4]);  
	    	   break;
	    	   
	       //default:
	    	   
	           //break;
	       }
		//Object directions1 = null;
		//if("go0" != null) {
			//System.out.println( directions1);
	
		
	//}
	}
public  static String[] collectInput() {
		try (Scanner s = new Scanner(System.in)) {
			return s.nextLine().split(" ");
		}
	
	}
	@SuppressWarnings({ "unused", "static-access" })
	public static void printRoom(Player player) {
		
		//boolean, option for continue, and player visit each room..
		
		System.out.println(player.getCurrentRoom().toString());  //
		int Room = 0;
		
		if(Room==1);
		System.out.println( "new Room player.getdirections_Room:"+" \n"+("dining"));
		If(Room==2); 
		System.out.println(  " new Room player.getdirections_Room:"+" \n"+("library"));
		if(Room==3);
		System.out.println(" new Room player.getdirections_Room:"+"\n" +("mini_Theater"));
		if(Room==4);
		System.out.println(" new Room player.getdirections_Room:"+"\n" +("master_bedroom"));
	
	
		try (Scanner in = new Scanner(System.in)) {
			while(true) {
				System.out.println("Enter: goSouth/North/East/West (no space)' to move or 'Exit', direction0 "+ 
			" or Continue entering options:");
				 String direction0 = in.next();
				 

			  for(int j =0; j<5 ;j++);
			System.out.println("\"The dining for entertaining people , with tables and chairs locate South direction1 . Crossing the open hall, is the dining room which \"\r\n"
					+ "	  + \"is next to the living room and adjacent to the kitchen"); 
			String direction1= in.next();
			    
            
			System.out.println(); 
			
			System.out.println("\"The library-office room is locate north direction2. There is computers, desks, bookshelves\n"
			           + "elegant  office furnetiere, chairs and small couchs. Flooring are colorful,rugs and paints in the wall\n"
			           + " Area design to a quiet reading, or office-home \n"
			           + "large windows east side, next to this a sunny room, also available for storage of small items.");
			String direction2= in.next();
			
			
			System.out.print("");
			
			System.out.println("mini Home_Theater,  mini home_theater room is locate East direction3.This is the entertaiment room,"
			   		+ "You're invite to watch movies");
			 String direction3= in.next();
			 
			 
			    System.out.print("");
			 System.out.println("masterBedroom, bedroom, This masterBedroom locate north-west direction4, the vanish edition has access "
			       		+ "to a mini pool which is locate "+ "in the top roof edition , sunny room - artificial garden");
			 String direction4= in.next();
			 
			 
			    System.out.print("");
			 System.out.print("\"Welcome! Home-Dream"+"\n");
			
			System.out.print("\"Welcome! Home-Dream"+"\n");
			System.out.print("Please, enter your name:"+"\n");
			String name = in.next();
			
			System.out.print("");
           
			System.out.print(" And prefer room-edition of the Home-Dream tour: ");
			 String tour = in.next();
			 String Y ="" ;
			 if(Room==0){System.out.print( "Guess-Invitation ->to visit the pool area:\n ");
				 
			 }
   // do {
			System.out.print("You're invited  to visit the Home_Dream  pool open area,...\n ");
			if( Y != null) {
				System.out.print("This is an attached-addition of the house.\n"+ " Please enter: 'thanks' for continue.\n");
 
			String pool = in.next(); 
			System.out.print("");
			}	
  
			System.out.print
			("I do hope you  enjoyed the experience to learn about the Modern Home-Dream edition."
					+ "(Please,enter 'go + 0' to get back to the menu)");
			String  homeDream = in.next();
	}
			} 	
			}
			
		
		


	private static void If(boolean b) {
		
		
	}

}
