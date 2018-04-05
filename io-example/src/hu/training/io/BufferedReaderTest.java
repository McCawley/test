package hu.training.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		PrintWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader("resources\\bufferedin.txt"));
			writer = new PrintWriter(new FileWriter("resources\\bufferedout.txt", true)); // true -> append
			String line = null;

			while ((line = reader.readLine()) != null) {
				writer.println(line);
			}
		} finally {
			if (reader != null) {
				reader.close();
			}
			if (writer != null) {
				writer.close();
			}
		}
	}

}
