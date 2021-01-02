import java.util.*;
import javax.swing.*;
import java.awt.*;

public class OneMean extends JFrame
{
     private JPanel contentPane = new JPanel();
    
    public OneMean()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,400,400,400);
        setContentPane(contentPane);
        Container mw = getContentPane();
        
        setLayout( new GridLayout(3,1));
        Button b1 = new Button("1");
        Button b2 = new Button("Greater Than One");
        JLabel jl1 = new JLabel("Sample Size?");
        mw.add(jl1);
        mw.add(b1);
        mw.add(b2);
        
        
         setResizable(false);
        setVisible(true);
        
        b1.addActionListener((e) ->
        {
            setVisible(false);
            JOptionPane.showMessageDialog(null,"Z Test","Stat Test", JOptionPane.INFORMATION_MESSAGE);
            
        });
        b2.addActionListener((e) ->
        {
            setVisible(false);
           JOptionPane.showMessageDialog(null,"t Test","Stat Test",JOptionPane.INFORMATION_MESSAGE);
            
        });
        
        
       
    }
    
    public static void main(String [] args)
    {
        
        EventQueue.invokeLater(() -> new OneMean());
    }
}
