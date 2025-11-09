package com.coder.abstraction.shape;

import com.coder.abstraction.shape.service.CircleService;
import com.coder.abstraction.shape.service.SquareService;

public class AbstractionShapeDemo {
    public static void main(String[] args) {
        CircleService circleService = new CircleService();
        circleService.draw();
        circleService.display();

        SquareService squareService = new SquareService();
        squareService.draw();
        squareService.display();
    }
}
