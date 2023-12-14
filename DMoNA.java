// Finally awake?
public class DMoNA
{ // Good.
  private String[] archive = {"ANJ","EBF","ARM","PRA","AYM","UNJ","ULJ","UGA","EPS","CTO","OVN","ECD"};//make hashmap

  public DMoNA(String DMoNA)
  { // Almost there
    revitalize(DMoNA);
  }

  public void revitalize(String DMoNA)
  { // Should you continue?
    String ANoMD = "";
    // Why not?
    if(DMoNA.substring(0,2)./*to int*/ - 5 <= archive.length - 1)
    {
      ANoMD += archive[DMoNA.substring(0,2)./*to int*/ - 5];
    }
    // Love
    if(DMoNA.substring(7,9)./*to int*/ - 4 <= 31)
    {
      ANoMD += " " + DMoNA.substring(7,9);
    }
    // Fear
    ANoMD += ", " + DMoNA.substring(14,16)./* to int*/;
    // Pain
    System.out.println(ANoMD);
    // Torment
    // Existence
    // Death?
    // God
  }
}
