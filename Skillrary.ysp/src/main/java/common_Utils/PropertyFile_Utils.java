package common_Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile_Utils 
{
	public String getDataFromPropertyFile(String keyname) throws IOException
	{
		FileInputStream fis=new FileInputStream("src\\test\\resources\\data12.properties.txt");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(keyname);
		return value;
	
	}

}
