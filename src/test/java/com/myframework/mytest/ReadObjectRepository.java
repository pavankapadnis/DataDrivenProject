package com.myframework.mytest;

import java.io.IOException;
import java.nio.file.Paths;

import com.mayframework.keyword.UIKeyword;

public class ReadObjectRepository {

public static void readObject() throws IOException {
		
		String dir = (System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		String name = UIKeyword.readObjectFile(dir, "name");
		String sirname = UIKeyword.readObjectFile(dir, "sirname");
		System.out.println(name+" "+sirname);
	}
	
	public static void main(String[] args) throws IOException {
		readObject();
		String userDirectory = Paths.get("")
                .toAbsolutePath()
                .toString();
        System.out.println(userDirectory);
	}

}
