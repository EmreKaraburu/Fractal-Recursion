package project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        boolean stream = true;
        while (stream)
        {
            System.out.println("\n\n\t1- Fractal Tree\n\t2- Reverse Fractal Tree\n\t3- More Size Fractal Tree");
            System.out.println("\t4- Sierpiński Triangle\n\t5- More detailed Sierpiński Triangle\n\t6- Less detailed Sierpiński Triangle");
            System.out.println("\t7- Circle Fractal\n\t8- More detailed Circle Fractal\n\t9- Less detailed Circle Fractal");
            System.out.println("\t10- Polygon Fractal: 8");
            System.out.println("\t11- Polygon Fractal: 8 detailed");
            System.out.println("\t12- Polygon Fractal: 8 simple");
            System.out.println("\t13- Polygon Fractal: 6");
            System.out.println("\t14- Polygon Fractal: 6 detailed");
            System.out.println("\t15- Polygon Fractal: 6 simple");
            System.out.println("\t16- Polygon Fractal: 10");
            System.out.println("\t17- Polygon Fractal: 15");
            System.out.println("\t18- Polygon Fractal: 20");
            System.out.println("\t19- Polygon Fractal: 30");
            System.out.println("\t20- Polygon Fractal: 50");
            System.out.println("\t21- Polygon Fractal: 100");
            System.out.println("\t22- view all fractals above");
            System.out.println("\t23- exit");
        
            System.out.print("Please enter the integer value of the option you want to select --> ");
            int selection = scan.nextInt();
            
            
            
            if(selection == 1)
            {
                ImageFileRenderer L_ifr1 = new ImageFileRenderer("Fractal Tree.png");
                Geometry line1 = new Line(512, 512, 10, -90, 90);
                L_ifr1.allProcessForGeometryObject(line1, L_ifr1);
            }
            else if (selection == 2)
            {
                ImageFileRenderer L_ifr2 = new ImageFileRenderer("Reverse Fractal Tree.png");
                Geometry line2 = new Line(512, 1, 10, 90, 20);
                L_ifr2.allProcessForGeometryObject(line2, L_ifr2);
            }
            else if (selection == 3)
            {
                ImageFileRenderer L_ifr3 = new ImageFileRenderer("More Size Fractal Tree.png");
                Geometry line3 = new Line(512, 1023, 15, -90, 20);
                L_ifr3.allProcessForGeometryObject(line3, L_ifr3);
            }
            else if (selection == 4)
            {
                ImageFileRenderer T_ifr1 = new ImageFileRenderer("Sierpinski Triangle.png");
                Geometry triangle1 = new Triangle(1, 950, 1024, 20);
                T_ifr1.allProcessForGeometryObject(triangle1, T_ifr1);
            }
            else if (selection == 5)
            {
                ImageFileRenderer T_ifr2 = new ImageFileRenderer("more detail Sierpinski Triangle.png");
                Geometry triangle2 = new Triangle(1, 950, 1024, 10);
                T_ifr2.allProcessForGeometryObject(triangle2, T_ifr2);

            }
            else if (selection == 6)
            {
                ImageFileRenderer T_ifr3 = new ImageFileRenderer("less detail Sierpinski Triangle.png");
                Geometry triangle3 = new Triangle(1, 950, 1024, 100);
                T_ifr3.allProcessForGeometryObject(triangle3, T_ifr3);
            }
            else if (selection == 7)
            {
                ImageFileRenderer C_ifr1 = new ImageFileRenderer("Circle Fractal.png");
                Geometry circle1 = new Circle(512, 512, 512, 10);
                C_ifr1.allProcessForGeometryObject(circle1, C_ifr1);
            }
            else if (selection == 8)
            {
                ImageFileRenderer C_ifr2 = new ImageFileRenderer("more detail Circle Fractal.png");
                Geometry circle2 = new Circle(512, 512, 512, 2);
                C_ifr2.allProcessForGeometryObject(circle2, C_ifr2);
            }
            else if (selection == 9)
            {
                ImageFileRenderer C_ifr3 = new ImageFileRenderer("less detail Circle Fractal.png");
                Geometry circle3 = new Circle(512, 512, 512, 100);
                C_ifr3.allProcessForGeometryObject(circle3, C_ifr3);
            }
            else if (selection == 10)
            {
                ImageFileRenderer P_ifr1 = new ImageFileRenderer("Polygon8.png");
                Geometry polygon1 = new Polygon(512, 512, 200, 50, 8);
                P_ifr1.allProcessForGeometryObject(polygon1, P_ifr1);
            }
            else if (selection == 11)
            {
                ImageFileRenderer P_ifr2 = new ImageFileRenderer("Polygon8 detail.png");
                Geometry polygon2 = new Polygon(512, 512, 200, 49, 8);
                P_ifr2.allProcessForGeometryObject(polygon2, P_ifr2);
            }
            else if (selection == 12)
            {
                ImageFileRenderer P_ifr3 = new ImageFileRenderer("Polygon8 simple.png");
                Geometry polygon3 = new Polygon(512, 512, 200, 100, 8);
                P_ifr3.allProcessForGeometryObject(polygon3, P_ifr3);
            }
            
            else if (selection == 13)
            {
                ImageFileRenderer P_ifr4 = new ImageFileRenderer("Polygon6.png");
                Geometry polygon4 = new Polygon(512, 512, 200, 25, 6);
                P_ifr4.allProcessForGeometryObject(polygon4, P_ifr4);
            }
            else if (selection == 14)
            {
                ImageFileRenderer P_ifr2 = new ImageFileRenderer("Polygon6 detail.png");
                Geometry polygon2 = new Polygon(512, 512, 200, 24, 6);
                P_ifr2.allProcessForGeometryObject(polygon2, P_ifr2);
            }
            else if (selection == 15)
            {
                ImageFileRenderer P_ifr3 = new ImageFileRenderer("Polygon6 simple.png");
                Geometry polygon3 = new Polygon(512, 512, 200, 50, 6);
                P_ifr3.allProcessForGeometryObject(polygon3, P_ifr3);
            }
            
            else if (selection == 16)
            {
                ImageFileRenderer P_ifr4 = new ImageFileRenderer("Polygon10.png");
                Geometry polygon4 = new Polygon(512, 512, 200, 99, 10);
                P_ifr4.allProcessForGeometryObject(polygon4, P_ifr4);
            }
            else if (selection == 17)
            {
                ImageFileRenderer P_ifr4 = new ImageFileRenderer("Polygon15.png");
                Geometry polygon4 = new Polygon(512, 512, 200, 100, 15);
                P_ifr4.allProcessForGeometryObject(polygon4, P_ifr4);
            }
            else if (selection == 18)
            {
                ImageFileRenderer P_ifr2 = new ImageFileRenderer("Polygon20.png");
                Geometry polygon2 = new Polygon(512, 512, 200, 100, 20);
                P_ifr2.allProcessForGeometryObject(polygon2, P_ifr2);
            }
            else if (selection == 19)
            {
                ImageFileRenderer P_ifr3 = new ImageFileRenderer("Polygon30.png");
                Geometry polygon3 = new Polygon(512, 512, 200, 100, 30);
                P_ifr3.allProcessForGeometryObject(polygon3, P_ifr3);
            }
            else if (selection == 20)
            {
                ImageFileRenderer P_ifr2 = new ImageFileRenderer("Polygon50.png");
                Geometry polygon2 = new Polygon(512, 512, 200, 100, 50);
                P_ifr2.allProcessForGeometryObject(polygon2, P_ifr2);
            }
            else if (selection == 21)
            {
                ImageFileRenderer P_ifr3 = new ImageFileRenderer("Polygon100.png");
                Geometry polygon3 = new Polygon(512, 512, 200, 100, 100);
                P_ifr3.allProcessForGeometryObject(polygon3, P_ifr3);
            }
            
            else if (selection == 22) // tüm fraktalları görüntületen kod copy paste code
            {
                for (int i = 1; i < 22; i++) 
            {
                int selectionn = i;
                
                if(selectionn == 1)
            {
                ImageFileRenderer L_ifr1 = new ImageFileRenderer("Fractal Tree.png");
                Geometry line1 = new Line(512, 1023, 10, -90, 20);
                L_ifr1.allProcessForGeometryObject(line1, L_ifr1);
            }
            else if (selectionn == 2)
            {
                ImageFileRenderer L_ifr2 = new ImageFileRenderer("Reverse Fractal Tree.png");
                Geometry line2 = new Line(512, 1, 10, 90, 20);
                L_ifr2.allProcessForGeometryObject(line2, L_ifr2);
            }
            else if (selectionn == 3)
            {
                ImageFileRenderer L_ifr3 = new ImageFileRenderer("More Size Fractal Tree.png");
                Geometry line3 = new Line(512, 1023, 15, -90, 20);
                L_ifr3.allProcessForGeometryObject(line3, L_ifr3);
            }
            else if (selectionn == 4)
            {
                ImageFileRenderer T_ifr1 = new ImageFileRenderer("Sierpinski Triangle.png");
                Geometry triangle1 = new Triangle(1, 950, 1024, 20);
                T_ifr1.allProcessForGeometryObject(triangle1, T_ifr1);
            }
            else if (selectionn == 5)
            {
                ImageFileRenderer T_ifr2 = new ImageFileRenderer("more detail Sierpinski Triangle.png");
                Geometry triangle2 = new Triangle(1, 950, 1024, 10);
                T_ifr2.allProcessForGeometryObject(triangle2, T_ifr2);

            }
            else if (selectionn == 6)
            {
                ImageFileRenderer T_ifr3 = new ImageFileRenderer("less detail Sierpinski Triangle.png");
                Geometry triangle3 = new Triangle(1, 950, 1024, 100);
                T_ifr3.allProcessForGeometryObject(triangle3, T_ifr3);
            }
            else if (selectionn == 7)
            {
                ImageFileRenderer C_ifr1 = new ImageFileRenderer("Circle Fractal.png");
                Geometry circle1 = new Circle(512, 512, 512, 10);
                C_ifr1.allProcessForGeometryObject(circle1, C_ifr1);
            }
            else if (selectionn == 8)
            {
                ImageFileRenderer C_ifr2 = new ImageFileRenderer("more detail Circle Fractal.png");
                Geometry circle2 = new Circle(512, 512, 512, 2);
                C_ifr2.allProcessForGeometryObject(circle2, C_ifr2);
            }
            else if (selectionn == 9)
            {
                ImageFileRenderer C_ifr3 = new ImageFileRenderer("less detail Circle Fractal.png");
                Geometry circle3 = new Circle(512, 512, 512, 100);
                C_ifr3.allProcessForGeometryObject(circle3, C_ifr3);
            }
            else if (selectionn == 10)
            {
                ImageFileRenderer P_ifr1 = new ImageFileRenderer("Polygon8.png");
                Geometry polygon1 = new Polygon(512, 512, 200, 50, 8);
                P_ifr1.allProcessForGeometryObject(polygon1, P_ifr1);
            }
            else if (selectionn == 11)
            {
                ImageFileRenderer P_ifr2 = new ImageFileRenderer("Polygon8 detail.png");
                Geometry polygon2 = new Polygon(512, 512, 200, 49, 8);
                P_ifr2.allProcessForGeometryObject(polygon2, P_ifr2);
            }
            else if (selectionn == 12)
            {
                ImageFileRenderer P_ifr3 = new ImageFileRenderer("Polygon8 simple.png");
                Geometry polygon3 = new Polygon(512, 512, 200, 100, 8);
                P_ifr3.allProcessForGeometryObject(polygon3, P_ifr3);
            }
            
            else if (selectionn == 13)
            {
                ImageFileRenderer P_ifr4 = new ImageFileRenderer("Polygon6.png");
                Geometry polygon4 = new Polygon(512, 512, 200, 25, 6);
                P_ifr4.allProcessForGeometryObject(polygon4, P_ifr4);
            }
            else if (selectionn == 14)
            {
                ImageFileRenderer P_ifr2 = new ImageFileRenderer("Polygon6 detail.png");
                Geometry polygon2 = new Polygon(512, 512, 200, 24, 6);
                P_ifr2.allProcessForGeometryObject(polygon2, P_ifr2);
            }
            else if (selectionn == 15)
            {
                ImageFileRenderer P_ifr3 = new ImageFileRenderer("Polygon6 simple.png");
                Geometry polygon3 = new Polygon(512, 512, 200, 50, 6);
                P_ifr3.allProcessForGeometryObject(polygon3, P_ifr3);
            }
            
            else if (selectionn == 16)
            {
                ImageFileRenderer P_ifr4 = new ImageFileRenderer("Polygon10.png");
                Geometry polygon4 = new Polygon(512, 512, 200, 99, 10);
                P_ifr4.allProcessForGeometryObject(polygon4, P_ifr4);
            }
            else if (selectionn == 17)
            {
                ImageFileRenderer P_ifr4 = new ImageFileRenderer("Polygon15.png");
                Geometry polygon4 = new Polygon(512, 512, 200, 100, 15);
                P_ifr4.allProcessForGeometryObject(polygon4, P_ifr4);
            }
            else if (selectionn == 18)
            {
                ImageFileRenderer P_ifr2 = new ImageFileRenderer("Polygon20.png");
                Geometry polygon2 = new Polygon(512, 512, 200, 100, 20);
                P_ifr2.allProcessForGeometryObject(polygon2, P_ifr2);
            }
            else if (selectionn == 19)
            {
                ImageFileRenderer P_ifr3 = new ImageFileRenderer("Polygon30.png");
                Geometry polygon3 = new Polygon(512, 512, 200, 100, 30);
                P_ifr3.allProcessForGeometryObject(polygon3, P_ifr3);
            }
            else if (selectionn == 20)
            {
                ImageFileRenderer P_ifr2 = new ImageFileRenderer("Polygon50.png");
                Geometry polygon2 = new Polygon(512, 512, 200, 100, 50);
                P_ifr2.allProcessForGeometryObject(polygon2, P_ifr2);
            }
            else if (selectionn == 21)
            {
                ImageFileRenderer P_ifr3 = new ImageFileRenderer("Polygon100.png");
                Geometry polygon3 = new Polygon(512, 512, 200, 100, 100);
                P_ifr3.allProcessForGeometryObject(polygon3, P_ifr3);
            }
                
                
            }
            }
            
            else if (selection == 23)
            {
                stream = false;
            }
            else
            {
                System.out.println("wrong input, please select true one");
                continue;
            }
            
            
            
        }
        
        
        
        
        
        
        
    }
    
}
