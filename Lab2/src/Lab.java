import java.util.Scanner;

public class Lab {
    public static void main(String[] args){
        System.out.println("Программа для расчета площади треугольника в пространстве.\nВведите координату точки А(3 координаты): ");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        Point3d A=new Point3d(a,b,c);
        System.out.println("Введите координаты точки B");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        Point3d B=new Point3d(a,b,c);
        System.out.println("Введите координаты точки С");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        Point3d C=new Point3d(a,b,c);
        System.out.println("S треугольника = "+comptureArea(A,B,C));
    }
    public static double comptureArea(Point3d a,Point3d b,Point3d c){
        double s=0,p=0;
        if(a.equals(b))return 0;
        if(a.equals(c))return 0;
        if(b.equals(c))return 0;
        double ab=0,bc=0,ca=0;
        ab=a.distanceto(b);
        bc=b.distanceto(c);
        ca=c.distanceto(a);
        p=(ab+bc+ca)/2;
        s=Math.sqrt(p*(p-ab)*(p-bc)*(p-ca));
        return s;
    }
}
