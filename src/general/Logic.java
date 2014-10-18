package general;

public class Logic
{
  public String findSteady(int min, int sec)
  {
    int totalSeconds = 60 * min + sec;
    double vMax = totalSeconds / 0.96D;
    double steady = vMax / 0.7D;
    
    int secondsSteady = (int)steady % 60;
    int minutesSteady = (int)((steady - steady % 60.0D) / 60.0D);
    if ((secondsSteady < 10) && (secondsSteady >= 0)) {
      return String.valueOf(minutesSteady) + "0" + String.valueOf(secondsSteady);
    }
    return String.valueOf(minutesSteady) + String.valueOf(secondsSteady);
  }
  
  public String calcFour(int meters, double percent, int min, int sec)
  {
    int totalSeconds = 60 * min + sec;
    double vMax = totalSeconds / 0.96D;
    double mileAdjustment = 0.9950248756218905D;
    double repPace = vMax * mileAdjustment / (percent / 100.0D);
    double fourPace = 0.25D * repPace;
    
    return String.valueOf(fourPace);
  }
  
  public String calcShort(int meters, double percent, int min, int sec)
  {
    int totalSeconds = 60 * min + sec;
    double vMax = totalSeconds / 0.96D;
    double repPace = vMax / (percent / 100.0D);
    double multiplier = meters / 1600.0D;
    double totalPace = multiplier * repPace;
    
    int secondsTotal = (int)(totalPace % 60.0D);
    double secondsTotalDouble = totalPace % 60.0D;
    String stringOfDouble = String.valueOf(secondsTotalDouble);
    int minutesTotal = (int)((totalPace - totalPace % 60.0D) / 60.0D);
    if ((secondsTotal < 10) && (secondsTotal >= 0)) {
      return String.valueOf(minutesTotal) + "0" + String.valueOf(secondsTotal) + stringOfDouble.substring(1, 3);
    }
    return String.valueOf(minutesTotal) + String.valueOf(secondsTotal) + stringOfDouble.substring(2, 4);
  }
  
  public String calcTotal(int meters, double percent, int min, int sec)
  {
    int totalSeconds = 60 * min + sec;
    double vMax = totalSeconds / 0.96D;
    double mileAdjustment = 0.9950248756218905D;
    double repPace = vMax * mileAdjustment / (percent / 100.0D);
    double multiplier = meters / 1600.0D;
    double totalPace = multiplier * repPace;
    
    int secondsTotal = (int)Math.round(totalPace % 60.0D);
    int minutesTotal = (int)((totalPace - totalPace % 60.0D) / 60.0D);
    if ((secondsTotal < 10) && (secondsTotal >= 0)) {
      return String.valueOf(minutesTotal) + "0" + String.valueOf(secondsTotal);
    }
    return String.valueOf(minutesTotal) + String.valueOf(secondsTotal);
  }
}
