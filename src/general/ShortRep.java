package general;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShortRep
  extends JPanel
  implements ActionListener
{
  private static final long serialVersionUID = 1L;
  JButton b1;
  JButton b2;
  JButton b3;
  JButton b4;
  JButton b5;
  JButton b6;
  JButton b7;
  JButton b8;
  JButton calculate;
  JButton remove;
  JTextField distance;
  JTextField rest;
  JTextField p1;
  JTextField p2;
  JTextField p3;
  JTextField p4;
  JTextField p5;
  JTextField p6;
  JTextField p7;
  JTextField p8;
  JPanel buttonPanel;
  JLabel spacing;
  JLabel spacing2;
  int confirmCount = 0;
  int distanceAmount;
  double percentAmount1;
  double percentAmount2;
  double percentAmount3;
  double percentAmount4;
  double percentAmount5;
  double percentAmount6;
  double percentAmount7;
  double percentAmount8;
  
  public ShortRep()
  {
    setBackground(Color.WHITE);
    
    this.spacing = new JLabel(" meters with ");
    this.spacing2 = new JLabel("rest           ");
    
    this.buttonPanel = new JPanel();
    this.buttonPanel.setBackground(Color.WHITE);
    
    this.b1 = new JButton("1");
    this.b1.setActionCommand("1");
    this.b1.addActionListener(this);
    
    this.b2 = new JButton("2");
    this.b2.setActionCommand("2");
    this.b2.addActionListener(this);
    
    this.b3 = new JButton("3");
    this.b3.setActionCommand("3");
    this.b3.addActionListener(this);
    
    this.b4 = new JButton("4");
    this.b4.setActionCommand("4");
    this.b4.addActionListener(this);
    
    this.b5 = new JButton("5");
    this.b5.setActionCommand("5");
    this.b5.addActionListener(this);
    
    this.b6 = new JButton("6");
    this.b6.setActionCommand("6");
    this.b6.addActionListener(this);
    
    this.b7 = new JButton("7");
    this.b7.setActionCommand("7");
    this.b7.addActionListener(this);
    
    this.b8 = new JButton("8");
    this.b8.setActionCommand("8");
    this.b8.addActionListener(this);
    
    this.calculate = new JButton("Calc");
    this.calculate.setActionCommand("Calc");
    this.calculate.addActionListener(this);
    
    this.remove = new JButton("-");
    this.remove.setActionCommand("Remove");
    this.remove.addActionListener(this);
    
    this.buttonPanel.add(this.remove);
    this.buttonPanel.add(this.b1);
    this.buttonPanel.add(this.b2);
    this.buttonPanel.add(this.b3);
    this.buttonPanel.add(this.b4);
    this.buttonPanel.add(this.b5);
    this.buttonPanel.add(this.b6);
    this.buttonPanel.add(this.b7);
    this.buttonPanel.add(this.b8);
    
    add(this.buttonPanel);
    
    this.distance = new JTextField(3);
    this.rest = new JTextField(3);
    this.p1 = new JTextField(4);
    this.p2 = new JTextField(4);
    this.p3 = new JTextField(4);
    this.p4 = new JTextField(4);
    this.p5 = new JTextField(4);
    this.p6 = new JTextField(4);
    this.p7 = new JTextField(4);
    this.p8 = new JTextField(4);
    
    Font font = new Font("GEORGIA", 0, 16);
    
    this.distance.setFont(font);
    this.rest.setFont(font);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    String command = e.getActionCommand();
    if (command.equals("1"))
    {
      remove(this.buttonPanel);
      add(this.remove);
      add(this.distance);
      add(this.spacing);
      add(this.rest);
      add(this.spacing2);
      add(this.p1);
      add(this.calculate);
      
      repaint();
      revalidate();
    }
    else if (command.equals("2"))
    {
      remove(this.buttonPanel);
      add(this.remove);
      add(this.distance);
      add(this.spacing);
      add(this.rest);
      add(this.spacing2);
      add(this.p1);
      add(this.p2);
      add(this.calculate);
      
      repaint();
      revalidate();
    }
    else if (command.equals("3"))
    {
      remove(this.buttonPanel);
      add(this.remove);
      add(this.distance);
      add(this.spacing);
      add(this.rest);
      add(this.spacing2);
      add(this.p1);
      add(this.p2);
      add(this.p3);
      add(this.calculate);
      
      repaint();
      revalidate();
    }
    else if (command.equals("4"))
    {
      remove(this.buttonPanel);
      add(this.remove);
      add(this.distance);
      add(this.spacing);
      add(this.rest);
      add(this.spacing2);
      add(this.p1);
      add(this.p2);
      add(this.p3);
      add(this.p4);
      add(this.calculate);
      
      repaint();
      revalidate();
    }
    else if (command.equals("5"))
    {
      remove(this.buttonPanel);
      add(this.remove);
      add(this.distance);
      add(this.spacing);
      add(this.rest);
      add(this.spacing2);
      add(this.p1);
      add(this.p2);
      add(this.p3);
      add(this.p4);
      add(this.p5);
      add(this.calculate);
      
      repaint();
      revalidate();
    }
    else if (command.equals("6"))
    {
      remove(this.buttonPanel);
      add(this.remove);
      add(this.distance);
      add(this.spacing);
      add(this.rest);
      add(this.spacing2);
      add(this.p1);
      add(this.p2);
      add(this.p3);
      add(this.p4);
      add(this.p5);
      add(this.p6);
      add(this.calculate);
      
      repaint();
      revalidate();
    }
    else if (command.equals("7"))
    {
      remove(this.buttonPanel);
      add(this.remove);
      add(this.distance);
      add(this.spacing);
      add(this.rest);
      add(this.spacing2);
      add(this.p1);
      add(this.p2);
      add(this.p3);
      add(this.p4);
      add(this.p5);
      add(this.p6);
      add(this.p7);
      add(this.calculate);
      
      repaint();
      revalidate();
    }
    else if (command.equals("8"))
    {
      remove(this.buttonPanel);
      add(this.remove);
      add(this.distance);
      add(this.spacing);
      add(this.rest);
      add(this.spacing2);
      add(this.p1);
      add(this.p2);
      add(this.p3);
      add(this.p4);
      add(this.p5);
      add(this.p6);
      add(this.p7);
      add(this.p8);
      add(this.calculate);
      
      repaint();
      revalidate();
    }
    else if (command.equals("Calc"))
    {
      Logic logic = new Logic();
      if (this.confirmCount == 0)
      {
        if (!this.p1.getText().equals(""))
        {
          this.distanceAmount = Integer.parseInt(this.distance.getText());
          this.percentAmount1 = Double.parseDouble(this.p1.getText());
        }
        if (!this.p2.getText().equals("")) {
          this.percentAmount2 = Double.parseDouble(this.p2.getText());
        }
        if (!this.p3.getText().equals("")) {
          this.percentAmount3 = Double.parseDouble(this.p3.getText());
        }
        if (!this.p4.getText().equals("")) {
          this.percentAmount4 = Double.parseDouble(this.p4.getText());
        }
        if (!this.p5.getText().equals("")) {
          this.percentAmount5 = Double.parseDouble(this.p5.getText());
        }
        if (!this.p6.getText().equals("")) {
          this.percentAmount6 = Double.parseDouble(this.p6.getText());
        }
        if (!this.p7.getText().equals("")) {
          this.percentAmount7 = Double.parseDouble(this.p7.getText());
        }
        if (!this.p8.getText().equals("")) {
          this.percentAmount8 = Double.parseDouble(this.p8.getText());
        }
        this.confirmCount += 1;
      }
      if (this.p1 != null)
      {
        String total1 = logic.calcShort(this.distanceAmount, this.percentAmount1, 
          Integer.parseInt((String)GoalPaceDropdown.minutesDropdown.getSelectedItem()), 
          Integer.parseInt((String)GoalPaceDropdown.secondsDropdown.getSelectedItem()));
        
        this.p1.setText(total1.substring(0, 1) + ":" + total1.substring(1, 5));
      }
      if (this.p2 != null)
      {
        String total2 = logic.calcShort(this.distanceAmount, this.percentAmount2, 
          Integer.parseInt((String)GoalPaceDropdown.minutesDropdown.getSelectedItem()), 
          Integer.parseInt((String)GoalPaceDropdown.secondsDropdown.getSelectedItem()));
        
        this.p2.setText(total2.substring(0, 1) + ":" + total2.substring(1, 5));
      }
      if (this.p3 != null)
      {
        String total3 = logic.calcShort(this.distanceAmount, this.percentAmount3, 
          Integer.parseInt((String)GoalPaceDropdown.minutesDropdown.getSelectedItem()), 
          Integer.parseInt((String)GoalPaceDropdown.secondsDropdown.getSelectedItem()));
        
        this.p3.setText(total3.substring(0, 1) + ":" + total3.substring(1, 5));
      }
      if (this.p4 != null)
      {
        String total4 = logic.calcShort(this.distanceAmount, this.percentAmount4, 
          Integer.parseInt((String)GoalPaceDropdown.minutesDropdown.getSelectedItem()), 
          Integer.parseInt((String)GoalPaceDropdown.secondsDropdown.getSelectedItem()));
        
        this.p4.setText(total4.substring(0, 1) + ":" + total4.substring(1, 5));
      }
      if (this.p5 != null)
      {
        String total5 = logic.calcShort(this.distanceAmount, this.percentAmount5, 
          Integer.parseInt((String)GoalPaceDropdown.minutesDropdown.getSelectedItem()), 
          Integer.parseInt((String)GoalPaceDropdown.secondsDropdown.getSelectedItem()));
        
        this.p5.setText(total5.substring(0, 1) + ":" + total5.substring(1, 5));
      }
      if (this.p6 != null)
      {
        String total6 = logic.calcShort(this.distanceAmount, this.percentAmount6, 
          Integer.parseInt((String)GoalPaceDropdown.minutesDropdown.getSelectedItem()), 
          Integer.parseInt((String)GoalPaceDropdown.secondsDropdown.getSelectedItem()));
        
        this.p6.setText(total6.substring(0, 1) + ":" + total6.substring(1, 5));
      }
      if (this.p7 != null)
      {
        String total7 = logic.calcShort(this.distanceAmount, this.percentAmount7, 
          Integer.parseInt((String)GoalPaceDropdown.minutesDropdown.getSelectedItem()), 
          Integer.parseInt((String)GoalPaceDropdown.secondsDropdown.getSelectedItem()));
        
        this.p7.setText(total7.substring(0, 1) + ":" + total7.substring(1, 5));
      }
      if (this.p8 != null)
      {
        String total8 = logic.calcShort(this.distanceAmount, this.percentAmount8, 
          Integer.parseInt((String)GoalPaceDropdown.minutesDropdown.getSelectedItem()), 
          Integer.parseInt((String)GoalPaceDropdown.secondsDropdown.getSelectedItem()));
        
        this.p8.setText(total8.substring(0, 1) + ":" + total8.substring(1, 5));
      }
    }
    else
    {
      if (Layout.sCount == 1)
      {
        WelcomeFrame.frame.remove(Layout.s1);
        Layout.sCount -= 1;
      }
      else if (Layout.sCount == 2)
      {
        WelcomeFrame.frame.remove(Layout.s2);
        Layout.sCount -= 1;
      }
      else if (Layout.sCount == 3)
      {
        WelcomeFrame.frame.remove(Layout.s3);
        Layout.sCount -= 1;
      }
      else if (Layout.sCount == 4)
      {
        WelcomeFrame.frame.remove(Layout.s4);
        Layout.sCount -= 1;
      }
      WelcomeFrame.frame.repaint();
      WelcomeFrame.frame.revalidate();
    }
  }
}
