import java.util.*;

public class Computer{
    public int num;

    public void computerNumber(){ 
        this.num = new Random().nextInt(13)+1;
        
        System.out.println("コンピューターの値は"+num+"です。");
}
}
