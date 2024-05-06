package project;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageFileRenderer extends Renderer {
    
    private String fileName;

    public ImageFileRenderer(String fileName) {
        this.fileName = fileName; // constructor ile dosya adı çağırıldı
    }    
    
    @Override
    public BufferedImage createPaper() {
        final int imageSize = 1024;
        BufferedImage image = new BufferedImage(imageSize, imageSize, BufferedImage.TYPE_INT_RGB );
        return image;
    }

    @Override
    public Graphics2D createPen(BufferedImage createdPaper) {
        
        Graphics2D pen = (Graphics2D)createdPaper.getGraphics();
        return pen;
    }

    @Override
    public void saveAndShow(BufferedImage createdImage) {
        File file = new File(fileName);
        try {
            ImageIO.write(createdImage, "PNG", file); // resim kaydedildi
            showImage(fileName);
        } catch (IOException e) {
            System.err.println("Resim kaydedilirken bir hata oluştu: " + e.getMessage());
        }
        
    }

    
    public void showImage(String imageFileName) {
        try {
            Runtime.getRuntime().exec("explorer  " + imageFileName);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void allProcessForGeometryObject (Geometry example, ImageFileRenderer ifr) {
        BufferedImage paper = ifr.createPaper(); // bu nesne ile kağıt oluşturuldu.
        Graphics2D pen = ifr.createPen(paper); // bu kağıda yazacak olan kalem oluşturuldu.
        example.draw(pen, example); // oluşturulan kalem ile oluşturulan kağıda parametrede bulunan Geometry nesnesi recursively çizildi.
        ifr.saveAndShow(paper); // kağıda çiziken fractal png olarak kaydedildi ve gösterildi.
    }
    
    
    
    
}
