package Java;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        a.start();
        for(int i=2; i<10; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}

class A extends Thread{
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