import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();

        Person p1 = new Person();
        p1.age = 1;
        p1.name = "A";
        al.add(p1);

        Person p2 = new Person();
        p2.age = 2;
        p2.name = "B";
        al.add(p2);

        Person p3 = new Person();
        p3.age = 3;
        p3.name = "C";
        al.add(p3);

        al.remove(p1);

        al.set(0, p2);

        for (Person person : al) {
            System.out.println(person.age+" "+person.name);
        }
        
    }
}

class Person{
    String name;
    int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}