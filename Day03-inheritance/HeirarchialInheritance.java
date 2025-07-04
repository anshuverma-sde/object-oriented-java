public class HeirarchialInheritance {
    public static void main(String arg[]){
        Intern newIntern = new Intern();
        newIntern.intro();
        newIntern.stipend();

        FullTimeEmployee newFullTimeEmp = new FullTimeEmployee();
        newFullTimeEmp.intro();
        newFullTimeEmp.salary();
    }
}

class Employee{
    void intro(){
        System.out.println("Employee");
    }
}

class Intern extends Employee{
    void stipend(){
        System.out.println("Stipend");
    }
}

class FullTimeEmployee extends Employee{
    void salary(){
        System.out.println("Salary");
    }
}