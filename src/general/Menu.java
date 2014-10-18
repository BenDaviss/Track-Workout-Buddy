package general;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu
  extends JMenuBar
  implements ActionListener
{
  private static final long serialVersionUID = 1L;
  JMenu file;
  JMenuItem print;
  
  public Menu()
  {
    this.file = new JMenu("File");
    this.print = new JMenuItem("Print");
    this.print.setActionCommand("P");
    this.print.addActionListener(this);
    
    this.file.add(this.print);
    add(this.file);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    String command = e.getActionCommand();
    if (command.equals("P")) {
      new Print();
    }
  }
}
