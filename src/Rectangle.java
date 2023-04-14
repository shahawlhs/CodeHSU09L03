public class Rectangle {

    //instance variables
    private double height;
    private double width;


    //constructor
    public Rectangle(double height, double width){
        this.width = width;
        this.height = height;
    }

    //getArea
    public double getArea(){
        return height * width;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    //toString
    public String toString(){
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
