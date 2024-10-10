package com.actiTime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GenFile {
	public String getProp(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./Data3/Read4.property");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
	}
	
	
}