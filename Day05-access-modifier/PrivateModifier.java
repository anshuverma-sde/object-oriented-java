public class PrivateModifier {
    public static void main(String[] args) {
        Human h = new Human();
        // System.out.println(h.name); // Not accessible
        // h.showName(); // Not accessible
        h.accessPrivate(); // Allowed through public method
    }
}

class Human {
    private int age = 10;

    private void showAge() {
        System.out.println(age);
    }

    public void accessPrivate() {
        showAge(); // Allowed inside class
    }
}