package task5.PetManagment;

import java.util.HashSet;
import java.util.Set;

public class PersonRegistry
{
    private Set<Person> people = new HashSet<>();

    public void addPerson(Person person)
    {
        people.add(person);
    }
    public void removePerson(Person person)
    {
        people.remove(person);
    }

    public Set<Person> getPeoplePets()
    {
        Set<Person> result = new HashSet<>();
        for (Person person : people)
        {
            if (person.hasPet())
            {
                result.add(person);
            }
        }
        return result;
    }

    public Set<Person> getPeopleNoPets()
    {
        Set<Person> result = new HashSet<>();
        for (Person person : people)
        {
            if (!person.hasPet())
            {
                result.add(person);
            }
        }
        return result;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Person person : people)
        {
            sb.append(person).append("\n");
        }
        return sb.toString();
    }
}