package Unit10;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        Thread t1=new Thread(new CountThread2("线程A"));
        t1.start();
        for (int k=0;k<5;k++){
            if (k>=2){
                try {
                    t1.join();//线程强制运行
                }catch (InterruptedException e){ }
            }
            System.out.println("主线程运行:k="+k);
        }
    }
}
