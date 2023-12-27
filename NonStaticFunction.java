class NonStaticFunction2 {
     void fun1() {
        System.out.println("A");
    }

      void fun2() {
        System.out.println("B");
    }

     void fun3() {
        System.out.println("C");
    }

 }
 class NonStaticFunction{
     public static void main(String[] args) {
        System.out.println("Hello World");
        NonStaticFunction obj1 = new NonStaticFunction ();
        obj1.fun1();
        obj1.fun2();
        obj1.fun3();
    }
}
