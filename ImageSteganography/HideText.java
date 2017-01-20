public class HideText
{
  public static void main(String[] args)
  {
    if (args.length != 3)
      System.out.println("Usage: java HideText <steg type> <text file> <image file>");
    else {
      int stegType = getNumber(args[0]);
      switch(stegType) {
        case 1:
          System.out.println("Using basic Steganography...");
          Steganography.hide(args[1], args[2]);
          break;
      } // end switch
    }
  }  // end of main()


  private static int getNumber(String str)
  {
    int val = 0;
    try { 
      val = Integer.parseInt(str); 
    } 
    catch (NumberFormatException e)
    { System.out.println("Could not parse number: \"" + str + "\""); }

    return val;
  }  // end of getNumber()


}  // end of HideText class