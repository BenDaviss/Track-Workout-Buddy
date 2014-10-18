package general;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class GoalPaceDropdown
{
  public static JComboBox<String> minutesDropdown;
  public static JComboBox<String> secondsDropdown;
  public static JLabel goalPace;
  
  public GoalPaceDropdown()
  {
    goalPace = new JLabel("Goal Pace:");
    goalPace.setFont(new Font("TIMES NEW ROMAN", 0, 24));
    
    minutesDropdown = new JComboBox<String>();
    minutesDropdown.setPreferredSize(new Dimension(70, 40));
    minutesDropdown.setFont(new Font("TIMES NEW ROMAN", 1, 30));
    
    secondsDropdown = new JComboBox<String>();
    secondsDropdown.setMaximumRowCount(10);
    secondsDropdown.setPreferredSize(new Dimension(70, 40));
    secondsDropdown.setFont(new Font("TIMES NEW ROMAN", 1, 30));
    for (int i = 3; i < 10; i++) {
      minutesDropdown.addItem(String.valueOf(i));
    }
    for (int i = 0; i < 60; i++) {
      secondsDropdown.addItem(String.format("%02d", new Object[] { Integer.valueOf(i) }));
    }
    minutesDropdown.setSelectedIndex(2);
    secondsDropdown.setSelectedIndex(0);
  }
}