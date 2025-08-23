package learnassignmentweek2;

public class Browser {

	void launchBrowser(String browserName)
	{
	
		System.out.println(browserName +" the browser is launched ");
	
	}
		
		void loadUrl(String url)
	 {
			System.out.println(url +" Url loades succesffully ");
	 }
			
	public static void main(String[] args) 
	
	{
  
		Browser BrowserClass = new Browser();
		BrowserClass.launchBrowser("Chrome");
        BrowserClass.loadUrl("https://platform.testleaf.com/");
		

	}

}
