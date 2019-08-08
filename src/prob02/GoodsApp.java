package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3; // 3까지 입력
	
	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in);
		String name;
		int price ;
		int countStock ;
		Goods[] gs = new Goods[COUNT_GOODS];
		
		for(int i=0; i < COUNT_GOODS; i++) {
				String info = scanner.nextLine();
				String[] data = info.split(" ");
				name = data[0];
				price = Integer.parseInt(data[1]);
				countStock = Integer.parseInt(data[2]);
				gs[i] = new Goods(name,price,countStock);
		}
		for(int i=0; i < COUNT_GOODS; i++) {
			gs[i].showInfo();
		}
		scanner.close();
	}
}
