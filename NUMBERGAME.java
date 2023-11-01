package codesoft;
import java.util.*;
public class NUMBERGAME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Let's play the guessing game");
		int round = 1;
		int win = 0;
		while(true)
		{
			System.out.println("Enter into the Round guys"+" "+round+" : ");
			int chances = 10;
			System.out.println("I give you 10 chances to guess the number. You guess the number from 1 to 100 ");
			System.out.println("If you guess it correct you will win the round my dear friends!");
			System.out.println("All The Best!!!you can do it easily");
			int i = 1;
			int min = 1;
			int max = 100;
			int target = rd.nextInt(max-min+1)+min;
			for(i=1;i<=10;i++)
			{
				System.out.println();
				System.out.println("Chance "+i+" Enter the number you guess: ");
				int num = sc.nextInt();
				System.out.println();
				if(num>target) System.out.println("The number you given is too high...");
				else if(num<target) System.out.println("The number you given is too low....");
				else
				{
					System.out.println("Congratulatios! you guessed the number correctly and won the round "+round+" just by "+i+" chances...");
					win++;
					break;
				}
				chances--;
				if(chances>0) System.out.println("You still have "+chances+" chances!! Try it!");
			}
			System.out.println();
			if(chances == 0) 
			{
				System.out.println("Oops! You have lost this round :( but don't give up try another round..");
				System.out.println("Better Luck Next Time!");
				System.out.println();
			}
			System.out.println("Overall rounds played : "+round);
			System.out.println("Overall rounds won : "+win);
			System.out.println();
			System.out.println("Don't leave your hope!!!");
			System.out.println("Do you want to play again: Yes or No");
			sc.nextLine();
			String s = sc.nextLine().toLowerCase();
			if(s.equals("no")) 
			{
				System.out.println();
				System.out.println("Thanks for making your brain thinking more.. See you later!!");
				System.out.println();
				System.out.println("Have a Nice Day :) ");
				break;
			}
			round++;
		}
	}
}

