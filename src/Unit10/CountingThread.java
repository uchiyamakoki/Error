package Unit10;

public class CountingThread extends Thread{
    private String name;
    public CountingThread(String name) {
        this.name=name;
    }
    public void run(){
        System.out.println("线程启动:"+this.name);
        for (int i=0;i<9;i++){
            System.out.println(name+"运动:i="+(i+1)+"\t");
            System.out.println("线程结束："+this.name);
        }
    }
}
