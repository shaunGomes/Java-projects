package packagejavalearn2;

import java.util.Random;

public class ludoprac {

	public static void main(String[] args) {

		int max_dice_value = 5;
		Random dice_roller = new Random();
		int actual_dice_roll_comparison_vlaue[] = { 1, 2, 3, 4, 5, 6 };
		int player_1 = 0;
		int player_2 = 0;
		

		while (!(player_1 == 90) && !(player_2 == 90)) {
			int dice_p1 = dice_roller.nextInt(max_dice_value);
			int dice_p2 = dice_roller.nextInt(max_dice_value);
			if (player_1 < 90) {
				int conditon_for_90_p1 = 0;
				int actual_dice_roll_p1 = 0;
				actual_dice_roll_p1 = dice_p1;
				actual_dice_roll_p1 = dice_p1 + 1;
				for (int j = 0; j < 6; j++) {
					if (actual_dice_roll_p1 == actual_dice_roll_comparison_vlaue[j]) {
						player_1 = player_1 + actual_dice_roll_comparison_vlaue[j];
						conditon_for_90_p1 = actual_dice_roll_comparison_vlaue[j];
					}
				}
				if (player_1 > 90) {
					player_1 = player_1 - conditon_for_90_p1;
				}
				
			}
			if (player_2 < 90) {
				int conditon_for_90_p2 = 0;
				int actual_dice_roll_p2 = 0;
				actual_dice_roll_p2 = dice_p2;
				actual_dice_roll_p2 = dice_p2 + 1;

				for (int j = 0; j < 6; j++) {
					if (actual_dice_roll_p2 == actual_dice_roll_comparison_vlaue[j]) {
						player_2 = player_2 + actual_dice_roll_comparison_vlaue[j];
						conditon_for_90_p2 = actual_dice_roll_comparison_vlaue[j];
					}
				}
				if (player_2 > 90) {
					player_2 = player_2 - conditon_for_90_p2;
				}
				
			}

		}

		if (player_1 > player_2) {
			System.out.println("player 1 wins" + player_1);
			
		} else {
			System.out.println("player 2 wins" + player_2);
			
		}

	}

}
