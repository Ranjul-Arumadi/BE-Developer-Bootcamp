class Main{
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alice";
        person.age = 5;
        

        // Static variable should not be access though object.
        System.out.println("Is alive: "+Person.isAlive);
        
        // Accessed through instance variable
        System.out.println("Name : "+person.name);
        System.out.println("Age : "+person.age);

    }
}