package day40_FinalKeyword;

import day39_EncapsulationInheritance.Shapes.Circle;
import day39_EncapsulationInheritance.Shapes.Square;

public class EncapsulationReview {
    private Circle circle;
    private Square square;
    public Circle getCircle(){
        return circle;
    }
    public void setCircle(Circle circle){
        if(circle.getRadius()<5){
            return;
        }
        this.circle=circle;
    }

    public Square square(){
        return square;
    }
    public void setSquare(Square square){
        this.square=square;
    }

}
