package prob03;

public class CurrencyConverterTest {

	public static void main(String[] args) {
		
		CurrencyConverter.setRate(1197.0);
		double won;
		double dollar;
				
		dollar = CurrencyConverter.toDollar( 1000000. );
		System.out.println( "백만원은 " + dollar + "달러 입니다" );
		
		won = CurrencyConverter.toKRW( 100. );
		System.out.println( "백달러는 " + won + "원 입니다" );
	}
}