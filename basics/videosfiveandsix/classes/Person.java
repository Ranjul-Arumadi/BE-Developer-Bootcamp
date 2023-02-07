public class Person {
    String name;
    int age;

    static boolean isAlive = true;

    public static boolean isAlive() {
        return isAlive;
    }

    public static void setAlive(boolean isAlive) {
        Person.isAlive = isAlive;
    }

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

}
