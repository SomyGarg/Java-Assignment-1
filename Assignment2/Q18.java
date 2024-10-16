/*Create three interfaces, each with two methods. Inherit a new interface from the three, 
adding a new method. Create a class by implementing the new interface and also 
inheriting from a concrete class. Now write four methods, each of which takes one of the 
four interfaces as an argument. In main ( ), create an object of your class and pass it to 
each of the methods. */
public class Q18 {
    public static void main(String[] args) {
        MultiInterfaceClass obj = new MultiInterfaceClass();
        obj.method1();
        obj.method3();
        obj.method5();
        obj.method7();
        obj.concreteMethod();
    }
}

interface Interface1 {
    void method1();
    void method2();
}

interface Interface2 {
    void method3();
    void method4();
}

interface Interface3 {
    void method5();
    void method6();
}

interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void method7();
}

class ConcreteClass {
    void concreteMethod() {
        System.out.println("Concrete Class Method");
    }
}

class MultiInterfaceClass extends ConcreteClass implements CombinedInterface {
    public void method1() {
        System.out.println("Method1");
    }

    public void method2() {
        System.out.println("Method2");
    }

    public void method3() {
        System.out.println("Method3");
    }

    public void method4() {
        System.out.println("Method4");
    }

    public void method5() {
        System.out.println("Method5");
    }

    public void method6() {
        System.out.println("Method6");
    }

    public void method7() {
        System.out.println("Method7");
    }
}
