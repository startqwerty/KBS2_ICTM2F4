import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame implements ActionListener {
    private JButton jbData;
    private JButton jbRoute;

    public HomeScreen() {
        setTitle("Nerdy Gadgets");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));

        jbData = new JButton("Gegevens inzien/ aanpassen");
        jbData.addActionListener(this);
        add(jbData);

        jbRoute = new JButton("Route bepaling");
        jbRoute.addActionListener(this);
        add(jbRoute);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbData){
            DataScreen dataScreen = new DataScreen();
        }
        else if(e.getSource() == jbRoute){
            RouteBepalingScherm route = new RouteBepalingScherm();

        }
    }
}
