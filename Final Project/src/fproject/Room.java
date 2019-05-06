package fproject;
import java.util.ArrayList;

public class Room {
	ArrayList <String> item = new ArrayList <String>();
	
	public Room() {
		this.item.add("Money");
		this.item.add("Watch");	
	}
	public void print() {
		for (String items : item) {
			System.out.println(items);
		}
	}

}
