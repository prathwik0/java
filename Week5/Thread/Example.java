/* Write a java program that implements Thread class methods */

package Thread;

class Example extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("running thread name is: " + Thread.currentThread().getName());
                System.out.println(
                        "running thread priority is:" + Thread.currentThread().getPriority());
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Example t0 = new Example();
        Example t1 = new Example();
        Example t2 = new Example();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t0.run();
        try {
            t0.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t1.run();
        t2.run();
    }
}
