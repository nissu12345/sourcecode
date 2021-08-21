package com.ois.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Rsheet1 {
public static void main(String[] args) throws IOException
{
	Properties conf = new Properties();
	String udir = System.getProperty("user.dir");
	String path =udir + "\\src\\test\\resources\\properties\\Config.properties";
	FileInputStream fis = new FileInputStream(path);
	conf.load(fis);
	System.out.println(conf.getProperty("browser"));
	
	Properties OR = new Properties();
	String path1 =udir + "\\src\\test\\resources\\properties\\OR.properties";
	 fis = new FileInputStream(path1);
	 OR.load(fis);
	 System.out.println(OR.getProperty("firstname"));
		
}
	
}
