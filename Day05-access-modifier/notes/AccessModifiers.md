
# 🔐 Access Modifiers in Java

Access modifiers in Java control the visibility (accessibility) of classes, methods, constructors, and variables. They are essential to enforce **encapsulation**, which is one of the core principles of Object-Oriented Programming.

---

## 🔹 Types of Access Modifiers

Java provides four access modifiers:

| Modifier      | Description                                                              |
|---------------|--------------------------------------------------------------------------|
| `private`     | Accessible only within the class where it is defined                     |
| *(default)*   | Accessible within classes in the same package                            |
| `protected`   | Accessible in the same package and in subclasses (even in different pkgs)|
| `public`      | Accessible from any other class anywhere                                 |

---

## ✅ `private` Modifier

- The **most restrictive** access level.
- Members declared `private` are **only accessible within the same class**.
- Helps in **data hiding**.

### 🔸 Use Case:

Keep sensitive fields and helper methods secure from outside interference.

### 💡 Example:

```java
class BankAccount {
    private double balance;

    private void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public void printBalance() {
        showBalance(); // ✅ internal access
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        // acc.balance = 1000;     // ❌ Not allowed
        // acc.showBalance();      // ❌ Not allowed
        acc.printBalance();        // ✅ Allowed via public method
    }
}
```

---

## ✅ Default (No Modifier)

- When no access modifier is specified, it's called **package-private**.
- Accessible **only within the same package**.
- Not accessible outside the package even in a subclass.

### 🔸 Use Case:

Used when you want access to be restricted to related classes in the same package.

### 💡 Example:

```java
// In package com.example.models
class Product {
    String name;

    void display() {
        System.out.println("Product: " + name);
    }
}
```

```java
// In same package
Product p = new Product();  // ✅ Accessible
p.display();                // ✅ Accessible

// In different package
Product p = new Product();  // ❌ Not Accessible
```

---

## ✅ `protected` Modifier

- Accessible within the **same package** and in **subclasses outside the package**.
- Often used when designing **inheritance-friendly** classes.

### 🔸 Use Case:

Allows controlled access to class members for subclasses while keeping some restrictions.

### 💡 Example:

```java
// basepkg/Animal.java
package basepkg;

public class Animal {
    protected void makeSound() {
        System.out.println("Some generic sound");
    }
}
```

```java
// derivedpkg/Dog.java
package derivedpkg;
import basepkg.Animal;

public class Dog extends Animal {
    public void sound() {
        makeSound(); // ✅ Accessible through inheritance
    }
}
```

```java
// non-subclass in another package
Animal a = new Animal();
a.makeSound(); // ❌ Not accessible
```

---

## ✅ `public` Modifier

- The **least restrictive** access level.
- Accessible from **any class anywhere**.
- Typically used for API methods, utility classes, and reusable code.

### 🔸 Use Case:

Use when a method/class needs to be accessible across all layers/modules of your application.

### 💡 Example:

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
        c.drive(); // ✅ Accessible
    }
}
```

---

## 🧠 Summary Table

| Modifier      | Same Class | Same Package | Subclass (Other Pkg) | Other Packages |
|---------------|------------|--------------|-----------------------|----------------|
| `private`     | ✅         | ❌           | ❌                    | ❌             |
| *(default)*   | ✅         | ✅           | ❌                    | ❌             |
| `protected`   | ✅         | ✅           | ✅                    | ❌             |
| `public`      | ✅         | ✅           | ✅                    | ✅             |

---

## 📌 Best Practices

- Use `private` by default for fields and helper methods.
- Expose only what’s necessary using `public`.
- Use `protected` for extensible base classes.
- Avoid using default unless you’re intentionally scoping within the package.

> 🔐 Access control helps in maintaining security, abstraction, and integrity of your code.

