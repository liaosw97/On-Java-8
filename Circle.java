package polymorphism.shape;

public class Shape {
    public void draw();
    public void erase();
}

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    
    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    
    @Override
    public void erase() {
        System.out.println("Trangle.erase()");
    }
}
        
