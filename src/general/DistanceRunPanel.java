package general;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DistanceRunPanel
  extends JPanel
  implements ActionListener
{
  private static final long serialVersionUID = 1L;
  JTextField textInput;
  JTextField paceCalculation;
  JButton remove;
  JButton calculate;
  JLabel at;
  Font font;
  
  public DistanceRunPanel()
  {
    this.at = new JLabel("at");
    
    this.remove = new JButton("-");
    this.remove.setActionCommand("Remove");
    this.remove.addActionListener(this);
    
    this.calculate = new JButton("Calculate");
    this.calculate.setActionCommand("Calc");
    this.calculate.addActionListener(this);
    
    this.textInput = new JTextField(15);
    this.paceCalculation = new JTextField(4);
    
    this.font = new Font("GEORGIA", 0, 20);
    this.textInput.setFont(this.font);
    this.paceCalculation.setFont(this.font);
    
    setBackground(Color.WHITE);
    
    add(this.remove);
    add(this.textInput);
    add(this.at);
    add(this.paceCalculation);
    add(this.calculate);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    String command = e.getActionCommand();
    if (command.equals("Remove"))
    {
      if (Layout.dCount == 1) {
        WelcomeFrame.frame.remove(Layout.d1);
      } else {
        WelcomeFrame.frame.remove(Layout.d2);
      }
      Layout.dCount -= 1;
      WelcomeFrame.frame.repaint();
      WelcomeFrame.frame.revalidate();
    }
    else
    {
      Logic distanceLogic = new Logic();
      String steady = distanceLogic.findSteady(Integer.parseInt((String)GoalPaceDropdown.minutesDropdown.getSelectedItem()), 
        Integer.parseInt((String)GoalPaceDropdown.secondsDropdown.getSelectedItem()));
      if (steady.length() > 3) {
        this.paceCalculation.setText(steady.substring(0, 2) + ":" + steady.substring(2, 4));
      } else {
        this.paceCalculation.setText(steady.substring(0, 1) + ":" + steady.substring(1, 3));
      }
    }
  }
}
