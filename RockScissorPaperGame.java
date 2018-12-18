package programmingExcercisesCH03;

import java.util.Random;
import java.util.Scanner;

public class RockScissorPaperGame {

	public static void main(String[] args) {
		/*
		 * (Game: scissor, rock, paper) Write a program that plays the popular
		 * scissor-rockpaper game. (A scissor can cut a paper, a rock can knock a
		 * scissor, and a paper can wrap a rock.) The program randomly generates a
		 * number 1, 2, and 3 representing scissor, rock, and paper. The program prompts
		 * the user to enter a number 0, 1, or 2 and displays a message indicating
		 * whether the user or the computer wins, loses, or draws.
		 */
		
		System.out.println("SCISSOR, ROCK, PAPER");
		System.out.println("Enter 1 for scissor OR 2 for rock OR 3 paper:");
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		Random rn = new Random();
		int computer = rn.nextInt(3-1)+1;
		String scsRckPprForUser ="";
		String scsRckPprForComputer = "";
		
		switch (number) {
		case 1:
			scsRckPprForUser = "Scissor";
			break;
		case 2:
			scsRckPprForUser = "Rock";
			break;
		case 3:
			scsRckPprForUser = "Paper";
			break;
		default:
			break;
		}
		switch (computer) {
		case 1:
			scsRckPprForComputer = "Scissor";
			break;
		case 2:
			scsRckPprForComputer = "Rock";
			break;
		case 3:
			scsRckPprForComputer = "Paper";
			break;
		default:
			break;
		}
		if (number <= 0 || number>3) {
			System.out.println("Wrong number. Please enter a number between 1 and 3");
		} else {
			if(number-computer==0 ) {
				System.out.println("The computer is "+scsRckPprForComputer+". You are "+scsRckPprForUser+". It is a draw");
			} else if (computer-number==1) {
				System.out.println("The computer is "+scsRckPprForComputer+". You are "+scsRckPprForUser+". Computer won");
			}else if (computer-number==-1) {
				System.out.println("The computer is "+scsRckPprForComputer+". You are "+scsRckPprForUser+". You won");
			}else if (computer-number==2) {
				System.out.println("The computer is "+scsRckPprForComputer+". You are "+scsRckPprForUser+". You won");
			}else if (computer-number==-2) {
				System.out.println("The computer is "+scsRckPprForComputer+". You are "+scsRckPprForUser+". Computer won");
			}
		}
	
		
		
	}

}
