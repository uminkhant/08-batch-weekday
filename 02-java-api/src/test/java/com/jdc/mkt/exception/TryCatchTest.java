package com.jdc.mkt.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TryCatchTest {

	void testTryCatchFinally() {
		try {
			var writer = new PrintWriter(new File("hello.txt"));
			writer.write("Hello java");

			writer.close();

		} catch (FileNotFoundException e) {
			System.out.println("There is no file");
		}finally {
			System.out.println("call tryCatchFinally method");
		}
	}

	void testTryWithResource() {
		try (var writer = new PrintWriter(new File("hello.txt"))) {
			writer.write("Hello java developer ");
			
		} catch (FileNotFoundException  e) {
			System.out.println("There is no file");
		}
	}

	@SuppressWarnings("null")
	@Test
	@Disabled
	void testTryMultiCatchOne() {
				
		try  {
			File f = new File("/mkt/documents","hello.txt");
			f = null;
			f.createNewFile();
			
			var writer = new PrintWriter(f);
			writer.write("Hello java developer ");
			
			writer.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("error casuse of crate new printwriter");
		}
		catch (IOException e) {
			System.out.println("error cause of create new file");
		}catch(RuntimeException e) {
			System.out.println("Null error of file");
		}
		catch(Exception e) {
			
		}
		
	}
	
	@SuppressWarnings({ "null", "unused" })
	@Test
	void testTryMultiCatchTwo() {
				
		try  {
			File f = new File("/mkt/documents","hello.txt");
			f = null;
			f.createNewFile();
			int i = 1000/0 ;
			
		
		}catch (NullPointerException | ArithmeticException | IOException e) {
			System.out.println("try multi catch");
		}
		
	}
}
