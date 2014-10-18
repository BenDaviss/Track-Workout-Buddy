package general;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CommentPanel
  extends JPanel
  implements ActionListener
{
  private static final long serialVersionUID = 1L;
  JTextField commentInput;
  JButton remove;
  
  public CommentPanel()
  {
    this.remove = new JButton("-");
    this.remove.addActionListener(this);
    
    this.commentInput = new JTextField(20);
    
    Font font = new Font("GEORGIA", 0, 20);
    this.commentInput.setFont(font);
    
    setBackground(Color.WHITE);
    
    add(this.remove);
    add(this.commentInput);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (Layout.cCount == 1) {
      WelcomeFrame.frame.remove(Layout.c1);
    } else if (Layout.cCount == 2) {
      WelcomeFrame.frame.remove(Layout.c2);
    } else if (Layout.cCount == 3) {
      WelcomeFrame.frame.remove(Layout.c3);
    } else if (Layout.cCount == 4) {
      WelcomeFrame.frame.remove(Layout.c4);
    } else {
      WelcomeFrame.frame.remove(Layout.c5);
    }
    Layout.cCount -= 1;
    WelcomeFrame.frame.repaint();
    WelcomeFrame.frame.revalidate();
  }
}
