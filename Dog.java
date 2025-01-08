public class Dog
{
  private String name;
  private int ID;
  private static int numDogs = 0;

  public void setName(String iName)
  {
    name = iName;
  }

  public String getName()
  {
    return name;
  }

  public void setID(int ID)
  {
    this.ID = ID;
  }
}
