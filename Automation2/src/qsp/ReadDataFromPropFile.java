package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropFile {

	public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("C:\\Users\\bindu\\Desktop\\Read2.Property");//To read the data from the given path
    	Properties P=new Properties();
    	P.load(fis);//to load the excel sheet
    	String un = P.getProperty("Username");
    	String u = P.getProperty("url");
    	String p = P.getProperty("Password");
    	System.out.println(un);
    	System.out.println(u);
    	System.out.println(p);
    	
    
	}

}
