import java.util.*;
import javax.swing.*;
import java.awt.*;

public class PropList extends JFrame
{
    private JPanel contentPane = new JPanel();
    
    public PropList()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,400,400,400);
        setContentPane(contentPane);
        Container mw = getContentPane();
        
        setLayout( new GridLayout(3,1));
        Button b1 = new Button("1 Proportion");
        Button b2 = new Button("Multiple Proportions");
        JLabel jl1 = new JLabel("How many Proportions?");
        mw.add(jl1);
        mw.add(b1);
        mw.add(b2);
        
        
         setResizable(false);
        setVisible(true);
        
        b1.addActionListener((e) ->
        {
            setVisible(false);
            JOptionPane.showMessageDialog(null,"One-Propotion Z Test","Stat Test", JOptionPane.INFORMATION_MESSAGE);
            
        });
        b2.addActionListener((e) ->
        {
            setVisible(false);
           JOptionPane.showMessageDialog(null,"Two-Sample Z Test","Stat Test",JOptionPane.INFORMATION_MESSAGE);
            
        });
        
        
       
    }
    
    public static void main(String [] args)
    {
        
        EventQueue.invokeLater(() -> new PropList());
    }
}
