import javax.swing.SwingUtilities;

public class Class235_Sub1 extends Class235 {
   static boolean aBoolean8975 = false;
   protected int anInt8976;
   static int anInt8977;
   static Interface16[] anInterface16Array8978;
   static OutgoingPacket aClass318_8979 = new OutgoingPacket(79, -1);
   static int anInt8980;
   static int anInt8981;

   static final void method2158(byte b, String string) {
      System.err.println("ERRUH CALLED");
      RSMapperClient.ERRORED_OUT = true;
      ++anInt8980;
      int i = -118 / ((-30 - b) / 46);
      final String err = IComponentDefinitions.method4147(string, false, "%0a", "\n");
      SwingUtilities.invokeLater(
         new Runnable() {
            @Override
            public void run() {
               String errStr = err.replaceAll("Map", "ABC")
                  .replaceAll("Object", "GHI")
                  .replaceAll("Editor", "DEF")
                  .replaceAll("Spawn", "JKL")
                  .replaceAll("Panel", "MNO")
                  .replaceAll("Client", "PQR")
                  .replaceAll("Script", "STU")
                  .replaceAll("Value", "VWX")
                  .replaceAll("Tool", "YZA")
                  .replaceAll("get", "(981)")
                  .replaceAll("set", "(762)")
                  .replaceAll("Tile", "(108)")
                  .replaceAll("From", "(426)")
                  .replaceAll("Hover", "(83)")
                  .replaceAll("handle", "(9)")
                  .replaceAll("Class", "-")
                  .replaceAll("method", "+")
                  .replaceAll("Node", "Ent")
                  .replaceAll("Sub", "=")
                  .replaceAll("Shape", "NONE");
               new ErrorMessage(errStr);
            }
         }
      );
   }

   public static void method2159(int i) {
      aClass318_8979 = null;
      System.err.println("~~~ ERR");
      if (i != 79) {
         method2158((byte)102, null);
      }

      anInterface16Array8978 = null;
   }

   @Override
   public final Class170 method20(int i) {
      if (i <= 81) {
         anInterface16Array8978 = null;
      }

      ++anInt8981;
      return Class350.aClass170_5391;
   }

   Class235_Sub1(int i, Class379 class379, Class77 class77, int i_0_, int i_1_, int i_2_) {
      super(i, class379, class77, i_0_, i_1_);
      this.anInt8976 = i_2_;
   }
}
