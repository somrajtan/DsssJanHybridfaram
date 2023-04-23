package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CongiDataProvider {
	
	 public Properties pr;
	public CongiDataProvider() throws IOException{
		 pr =new Properties();
		File file=new File(System.getProperty("user.dir")+"\\config\\config.properties");
		FileInputStream fl= new FileInputStream(file);
		pr.load(fl);
		
		
	}
	
	
	public String getStageUrl() {
		
		return pr.getProperty("Stage_url");
	
	}
	
     public String getLiveUrl() {
		
		return pr.getProperty("Live_url");
	
	}
	
		
}
