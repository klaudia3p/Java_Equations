import java.lang.*;
class Equations {
    //first equation
    public int makeByXq1(int a1, int f1){
        int res = a1 + f1;
        return res;
    }
    public int makeByXs1(int c1, int e1, int h1){
        int n = 2;
        int part1 = c1 * n;
        int part2 = e1;
        int part3 = h1 * n;
        int res = part1 + part2 + part3;
        return res;
    }
    public double makeFree1(int d1, int i1){
        int part1 = (int)Math.pow(d1,2);
        int part2 = (int)Math.pow(i1,2);
        part2 = -part2;
        double res = part1 + part2;
        res = -res;
        return res;
    }

    //second equation
    public int makeByXq2(int d1){
        return d1;
    }
    int makeByXs2(int a1, int e1){
        int res = a1+e1;
        return res;
    }
    public int makeFree2(int b1, int c1){
        int res = b1* c1;
        return res;
    }
    int makeDelta(int a, int b, int c){
        int delta = (int) Math.pow(b,2) - 4 *a*c;
        return delta;
    }
    public double makeX1(int a, int b, int delta){
        double x1= (-b+ Math.sqrt(delta)) / 2*a;
        return x1;
    }
    public double makeX2(int a, int b, int delta){
        double x2= (-b- Math.sqrt(delta)) / 2*a;
        return x2;
    }
    public double makeXd(int a, int b){
        double x = -b/2*a;
        return x;
    }

    //results
    public void getResult1(){
        int a = this.makeByXq1(1,-1);
        int b = this.makeByXs1(2,-2,3);
        double c = this.makeFree1(2,-3);
        System.out.println("a= "+a+"  b= "+b+"  c= "+c);
        double xd = c / b;
        if (a == 0){
            System.out.println("x = "+xd);
        }
    }
    public void getResult2(){

        double xm1 = 2d;
        double xm2 = -3d;
        int a = this.makeByXq2(-1);
        int b = this.makeByXs2(4, 2);
        int c = this.makeFree2(4,3);
        int delta = this.makeDelta(a,b,c);
        if (delta > 0){
            double x1 = this.makeX1(a,b,delta);
            double x2 = this.makeX2(a,b,delta);
            if (x1 == xm1){
                System.out.println("There is only one solution.");
                System.out.println("x2 = "+x2);
            }else if (x2 == xm2){
                System.out.println("There is only one solution.");
                System.out.println("x1 = "+x1);
            }else{
                System.out.println("There are two solutions");
                System.out.println("x1= "+x1+"  x2= "+x2);
            }
        }

    }
}
public class Main {
    public static void main(String[] args) {
        Equations r01 = new Equations();
        r01.getResult1();
        r01.getResult2();
    }
}