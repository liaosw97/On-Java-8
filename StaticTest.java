class StaticTest {
    static i = 47;
}

public static void main( String [] args) {
    StaticTest st1 = new StaticTest();
    StaticTest st2 = new StaticTest();
    
    System.out.println("st1.i =" + st1.i +"\n" + "st2.i =" + st2.i );
    
    StaticTest.i++;    
    System.out.println("st1.i =" + st1.i +"\n" + "st2.i =" + st2.i );
}
 
