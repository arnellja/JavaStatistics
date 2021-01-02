import java.util.*;
import java.awt.*;
import javax.swing.*;


public class xorm extends JFrame
{
    static Scanner reader = new Scanner(System.in);
    static Scanner sreader = new Scanner(System.in);
    private JPanel contentpane = new JPanel();
    
    
    
    public xorm () 
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setBounds( 300,300, 200,200);
        
        setContentPane(contentpane);
        Container mw = getContentPane();
        
        Button m = new Button(" Sample to Population Estimate ");
        Button xbar = new Button(" Population to Sample Estimate ");
        
        GridLayout layout = new GridLayout(2,1);
        setLayout(layout);
        mw.add(xbar);
        mw.add(m);
        setVisible(true);
        m.addActionListener((e) -> { 
        EventQueue.invokeLater(() -> new StoP());
        setVisible(false);
        });
        
        xbar.addActionListener((e) -> {
        EventQueue.invokeLater(() -> new PtoS());
        setVisible(false);
        });
    }
}
