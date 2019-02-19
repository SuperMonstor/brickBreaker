import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        gameplay gamePlay = new gameplay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Brick Breaker!");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        obj.setVisible(true);
    }
}
