
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class Distributions extends JFrame
{
     private JPanel contentPane = new JPanel();
    
    public Distributions()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,400,400,400);
        setContentPane(contentPane);
        Container mw = getContentPane();
        
        setLayout( new GridLayout(3,1));
        Button b1 = new Button("Yes");
        Button b2 = new Button("No");
        JLabel jl1 = new JLabel("Is there a claimed distribution?");
        mw.add(jl1);
        mw.add(b1);
        mw.add(b2);
        
        
         setResizable(false);
        setVisible(true);
        
        b1.addActionListener((e) ->
        {
            setVisible(false);
            JOptionPane.showMessageDialog(null,"X^2 Test for Goodness of Fit","Stat Test",JOptionPane.INFORMATION_MESSAGE);
            
        });
        b2.addActionListener((e) ->
        {
            setVisible(false);
           EventQueue.invokeLater(() -> new HomOInd());
            
        });
        
        
       
    }
    
    public static void main(String [] args)
    {
        
        EventQueue.invokeLater(() -> new Distributions());
    }
}
