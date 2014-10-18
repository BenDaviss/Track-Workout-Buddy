package general;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RepPanel
  extends JPanel
  implements ActionListener
{
  private static final long serialVersionUID = 1L;
  JTextField distanceInput;
  JTextField percentInput;
  JTextField totalResult;
  JTextField lapResult;
  JTextField reco;
  JLabel at;
  JLabel percent;
  JLabel total;
  JLabel perLap;
  JLabel recovery;
  JButton remove;
  JButton calculate;
  int errorCount = 0;
  
  public RepPanel()
  {
    this.calculate = new JButton("Calculate");
    this.calculate.setActionCommand("Calc");
    this.calculate.addActionListener(this);
    this.remove = new JButton("-");
    this.remove.setActionCommand("Remove");
    this.remove.addActionListener(this);
    
    this.at = new JLabel("meters at");
    this.percent = new JLabel("percent             ");
    this.total = new JLabel("total");
    this.perLap = new JLabel("per 400");
    this.recovery = new JLabel("Recovery");
    
    this.distanceInput = new JTextField(3);
    this.percentInput = new JTextField(3);
    this.totalResult = new JTextField(4);
    this.lapResult = new JTextField(4);
    this.reco = new JTextField(3);
    
    Font font = new Font("GEORGIA", 0, 20);
    this.distanceInput.setFont(font);
    this.percentInput.setFont(font);
    this.totalResult.setFont(font);
    this.lapResult.setFont(font);
    this.reco.setFont(font);
    
    setBackground(Color.WHITE);
    
    add(this.remove);
    add(this.distanceInput);
    add(this.at);
    add(this.percentInput);
    add(this.percent);
    add(this.totalResult);
    add(this.total);
    add(this.lapResult);
    add(this.perLap);
    add(this.calculate);
    add(this.reco);
    add(this.recovery);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    String command = e.getActionCommand();
    if (command.equals("Calc"))
    {
      if ((!this.distanceInput.getText().equals("")) && (!this.percentInput.getText().equals("")))
      {
        Logic logic = new Logic();
        String four = logic.calcFour(Integer.parseInt(this.distanceInput.getText()), Double.parseDouble(this.percentInput.getText()), 
          Integer.parseInt((String)GoalPaceDropdown.minutesDropdown.getSelectedItem()), 
          Integer.parseInt((String)GoalPaceDropdown.secondsDropdown.getSelectedItem()));
        DecimalFormat df = new DecimalFormat("##.#");
        this.lapResult.setText(df.format(Double.parseDouble(four)));
        
        String total = logic.calcTotal(Integer.parseInt(this.distanceInput.getText()), Double.parseDouble(this.percentInput.getText()), 
          Integer.parseInt((String)GoalPaceDropdown.minutesDropdown.getSelectedItem()), 
          Integer.parseInt((String)GoalPaceDropdown.secondsDropdown.getSelectedItem()));
        if (total.length() > 3) {
          this.totalResult.setText(total.substring(0, 2) + ":" + total.substring(2, 4));
        } else {
          this.totalResult.setText(total.substring(0, 1) + ":" + total.substring(1, 3));
        }
      }
    }
    else
    {
      if (Layout.rCount == 1) {
        WelcomeFrame.frame.remove(Layout.r1);
      } else if (Layout.rCount == 2) {
        WelcomeFrame.frame.remove(Layout.r2);
      } else if (Layout.rCount == 3) {
        WelcomeFrame.frame.remove(Layout.r3);
      } else if (Layout.rCount == 4) {
        WelcomeFrame.frame.remove(Layout.r4);
      } else if (Layout.rCount == 5) {
        WelcomeFrame.frame.remove(Layout.r5);
      } else if (Layout.rCount == 6) {
        WelcomeFrame.frame.remove(Layout.r6);
      } else if (Layout.rCount == 7) {
        WelcomeFrame.frame.remove(Layout.r7);
      } else if (Layout.rCount == 8) {
        WelcomeFrame.frame.remove(Layout.r8);
      } else if (Layout.rCount == 9) {
        WelcomeFrame.frame.remove(Layout.r9);
      } else if (Layout.rCount == 10) {
        WelcomeFrame.frame.remove(Layout.r10);
      } else if (Layout.rCount == 11) {
        WelcomeFrame.frame.remove(Layout.r11);
      } else if (Layout.rCount == 12) {
        WelcomeFrame.frame.remove(Layout.r12);
      } else if (Layout.rCount == 13) {
        WelcomeFrame.frame.remove(Layout.r13);
      } else if (Layout.rCount == 14) {
        WelcomeFrame.frame.remove(Layout.r14);
      } else if (Layout.rCount == 15) {
        WelcomeFrame.frame.remove(Layout.r15);
      } else {
        WelcomeFrame.frame.remove(Layout.r16);
      }
      Layout.rCount -= 1;
      WelcomeFrame.frame.repaint();
      WelcomeFrame.frame.revalidate();
    }
  }
}
