class A extends Thread{    // A class is extending the Thread class, so it can be used to create a thread
    public void run(){     // run() method is the entry point of the thread, it will be called when the thread is started, every thread class must have a run() method
        for(int i = 0; i <= 100; i++){
            System.out.println("Hii");
        }
    }
}

class B extends Thread{      // B class is also extending the Thread class, so it can also be used to create a thread
    public void run(){     // run() method is the entry point of the thread, it will be called when the thread is started, every thread class must have a run() method
        for(int i = 0; i <= 100; i++){
            System.out.println("Hello");
        }
    }
}

class TestM01_01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();    // start() method will call the run() method of the respective thread class
        b.start();    // start() method will call the run() method of the respective thread class
    }
}