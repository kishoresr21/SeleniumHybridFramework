package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties p;
	public ConfigDataProvider()
	{
		File f=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(f);
			p=new Properties();
			p.load(fis);
			
		} catch (Exception e) {
			System.out.println("Exception is:"+e.getMessage());
			
		}
	}

	public String getApplicationUrl()
	{
		String url=p.getProperty("url");
		return url;
	}
	public String getChromePath()
	{
		String chrome_path=p.getProperty("chromePath");
		return chrome_path;
	}
	public String getIEPath()
	{
		String IE_Path=p.getProperty("IEPath");
		return IE_Path;
	}
	
}
