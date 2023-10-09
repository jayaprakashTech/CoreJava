package com.filesanddirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {

		// Files.list(Paths.get(".")).forEach(System.out::println);

		// Files.walk(Paths.get("."), 4).forEach(System.out::println);

		Path path = Paths.get(".");
		Files.walk(path, 4).filter(i -> String.valueOf(i).contains(".java")).forEach(System.out::println);

		// Files.find(Paths.get("."), 4, (i1, i2) ->
		// String.valueOf(i1).contains(".java")).forEach(System.out::println);

		// Files.find(Paths.get("."), 4, (i1, i2) ->
		// i2.isDirectory()).forEach(System.out::println);
	}

}
