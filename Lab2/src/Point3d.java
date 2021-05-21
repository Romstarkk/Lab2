public class Point3d {

    public double x_cord;
    public double y_cord;
    public double z_cord;

    public Point3d()//конструктор по умолчанию
    {
        x_cord=0;
        y_cord=0;
        z_cord=0;
    }
    public Point3d(double x,double y,double z)//конструктор инициализации
    {
        x_cord=x;
        y_cord=y;
        z_cord=z;
    }
    public double get_x(){return x_cord;}//
    public double get_y(){return y_cord;}//     вернуть координату точки
    public double get_z(){return z_cord;}//
    public void set_x(double x){x_cord=x;}//
    public void set_y(double y){y_cord=y;}//    выставить координату точки
    public void set_z(double z){z_cord=z;}//

 /*   public double distance(Point3d a,Point3d b)//расстояние межу двумя точками
    {
        double distx = Math.abs(a.get_x()-b.get_x());
        double disty = Math.abs(a.get_y()-b.get_y());
        double distz = Math.abs(a.get_z()-b.get_z());
        double dist = Math.sqrt(distx*distx+disty*disty+distz*distz);
        return dist;
    }*/

    public double distanceto(Point3d a)//расстояние между двумя точками
    {
        double x_dist=Math.abs(this.get_x()-a.get_x());
        double y_dist=Math.abs(this.get_y()-a.get_y());
        double z_dist=Math.abs(this.get_z()-a.get_z());
        double dist=Math.sqrt(x_dist*x_dist+y_dist*y_dist+z_dist*z_dist);
        return dist;
    }
    public boolean equals(Point3d a)//сравнение двух точек по их координатам
    {
        if((this.get_x()==a.get_x())
                &&(this.get_y()==a.get_y())
                &&(this.get_z()==a.get_z())) return true;
        return false;
    }
}
