class Thread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("BMS College of eingineering");
            try{
                Thread.sleep(10000);
            }
            catch(InterruptedException e){
                continue;
            }
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("CSE");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                continue;
            }
        }
    }
}

public class thread_prog8 {
    public static void main(String args[]){
        System.out.println("Control-C to exit");
        new Thread1().start();
        new Thread2().start();
    }
}
