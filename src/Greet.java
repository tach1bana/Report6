import java.util.*;
public class Greet {
	String name;

	public void FirstGreet(){
		System.out.println("ゲームを開始します");
		System.out.print("あなたの名前を入力してください) ?>>");
		this.name = new Scanner(System.in).next();
		System.out.println(this.name + "さん、ようこそ！");
		System.out.println(this.name + "さんには、2種類のゲームプレイしていただきます");
		System.out.println("まず1つ目は");
		System.out.println("---------------");
		System.out.println("High&Low");
		System.out.println("---------------");
		System.out.println("です。");
		System.out.println("ルールは簡単");
		System.out.println("コンピューターの値が" + this.name + "さんより大きいか否かを当てるゲームです。");
	}

	public void FirstGreet_1(){
		Greet g = new Greet();
		User u = new User();
		System.out.println(this.name + "さんの値は" + u.num1 + "です。");
		System.out.print(g.name + "さんの値は、コンピューターの値より大きいでしょうか(High or Low) ?>>");
		String ans = new Scanner(System.in).next();
	}

	public void SecondGreet(){
		System.out.println("2つ目に移ります");
		System.out.println("2つ目は");
		System.out.println("---------------");
		System.out.println("変則High&Low");
		System.out.println("---------------");
		System.out.println("です。");
		System.out.println("ルールは");
		System.out.println("１：プレイヤーは"+this.name+"さんを含んだ５人で行います。");
		System.out.println("２："+this.name+"さんに1~99の間で数字を選んでいただきます。");
		System.out.println("３：全員の値を足して7で割った数字に最も近かった人が勝ちです。");

	}
}
