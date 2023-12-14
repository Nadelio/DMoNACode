// Finally awake?
public class DMoNA
{ // Good.
  private String[] archive = {"ANJ","EBF","ARM","PRA","AYM","UNJ","ULJ","UGA","EPS","CTO","OVN","ECD"};//make hashmap

  public DMoNA(String DMoNA)
  { // Almost there
    revitalize(DMoNA);
  }

  public void revitalize(String code)
  { // Should you continue?
    String ANoMD = "";
    // Why not?
    if(Integer.parseInt(code.substring(0,2)) - 5 <= archive.length - 1)
    {
      ANoMD += archive[Integer.parseInt(code.substring(0,2)) - 5];
    }
    // Love
    if(Integer.parseInt(code.substring(7,9)) - 4 <= 31)
    {
      ANoMD += " " + code.substring(7,9);
    }
    // Fear
    ANoMD += ", " + Integer.parseInt(code.substring(14,16));
    // Pain
    System.out.println(ANoMD);
    // Torment
    // Existence
    // Death?
    // God
  }
}
// https://github.com/Nadelio/5-4x1-5-4x1-28-4/blob/main/newGame.java // next place?
