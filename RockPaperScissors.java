package JavaApps;

import java.util.*;

public class RockPaperScissors {
	public static void main (String[] args) {
		while(true) {

		Scanner Sc = new Scanner (System.in);
		Random R = new Random();
		
		int player_score = 0;
		int comp_score = 0;
		
		String player_move;
		System.out.print("Enter your move, RPS: ");
		player_move = Sc.next().toUpperCase();
		
		String[] move = {"R","P","S"};
		int index = 3;
		String comp_move = move[R.nextInt(index)];
		
		//Rock
		if(player_move.equals("R")) {
			//Rock Tie
			if(comp_move.equals("R")) {
				System.out.println("Both chose Rock, it's a tie!");
			}
			//Rock Win
			if(comp_move.equals("S")) {
				System.out.println("The computer chose Scissors and you chose Rock, You Win!");
				comp_score -=1;
				player_score +=1;
			}
			//Rock Lose
			if(comp_move.equals("P")) {
				System.out.println("The computer chose Paper and you chose Rock, you lose!");
				comp_score +=1;
				player_score -=1;
			}
		}
		//Paper
		else if (player_move.equals("P")) {
			//Paper Tie
			if(comp_move.equals("P")) {
				System.out.println("Both chose Paper, it's a tie!");
			}
			//Paper Win
			else if (comp_move.equals("R")) {
				System.out.println("The computer chose Rock and you chose Paper, you win!");
				comp_score -=1;
				player_score +=1;
			}
			//Paper Lose
			else if (comp_move.equals("S")) {
				System.out.println("The computer chose Scissors and you chose Paper, you lost!");
				comp_score +=1;
				player_score -=1;
			}
		}
		//Scissors
		else if (player_move.equals("S")) {
			//Scissors Tie
			if(comp_move.equals("S")) {
				System.out.println("Both chose Scissors, it's a tie!");
			}
			//Scissors Win
			else if (comp_move.equals("P")) {
				System.out.println("The computer chose Paper and you chose Scissors, you win!");
				comp_score -=1;
				player_score +=1;
			}
			//Scissors Lose
			else if (comp_move.equals("R")) {
				System.out.println("The computer chose Rock and you chose Scissors, you lost!");
				comp_score -=1;
				player_score +=1;
			}
		}
		System.out.printf("%nPLayer Score:%d",player_score);
		System.out.printf("%nPLayer Score:%d%n",comp_score);
        Sc.close();
	}
}
}