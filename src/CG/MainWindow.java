package CG;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private DrawPanel dp;

    public MainWindow() throws HeadlessException {
        dp = new DrawPanel();
        add(dp);
    }

    /*
     * возможен и такой вариант через контструктор, как мы делали в прошлом семе
     */

    /* public MainWindow() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }   */
}
