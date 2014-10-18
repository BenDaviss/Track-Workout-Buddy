package general;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Run
{
  public static void main(String[] args)
  {
    new WelcomeFrame();
    try
    {
      UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (InstantiationException e)
    {
      e.printStackTrace();
    }
    catch (IllegalAccessException e)
    {
      e.printStackTrace();
    }
    catch (UnsupportedLookAndFeelException e)
    {
      e.printStackTrace();
    }
  }
}
