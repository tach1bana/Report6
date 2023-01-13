import java.util.*;

public class Computer{
    public int num1;
    public int num2;
    public void computerNumber(){ 
        //１〜１３の数字をランダムで取得し、それを出力する
        /**
　　　　　　　　　　    *一つ目のゲーム用のコンピュータの値
　　　　　　　　　    　*/
        this.num1 = new Random().nextInt(13)+1;
        System.out.println("コンピューターの値は"+num1+"でした。");
    }
    public void computerNumber2(){
        //１〜９９の数字をランダムで取得し、それを出力する
        /**
　　　　　　　　　　    *二つ目のゲーム用のコンピュータの値
　　　　　　　　　    　*/
        this.num2 = new Random().nextInt(99)+1;
        System.out.println(this.num2);
    }
}
