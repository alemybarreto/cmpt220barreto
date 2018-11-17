package lab10;
class AbstractClassTest {

    public static void main(String[] args) {
        AbstractClass obj1 = new FirstSubclass();
        obj1.printMessage();

        AbstractClass obj2 = new SecondSubclass();
        obj2.printMessage();
    }

}