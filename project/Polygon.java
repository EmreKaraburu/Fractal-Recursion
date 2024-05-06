package project;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Polygon extends Geometry {
    
    private int x1, y1, size, minSize, edgeNum;

    public Polygon(int x1, int y1, int size, int minSize, int edgeNum) {
        this.x1 = x1;
        this.y1 = y1;
        this.size = size;
        this.minSize = minSize;
        this.edgeNum = edgeNum;
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

    public int getEdgeNum() {
        return edgeNum;
    }

    public void setEdgeNum(int edgeNum) {
        this.edgeNum = edgeNum;
    }
    

    @Override
    public List<Geometry> transform(Geometry geometryObj) {
        
        int childSize = ( ((Polygon)geometryObj).getSize() ) / 2;
        int minSize = ( ((Polygon)geometryObj).getMinSize() );
        int edgeNum = ( ((Polygon)geometryObj).getEdgeNum() );
        int x = ( ((Polygon)geometryObj).getX1());
        int y = ( ((Polygon)geometryObj).getY1());
        
        List<Geometry> childs = new ArrayList<>();
        for (int i = 0; i < edgeNum; i++) 
        {
            int newX = x + (int) (childSize * Math.cos(2.0 * Math.PI * i / edgeNum));
            int newY = y + (int) (childSize * Math.sin(2.0 * Math.PI * i / edgeNum));
            childs.add(new Polygon(newX, newY, childSize, minSize, edgeNum));
        }
        
        return childs;
        

    }

    @Override
    public void draw(Graphics2D g, Geometry polygon) {
        
        int[] xPoints = new int[ ((Polygon)polygon).getEdgeNum() ];
        int[] yPoints = new int[ ((Polygon)polygon).getEdgeNum() ];
        int x = ( ((Polygon)polygon).getX1());
        int y = ( ((Polygon)polygon).getY1());
        
        for (int i = 0; i < xPoints.length; i++) 
        {
            double angle = 2.0 * Math.PI * i / xPoints.length;
            xPoints[i] = x + (int) (size * Math.cos(angle));
            yPoints[i] = y + (int) (size * Math.sin(angle));
        }
        
        g.drawPolygon(xPoints, yPoints, xPoints.length);
        
        if ( ((Polygon)polygon).getSize() > ((Polygon)polygon).getMinSize() )
        {
            for (int i = 0; i < polygon.transform(polygon).size(); i++) 
            {
                draw(g, polygon.transform(polygon).get(i));
            }
            
        }

    }
    
}
