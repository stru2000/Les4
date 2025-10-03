package Screen.polymorphisme;


import vehicles.Car;

void main(){
    Shape shape = new Circle();
    shape.printShape();

    ArrayList<Figure> shapeList = new ArrayList<>();
    shapeList.add(new Circle());
    shapeList.add(new Line());
    shapeList.add(new Rectangle());
    shapeList.add(new Cartoon());

    for (Figure item : shapeList){
        ((Shape) item).printShape();
    }
}

abstract class Figure{

}
abstract class Shape extends Figure{
    public abstract void printShape();
}

class Cartoon extends Figure{}
class Circle extends Shape{
    @Override
    public void printShape() {
        IO.println("circle");
    }
}
class Rectangle extends Shape{
    @Override
    public void printShape() {
        IO.println("rectangle");
    }
}
class Line extends Shape{
    @Override
    public void printShape() {
        IO.println("line");
    }
}
