
public class BubbleTeaOrder {
	
	public static void main(String args[]) {
		BubbleTea bubble = new BubbleTea();
		
		System.out.println("주문해주세요.");
		System.out.println("0.버블티만 (3500원)\n1.얼음0% (300원추가)\n2.버블추가 (500원추가)");
		
		bubble.menuboard();
	}
}
