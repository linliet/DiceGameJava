package DiceGameJava;
import java.util.Scanner;

public class Menu {
	public Menu(){
	
	}
	public void greeting(){
		String name;
		
		System.out.println("Please kindly state your name.");
		Scanner input = new Scanner(System.in);
		
		name = input.nextLine();
		System.out.println("Greetings " + name + "!! Welcome to Build A Character!");
		
	
	}
	public void getPlayerSelection(){
		int choice;
		
		System.out.println("If you would like to play against another player select [2].");
		System.out.println("Select [1] if you would like to just play against the computer.");
		
		Scanner play = new Scanner(System.in);
		choice = play.nextInt();
		
		/*switch(choice){
		case 1:
			//computer.startGame();
			break;
		case 2:
			//player.startGame();
			break;
		default:
			System.out.println("Please select 1 or 2.");
		}*/
	}

}


