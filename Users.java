import lab1.Course;

import java.util.ArrayList;
import java.util.List;

class Users {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    Users(int id, String login, String password, String name, String surname){

        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public Users() {

    }
}

class User extends Users{
    User(int id, String login, String password, String name, String surname){
        super(id, login,password, name, surname);
    }
    int getId(){
        return id;
    }
    String getLogin(){
        return login;
    }
    String getPassword(){
        return password;
    }
    String getName(){
        return name;
    }
    String getSurname(){
        return surname;
    }
    void setId(int id){ this.id = id; }
    void setLogin(String login){ this.login = login; }
    void setPassword(String password){ this.password = password; }
    void setName(String name){ this.name = name; }
    void setSurname(String surname){ this.surname = surname; }
    String getData(){
        return id + " " + login + " " + password + " " + name + " " + surname;
    }

}

class staff extends User{
    double salary;
    List<String> subjects = new ArrayList<>();
    staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }
    double getSalary(){ return salary; }
    void setSalary(double salary){ this.salary = salary; }

    void addSubject(String subjects){ this.subjects.add(subjects); }
    @Override
    String getData() {
        return id + " " + login + " " + password + " " + name + " " + surname + " " + salary + " " + subjects;

    }
}
class Student extends User{
    double gpa;
    List<String> courses = new ArrayList<>();
    Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }
    double getGpa(){ return gpa; }
    void setGpa(double gpa){ this.gpa = gpa; }
    void addCourse(String courses){ this.courses.add(courses); }
    @Override
    String getData() {
        return id + " " + login + " " + password + " " + name + " " + surname + " " + gpa + " " + courses;
    }


}