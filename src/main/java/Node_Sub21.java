public class Node_Sub21 extends Node {
   protected int anInt7181;
   static int anInt7182;
   static Class96 aClass96_7183 = null;
   static int baseY;
   static Class243 aClass243_7185 = new Class243();
   static int anInt7186;
   protected int anInt7187;

   public static void method2617(int i) {
      aClass243_7185 = null;
      int i_0_ = 75 % ((i - -6) / 55);
      aClass96_7183 = null;
   }

   static final void method2618(boolean bool, int i) {
      ++anInt7182;
      if (Node_Sub10.stringInConsole.length() != 0) {
         Node_Sub7.writeToConsole((byte)43, "--> " + Node_Sub10.stringInConsole);
         Class126.processClientCommand(120, false, bool, Node_Sub10.stringInConsole);
         Class332.anInt4145 = i;
         if (!bool) {
            Class315.anInt4034 = 0;
            Node_Sub10.stringInConsole = "";
         }
      }
   }

   Node_Sub21(int i, int i_1_) {
      this.anInt7187 = i;
      this.anInt7181 = i_1_;
   }
}
