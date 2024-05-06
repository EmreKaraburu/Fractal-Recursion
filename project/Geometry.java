package project;

import java.awt.Graphics2D;
import java.util.List;

public abstract class Geometry {
    
    public abstract void draw(Graphics2D g, Geometry geometryObj);
    
    public abstract List<Geometry> transform(Geometry geometryObj);
    
    /*
    
    transform methodu geometri nesnesini parametre olarak alÄ±r, bu nesne oluşturulurken constructordan gelen değerleri kullanarak
    o nesneden türeyece child'ları bir listeye atar ve bu listeyi return eder.
    
    draw methodu da parametre olarak root'u alır ve çizimi yapar. ek olarak transformdan gelen child'ı parametre alarak
    kendine recurse eder. Bu sayede önceki rootun childı yeni rootu olur ve böylece fractal tamamlanır.
    
    */
    
}
