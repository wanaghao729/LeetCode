package src.getOffer;

public class Test {
    private int value = 1;
    private synchronized void printOdd() {
        while (value <= 100) {
            if ((value&0x01) == 1) {
                System.out.println(Thread.currentThread() + ": -" + value++);
                this.notify();
            }else {
                try {
                    this.wait();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private synchronized void printEven() {
        while (value <= 100) {
            if ((value&0x01) == 0) {
                System.out.println(Thread.currentThread() + ": -" + value++);
                this.notify();
            }else {
                try {
                    this.wait();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        System.out.println(2&0x1);
        System.out.println(3&0x1);
        Test t = new Test();
        Thread t1 = new Thread(t::printOdd);
        Thread t2 = new Thread(t::printEven);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(0.6332);
    }
}
