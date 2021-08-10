package com.java8.stream.programs;

import java.util.Arrays;
import java.util.List;

public class MapMethod {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
		
        list.stream().map(number -> number * 3).forEach(System.out::println);
	}

}
