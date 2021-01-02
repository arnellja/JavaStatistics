
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class HomOInd extends JFrame
{
     private JPanel contentPane = new JPanel();
    
    public HomOInd()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,400,400,400);
        setContentPane(contentPane);
        Container mw = getContentPane();
        
        setLayout( new GridLayout(3,1));
        Button b1 = new Button("1 Sample");
        Button b2 = new Button("Multiple Samples");
        JLabel jl1 = new JLabel("How many samples?");
        mw.add(jl1);
        mw.add(b1);
        mw.add(b2);
        
        
         setResizable(false);
        setVisible(true);
        
        b1.addActionListener((e) ->
        {
            setVisible(false);
            JOptionPane.showMessageDialog(null,"X^2 Test for Homogeneity","Stat Test", JOptionPane.INFORMATION_MESSAGE);
            
        });
        b2.addActionListener((e) ->
        {
            setVisible(false);
           JOptionPane.showMessageDialog(null,"X^2 Test for Independence","Stat Test",JOptionPane.INFORMATION_MESSAGE);
            
        });
        
        
       
    }
    
    public static void main(String [] args)
    {
        
        EventQueue.invokeLater(() -> new HomOInd());
    }
}
