
public class BubbleTea {
	int bubbletea = 3500;
	int price;
	boolean menu;
	int option;
	
	BubbleTea(int option) {
		this.option = option;
	}
	
	public void menuboard() {
		while(menu==true) {
			if (option == 0) {
				price = bubbletea;
			}
			if (option == 1) {
				price = bubbletea+300;
			}
			if (option == 2) {
				price = bubbletea+500;
			}
			if (option>2 || option<0) {
				System.out.println("�ֹ��� �߸��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				menu = false;
			}
		}
		System.out.println("��" + price + "�� �Դϴ�.");
	}
}