package HandlingMethods;

import javax.swing.*;
import java.awt.*;
public class ImageHandling {
    public static ImageIcon imgIconAuto(ImageIcon In,int width,int height){
        Image newimg,image;
        image = In.getImage();
        newimg = image.getScaledInstance(width, height,  Image.SCALE_SMOOTH);
        return new ImageIcon(newimg);
    }


}
