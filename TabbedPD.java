import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class TabbedPD extends JFrame {
    private String[] ipl ={
        "Deccan charger", "kolkata night Riders",
        "Mumbai Indian","Csk",
        "RR","RCB","kP","PWI","DD"
    };
    private JTabbedPane tab = new JTabbedPane();
    private JTextField textfield = new JTextField(20);

    public TabbedPD(){
        int i =0;
        for( String team : ipl){
            tab.addTab(ipl[i], new JTextField("Who will win ipl this year?"));
            i++;
        }
        tab.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent e){
                textfield.setText("you selected : " +
                tab.getTitleAt(tab.getSelectedIndex()));
            }
            
        });
        add(BorderLayout.SOUTH,textfield);
        add(tab);
    }
    public static void main(String[] args) {
        setFrame(new TabbedPD(),450,175);
    }
    private static void setFrame(final JFrame frame,final int width, 
    final int height) {
        SwingUtilities.invokeLater(new Runnable() {
           public void run(){
               frame.setTitle(frame.getClass().getSimpleName());
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setSize(width,height);
               frame.setVisible(true);
           } 
        });
    }

    
}
