import java.math.BigInteger;

public class Constants {
   public static final String NAME = "Map Editor";
   public static final String EXTERNAL_CACHE = "Unparagoned Development & Community";
   public static final int REVISION = 666;
   public static final String BUILD = "Build: 666";
    public static final int DEV_CONSOLE_COLOR = 0xFF0000;
   public static final int MAX_ITEMS = 22271;
   public static String IP = "127.0.0.1";
   public static final BigInteger RSA_MODULUS = new BigInteger(
      "10174277393471832434077665447090982535320954703538783239145580559762966247116569111567847"
         + Integer.toString(40)
         + "517835377444866069827302045695472885258958003812966518005467381943018534809092697"
         + Integer.toString(104)
         + "16950789793318391141479236233585752002621260634214"
         + Integer.toString(44)
         + "3509400257761714587239713035377860371443291773673266440535957413236472873724491387"
   );
   public static final BigInteger RSA_EXPONENT = new BigInteger(Integer.toString(65) + "537");
   public static final String DBX_TOKEN = "tVp2fngRMBTxTTM2ZBCEpd_HbcrqBiHuIMw19nyXr8mP7n8rPLG4S1LA";
   public static int ZOOM_MODIFIER = 4;
    public static final String[][] REPLACED_LOGINS = new String[][]{{"Invalid login or password.<br><br>For accounts created after the 24th of November 2010, please use your email address to login. Otherwise please login with your username.", ""}, {"Your session has expired. Please click 'Back' in your browser to renew it.", "Database connection error! Please retry in a few minutes..."}, {"Invalid loginserver requested. Please try using a different world.", "Your account has been nulled.<br>Post this bug on the forums to join the game."}, {"This computer's address has been blocked, as it was used to break our rules.", "This is your first time playing so we made you a new forum account!<br><col=FF00C4>Log in again to play Map Editor!</col>"}, {"Service unavailable.", "Username must be between 3-12<br>alphanumerical characters."}};

   // public static boolean isJarFile() {
   //    String className = RSMapperClient.class.getName().replace('.', '/');
   //    String classJar = RSMapperClient.class.getResource("/" + className + ".class").toString();
   //    return classJar.startsWith("jar:");
   // }

   public static void adjustZoom(int notches) {
        while (notches > 0) {
         if (ZOOM_MODIFIER < 11) {
            ++ZOOM_MODIFIER;
         }
            --notches;
      }
        while (notches < 0) {
         if (ZOOM_MODIFIER > 0) {
            --ZOOM_MODIFIER;
         }
            ++notches;
      }
   }
}

