import Shapes.Triangle;
import Shapes.Circle;

/**
 * Created by Мария on 15.06.2016.
 */
public class Main {
    public static void main (String [] args) {

Triangle triangle = new Triangle(10, 5);
        System.out.println("Площадь треугольника: " + triangle.figureArea()
        + "\n" + "Название фигуры: " + triangle.figureName + "\n" + "Количество углов: " + triangle.angleCount);

Circle circle = new Circle (10);
        circle.getDiametr();
        System.out.println ("\n" + "Радиус круга: " + circle.radius + "\n" + "Диаметр круга: " + circle.getDiametr()
        + "\n" + "Название: " + circle.figureName);









    }
}
