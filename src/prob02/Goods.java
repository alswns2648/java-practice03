package prob02;

public class Goods {
	
	//필드제작 상품,가격,갯수
	public String name;
	private int price;
	private int countStock;
	
	public Goods(String name, int price, int countStock){
		this.name = name;
		this.price = price;
		this.countStock = countStock;
	}
	
	public void showInfo() {
		System.out.println(name + "(가격:" + price + "원)이" + countStock + "개 입고 되었습니다.");
	}
}