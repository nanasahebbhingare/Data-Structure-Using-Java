package com.datastructure.arrays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LoadDataFileToArray {
	public static void main(String[] args) {
		loadDataToFileAndPrint();
	}

	private static void loadDataToFileAndPrint() {
		List<String> lines = loadFileData();
		int sizeOfArray = Integer.valueOf(lines.get(0));
		String[] strArray = lines.get(1).split("\\,");
		display(strArray, sizeOfArray);
	}

	private static List<String> loadFileData() {
		List<String> lines = null;
		try {
			// Initialize Path object
			Path path = Paths.get("src/arrayData.txt");
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

	private static void display(String[] strArray, int sizeOfArray) {
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.println(strArray[i]);
		}
	}
}
