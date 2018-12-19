package programmingExcercisesCH03;

import java.util.Random;
import java.util.Scanner;

public class RockScissorPaperGame {

	public static void main(String[] args) {
		
		System.out.println("SCISSOR, ROCK, PAPER");
		System.out.println("Enter 1 for scissor OR 2 for rock OR 3 paper:");
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		Random rn = new Random();
		int computer = rn.nextInt(3-1+1)+1;
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
