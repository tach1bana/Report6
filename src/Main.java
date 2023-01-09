import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.print("あなたの名前を入力してください) ?>>");
		String name = new Scanner(System.in).next();
		
		Computer c = new Computer();
		c.computerNumber();
		System.out.print(name + "の値は、コンピューターの値より大きいでしょうか(High or Low) ?>>");
		String ans = new Scanner(System.in).next();
		User u = new User();
		u.userNumber();
		System.out.println(name + "の値は"+ u.num +"です。");
		
        if(ans.equalsIgnoreCase("High") && c.num < u.num || ans.equalsIgnoreCase("Low") && c.num > u.num){
			System.out.println("You Win!!");
		}else if(c.num == u.num){
			System.out.println("Draw");
		}else{
			System.out.println("You Lose...");
		}

	}


}