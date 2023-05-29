/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartease;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class Dimensions {

    public static void setDefaultFrameSize(JFrame frame, int width, int height) {
        frame.setSize(width, height);
        frame.setMinimumSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setPreferredSize(new Dimension(width, height));
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame on the screen
    }

}
