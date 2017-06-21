import org.testng.annotations.Test;

public class PriorityINTestNG {
	// ggjdgjkdfjkg
	
	@Test (priority =0)
	public void openTheBrowser(){
		
		System.out.println("Browser has to Open");
	}
	
	
	@Test (priority =1)
	public void login(){
		
		System.out.println(" Valid users has to be logged in");
	}
	
	@Test(priority =2)
	public void searchAndPick(){
		
		System.out.println(" Pick the desire book");
	}
	
	@Test(priority =3)
	public void payment(){
		
		System.out.println("Payment has to be clear");
	}
	
	@Test(priority =4)
	public void closeTheBrowser(){
		
		System.out.println("Browser has to be closed");
	}

}
