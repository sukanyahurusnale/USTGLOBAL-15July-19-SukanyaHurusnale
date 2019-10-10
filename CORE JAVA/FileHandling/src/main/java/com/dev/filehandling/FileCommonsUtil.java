package com.dev.filehandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileCommonsUtil {

	public static void main(String[] args) throws IOException {

		File file = new File("E:/Text.txt");

		FileUtils.touch(file); // filecreated name is Text.txt

		if (file.exists()) {
			System.out.println("file exists...");
		}

		else {
			System.out.println("file does not exist...");
		}

		FileUtils.deleteQuietly(file); // file deleted
		if (file.exists()) {
			System.out.println("file exists...");
		}

		else {
			System.out.println("file does not exist...");
		}
	}

}
