import java.util.*;
public class Main{
	static String name;
	public static void main(String[] args){
		//一つ目のゲーム
		Greet g = new Greet();
		Computer c1 = new Computer();
		g.firstGreet();
		User u = new User();
		u.userNumber();
		System.out.println(g.name + "さんの値は" + u.num1 + "です。");
		System.out.print(g.name + "さんの値は、コンピューターの値より大きいでしょうか(High or Low) ?>>");
		
		//一つ目のゲームの判定
		String ans = new Scanner(System.in).next();
		c1.computerNumber();
		//highかlowを大文字小文字関係なく比較する
		if(ans.equalsIgnoreCase("High") && c1.num1 < u.num1 || ans.equalsIgnoreCase("Low") && c1.num1 > u.num1){
			correctAnswer();
		}else if(c1.num1 == u.num1){
			Draw();
		}else{
			incorrectAnswer();
		}
		//二つ目のゲーム
		g.secondGreet();
		Computer c2 = new Computer();
		Computer c3 = new Computer();
		Computer c4 = new Computer();
		//ユーザの値をstr型で受け取りint型に変換する
		System.out.print("1~99までの数字を入力してください ?>>");
		String num2 = new Scanner(System.in).next();
		//コンピュータの数字を受け取る(1~99をランダムで)
		c1.computerNumber2();
		c2.computerNumber2();
		c3.computerNumber2();
		c4.computerNumber2();
		int num3 = Integer.parseInt(num2);
		int score = (c1.num2 +c2.num2 +c3.num2 +c4.num2 +num3) / 7 ;
		Integer index = score;
		//５人の中で一番７で割った数に近かった人を探し出す
        List<Integer> list = Arrays.asList(c1.num2, c2.num2, c3.num2,c4.num2,num3);
		int PerfectAnswer = list.stream().min(Comparator.comparing((Integer x) -> Math.abs(x - index))).get();
		System.out.println("５人の値を足して7で割った値は" + score + "でした。");
		System.out.println("一番近かった回答は" + PerfectAnswer + "です。" );
		//二つ目のゲームの判定
		if (PerfectAnswer == num3){
			System.out.println("おめでとうございます。あなたの勝利です！！！");
		}
		else{
			System.out.println("残念...あなたの負けです...");
		}
		finish();
	}

	//一つ目のif文の中身用
	public static void correctAnswer(){
		System.out.println("正解!!予想は的中しました！");
		System.out.println("おめでとう！！！");
		System.out.println("この調子で次も頑張ってください");
	}
	public static void Draw(){
		System.out.println("引き分けです。惜しかったですね。");
		System.out.println("次は正解するといいですね。");
	}
	public static void incorrectAnswer(){
		System.out.println("不正解...予想は的中しませんでした...");
		System.out.println("残念でした");
		System.out.println("気を取り直して次も頑張ってください");
	}

	//ゲーム終了用
	public static void finish(){
		System.out.println("ゲーム終了です。");
		System.out.println("またのお越しをお待ちしております！");
	
	}


}