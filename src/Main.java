import java.util.*;
public class Main{
	static String name;
	public static void main(String[] args){
		//一つ目のゲーム
		Greet g = new Greet();
		g.FirstGreet();
		User u = new User();
		u.userNumber();
		System.out.println(g.name + "さんの値は" + u.num1 + "です。");
		System.out.print(g.name + "さんの値は、コンピューターの値より大きいでしょうか(High or Low) ?>>");
		
		//一つ目のゲームの判定
		FirstJudge();

		//二つ目のゲーム
		g.SecondGreet();
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		Computer c3 = new Computer();
		Computer c4 = new Computer();

		c1.computerNumber2();
		c2.computerNumber2();
		c3.computerNumber2();
		c4.computerNumber2();

		System.out.print("1~99までの数字を入力してください ?>>");
		String num2 = new Scanner(System.in).next();
		int num3 = Integer.parseInt(num2);
		int score = (c1.num2 +c2.num2 +c3.num2 +c4.num2 +num3) / 7 ;
		Integer index = score;
        List<Integer> list = Arrays.asList(c1.num2, c2.num2, c3.num2,c4.num2,num3);
		int PerfectAnswer = list.stream().min(Comparator.comparing((Integer x) -> Math.abs(x - index))).get();
		//二つ目のゲームの判定
		if (PerfectAnswer == num3){
			System.out.println("おめでとうございます。あなたの勝利です！！！");
		}
		else{
			System.out.println("残念...あなたの負けです...");
		}
		System.out.println("５人の値を足して7で割った値は" + score + "でした。");
		System.out.println("一番近かった回答は" + PerfectAnswer + "です。" );
		System.out.println("以下参考までに--------------");
		System.out.println("コンピュータ１の数字："+c1.num2);
		System.out.println("コンピュータ２の数字："+c2.num2);
		System.out.println("コンピュータ３の数字："+c3.num2);
		System.out.println("コンピュータ４の数字："+c4.num2);
		System.out.println("----------------------------");
		System.out.println("ゲーム終了です。");
		System.out.println(g.name + "さんのまたのお越しをお待ちしてます！");
	}


	//一つ目のゲームの判定
	public static void FirstJudge(){
        Computer c1 = new Computer();
		Greet g = new Greet();
		User u = new User();
		String ans = new Scanner(System.in).next();
		c1.computerNumber();
		if(ans.equalsIgnoreCase("High") && c1.num1 < u.num1 || ans.equalsIgnoreCase("Low") && c1.num1 > u.num1){
			System.out.println("正解!!予想は的中しました！");
			System.out.println("おめでとう！！！");
			System.out.println("この調子で次も頑張ってください");
			
		}else if(c1.num1 == u.num1){
			System.out.println("引き分けです。惜しかったですね。");
			System.out.println("次は正解するといいですね。");
		}else{
			System.out.println("不正解...予想は的中しませんでした...");
			System.out.println("残念でした");
			System.out.println("気を取り直して次も頑張ってください");
		
		}
    }
}