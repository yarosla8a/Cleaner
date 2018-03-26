package org.itstep;

public class Room {
	private String name;
	private boolean isClean;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isClean() {
		return isClean;
	}

	public void setClean(boolean isClean) {
		this.isClean = isClean;
	}

	public Room(String name) {// constructor//without boolean 

		this.isClean = false;// room does not clean
		this.name = name;
	}

}
