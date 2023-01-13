import java.util.*;

public class Computer{
    public int num1;
    public int num2;
    public void computerNumber(){ 
        this.num1 = new Random().nextInt(13)+1;
        System.out.println("コンピューターの値は"+num1+"でした。");
    }
    public void computerNumber2(){
        this.num2 = new Random().nextInt(99)+1;
    }
}
