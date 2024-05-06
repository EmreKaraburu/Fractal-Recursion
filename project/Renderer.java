package project;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class Renderer {
    
    public abstract void saveAndShow(BufferedImage createdImage);
    public abstract BufferedImage createPaper();
    public abstract Graphics2D createPen(BufferedImage createdPaper);
    public abstract void allProcessForGeometryObject (Geometry example, ImageFileRenderer ifr);
    
    
}
