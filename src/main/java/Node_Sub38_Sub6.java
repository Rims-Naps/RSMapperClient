public class Node_Sub38_Sub6 extends Node_Sub38 {
   static int anInt10132 = 0;
   static int anInt10133;
   private int anInt10134 = 0;
   static OutgoingPacket aClass318_10135 = new OutgoingPacket(8, -1);
   static int anInt10136;
   private int anInt10137 = 4096;
   static Index aClass302_10138;
   static int anInt10139;

   @Override
   final int[] method2775(int i, int i_0_) {
      ++anInt10136;
      int[] is = this.aClass146_7460.method1645(27356, i_0_);
      if (this.aClass146_7460.aBoolean1819) {
         int[] is_1_ = this.method2786(i_0_, 0, 0);

         for(int i_2_ = 0; ~Class339_Sub7.anInt8728 < ~i_2_; ++i_2_) {
            int i_3_ = is_1_[i_2_];
            is[i_2_] = ~this.anInt10134 >= ~i_3_ && ~this.anInt10137 <= ~i_3_ ? 4096 : 0;
         }
      }

      return i < 107 ? null : is;
   }

   @Override
   final void method2780(boolean bool, Buffer buffer, int i) {
      if (~i != -1) {
         if (~i == -2) {
            this.anInt10137 = buffer.readUnsignedShort();
         }
      } else {
         this.anInt10134 = buffer.readUnsignedShort();
      }

      if (!bool) {
         ++anInt10133;
      }
   }

   public Node_Sub38_Sub6() {
      super(1, true);
   }

   public static void method2804(byte b) {
      aClass302_10138 = null;
      aClass318_10135 = null;
      if (b != 100) {
         aClass302_10138 = null;
      }
   }
}