import java.util.Random;
public class CoinToss {

	
	public String tossCoin() {
		Random rand = new Random();
		int toss = (Math.abs(rand.nextInt())) % 2;
		if (toss==1) {
			return "Heads";
		} else {
			return "Tails";
		}
	}
	public static void main(String[] args) {
		CoinToss game = new CoinToss();
		System.out.println(game.tossCoin());
		System.out.println(game.tossCoin());
		System.out.println(game.tossCoin());
		System.out.println(game.tossCoin());
		System.out.println(game.tossCoin());
		System.out.println(game.tossCoin());
		System.out.println(game.tossCoin());
		System.out.println(game.tossCoin());
	}

}
