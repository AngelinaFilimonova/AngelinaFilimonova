package Solves;

import Intarfaces.Draw;
import Intarfaces.Move;

import java.awt.*;

public class Rectangle extends Figure implements Draw, Move {
    public Rectangle(double a, double b) {
        super(a, b, a, 0, 0);
    }

    @Override
    public double Perimeter() {
        return this.a + this.b;
    }

    @Override
    public double Area(){
        return this.a * this.height;
    }

    @Override
    public void draw(){
        System.out.println("Drawing rectangle");
    }

    @Override
    public void move(){
        System.out.println("Moving rectangle");
    }
}
