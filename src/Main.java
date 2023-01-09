import java.util.*;
public class Main{
	public static void main(String[] args){
		int num1 = new Random().nextInt(13)+1;
		System.out.println("1枚目の値は" + num1 + "です。");
		System.out.print("次の値は前回の値より大きいでしょうか(High or Low) ?>>");
		String ans = new Scanner(System.in).next();
		int num2 = new Random().nextInt(13)+1;
		System.out.println("1枚目の値は" + num2 + "でした。");
        if(ans.equalsIgnoreCase("High") && num1 < num2 || ans.equalsIgnoreCase("Low") && num1 > num2){
			System.out.println("You Win!!");
		}else{
			System.out.println("You Lose...");
		}
	}


}