public class SingleInheritance {
    public static void main(String arg[]){

        Male anshu = new Male();
        anshu.sleep();
    }
}


class Human{
    int age;
    int weight;
    public Human(){
        System.out.println("Constructor created");
    }

    void sleep(){
        System.out.println("Sleeping");
    }

    void eat(){
        System.out.println("Eating");
    }
}

class Male extends Human {

}