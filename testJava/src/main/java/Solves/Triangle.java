package Solves;


import Intarfaces.Draw;
import Intarfaces.Move;

public class Triangle extends Figure implements Move, Draw {
    public Triangle(double a, double b, double heigth) {
        super(a, b, heigth, 0, 0);
    }
    @Override
    public double Perimeter() {
        return Math.sqrt(Math.pow(this.a,2) + Math.pow(this.b,2)) + this.a + this.b;
    }

    @Override
    public double Area() {
        return 1/2. * this.a * this.height;
    }

    @Override
    public void draw(){
        System.out.println("Drawing triangle");
    }

    @Override
    public void move(){
        System.out.println("Moving triangle");
    }
}
