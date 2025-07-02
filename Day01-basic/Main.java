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

    // properties
    int age;
    int weight;

    // behavior
    void sleep(){
        System.out.println("Sleeping.");
    }

    void eat(){
        System.out.println("Eating.");
    }

}