import java.util.*;
import java.awt.*;
import javax.swing.*;


public class confintsamptopop extends JFrame
{
    static Scanner reader = new Scanner(System.in);
    static Scanner sreader = new Scanner(System.in);
    private JPanel contentpane = new JPanel();
    
    public static void main (String [] args)
    {
        EventQueue.invokeLater(() -> new confintsamptopop());
        
    }
    
    public confintsamptopop ()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setBounds( 300,300, 200,200);
        
        setContentPane(contentpane);
        Container mw = getContentPane();
        
        Button mean = new Button(" Mean ");
        Button prop = new Button(" Proportion ");
        
        GridLayout layout = new GridLayout(2,1);
        setLayout(layout);
        mw.add(mean);
        mw.add(prop);
         setVisible(true);
        mean.addActionListener((e) -> { 
        EventQueue.invokeLater(() -> new xorm());
        setVisible(false);
        });
        
        prop.addActionListener((e) -> {
        EventQueue.invokeLater(() -> new porph());
        setVisible(false);
        });
        
    }
}
