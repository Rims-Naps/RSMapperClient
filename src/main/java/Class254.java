public class Class254 {
   static int anInt3206;
   static int anInt3207;
   protected int anInt3208 = 1;
   static int anInt3209;
   protected char aChar3210;
   static int anInt3211;
   static int anInt3212;
   static float[] aFloatArray3213 = new float[4];

   private final void method3107(int i, Buffer buffer, byte b) {
      if (b <= 105) {
         this.method3109((byte)37, null);
      }

      ++anInt3207;
      if (~i == -2) {
         this.aChar3210 = Class20_Sub1.method294(buffer.readByte(), (byte)121);
      } else if (~i == -3) {
         this.anInt3208 = 0;
      }
   }

   static final void method3108(int i, int i_0_) {
      Node_Sub43.anInt7539 = i;
      if (i_0_ != 4) {
         method3108(32, 71);
      }

      ++anInt3206;
   }

   final void method3109(byte b, Buffer buffer) {
      int i = 25 % ((-19 - b) / 33);

      while(true) {
         int i_1_ = buffer.readUnsignedByte();
         if (i_1_ == 0) {
            ++anInt3211;
            return;
         }

         this.method3107(i_1_, buffer, (byte)119);
      }
   }

   public static void method3110(int i) {
      if (i != 19701) {
         method3110(112);
      }

      aFloatArray3213 = null;
   }
}