import java.util.Scanner;

public class BubbleTeaOrder {
	static int option;
	static BubbleTea bubble = new BubbleTea(option);
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		System.out.println("주문해주세요.");
		System.out.println("0.버블티만 (3500원)\n1.얼음0% (300원추가)\n2.버블추가 (500원추가)");
		System.out.print("옵션 입력:");
		option = sc.nextInt();
		bubble.menuboard();
	}
}
