package Java;

public class ThreadRunnable {
    public static void main(String[] args) throws InterruptedException {
        X x = new X();
        Thread n = new Thread(x);
        n.start();
        for(int i=2; i<10; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}

class X extends Y implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Y{

}
