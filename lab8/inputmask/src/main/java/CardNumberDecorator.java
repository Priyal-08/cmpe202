
public class CardNumberDecorator implements IDisplayDecorator, IDisplayComponent{
	
	private String space;
	
	public CardNumberDecorator() {
		space = " ";
	}
	
	public String display() {
		return space;
	}
	
	public void addSubComponent( IDisplayComponent c ) {
	}
	
	public String decorate(String number) {
		StringBuilder cardNumber = new StringBuilder();
		for(int i=0;i<number.length();i++) {
			if(i==4 || i==8 || i==12)
				cardNumber.append(space + number.charAt(i));
			else
				cardNumber.append(number.charAt(i));
		}
		return cardNumber.toString();
	}
}
