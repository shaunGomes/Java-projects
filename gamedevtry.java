import java.util.Random;
import java.util.Scanner;

public class gamedevtry {

	public static int player_1;
	public static int player_2;

	public gamedevtry() {
		int max_count = 11;
		Random card = new Random();
		int card_random_1 = card.nextInt(max_count);
		player_1 = card_random_1;
		int card_random_2 = card.nextInt(max_count);
		player_2 = card_random_2;
	}

	public static void main(String[] args) {
		gamedevtry game = new gamedevtry();
		System.out.println("player 1 has this card:" + player_1);
		System.out.println("player 2 has this card:" + player_2);
		game.player1_comparision_player2();
		game.player1_equals_player2();
	}

	public void player1_comparision_player2() {
		if (player_1 > player_2) {
			System.out.println("player 1 wins");
		} else if (player_1 < player_2) {
			System.out.println("player 2 wins");
		}
	}

	public void player1_equals_player2() {
		if (player_1 == player_2) {
			Random face = new Random();
			int face_bound = 3;
			int face_card_diamond = face.nextInt(face_bound);
			int face_card_hearts = face.nextInt(face_bound);
			int face_card_spades = face.nextInt(face_bound);
			int face_card_flowers = face.nextInt(face_bound);
			Scanner in = new Scanner(System.in);
			String a = null;
			String b = null;
			System.out.print("Player 1 enter your face card value from d,h,s,f");
			a = in.next();
			System.out.print("Player 2 enter your face card value from d,h,s,f");
			b = in.next();
			int player_1_face = 0;
			int player_2_face = 0;

			if (a.equals("d")) {
				player_1_face = face_card_diamond;
			} else if (a.equals("h")) {
				player_1_face = face_card_hearts;
			} else if (a.equals("s")) {
				player_1_face = face_card_spades;
			} else if (a.equals("f")) {
				player_1_face = face_card_flowers;
			}

			if (b.equals("d")) {
				player_2_face = face_card_diamond;
			} else if (b.equals("h")) {
				player_2_face = face_card_hearts;
			} else if (b.equals("s")) {
				player_2_face = face_card_spades;
			} else if (b.equals("f")) {
				player_2_face = face_card_flowers;
			}

			if (player_1_face > player_2_face) {
				System.out.println("player 1 wins");
			} else if (player_1_face < player_2_face) {
				System.out.println("player 2 wins");
			} else if (player_1_face == player_2_face) {
				System.out.println("draw");
			}
		}
	}

}
