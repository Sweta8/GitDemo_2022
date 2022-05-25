package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	
	private static Properties prop = new Properties();
	private static String propertiesFile;
	private static FileInputStream fis;
	private static FileOutputStream fos;
	
	public Configuration(String propertiesFile) 
	{
		this.propertiesFile = propertiesFile;
		
		
	}
	
	public static void loadPropertiesFile() throws IOException, FileNotFoundException
	{
			fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//resources//"+propertiesFile);
		prop.load(fis);	
	}

	
	public static String getConfig(String key) throws IOException
	{
		loadPropertiesFile();
		return prop.getProperty(key);
		
	}
	
	public void setConfig(String key, String value) throws IOException
	{
		loadPropertiesFile();
		prop.setProperty(key, value);
		fos =new FileOutputStream(System.getProperty("user.dir")+"//src//main//java//resources//"+propertiesFile);
		prop.store(fos, "Updated"+propertiesFile);
		
	}
}
