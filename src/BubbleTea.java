import java.util.Scanner;

public class BubbleTea {
	Scanner sc = new Scanner(System.in);
	int bubbletea = 3500;
	int price = 0;
	
	public void menuboard() {
		
		while(true) {
			System.out.print("번호 입력:");
			int option = sc.nextInt();
			if (option == 0) {
				price = bubbletea;
				System.out.println("총" + price + "원 입니다.");
				break;
			}
			if (option == 1) {
				price = bubbletea+300;
				System.out.println("총" + price + "원 입니다.");
				break;
			}
			if (option == 2) {
				price = bubbletea+500;
				System.out.println("총" + price + "원 입니다.");
				break;
			}
			if (option>2 || option<0) {
				System.out.println("주문을 잘못하셨습니다. 다시 입력해주세요.");
			}
		}
	}
}
