public class RevealText
{
  public static void main(String[] args)
  {
    if (args.length != 2)
      System.out.println("Usage: java RevealText <steg type> <image file>");
    else {
      int stegType = getNumber(args[0]);
      switch(stegType) {
        case 1:
          System.out.println("Using basic Steganography...");
          Steganography.reveal(args[1]);
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


}  // end of RevealText class