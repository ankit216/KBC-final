package Ankit;

import java.io.IOException;

/**
 * Created by JSBot on 23-Sep-17.
 */
public class MainAnkit {

public static void main (String [] args) throws IOException, InterruptedException {
   /* AnkitPrg ap = new AnkitPrg();
    ap.game();
*/
   GameXls gx = new GameXls();
    try {
        gx.read();
    } catch (IOException e) {
        e.printStackTrace();
    }
   /* FastessFingurFirst fff = new FastessFingurFirst();
    fff.fastess();*/
    //StopWacth sw = new StopWacth();
    //sw.stopWatch();
}
}
