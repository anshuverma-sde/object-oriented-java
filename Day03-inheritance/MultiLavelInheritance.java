public class MultiLavelInheritance {
    public static void main(String arg[]){
        Scorpio newCar = new Scorpio();
        newCar.intro();
        newCar.runCar();
        newCar.breakCar();
    }
}


class Car{
    String color;
    int weight;

    void runCar(){
        System.out.println("car is running");
    }

    void breakCar(){
        System.out.println("car is breaking");
    }
}

class Mahindra extends Car{
    int rating;

    void intro(){
        System.out.println("This is Mahindra");
    }
}

class Scorpio extends Mahindra{

}