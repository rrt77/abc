import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datataprovider {
	
	
	public ExcelReader xr = null;
	
	
	
	@Test(dataProvider= "getdata")
	public void login(String username, String password){
		
		System.out.println("USERNAME ="+ username +"and PASSWORD = "+ password);
		
		
	}
	
	
	
	
	@DataProvider	
	public Object[][] getdata(){
		
		
		if (xr == null){
			
			xr = new ExcelReader("C:\\Users\\pntdba\\Desktop\\data\\loginDataProvider.xlsx");
		}
		
		
		String sheetName = "loginData";
		int rows = xr.getRowCount(sheetName);
		
		int cols = xr.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][cols];	
		
		for(int i =2; i<=rows; i++){
			for(int j =0; j<cols; j++ ){
				
				
				data[i-2][j]= xr.getCellData(sheetName, j, i);
			}
		}
		
		
		
		
		/*data[0][0] = "Tuhin";
		data[0][1]	= "abc123";	
		
		
		data[1][0] = "Rahim";
		data[1][1]	= "abc1234";	
		
		data[2][0] = "Ambia";
		data[2][1]	= "abc12345";	*/
		
		return data;
		
		
		
	}
	
	
	

}
