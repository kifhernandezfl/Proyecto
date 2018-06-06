package project;
import java.awt.*;
import javax.swing.*;
 
public class MyIcon implements Icon
{
 /**
  * 
  * @param c
  * @param g
  * @param x
  * @param y 
  */
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Image image = new ImageIcon(getClass().getResource("/Imagen/1.jpg")).getImage();
        g.drawImage(image, x, y, c);
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public int getIconWidth() {
        return 50;
    }
 
    /**
     * 
     * @return 
     */
    @Override
    public int getIconHeight() {
        return 50;
    }
 
}