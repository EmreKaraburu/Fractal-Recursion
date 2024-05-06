package project;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Line extends Geometry {
    
    private int x, y, size;
    private double startAngle, deviationAngle;
    
    
    public Line(int x, int y, int size, double startAngle, double deviationAngle) { //rootun başlangıç açısı , her childen sapma açısı
        this.x = x;
        this.y = y;
        this.size = size;
        this.startAngle = startAngle;
        this.deviationAngle = deviationAngle;        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(double startAngle) {
        this.startAngle = startAngle;
    }

    public double getDeviationAngle() {
        return deviationAngle;
    }

    public void setDeviationAngle(double deviationAngle) {
        this.deviationAngle = deviationAngle;
    }
    
    

    

    @Override
    public List transform(Geometry geometryObj) { // root'u parametre olarak alır childlarını list olarrak döndürür

        int x2 = ((Line)geometryObj).getX() + (int) (Math.cos(Math.toRadians(((Line)geometryObj).getStartAngle())) * ((Line)geometryObj).getSize() * 10);
        int y2 = ((Line)geometryObj).getY() + (int) (Math.sin(Math.toRadians(((Line)geometryObj).getStartAngle())) * ((Line)geometryObj).getSize() * 10);
        int size2 = ((Line)geometryObj).getSize() - 1;
        List<Geometry> childs = new ArrayList<>();
        double startAngle2 = ((Line)geometryObj).getStartAngle();
        double deviationAngle2 = ((Line)geometryObj).getDeviationAngle();
        
        Geometry child1 = new Line(x2, y2, size2, (startAngle2 + deviationAngle2), deviationAngle2);
        Geometry child2 = new Line(x2, y2, size2, (startAngle2 - deviationAngle2), deviationAngle2);
        
        childs.add(child1);
        childs.add(child2);
        
        return childs;
        
    }
    
    /*
        draw methodu da bu her Ã¶zelliÄŸi transform methodu sayesinde hesaplanan Ã§izgiyi Ã§izecek
        aynı zamanda da draw methodu kendisini tekrarlayacak --> ta ki size 0 olana dek
    */
    
    @Override
    public void draw(Graphics2D g, Geometry line) {
                
        int x_1 = ((Line) line).getX();
        int y_1 = ((Line) line).getY();
        
        int x_2 = ((Line) line.transform(line).get(0)).getX(); // transform methodu parametredekinin childlarÄ±nÄ± Ã¼retti.
        int y_2 = ((Line) line.transform(line).get(0)).getY(); // üretilen childlarÄ±n x,y deÄŸerlerini get ile alÄ±ndÄ±.
        
        g.drawLine(x_1, y_1, x_2, y_2); // iki noktasÄ± (rootun başlangıçtaki ve child'Ä±n baÅŸlangÄ±cÄ±) bilinen doÄŸru Ã§izildi bu doÄŸru root'tur.
        
        if (((Line) line).getSize() > 1) // root 1 den büyükse devam eder yoksa bitirir.
        {
            draw(g, ((Line) line.transform(line).get(0)));
            draw(g, ((Line) line.transform(line).get(1)));
        }
    }
    
}
