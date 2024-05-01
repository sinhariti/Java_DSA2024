class Base {
    int baseValue;

    Base(int value) {
        this.baseValue = value;
    }

    void display() {
        System.out.println("Base class value: " + baseValue);
    }
}

class Derived extends Base {
    int derivedValue;

    Derived(int baseValue, int derivedValue) {
        super(baseValue); // Call the constructor of the base class
        this.derivedValue = derivedValue;
    }

    void display() {
        super.display(); // Call the display() method of the base class
        System.out.println("Derived class value: " + derivedValue);
    }
}
public class superclass1 {
    public static void main(String[] args) {
        Derived derivedObj = new Derived(10, 20);
        derivedObj.display();
    }
}
