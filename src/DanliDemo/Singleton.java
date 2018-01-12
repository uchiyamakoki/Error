package DanliDemo;

public class Singleton {
   //私有化构造方法，不允许外部直接创建对象
    private Singleton(){
    }
    //创建类的唯一实例
    private static Singleton instance=new Singleton();
    //提供一个用于获取实例的方法,使用public static修饰
    public static Singleton getInstance() {
        return instance;
    }
}
