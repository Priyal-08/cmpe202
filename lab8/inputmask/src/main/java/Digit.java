
public class Digit implements IDigitDecorator, IDisplayComponent{
	
	private IDigitDecorator wrapped;
	private String number;
	
	public Digit(String n) {
		number = n;
		wrapped = null;
	}
	
	public void wrapDecorator( IDigitDecorator w ) {
       this.wrapped = w ;
   }
	
	public String display() {
		if(this.wrapped == null) {
			return number;
		}else {
			return wrapped.display() + number;
		}
	}
	
	public void addSubComponent( IDisplayComponent c ) {
	}

}
