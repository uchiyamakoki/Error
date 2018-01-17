package Unit6;

public class ExceptionDemo {
    public static void main(String[] args) {
        int i=0;
        String[] colours={"RED","BLUE","GREEN"};
        try {
            System.out.println("输入颜色是（1,2,3）：");
            String s="4";
            i=Integer.parseInt(s); //需要捕捉NumberformatException异常
            System.out.println(i+",");
            //捕捉ArrayIndexOutOfBonndsException异常
            System.out.println(colours[i-1]);
        }catch (NumberFormatException e){
            System.out.println("数据格式错误");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
            e.printStackTrace();
        }finally {
            System.out.println("finally,goodbye!");
        }
    }
}
