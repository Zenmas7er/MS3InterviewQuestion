package com.MS3;

// OpenCSV imports
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

// SQLiteJDBC imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;

public class Main {
	private static final String CSVPath = "./src/resources/ms3Interview.csv";
	private static final String CSVOutput = "./src/resources/ms3InterviewFailure.csv";
	
	private static Connection connect() {
		Connection conn = null;
		try {
			String url = "jdbc:sqlite:./src/resources/MS3Customers.db";
			conn = DriverManager.getConnection(url);
			
			System.out.println("Connection to SQLite has been established");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return conn;
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int recNumber = 0; // number of total records read
		int successNumber = 0; // number of successes read
		int failureNumber = 0; // number of failures read
		Logger logger = Logger.getLogger(Main.class.getName());
		FileHandler fh;
		
		String sql = "INSERT INTO customers (A, B, C, D, E, F, G, H, I, J)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try (
			Reader reader = Files.newBufferedReader(Paths.get(CSVPath));
			CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
			Writer writer = Files.newBufferedWriter(Paths.get(CSVOutput));
			CSVWriter csvWriter = new CSVWriter(writer);
		){
			List<String[]> records = csvReader.readAll();
			String[] headerRecord = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
			csvWriter.writeNext(headerRecord);
			
			for(String[] record : records)
			{
				// Failures write to a .csv file
				// First 10 if-else if statements record individual failures
				if(record.length > 1 && record[0].equals(""))
				{
//					System.out.println("A : " + record[0]);
//					System.out.println("B : " + record[1]);
//					System.out.println("C : " + record[2]);
//					System.out.println("D : " + record[3]);
//					System.out.println("E : " + record[4]);
//					System.out.println("F : " + record[5]);
//					System.out.println("G : " + record[6]);
//					System.out.println("H : " + record[7]);
//					System.out.println("I : " + record[8]);
//					System.out.println("J : " + record[9]);
					csvWriter.writeNext(record);
					recNumber++;
					failureNumber++;
					continue;
				}
				else if(record.length > 1 && record[1].equals(""))
				{
//					System.out.println("A : " + record[0]);
//					System.out.println("B : " + record[1]);
//					System.out.println("C : " + record[2]);
//					System.out.println("D : " + record[3]);
//					System.out.println("E : " + record[4]);
//					System.out.println("F : " + record[5]);
//					System.out.println("G : " + record[6]);
//					System.out.println("H : " + record[7]);
//					System.out.println("I : " + record[8]);
//					System.out.println("J : " + record[9]);
					csvWriter.writeNext(record);
					recNumber++;
					failureNumber++;
					continue;
				}
				else if(record.length > 1 && record[2].equals(""))
				{
//					System.out.println("A : " + record[0]);
//					System.out.println("B : " + record[1]);
//					System.out.println("C : " + record[2]);
//					System.out.println("D : " + record[3]);
//					System.out.println("E : " + record[4]);
//					System.out.println("F : " + record[5]);
//					System.out.println("G : " + record[6]);
//					System.out.println("H : " + record[7]);
//					System.out.println("I : " + record[8]);
//					System.out.println("J : " + record[9]);
					csvWriter.writeNext(record);
					recNumber++;
					failureNumber++;
					continue;
				}
				else if(record.length > 1 && record[3].equals(""))
				{
//					System.out.println("A : " + record[0]);
//					System.out.println("B : " + record[1]);
//					System.out.println("C : " + record[2]);
//					System.out.println("D : " + record[3]);
//					System.out.println("E : " + record[4]);
//					System.out.println("F : " + record[5]);
//					System.out.println("G : " + record[6]);
//					System.out.println("H : " + record[7]);
//					System.out.println("I : " + record[8]);
//					System.out.println("J : " + record[9]);
					csvWriter.writeNext(record);
					recNumber++;
					failureNumber++;
					continue;
				}
				else if(record.length > 1 && record[4].equals(""))
				{
//					System.out.println("A : " + record[0]);
//					System.out.println("B : " + record[1]);
//					System.out.println("C : " + record[2]);
//					System.out.println("D : " + record[3]);
//					System.out.println("E : " + record[4]);
//					System.out.println("F : " + record[5]);
//					System.out.println("G : " + record[6]);
//					System.out.println("H : " + record[7]);
//					System.out.println("I : " + record[8]);
//					System.out.println("J : " + record[9]);
					csvWriter.writeNext(record);
					recNumber++;
					failureNumber++;
					continue;
				}
				else if(record.length > 1 && record[5].equals(""))
				{
//					System.out.println("A : " + record[0]);
//					System.out.println("B : " + record[1]);
//					System.out.println("C : " + record[2]);
//					System.out.println("D : " + record[3]);
//					System.out.println("E : " + record[4]);
//					System.out.println("F : " + record[5]);
//					System.out.println("G : " + record[6]);
//					System.out.println("H : " + record[7]);
//					System.out.println("I : " + record[8]);
//					System.out.println("J : " + record[9]);
					csvWriter.writeNext(record);
					recNumber++;
					failureNumber++;
					continue;
				}
				else if(record.length > 1 && record[6].equals(""))
				{
//					System.out.println("A : " + record[0]);
//					System.out.println("B : " + record[1]);
//					System.out.println("C : " + record[2]);
//					System.out.println("D : " + record[3]);
//					System.out.println("E : " + record[4]);
//					System.out.println("F : " + record[5]);
//					System.out.println("G : " + record[6]);
//					System.out.println("H : " + record[7]);
//					System.out.println("I : " + record[8]);
//					System.out.println("J : " + record[9]);
					csvWriter.writeNext(record);
					recNumber++;
					failureNumber++;
					continue;
				}
				else if(record.length > 1 && record[7].equals(""))
				{
//					System.out.println("A : " + record[0]);
//					System.out.println("B : " + record[1]);
//					System.out.println("C : " + record[2]);
//					System.out.println("D : " + record[3]);
//					System.out.println("E : " + record[4]);
//					System.out.println("F : " + record[5]);
//					System.out.println("G : " + record[6]);
//					System.out.println("H : " + record[7]);
//					System.out.println("I : " + record[8]);
//					System.out.println("J : " + record[9]);
					csvWriter.writeNext(record);
					recNumber++;
					failureNumber++;
					continue;
				}
				else if(record.length > 1 && record[8].equals(""))
				{
//					System.out.println("A : " + record[0]);
//					System.out.println("B : " + record[1]);
//					System.out.println("C : " + record[2]);
//					System.out.println("D : " + record[3]);
//					System.out.println("E : " + record[4]);
//					System.out.println("F : " + record[5]);
//					System.out.println("G : " + record[6]);
//					System.out.println("H : " + record[7]);
//					System.out.println("I : " + record[8]);
//					System.out.println("J : " + record[9]);
					csvWriter.writeNext(record);
					recNumber++;
					failureNumber++;
					continue;
				}
				else if(record.length > 1 && record[9].equals(""))
				{
//					System.out.println("A : " + record[0]);
//					System.out.println("B : " + record[1]);
//					System.out.println("C : " + record[2]);
//					System.out.println("D : " + record[3]);
//					System.out.println("E : " + record[4]);
//					System.out.println("F : " + record[5]);
//					System.out.println("G : " + record[6]);
//					System.out.println("H : " + record[7]);
//					System.out.println("I : " + record[8]);
//					System.out.println("J : " + record[9]);
					csvWriter.writeNext(record);
					recNumber++;
					failureNumber++;
					continue;
				}
				
				// Correct answers are recorded here and added to the database
				else if(record.length > 1)
				{
//					System.out.println("A : " + record[0]);
//					System.out.println("B : " + record[1]);
//					System.out.println("C : " + record[2]);
//					System.out.println("D : " + record[3]);
//					System.out.println("E : " + record[4]);
//					System.out.println("F : " + record[5]);
//					System.out.println("G : " + record[6]);
//					System.out.println("H : " + record[7]);
//					System.out.println("I : " + record[8]);
//					System.out.println("J : " + record[9]);
					
					try(Connection conn = connect();
						PreparedStatement pstmt = conn.prepareStatement(sql)){
						pstmt.setString(1, record[0]);
						pstmt.setString(2, record[1]);
						pstmt.setString(3, record[2]);
						pstmt.setString(4, record[3]);
						pstmt.setString(5, record[4]);
						pstmt.setString(6, record[5]);
						pstmt.setString(7, record[6]);
						pstmt.setString(8, record[7]);
						pstmt.setString(9, record[8]);
						pstmt.setString(10, record[9]);
						pstmt.executeUpdate();
					}
					catch (SQLException e){
						System.out.println(e.getMessage());
					}
					
					recNumber++;
					successNumber++;
				}
			}
			
			System.out.println();
//			System.out.println("# of records received: " + recNumber);
//			System.out.println("# of successes: " + successNumber);
//			System.out.println("# of failures: " + failureNumber);
			
			try {
				fh = new FileHandler("./src/resources/ms3InterviewLog.log");
				logger.addHandler(fh);
				SimpleFormatter formatter = new SimpleFormatter();
				fh.setFormatter(formatter);
				
				logger.info("# of records received: " + recNumber);
				logger.info("# of successes: " + successNumber);
				logger.info("# of failures: " + failureNumber);
			}
			catch(SecurityException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
	}

}
