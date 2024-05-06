package project;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Triangle extends Geometry {
    
    /*
    Ekranı kaplayan bir tane büyük üçgen var. Bu üçgnin üç kenarına 1'er tane eş üçgenler (childs) çizilecek. Ardından çizilen üçgenler root kabul edilip
    bu üçgenlerin içerisine de eş 3 üçge çizilecek. Bu şekilde devam eden recursive bir noktada duracak ve şekil oluşmuş olacak.
    
    Bir eşkenar üçgen çizebilmek için üçgenin sol alt köşesinin koordinatlarını ve bir kenarının uzunluğunu bilmek yeterli.
    */
    
    private int x1,y1, x2,y2, x3,y3, size, minSize; // koordinatlar ve kenar uzunluğu

    public Triangle(int x1, int y1,  int size, int minSize) { // sol alttaki köşe --> (x1,y1)
        this.size = size;
        
        this.x1 = x1;
        this.y1 = y1;
        
        this.x2 = x1 + size/2;
        this.y2 = y1 - (int) (size * Math.sqrt(3) / 2);
        
        this.x3 = x1 + size;
        this.y3 = y1;
        
        this.minSize = minSize; // recursivede çizilecek en küçük üçgenin kenar uzunluğunu sınırlamak için
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    
    
    
    @Override
    public List<Geometry> transform(Geometry geometryObj) {
        
        int childSize = ( ((Triangle)geometryObj).getSize() ) / 2;
        int minSize = ( ((Triangle)geometryObj).getMinSize() ); // childların sınırı da en başta constta verilen değer olduğundan minSize değişmeyecek.
        
        int child1_x1 = ((Triangle)geometryObj).getX1();
        int child1_y1 = ((Triangle)geometryObj).getY1();
        
        int child2_x1 = ( ((Triangle)geometryObj).getX1() + ((Triangle)geometryObj).getX2() ) / 2;
        int child2_y1 = ( ((Triangle)geometryObj).getY1() + ((Triangle)geometryObj).getY2() ) / 2;
        
        int child3_x1 = ((Triangle)geometryObj).getX2();
        int child3_y1 = ((Triangle)geometryObj).getY1();
        
        Geometry child1 = new Triangle(child1_x1, child1_y1, childSize, minSize);
        Geometry child2 = new Triangle(child2_x1, child2_y1, childSize, minSize);
        Geometry child3 = new Triangle(child3_x1, child3_y1, childSize, minSize);
        
        List<Geometry> childs = new ArrayList<>();
        childs.add(child1);
        childs.add(child2);
        childs.add(child3);
        
        return childs;
        
    }
    

    @Override
    public void draw(Graphics2D g, Geometry triangle) {
        
        int[] xPoints = { ((Triangle)triangle).getX1(), ((Triangle)triangle).getX2(), ((Triangle)triangle).getX3() };
        int[] yPoints = { ((Triangle)triangle).getY1(), ((Triangle)triangle).getY2(), ((Triangle)triangle).getY3() };
        
        g.drawPolygon(xPoints, yPoints, 3);
        
        if ( ((Triangle)triangle).getSize() > ((Triangle)triangle).getMinSize() )
        {
            draw(g, triangle.transform(triangle).get(0));
            draw(g, triangle.transform(triangle).get(1));
            draw(g, triangle.transform(triangle).get(2));
        }
    
    }

    
    
    
    
}