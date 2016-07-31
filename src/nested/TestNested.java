package nested;

/**
 * Created by Aziz on 7/31/2016.
 */
public class TestNested {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.outerMethodDisplay();
        Outer.InnerD outerInnerA=outer.new InnerD();
        outerInnerA.innerDDisplay();
    }
}
