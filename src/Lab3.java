import java.util.Scanner;

public class Lab3
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int num1, num2;

		System.out.print("Are you hungry? (Enter 1 for YES, 0 for NO): ");
		num1 = input.nextInt();

		if (num1 == 0)
			System.out.println("OK. Bye!");
		else
		{
			System.out.print("Get in line!\nLet's get some lunch!\nAre you thirsty? (Enter 1 for YES, 0 for NO): ");
			num1 = input.nextInt();
			if (num1 == 1)
			{
				System.out.print("Have you eaten breakfast? (Enter 1 for YES, 0 for NO): ");
				num2 = input.nextInt();
				if (num2 == 1)
					System.out.print("OK. Let's get some Diet Coke!\nNow eat!\n");
				else
					System.out.print("OK. Let's get some Coke!\nNow eat!\n");
			}
			else
				System.out.print("OK. Let's get some water.\nNow eat!\n");
			System.out.print("Return your tray!\nSee you again!");
		}
	}

}
