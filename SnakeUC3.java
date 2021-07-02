import java.util.*;
public class SnakeUC3 {
	public static void main(String[] args) {
		System.out.print("Enter player name: ");
		Scanner s = new Scanner(System.in);
		String playerName = s.next();
		int playerPosition = 0;
		System.out.println("Player name: " + playerName);
		//using random to get number between 1 to 6.
		int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice roll: " + die);
		//using random to check for option.
		int option = (int) (Math.floor(Math.random() * 10) % 3);
		switch (option) {
			case 0:
				System.out.println("No play"); //if no play player stay on same position
				playerPosition += 0;
				break;
			case 1:
				System.out.println("Ladder"); //if it is ladder then it will move that position in he die.
				playerPosition += die;
				break;
			default:
				System.out.println("Snake");//if it is snake it will move behind the number of position
				playerPosition -= die;
				if (playerPosition < 0)
					playerPosition = 0;		
		}
		System.out.println("Player position: " + playerPosition);
	}

}
