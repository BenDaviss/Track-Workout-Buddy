package general;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout
  extends JFrame
  implements ActionListener
{
  private static final long serialVersionUID = 1L;
  JButton addComment;
  JButton addDPanel;
  JButton addRep;
  JButton addShortRep;
  JButton calcAll;
  public static int dCount = 0;
  public static int cCount = 0;
  public static int rCount = 0;
  public static int sCount = 0;
  JPanel goalPanel;
  public static DistanceRunPanel d1;
  public static DistanceRunPanel d2;
  public static CommentPanel c1;
  public static CommentPanel c2;
  public static CommentPanel c3;
  public static CommentPanel c4;
  public static CommentPanel c5;
  public static RepPanel r1;
  public static RepPanel r2;
  public static RepPanel r3;
  public static RepPanel r4;
  public static RepPanel r5;
  public static RepPanel r6;
  public static RepPanel r7;
  public static RepPanel r8;
  public static RepPanel r9;
  public static RepPanel r10;
  public static RepPanel r11;
  public static RepPanel r12;
  public static RepPanel r13;
  public static RepPanel r14;
  public static RepPanel r15;
  public static RepPanel r16;
  public static ShortRep s1;
  public static ShortRep s2;
  public static ShortRep s3;
  public static ShortRep s4;
  
  public Layout()
  {
    this.goalPanel = new JPanel();
    
    Menu menu = new Menu();
    
    this.addDPanel = new JButton("+ Distance Run");
    this.addDPanel.setActionCommand("Distance Run");
    this.addDPanel.addActionListener(this);
    
    this.addComment = new JButton("+ Comment");
    this.addComment.setActionCommand("Comment");
    this.addComment.addActionListener(this);
    
    this.addRep = new JButton("+ Rep");
    this.addRep.setActionCommand("Rep");
    this.addRep.addActionListener(this);
    
    this.addShortRep = new JButton("+ Short Rep");
    this.addShortRep.setActionCommand("Short Rep");
    this.addShortRep.addActionListener(this);
    
    this.calcAll = new JButton("Calculate All");
    this.calcAll.setFont(new Font("DIALOG", 3, 12));
    this.calcAll.setActionCommand("Calc All");
    this.calcAll.addActionListener(this);
    
    menu.add(this.addComment);
    menu.add(this.addDPanel);
    menu.add(this.addRep);
    menu.add(this.addShortRep);
    menu.add(this.calcAll);
    
    setTitle("T.W. Buddy Beta");
    setVisible(true);
    setSize(800, 725);
    getContentPane().setBackground(Color.WHITE);
    setResizable(false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(3);
    setJMenuBar(menu);
    setLayout(new BoxLayout(getContentPane(), 1));
    

    @SuppressWarnings("unused")
	GoalPaceDropdown gpd = new GoalPaceDropdown();
    
    this.goalPanel.setBackground(Color.WHITE);
    this.goalPanel.setLocation(0, 0);
    this.goalPanel.add(GoalPaceDropdown.goalPace);
    this.goalPanel.add(GoalPaceDropdown.minutesDropdown);
    this.goalPanel.add(GoalPaceDropdown.secondsDropdown);
    
    add(this.goalPanel);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    String command = e.getActionCommand();
    if (command.equals("Distance Run"))
    {
      if (dCount == 0)
      {
        d1 = new DistanceRunPanel();
        add(d1);
        dCount += 1;
      }
      else if (dCount == 1)
      {
        d2 = new DistanceRunPanel();
        add(d2);
        dCount += 1;
      }
      revalidate();
      repaint();
    }
    else if (command.equals("Comment"))
    {
      if (cCount == 0)
      {
        c1 = new CommentPanel();
        add(c1);
        cCount += 1;
      }
      else if (cCount == 1)
      {
        c2 = new CommentPanel();
        add(c2);
        cCount += 1;
      }
      else if (cCount == 2)
      {
        c3 = new CommentPanel();
        add(c3);
        cCount += 1;
      }
      else if (cCount == 3)
      {
        c4 = new CommentPanel();
        add(c4);
        cCount += 1;
      }
      else if (cCount == 4)
      {
        c5 = new CommentPanel();
        add(c5);
        cCount += 1;
      }
      revalidate();
      repaint();
    }
    else if (command.equals("Rep"))
    {
      if (rCount == 0)
      {
        r1 = new RepPanel();
        add(r1);
        rCount += 1;
      }
      else if (rCount == 1)
      {
        r2 = new RepPanel();
        add(r2);
        rCount += 1;
      }
      else if (rCount == 2)
      {
        r3 = new RepPanel();
        add(r3);
        rCount += 1;
      }
      else if (rCount == 3)
      {
        r4 = new RepPanel();
        add(r4);
        rCount += 1;
      }
      else if (rCount == 4)
      {
        r5 = new RepPanel();
        add(r5);
        rCount += 1;
      }
      else if (rCount == 5)
      {
        r6 = new RepPanel();
        add(r6);
        rCount += 1;
      }
      else if (rCount == 6)
      {
        r7 = new RepPanel();
        add(r7);
        rCount += 1;
      }
      else if (rCount == 7)
      {
        r8 = new RepPanel();
        add(r8);
        rCount += 1;
      }
      else if (rCount == 8)
      {
        r9 = new RepPanel();
        add(r9);
        rCount += 1;
      }
      else if (rCount == 9)
      {
        r10 = new RepPanel();
        add(r10);
        rCount += 1;
      }
      else if (rCount == 10)
      {
        r11 = new RepPanel();
        add(r11);
        rCount += 1;
      }
      else if (rCount == 11)
      {
        r12 = new RepPanel();
        add(r12);
        rCount += 1;
      }
      else if (rCount == 12)
      {
        r13 = new RepPanel();
        add(r13);
        rCount += 1;
      }
      else if (rCount == 13)
      {
        r14 = new RepPanel();
        add(r14);
        rCount += 1;
      }
      else if (rCount == 14)
      {
        r15 = new RepPanel();
        add(r15);
        rCount += 1;
      }
      else if (rCount == 15)
      {
        r16 = new RepPanel();
        add(r16);
        rCount += 1;
      }
      revalidate();
      repaint();
    }
    else if (command.equals("Short Rep"))
    {
      if (sCount == 0)
      {
        s1 = new ShortRep();
        add(s1);
        sCount += 1;
      }
      else if (sCount == 1)
      {
        s2 = new ShortRep();
        add(s2);
        sCount += 1;
      }
      else if (sCount == 2)
      {
        s3 = new ShortRep();
        add(s3);
        sCount += 1;
      }
      else if (sCount == 3)
      {
        s4 = new ShortRep();
        add(s4);
        sCount += 1;
      }
      revalidate();
      repaint();
    }
    else
    {
      if (r1 != null) {
        r1.calculate.doClick();
      }
      if (r2 != null) {
        r2.calculate.doClick();
      }
      if (r3 != null) {
        r3.calculate.doClick();
      }
      if (r4 != null) {
        r4.calculate.doClick();
      }
      if (r5 != null) {
        r5.calculate.doClick();
      }
      if (r6 != null) {
        r6.calculate.doClick();
      }
      if (r7 != null) {
        r7.calculate.doClick();
      }
      if (r8 != null) {
        r8.calculate.doClick();
      }
      if (r9 != null) {
        r9.calculate.doClick();
      }
      if (r10 != null) {
        r10.calculate.doClick();
      }
      if (r11 != null) {
        r11.calculate.doClick();
      }
      if (r12 != null) {
        r12.calculate.doClick();
      }
      if (r13 != null) {
        r13.calculate.doClick();
      }
      if (r14 != null) {
        r14.calculate.doClick();
      }
      if (r15 != null) {
        r15.calculate.doClick();
      }
      if (r16 != null) {
        r16.calculate.doClick();
      }
      if (s1 != null) {
        s1.calculate.doClick();
      }
      if (s2 != null) {
        s2.calculate.doClick();
      }
      if (s3 != null) {
        s3.calculate.doClick();
      }
      if (s4 != null) {
        s4.calculate.doClick();
      }
      if (d1 != null) {
        d1.calculate.doClick();
      }
      if (d2 != null) {
        d2.calculate.doClick();
      }
    }
  }
}
