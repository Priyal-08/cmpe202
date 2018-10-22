import java.util.ArrayList;

/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{
	private IKeyEventHandler nextHandler ;
	private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>();
	private String number = "" ;
    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		number = "";
		for(IDisplayComponent obj : components) {
			number += obj.display();
		}
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
			return "[" + number + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ) {
			if(ch.matches("x|X")) {
				deleteSubComponent();
			}
			else {
				if(cnt==5 || cnt ==9 || cnt == 13) {
					Digit digit = new Digit(ch);
					digit.wrapDecorator(new Digit(" "));
					addSubComponent(digit);
				}
				else
					addSubComponent(new Digit(ch));
			}
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}
	
	public void addSubComponent( IDisplayComponent c ) {
		components.add(c);
	}
	
	public void deleteSubComponent () {
		if(components.size()>0)
			components.remove(components.size() - 1);
	}
}