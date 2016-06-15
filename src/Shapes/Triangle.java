package Shapes;

/**
 * Created by Мария on 15.06.2016.
 */
public class Triangle extends MultiAngle{
    private int height;
    private int base;
public Triangle (int height, int base)
{
    super (3, "Треугольник");
    this.height=height;
    this.base=base;
}

    public int figureArea ()
    {
        int figureArea;
        figureArea = (height*base)/2;
        return figureArea;
    }


}
