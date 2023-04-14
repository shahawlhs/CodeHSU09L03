public class Square extends Rectangle{
//instance variables - none needed


    //constructor
    public Square (double sideLength){
        super(sideLength, sideLength);
    }

    //getSideLength
    public double getSideLength(){
        return super.getHeight();
    }

    //toString
    @Override
    public String toString(){
        return "Square with side lengths " + getSideLength();
    }
}
