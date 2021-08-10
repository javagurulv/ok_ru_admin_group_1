package teacher.lesson_13_streams.lessoncode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitStreamApi {

	private List<Fruit> fruits = new ArrayList<>();

	public FruitStreamApi() {
		fruits.add(new Fruit("apple", "red", 100));
		fruits.add(new Fruit("apple", "green", 200));
		fruits.add(new Fruit("pear", "red", 100));
		fruits.add(new Fruit("pear", "yellow", 100));
		fruits.add(new Fruit("tomato", "red", 100));
	}

	public List<Fruit> getAllFruits() {
		return fruits;
	}

	public List<Fruit> findAllApplesV2() {
		return fruits.stream()
				.filter(new Predicate<Fruit>() {
					@Override
					public boolean test(Fruit fruit) {
						return "apple".equals(fruit.getTitle());
					}
				})
				.collect(Collectors.toList());
	}

	public List<Fruit> findAllApplesV1() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.collect(Collectors.toList());
	}

	public List<Fruit> findRedApplesWithWeightBiggerThen100() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.filter(fruit -> "red".equals(fruit.getColor()))
				.filter(fruit -> fruit.getWeight() > 100)
				.collect(Collectors.toList());
	}

	public Set<String> findAllFruitUniqNamesV2() {
		return fruits.stream()
				.map(new Function<Fruit, String>() {
					@Override
					public String apply(Fruit fruit) {
						return fruit.getTitle();
					}
				})
				.collect(Collectors.toSet());
	}


	public Set<String> findAllFruitUniqNamesV1() {
		return fruits.stream()
					 .map(fruit -> fruit.getTitle())
					 .collect(Collectors.toSet());
	}

	public List<String> findAllFruitUniqueNames() {
		Optional<Fruit> red = fruits.stream()
				//.parallel()
				.filter(fruit -> "red".equals(fruit.getColor()))
				.findFirst();

		return fruits.stream()
				.map(Fruit::getTitle)
				//.map(fruit -> fruit.getTitle())
				.distinct()
				.collect(Collectors.toList());
	}

	public Optional<Fruit> findAnyApple() {
		// Optional.empty();
		return fruits.stream()
					 .filter(fruit -> "apple".equals(fruit.getTitle()))
					 .findAny();
	}

	public Optional<Fruit> findFirstApple() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.findFirst();
	}
}
