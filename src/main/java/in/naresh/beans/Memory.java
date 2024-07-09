package in.naresh.beans;

import org.springframework.stereotype.Component;

@Component
public class Memory {
	
	//To check obj is created or not
	public Memory() {
		System.out.println("Memeory :: Constructor");
	}

	  public String memoryType() {
		  return "64-GB";
	  }
}
