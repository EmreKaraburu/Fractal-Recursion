package project;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Circle extends Geometry {
    
    /*
    Bir circle çizilecek ve o root olacak. Bunun içerisine sağına ve soluna rootun yarı boyutunda birer circle daha çizilecek
    Bu iki circle child olacak sonrasında draw methodunda recurse edilirken önceki child'lar root olacak.
    Böylece fractal tamamlanacak.
    
    Circle'ın merkez noktası ve yarıçapı çizmek için yeterli.
    
    */
    
    private int xCenter, yCenter, radius;
    private int xDraw, yDraw; // drawOval methodu için --> çemberi içine alan dörtgenin sol üst köşesinin koordinatları.
    private int minSize; // en küçük circle için sınırlandırıcı

    public Circle(int xCenter, int yCenter, int radius, int minSize) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.radius = radius;
        
        this.xDraw = xCenter - radius;
        this.yDraw = yCenter - radius;
        
        this.minSize = minSize;
    }

    public int getxCenter() {
        return xCenter;
    }

    public void setxCenter(int xCenter) {
        this.xCenter = xCenter;
    }

    public int getyCenter() {
        return yCenter;
    }

    public void setyCenter(int yCenter) {
        this.yCenter = yCenter;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getxDraw() {
        return xDraw;
    }

    public void setxDraw(int xDraw) {
        this.xDraw = xDraw;
    }

    public int getyDraw() {
        return yDraw;
    }

    public void setyDraw(int yDraw) {
        this.yDraw = yDraw;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }
    

    @Override
    public List<Geometry> transform(Geometry geometryObj) {
        
        int childRadius = ( ((Circle)geometryObj).getRadius()) / 2;
        int minSize = ( ((Circle)geometryObj).getMinSize() ); // childların sınırı da en başta constta verilen değer olduğundan minSize değişmeyecek.
        
        int child1_xCenter = ((Circle)geometryObj).getxCenter() + childRadius;
        int child1_yCenter = ((Circle)geometryObj).getyCenter();
        
        int child2_xCenter = ((Circle)geometryObj).getxCenter() - childRadius;
        int child2_yCenter = ((Circle)geometryObj).getyCenter();
        
        Geometry child1 = new Circle(child1_xCenter, child1_yCenter, childRadius, minSize);
        Geometry child2 = new Circle(child2_xCenter, child2_yCenter, childRadius, minSize);
        
        List<Geometry> childs = new ArrayList<>();
        childs.add(child1);
        childs.add(child2);
        
        return childs;
    }

    @Override
    public void draw(Graphics2D g, Geometry circle) {
        
        int xForDraw = ((Circle)circle).getxDraw();
        int yForDraw = ((Circle)circle).getyDraw();
        int height = ((Circle)circle).getRadius() * 2;
        int width = ((Circle)circle).getRadius() * 2;
        
        g.drawOval(xForDraw, yForDraw, width, height);
        
        if ( ((Circle)circle).getRadius() > ((Circle)circle).getMinSize() )
        {
            draw(g, circle.transform(circle).get(0));
            draw(g, circle.transform(circle).get(1));
        }
        
    }
    
    
    
}
