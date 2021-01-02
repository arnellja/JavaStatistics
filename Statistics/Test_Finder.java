import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Test_Finder extends JFrame
{
    static Scanner reader = new Scanner(System.in);
    static Scanner sreader = new Scanner(System.in);
    private JPanel contentPane = new JPanel();
    
    public Test_Finder()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,400,400,400);
        setContentPane(contentPane);
        Container mw = getContentPane();
        
        setLayout( new GridLayout(5,1));
        Button b1 = new Button("Mean");
        Button b2 = new Button("Proportion");
        Button b3 = new Button("Beta");
        Button b4 = new Button("Distributions");
        JLabel jl1 = new JLabel("\t\t\tWhich parameter?");
        mw.add(jl1);
        mw.add(b1);
        mw.add(b2);
        mw.add(b3);
        mw.add(b4);
        
         setResizable(false);
        setVisible(true);
        
        b1.addActionListener((e) ->
        {
            setVisible(false);
            EventQueue.invokeLater(() -> new MeanList());
            
        });
        b2.addActionListener((e) ->
        {
            setVisible(false);
            EventQueue.invokeLater(() -> new PropList());
            
        });
        
        b3.addActionListener((e) ->
        {
            setVisible(false);
            
             JOptionPane.showMessageDialog(null,"Least Sum Regression Line Slope Test", "Stat Test",JOptionPane.INFORMATION_MESSAGE);
        });
        
        b4.addActionListener((e) ->
        {
            setVisible(false);
            
             EventQueue.invokeLater(() -> new Distributions());
        });
       
    }
    
    public static void main(String [] args)
    {
        
        EventQueue.invokeLater(() -> new Test_Finder());
    }
    
    
    
    
}
/*
 * mean/proportion/Beta
 * how many samples?
 * testing for an association
 * how many in sample?
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */