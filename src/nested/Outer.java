package nested;

/**
 * Created by Aziz on 7/31/2016.
 */
public class Outer {
    int innerANum=10;

    InnerA innerA=new InnerA();
    public void outerMethodDisplay(){
        System.out.println("I am on Outer class");
    }

    private class InnerA{
        int innerAnum=10;
        public void innerADisplay(){
            System.out.println("I am on Inner A class");
        }
    }

    private class InnerB extends InnerA{
        int innerBnum=12;
        public void innerBDisplay(){
            System.out.println("I am on Inner B class");
        }
    }

    private class InnerC{
        int innerCnum=14;
        public void innerCDisplay(){
            System.out.println("I am on Inner C class");
        }
    }

    public class InnerD{
        int innerDnum=16;
        public void innerDDisplay(){
            System.out.println("I am on Inner D class");
        }
    }
}
