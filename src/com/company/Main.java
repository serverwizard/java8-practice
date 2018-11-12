package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<String> ids = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		ids.stream()
				.filter(id -> id.startsWith("c"))
				.map(c -> c.toUpperCase())
				.sorted()
				.forEach(System.out::println);
		System.out.println("=======");

		Arrays.stream(new int[]{1, 2, 3})
				.map(val -> val * 2) // 2, 4, 6
				.average()
				.ifPresent(val -> System.out.println(val));
		System.out.println("=======");

		Stream.of("d2", "a2", "b1", "b3", "c")
				.map(s -> s.toUpperCase())
				.anyMatch(
						s -> {
							System.out.println("result : " + s);
							return s.startsWith("A");
						});
		System.out.println("=======");

	}
}
