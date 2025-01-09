public class Car
{
  private String make;
  private String model;
  private int year;
  private double mpg;

  public Car()
  {
    make = "none";
    model = "none";
    year = 2000;
    mpg = 0;
  }
   public Car(String make, String model, int year, double mpg)
   {
    this.make = make;
    this.year = year;

    if (this.year > 2022)
    {
        this.year = 2022;
    }
    if(this.year < 1885)
    {
        this.year = 2000;
    }
    
    this.mpg = mpg;
    if(this.mpg < 0)
    {
        this.mpg = 0;
    }
   }
   public static CalculateID
}
