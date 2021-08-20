package com.bangladesh.Util;

    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.IOException;
    import java.util.Properties;
    import java.util.concurrent.TimeUnit;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class TestBase_BD 
   {
	public static  Properties prop;
	public static WebDriver driver;
    public  TestBase_BD () 
   {
	
	
	try {
		FileInputStream fls	= new  FileInputStream(System.getProperty("user.dir") +"\\src\\test\\java\\com\\bangladesh\\config\\configBD.properties");
			  prop = new Properties ();// properties class,fileinputstream class
					prop.load(fls);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
    }	
     public void initialize() 
   {
	String Browsername = prop.getProperty("browser1");
	if(Browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Utill.implicitlywait_Wait, TimeUnit.SECONDS);// before lunch the url
		driver.manage().timeouts().pageLoadTimeout(Utill.pageLoadTimeout_wait, TimeUnit.SECONDS);//after lunch the url give some time for page loadout
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		 
	}
	else
		System.out.println("Browser not found");
    }
    public static void launchApplication(String URL) 
   {
    	
	driver.get(prop.getProperty("url_QA"));
	
	
	
}

}	
	
	
	
