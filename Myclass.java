class MyClass {
    // static variable to count number of objects
    static int count = 0;

    // constructor
    MyClass() {
        count++;   // increment when an object is created
    }

    public static void main(String[] args) {
        // create objects
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        // display number of objects created
        System.out.println("No of objects = " + MyClass.count);
    }
}
