package game;

import fixtures.Room;

public class Player {

	/*public Player(Object startingRoom, Object object) {
		
	}

	public static Object getdirectionsRoom(String string) {
		return null;*/
	


private static Room currentRoom;

@SuppressWarnings("static-access")
public Player(Room currentRoom, Room startingRoom) {
	super();
	this.currentRoom = currentRoom;
	currentRoom= startingRoom;
}



public void Player1(Room startingRoom) {
	
}


public Room getCurrentRoom() {
	return currentRoom;
}

public void setCurrentRoom(Room player) {
	Player.currentRoom = player;
}



public Room getCurrentRoom1() {
	// TODO Auto-generated method stub
	return null ;
}


public static Room getdirectionsRoom(String b) {
	Room directionsRoom = currentRoom;
	return directionsRoom;
}
@SuppressWarnings("static-access")
public void setdirectionsRoom(Room currentRoom) {
	this.currentRoom = currentRoom;
}



@SuppressWarnings("static-access")
public void setCurrentRoom(Player exit) {
	Room Player = null;
	this.currentRoom= Player; //walking tour, dining
	
}




}
  
  




