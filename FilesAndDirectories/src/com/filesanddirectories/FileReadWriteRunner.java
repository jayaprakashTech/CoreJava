package com.filesanddirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReadWriteRunner {

	public static void main(String[] args) throws IOException {

		// Files.readAllLines(Paths.get("./resources/data.txt")).forEach(System.out::println);
		/*
		 * Files.lines(Paths.get("./resources/data.txt")).map(String::toUpperCase).
		 * filter(i -> i.contains("A")) .forEach(System.out::println);
		 */

		List<String> list = List.of("asam", "bihar", "jaipur");
		Files.write(Paths.get("./resources/write.txt"), list);

	}

}
