package in.naresh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	public Mobile() {
		System.out.println("Mobile :: Constructor");
	}
	
    @Autowired 
	private Memory Memory; //To inject Memory into Mobile
	
	public void doWork() {
		String Type = Memory.memoryType();
		
		if (Type.equals("64-GB")) {
			System.out.println("Memory is Usable...");
		}
	}
}
