package com.example.demo;

import com.example.demo.DataAccessObj.DataAccessService;
import com.example.demo.api.UserAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		String line;
		String filename = "input.csv";
		File file = new File(filename);

		DataAccessService testdata = new DataAccessService();
		try
		{
			BufferedReader read = new BufferedReader(new FileReader(file));
			read.readLine();
			while((line = read.readLine()) != null)
			{
				String[] data = line.split(",");
				Long l2= Long.parseLong(data[1]);
				testdata.insertUser(data[0], l2);

			}

		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		SpringApplication.run(DemoApplication.class, args);
	}

}
