package entities;

public class Rectangle {
    public double width;
    public double height;


    public double calcArea(){
        return width * height;
    }

    public double calcPerimeter(){
        return 2 * (width + height);
    }

    public double calcDiagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public String toString(){
        return "Area = " + String.format("%.2f", calcArea()) + "\n" +
                "Perimeter = " + String.format("%.2f", calcPerimeter()) + "\n" +
                "Diagonal = " + String.format("%.2f", calcDiagonal());
    }

}
