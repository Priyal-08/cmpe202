package decorator;
import java.util.function.Function;
public class Tester {

    public static void runTest()
    {
        Component obj = new ConcreteComponent();
    	Function<String, String> decA = input -> "<em>" + input + "</em>";
        Function<String, String> decB = input -> "<h1>" + input + "</h1>";
        String result = decB.compose(decA).apply(obj.operation());
        System.out.println( result );
    }

  public static void main( String [] args )
    {
        Tester t = new Tester() ;
        t.runTest() ;
    }    
    
}
