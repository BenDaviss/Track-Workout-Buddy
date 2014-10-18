package general;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class Print
  implements Printable
{
  public int print(Graphics g, PageFormat pf, int page)
    throws PrinterException
  {
    Paper paper = new Paper();
    paper.setImageableArea(25.0D, 25.0D, 600.0D, 725.0D);
    
    pf.setPaper(paper);
    if (page > 0) {
      return 1;
    }
    Graphics2D g2 = (Graphics2D)g;
    g2.translate(pf.getImageableX(), pf.getImageableY());
    
    WelcomeFrame.frame.printAll(g);
    

    return 0;
  }
  
  public Print()
  {
    PrinterJob job = PrinterJob.getPrinterJob();
    job.setPrintable(this);
    boolean ready = job.printDialog();
    if (ready) {
      try
      {
        job.print();
      }
      catch (PrinterException ex)
      {
        System.out.println(ex);
      }
    }
  }
}
