public class Point2d {//двумерный класс точки
    private double xCoord;//координата x
    private double yCoord;//координата y
    public Point2d ( double x, double y) {xCoord = x; yCoord = y; }//конструктор инициализации
    public Point2d () {//Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0);
    }
    public double getX () { return xCoord; }//возвращение координаты x
    public double getY () {//возвращение коордигаты y
        return yCoord;
    }
    public void setX ( double val) {//установка значения координаты x
        xCoord = val;
    }
    public void setY ( double val) {//установка значения y
        yCoord = val;
    }
}
