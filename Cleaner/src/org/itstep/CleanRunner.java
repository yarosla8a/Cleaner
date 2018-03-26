package org.itstep;

import java.util.ArrayList;
import java.util.Arrays;

public class CleanRunner {
	public static void main(String[] args) {

		Room r1 = new Room("livingroom");
		Room r2 = new Room("badroom");
		Room r3 = new Room("kitchen");
		Room r4 = new Room("cildrenroom");
		Room r5 = new Room("corridor");

		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.addAll(Arrays.asList(r1, r2,r3,r4,r5));
		
		for (Room room : rooms) {//Room is tipe , 
			if(!room.isClean() ){//not clean// ! ������ ��������
				room.setClean(true);// change to true
				
			}
			System.out.println(room.getName()+"  "+ room.isClean());
		}
		
	}

}
