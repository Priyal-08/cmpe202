import java.util.ArrayList;

/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>();

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		date = "";
		for(IDisplayComponent obj : components) {
			date += obj.display();
		}
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			return "[" + date + "]" + "  " ;
	}

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20 ) {
			if(ch.matches("x|X") && cnt>16) {
				deleteSubComponent();
			}
			else {
				if(cnt == 19){
					Digit digit = new Digit(ch);
					digit.wrapDecorator(new Digit("/"));
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