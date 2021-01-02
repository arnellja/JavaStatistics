import java.util.*;
import java.awt.*;
import javax.swing.*;


public class porph extends JFrame
{
    static Scanner reader = new Scanner(System.in);
    static Scanner sreader = new Scanner(System.in);
    private JPanel contentpane = new JPanel();
    
    
    
    public porph () 
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setBounds( 300,300, 200,200);
        
        setContentPane(contentpane);
        Container mw = getContentPane();
        
        Button p = new Button(" Sample to Population Estimate ");
        Button ph = new Button(" Population to Sample Estimate ");
        
        GridLayout layout = new GridLayout(2,1);
        setLayout(layout);
        mw.add(p);
        mw.add(ph);
        setVisible(true);
        p.addActionListener((e) -> { 
        EventQueue.invokeLater(() -> new PHtoP());
        setVisible(false);
        });
        
        ph.addActionListener((e) -> {
        EventQueue.invokeLater(() -> new PtoPH());
        setVisible(false);
        });
    }
}
