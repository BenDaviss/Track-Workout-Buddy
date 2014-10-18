package general;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WelcomeFrame
  extends JFrame
  implements ActionListener
{
  private static final long serialVersionUID = 1L;
  JFrame startFrame;
  JButton start;
  JButton tutorial;
  public static Layout frame;
  
  public WelcomeFrame()
  {
    setTitle("Welcome!");
    setVisible(true);
    setSize(300, 85);
    setResizable(false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(3);
    setLayout(new FlowLayout());
    
    this.start = new JButton("Start");
    this.start.setPreferredSize(new Dimension(100, 40));
    this.start.setActionCommand("S");
    this.start.addActionListener(this);
    this.tutorial = new JButton("Tutorial");
    this.tutorial.setPreferredSize(new Dimension(100, 40));
    this.tutorial.setActionCommand("T");
    this.tutorial.addActionListener(this);
    
    add(this.start);
    add(this.tutorial);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    String command = e.getActionCommand();
    if (command.equals("S"))
    {
      setVisible(false);
      frame = new Layout();
    }
    else if (command.equals("T"))
    {
      setVisible(false);
      new Tutorial();
    }
  }
}