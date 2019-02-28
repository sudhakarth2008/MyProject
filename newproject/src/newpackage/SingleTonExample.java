package newpackage;

import org.testng.annotations.Test;

public class SingleTonExample {

	
	@Test
	public void Hello()
	{
		SingleTon sn = SingleTon.getInstance("Hello");
		//sn.getInstance("Hai");
		
		SingleTon sn1 =SingleTon.getInstance("Hai");
		//sn1.getInstance("Hai");
	
		
	}
	

    

}