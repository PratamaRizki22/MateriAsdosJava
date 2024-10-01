package method2;

class Person {
    // Atribut
    String name;
    int age;
    String city;
    String gender;

    // Konstruktor untuk inisialisasi atribut, dibahas habis uts
//    public Person(String name, int age, String city, String gender) {
//        this.name = name;
//        this.age = age;
//        this.city = city;
//        this.gender = gender;
//    }
    
    // method
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

}

class DiagramClass {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        person1.age = 35;
        person1.city = "Delhi";
        person1.gender = "male";
        person1.eat();
        person1.study();

        Person person2 = new Person();
        person2.name = "Dessy";
        person2.age = 20;
        person2.city = "Pune";
        person2.gender = "female";
        person2.play();
        person2.sleep();
    }
}
