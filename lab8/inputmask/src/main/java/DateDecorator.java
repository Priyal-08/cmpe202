
public class DateDecorator implements IDisplayDecorator, IDisplayComponent{
	
	private String slash;
	
	public DateDecorator() {
		slash = "/";
	}
	
	public String display() {
		return slash;
	}
	
	public void addSubComponent( IDisplayComponent c ) {
	}
	
	public String decorate(String expiryDate) {
		StringBuilder date = new StringBuilder();
		for(int i=0;i<expiryDate.length();i++) {
			if(i==2)
				date.append(slash + expiryDate.charAt(i));
			else
				date.append(expiryDate.charAt(i));
		}
		return date.toString();
	}
}
