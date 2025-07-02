public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello Anshu");

        // create an object
        Human anshu = new Human();
        anshu.age = 24;
        anshu.weight = 74;

        anshu.sleep();
        anshu.eat();
    }
}

class Human {

    // properties/data member
    int age;
    int weight;

    // default constructor

    // 2 types:
    // no-arg constructor
    public Human(){
        age = 0;
        System.out.println("Inside the constructor - Creating Object.");
    }
    // parameterized constructor


    // behavior
    void sleep(){
        System.out.println("Sleeping.");
    }

    void eat(){
        System.out.println("Eating.");
    }

}