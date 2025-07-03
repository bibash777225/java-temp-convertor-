// 1. Write a generic class Box that can hold any type of object. Demonstrate how generics can
// help prevent runtime type errors by trying to add incompatible types without using generics.

// Generic Box class
package unit8;
class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        // Box to hold String
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        String text = stringBox.get();
        System.out.println("String: " + text);

        // Box to hold Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        int number = intBox.get();
        System.out.println("Number: " + number);

        // stringBox.set(123); // ❌ Error: Can't put Integer into Box<String>
    }
}
