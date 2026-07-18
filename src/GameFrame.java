import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        this.add(new  GamePanel());
        this.setTitle("Sneggy in StrataSnake");
        this.setResizable(false);
        this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocation(0, 0);
        this.setVisible(true);

    }
}
