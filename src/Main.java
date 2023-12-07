import java.lang.*;
class Equations {
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
}
public class Main {
    public static void main(String[] args) {
        Equations r01 = new Equations();
        r01.getResult1();
    }
}