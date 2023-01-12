import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.println("ゲームを開始します");
		System.out.print("あなたの名前を入力してください) ?>>");
		String name = new Scanner(System.in).next();
		System.out.println(name + "さん、ようこそ！");
		System.out.println(name + "さんには、2種類のゲームプレイしていただきます");
		System.out.println("まず1つ目は");
		System.out.println("---------------");
		System.out.println("High&Low");
		System.out.println("---------------");
		System.out.println("です。");
		System.out.println("ルールは簡単");
		System.out.println("コンピューターの値が" + name + "さんより大きいか否かを当てるゲームです。");
		User u = new User();
		u.userNumber();
		System.out.println(name + "さんの値は" + u.num1 + "です。");
		System.out.print(name + "さんの値は、コンピューターの値より大きいでしょうか(High or Low) ?>>");
		String ans = new Scanner(System.in).next();
		Computer c1 = new Computer();
		c1.computerNumber();
		
        if(ans.equalsIgnoreCase("High") && c1.num1 < u.num1 || ans.equalsIgnoreCase("Low") && c1.num1 > u.num1){
			System.out.println("正解!!" + name + "さんの予想は的中しました！");
			System.out.println("おめでとう！！！");
			System.out.println("この調子で次も頑張ってください");
			
		}else if(c1.num1 == u.num1){
			System.out.println("引き分けです。惜しかったですね。");
			System.out.println("次は正解するといいですね。");
		}else{
			System.out.println("不正解..." + name + "さんの予想は的中しませんでした...");
			System.out.println("残念でした");
			System.out.println("気を取り直して次も頑張ってください");
		
		}


		System.out.println("2つ目に移ります");
		System.out.println("2つ目は");
		System.out.println("---------------");
		System.out.println("変則High&Low");
		System.out.println("---------------");
		System.out.println("です。");
		System.out.println("ルールは");
		System.out.println("１：プレイヤーは"+name+"さんを含んだ５人で行います。");
		System.out.println("２："+name+"さんに1~99の間で数字を選んでいただきます。");
		System.out.println("３：全員の値を足して3で割った数字に最も近かった人が勝ちです。");


		Computer c2 = new Computer();
		Computer c3 = new Computer();
		Computer c4 = new Computer();


		System.out.print("1~99までの数字を入力してください ?>>");
		String num2 = new Scanner(System.in).next();
		int num3 = Integer.parseInt(num2);


		System.out.println(c1.num2);
		c1.computerNumber2();
		c2.computerNumber2();
		System.out.println(c2.num2);
		c3.computerNumber2();
		System.out.println(c3.num2);
		c4.computerNumber2();
		System.out.println(c4.num2);
		


		int score = (c1.num2 +c2.num2 +c2.num2 +c2.num2 +num3) / 3 ;
		System.out.println("５人の値を足して3で割った値は" + score + "でした。");
		Integer index = score;
        List<Integer> list = Arrays.asList(c1.num2, c2.num2, c4.num2,num3);
		int PerfectAnswer = list.stream().min(Comparator.comparing((Integer x) -> Math.abs(x - index))).get();
		System.out.println("一番近かった回答は" + PerfectAnswer + "です。" );
		if (PerfectAnswer == num3){
			System.out.println("おめでとうございます。" + name + "さんの勝利です！！！");
		}
		else{
			System.out.println("残念" + name + "さんの負けです...");
		}



		System.out.println("ゲーム終了です。");
		System.out.println("またプレイしてください！");

	}


}