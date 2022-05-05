package OOPs.Basic;

import java.util.Scanner;

public class J01025{
    final static int mod = 1000 * 1000 * 1000 + 7;
    public class Point {
        public int x;
        public int y;
        // public Point(int x, int y) {
        //     this.x = x;
        //     this.y = y;
        // }
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int ax = ip.nextInt(); int ay = ip.nextInt(); //A
        int bx = ip.nextInt(); int by = ip.nextInt(); //B
        int cx = ip.nextInt(); int cy = ip.nextInt(); //C
        int dx = ip.nextInt(); int dy = ip.nextInt(); //D
        int ty1 = Math.max(dy, by);
        int tx1 = Math.min(cx, ax);
        int dx1 = Math.min(cy, ay);
        int dy1 = Math.max(dx, bx);
        int res = Math.max(ty1 - dx1, dy1 - tx1);
        System.out.println(res * res);
        ip.close();
    }
    public static void swap(int a, int b){
        int t = a;
        a = b;
        b = t;
    }

}
