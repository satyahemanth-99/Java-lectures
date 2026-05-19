class A extends Thread{    // A class is extending the Thread class, so it can be used to create a thread
    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.println("Hii");
            try {
                Thread.sleep(10);  //this will in waiting state for 10 milliseconds, this will give chance to other thread to execute, this is called as yielding the thread, it will help in better performance of the thread, it will also help in avoiding starvation of the thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{      // B class is also extending the Thread class, so it can also be used to create a thread   
    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);  //this will in waiting state for 10 milliseconds, this will give chance to other thread to execute, this is called as yielding the thread, it will help in better performance of the thread, it will also help in avoiding starvation of the thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class TestM01_01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // b.setPriority(Thread.MAX_PRIORITY);  //setPriority() method is used to set the priority of the thread, it takes an integer value as an argument, the higher the value, the higher the priority of the thread

        a.start();    // start() method will call the run() method of the respective thread class
        b.start();    // start() method will call the run() method of the respective thread class
    }
}