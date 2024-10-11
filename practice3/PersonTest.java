package practice3;

public class PersonTest {
	  public static void main(String[] args) {
	        Person person = new Person("Yerdaly Yeskendir", "Sauran 20");
	        System.out.println(person);  // Вывод: Person[name = John Doe, address = 123 Main St]

	 
	        person.setAddress("Sauran 26");
	        System.out.println(person.getAddress());  
	        System.out.println(person);
}
}