import java.util.List;

public class Person {
	private String name;
	private String age;
	private List<String> favoriteFoods;
	private boolean likesJava;
	
	// Constructors
	public Person() {
		super();
	}
	public Person(String name) {
		this();
		this.name = name;
	}

	public Person(String name, String age) {
		this(name);
		this.age = age;
	}

	public Person(String name, String age, List<String> favoriteFoods) {
		this(name, age);
		this.favoriteFoods = favoriteFoods;
	}

	public Person(String name, String age, boolean likesJava) {
		this(name, age);
		this.likesJava = likesJava;
	}

	public Person(String name, String age, List<String> favoriteFoods, boolean likesJava) {
		this(name, age, favoriteFoods);
		this.likesJava = likesJava;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public List<String> getFavoriteFoods() {
		return favoriteFoods;
	}

	public void setFavoriteFoods(List<String> favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
	}

	public boolean isLikesJava() {
		return likesJava;
	}

	public void setLikesJava(boolean likesJava) {
		this.likesJava = likesJava;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + ": " + name;
	}

}
