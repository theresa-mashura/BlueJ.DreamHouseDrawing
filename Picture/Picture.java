
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square grass;
    private Square wall;
    private Square window;
    private Square windowTopRight;
    private Square windowBottomLeft;
    private Square windowBottomRight;
    private Square chimney;
    private Triangle roof;
    private Square roofWindow;
    private Circle roofWindowTop;
    private Triangle treePiece1; 
    private Triangle treePiece2; 
    private Triangle treePiece3; 
    private Triangle treePiece4;
    private Triangle treePiece5;
    private Circle cloudPc1;
    private Circle cloudPc2;
    private Circle cloudPc3;
    private Circle cloudPc4;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(200);
        wall.changeColor("red");
        wall.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(40);
        window.moveVertical(100);
        window.makeVisible();
        
        windowTopRight = new Square();
        windowTopRight.changeColor("yellow");
        windowTopRight.moveHorizontal(130);
        windowTopRight.moveVertical(100);
        windowTopRight.makeVisible();
        
        windowBottomLeft = new Square();
        windowBottomLeft.changeColor("yellow");
        windowBottomLeft.moveHorizontal(40);
        windowBottomLeft.moveVertical(175);
        windowBottomLeft.makeVisible();
        
        windowBottomRight = new Square();
        windowBottomRight.changeColor("yellow");
        windowBottomRight.moveHorizontal(130);
        windowBottomRight.moveVertical(175);
        windowBottomRight.makeVisible();
        
        chimney = new Square();
        chimney.changeSize(40);
        chimney.changeColor("magenta");
        chimney.moveHorizontal(33);
        chimney.moveVertical(5);
        chimney.makeVisible();

        roof = new Triangle();
        roof.changeSize(100, 220);
        roof.changeColor("black");
        roof.moveHorizontal(110);
        roof.moveVertical(20);
        roof.makeVisible();
        
        roofWindow = new Square();
        roofWindow.changeColor("yellow");
        roofWindow.moveHorizontal(90);
        roofWindow.moveVertical(25);
        roofWindow.makeVisible();
        
        roofWindowTop = new Circle();
        roofWindowTop.changeColor("yellow");
        roofWindowTop.moveHorizontal(130);
        roofWindowTop.moveVertical(5);
        roofWindowTop.changeSize(30);
        roofWindowTop.makeVisible();
        
        treePiece1 = new Triangle();
        treePiece1.changeSize(50, 60);
        treePiece1.changeColor("green");
        treePiece1.moveHorizontal(10);
        treePiece1.moveVertical(75);
        treePiece1.makeVisible();
        
        treePiece2 = new Triangle();
        treePiece2.changeSize(50, 60);
        treePiece2.changeColor("green");
        treePiece2.moveHorizontal(10);
        treePiece2.moveVertical(115);
        treePiece2.makeVisible();
        
        treePiece3 = new Triangle();
        treePiece3.changeSize(50, 60);
        treePiece3.changeColor("green");
        treePiece3.moveHorizontal(10);
        treePiece3.moveVertical(155);
        treePiece3.makeVisible();
        
        treePiece4 = new Triangle();
        treePiece4.changeSize(50, 60);
        treePiece4.changeColor("green");
        treePiece4.moveHorizontal(10);
        treePiece4.moveVertical(195);
        treePiece4.makeVisible();
        
        treePiece5 = new Triangle();
        treePiece5.changeSize(50, 60);
        treePiece5.changeColor("green");
        treePiece5.moveHorizontal(10);
        treePiece5.moveVertical(235);
        treePiece5.makeVisible();
        
        cloudPc1 = new Circle();
        cloudPc1.changeColor("blue");
        cloudPc1.moveHorizontal(25);
        cloudPc1.moveVertical(-50);
        cloudPc1.changeSize(30);
        cloudPc1.makeVisible();
        
        cloudPc2 = new Circle();
        cloudPc2.changeColor("blue");
        cloudPc2.moveHorizontal(15);
        cloudPc2.moveVertical(-40);
        cloudPc2.changeSize(30);
        cloudPc2.makeVisible();
        
        cloudPc3 = new Circle();
        cloudPc3.changeColor("blue");
        cloudPc3.moveHorizontal(30);
        cloudPc3.moveVertical(-30);
        cloudPc3.changeSize(30);
        cloudPc3.makeVisible();
        
        cloudPc4 = new Circle();
        cloudPc4.changeColor("blue");
        cloudPc4.moveHorizontal(40);
        cloudPc4.moveVertical(-40);
        cloudPc4.changeSize(30);
        cloudPc4.makeVisible();


        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(190);
        sun.moveVertical(-30);
        sun.changeSize(60);
        sun.makeVisible();
        
        grass = new Square();
        grass.moveVertical(235);
        grass.changeSize(1000);
        grass.moveHorizontal(-75);
        grass.changeColor("green");
        grass.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
