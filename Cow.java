class Cow
//Hello this is a change ig here
{

           String cowName;

           String cowImage;

 

           // constructor

           public Cow(String name)

           {

                      cowName=name;

           }

 

           public String getName()

           {

                      return cowName;

           }

           public void setImage(String _image)

           {

                      cowImage=_image;

           }

           public String getImage()

           {

                      return cowImage;

           }

}

class HeiferGenerator

{

 

           // constructor

           public HeiferGenerator()

           {

           }

           public static Cow[] getCows()

           {

                      if (cows == null)

                      {

                                  cows = new Cow[cowImages.length];

                                 

                                  for (int index = 0; index < cows.length; index++)

                                  {

                                             cows[index] = new Cow(cowNames[index]);

                                             cows[index].setImage(quoteLines + cowImages[index]);

                                  }

                      }

 

                      return cows;

           }

 

           private static String[] cowNames = { "heifer", "kitteh", "pinguin" };

 

           private static String quoteLines =                   "    \\\n" +

                                                                                                                           "     \\\n" +

                                                                                                                           "      \\\n";

 

           private static String[] cowImages = {  "        ^__^\n" +

                                                                                                     "        (oo)\\_______\n" +

                                                                                                     "        (__)\\       )\\/\\\n" +

                                                                                                     "            ||----w |\n" +

                                                                                                     "            ||     ||\n",

 

 

                                                                                                                           "       (\"`-'  '-/\") .___..--' ' \"`-._\n" +

                                                                                                                           "         ` *_ *  )    `-.   (      ) .`-.__. `)\n" +

                                                                                                                           "         (_Y_.) ' ._   )   `._` ;  `` -. .-'\n" +

                                                                                                                           "      _.. `--'_..-_/   /--' _ .' ,4\n" +

                                                                                                                           "   ( i l ),-''  ( l i),'  ( ( ! .-'\n",

                                                                                                     "this is only a test"

 

 

 

 

                                                                                                                };

 

           private static Cow[] cows = null;

}
