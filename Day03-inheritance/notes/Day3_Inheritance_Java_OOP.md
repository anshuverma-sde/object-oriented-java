
# 📘 Day 3: Inheritance in Java – OOPs Journey

## 🔷 What is Inheritance?

Inheritance is an OOP concept where a class (child) inherits properties and methods from another class (parent). It promotes **code reusability** and supports **hierarchical structure** in applications.

---

## 🔹 Types of Inheritance in Java

### ✅ 1. Single Inheritance

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // from Animal
        d.bark();  // from Dog
    }
}
```

---

### ✅ 2. Multilevel Inheritance

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
```

---

### ✅ 3. Hierarchical Inheritance

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
```

---

## ⚠️ Why Multiple Inheritance is Not Supported in Java

### ❌ The Diamond Problem

If a class inherits from two classes that have the same method, the JVM wouldn't know which method to call.

```java
class A {
    void show() {
        System.out.println("From A");
    }
}

class B {
    void show() {
        System.out.println("From B");
    }
}

// ❌ This will NOT compile in Java
class C extends A, B { 
    // Ambiguous method reference
}
```

### ✅ Solution in Java

Java allows **multiple inheritance through interfaces**, not classes.

---

## ⚠️ Why Hybrid Inheritance is Not Supported

Hybrid inheritance is a combination of multiple types (like hierarchical + multilevel), often involving multiple inheritance.

### ❌ Java restricts it via classes to avoid:

- Method ambiguity
- Constructor conflicts
- Diamond problem

### ✅ You can simulate it using:

- Interfaces for multiple inheritance
- Composition and abstraction

---

## 🧠 Summary Table

| Type                | Supported? | Example                     |
|---------------------|------------|-----------------------------|
| Single              | ✅         | `Dog extends Animal`        |
| Multilevel          | ✅         | `Puppy → Dog → Animal`      |
| Hierarchical        | ✅         | `Dog & Cat extend Animal`   |
| Multiple (Classes)  | ❌         | Use interfaces instead      |
| Hybrid              | ❌         | Use interfaces + composition|

---

📌 **Next Up**: Method Overriding & `super` keyword

📂 **Explore Full Repo**: [GitHub – anshuverma-sde](https://github.com/anshuverma-sde)
