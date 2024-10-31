import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Window Variables
        int tilesize = 32;
        int row= 16;
        int coloums = 16;
        int boardwidth = tilesize * coloums; // 32*16=512px
        int boardhight = tilesize *row; // 32*16=512px

        JFrame frame =new JFrame("Space Invaders Game");
        frame.setVisible(true);
        frame.setSize(boardwidth, boardhight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpaceInvaders spaceInvaders=new SpaceInvaders();
        frame.add(spaceInvaders);
        frame.pack();
        spaceInvaders.requestFocus();
        frame.setVisible(true);
    }
}
