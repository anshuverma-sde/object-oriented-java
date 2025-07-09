
# 🔐 Access Modifiers in Java

Access modifiers in Java define the **visibility** or **scope** of classes, methods, and variables. They help in **encapsulation** and controlling access to internal parts of code.

---

## 🔹 Types of Access Modifiers

| Modifier      | Class | Same Package | Subclass (Other Package) | World (Everywhere) |
|---------------|:-----:|:------------:|:------------------------:|:------------------:|
| `private`     | ✅    | ❌           | ❌                       | ❌                 |
| *(default)*   | ✅    | ✅           | ❌                       | ❌                 |
| `protected`   | ✅    | ✅           | ✅                       | ❌                 |
| `public`      | ✅    | ✅           | ✅                       | ✅                 |

---

## ✅ `private` Example

```java
// File: Main.java
class Person {
    private String name = "John";

    private void showName() {
        System.out.println(name);
    }

    public void accessPrivate() {
        showName(); // ✅ Allowed inside class
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        // System.out.println(p.name);       // ❌ Not accessible
        // p.showName();                     // ❌ Not accessible
        p.accessPrivate();                  // ✅ Allowed through public method
    }
}
```

---

## ✅ Default (No Modifier) Example

```java
// File: samepkg/Student.java
package samepkg;

class Student {
    int age = 20;

    void showAge() {
        System.out.println(age);
    }
}

// File: samepkg/Test.java
package samepkg;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.showAge(); // ✅ Accessible in same package
    }
}
```

```java
// File: otherpkg/Demo.java
package otherpkg;

import samepkg.Student;

public class Demo {
    public static void main(String[] args) {
        // Student s = new Student(); // ❌ Not accessible in different package
    }
}
```

---

## ✅ `protected` Example

```java
// File: basepkg/Animal.java
package basepkg;

public class Animal {
    protected void speak() {
        System.out.println("Animal speaks");
    }
}
```

```java
// File: derivedpkg/Dog.java
package derivedpkg;

import basepkg.Animal;

public class Dog extends Animal {
    public void bark() {
        speak(); // ✅ Accessible in subclass from different package
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
```

```java
// File: derivedpkg/Test.java
package derivedpkg;

import basepkg.Animal;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        // a.speak(); // ❌ Not accessible outside subclass
    }
}
```

---

## ✅ `public` Example

```java
// File: vehicle/Car.java
package vehicle;

public class Car {
    public void drive() {
        System.out.println("Driving...");
    }
}
```

```java
// File: app/Main.java
package app;

import vehicle.Car;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive(); // ✅ Public method accessible from anywhere
    }
}
```

---

## 🧠 Summary

- `private`: Accessible only inside the same class.
- **Default**: Accessible only within the same package.
- `protected`: Accessible in the same package and in subclasses across packages.
- `public`: Accessible from anywhere.

> 📌 Choose the most restrictive access level necessary for better security and encapsulation.
