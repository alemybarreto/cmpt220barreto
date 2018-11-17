package lab10;
abstract class AbstractClass {
    public abstract void printMessage();
}

class FirstSubclass extends AbstractClass {
    @Override
    public void printMessage() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends AbstractClass {
    @Override
    public void printMessage() {
        System.out.println("This is second subclass");
    }
}