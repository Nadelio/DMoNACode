// Finally awake?
public class DMoNA
{ // Good.
  private String[] archive = {"ANJ","EBF","ARM","PRA","AYM","UNJ","ULJ","UGA","EPS","CTO","OVN","ECD"};//:.com

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
      ANoMD += " " + (Integer.parseInt(code.substring(7,9)) - 4);
    }
    // Fear
    ANoMD += ", " + (Integer.parseInt(code.substring(14,16)) - 4);
    // Pain
    System.out.println(ANoMD);
    // Death(?)
  }
}
// newGame.java // now?
