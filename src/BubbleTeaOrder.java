import java.util.Scanner;

public class BubbleTeaOrder {
	static int option;
	static BubbleTea bubble = new BubbleTea(option);
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		System.out.println("�ֹ����ּ���.");
		System.out.println("0.����Ƽ�� (3500��)\n1.����0% (300���߰�)\n2.�����߰� (500���߰�)");
		System.out.print("�ɼ� �Է�:");
		option = sc.nextInt();
		bubble.menuboard();
	}
}
