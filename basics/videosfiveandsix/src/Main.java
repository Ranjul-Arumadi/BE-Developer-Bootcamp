class Main{
    public static void main(String[] args) {
        Person person = new Person();

        // Accessed through instance variable
        person.setAge(1);
        person.setName("Alice");

        System.out.println(person.getAge());
        System.out.println(person.getName());
        

        // Static variable should not be access though object.
        System.out.println("Is alive: "+Person.isAlive());
        
    }
}