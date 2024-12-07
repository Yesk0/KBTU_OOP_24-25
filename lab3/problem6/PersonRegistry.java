package lab3.problem6;

import java.util.Vector;

public class PersonRegistry {
	private Vector<Person> clients;
	
	public PersonRegistry() {
		clients = new Vector<>();
	}
	
	public void addPerson(Person p) {
		clients.add(p);
	}
	public void removePerson(Person p) {
		clients.remove(p);
	}
	
	
	public void checkPet(Person p) {
		for(Person person : clients) {
			if(person.equals(p)) {
				if(person.hasPet()) {
					System.out.println(p.getName() + " has a pet");
					
				}
				else {
					 System.out.println(p.getName() + " doesn't have a pet");
					 
				}
			}
			
		}
	}
	

	
	public String toString() {
		return "the pet was succesfully taked!";
	}

    public Vector<Person> getPersons() {
        return clients;
    }
	
	
}
