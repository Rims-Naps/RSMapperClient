public class Node_Sub38_Sub35 extends Node_Sub38 {
   static int anInt10448;
   static int anInt10449;
   private int anInt10450;
   static int anInt10451;
   static Class312 aClass312_10452 = new Class312();
   private int anInt10453 = 0;
   static int anInt10454;
   static d aD10455;

   @Override
   final int[] method2775(int i, int i_0_) {
      ++anInt10451;
      int[] is = this.aClass146_7460.method1645(27356, i_0_);
      if (this.aClass146_7460.aBoolean1819) {
         int[] is_1_ = this.method2786(i_0_, 0, 0);

         for(int i_2_ = 0; i_2_ < Class339_Sub7.anInt8728; ++i_2_) {
            int i_3_ = is_1_[i_2_];
            if (~i_3_ > ~this.anInt10453) {
               is[i_2_] = this.anInt10453;
            } else if (~this.anInt10450 > ~i_3_) {
               is[i_2_] = this.anInt10450;
            } else {
               is[i_2_] = i_3_;
            }
         }
      }

      if (i < 107) {
         aD10455 = null;
      }

      return is;
   }

   public static void method2903(byte b) {
      aD10455 = null;
      aClass312_10452 = null;
      if (b >= -58) {
         method2903((byte)105);
      }
   }

   public Node_Sub38_Sub35() {
      super(1, false);
      this.anInt10450 = 4096;
   }

   @Override
   final void method2780(boolean bool, Buffer buffer, int i) {
      ++anInt10449;
      if (i != 0) {
         if (~i != -2) {
            if (i == 2) {
               this.aBoolean7463 = buffer.readUnsignedByte() == 1;
            }
         } else {
            this.anInt10450 = buffer.readUnsignedShort();
         }
      } else {
         this.anInt10453 = buffer.readUnsignedShort();
      }

      if (bool) {
         this.method2778(0, true);
      }
   }

   @Override
   final int[][] method2778(int i, boolean bool) {
      if (!bool) {
         this.method2778(6, true);
      }

      ++anInt10448;
      int[][] is = this.aClass348_7454.method3981(i, 3168);
      if (this.aClass348_7454.aBoolean4300) {
         int[][] is_5_ = this.method2777(-110, 0, i);
         int[] is_6_ = is_5_[0];
         int[] is_7_ = is_5_[1];
         int[] is_8_ = is_5_[2];
         int[] is_9_ = is[0];
         int[] is_10_ = is[1];
         int[] is_11_ = is[2];

         for(int i_12_ = 0; i_12_ < Class339_Sub7.anInt8728; ++i_12_) {
            int i_13_ = is_6_[i_12_];
            int i_14_ = is_7_[i_12_];
            int i_15_ = is_8_[i_12_];
            if (~this.anInt10453 >= ~i_13_) {
               if (this.anInt10450 >= i_13_) {
                  is_9_[i_12_] = i_13_;
               } else {
                  is_9_[i_12_] = this.anInt10450;
               }
            } else {
               is_9_[i_12_] = this.anInt10453;
            }

            if (~this.anInt10453 < ~i_14_) {
               is_10_[i_12_] = this.anInt10453;
            } else if (~i_14_ < ~this.anInt10450) {
               is_10_[i_12_] = this.anInt10450;
            } else {
               is_10_[i_12_] = i_14_;
            }

            if (this.anInt10453 <= i_15_) {
               if (~this.anInt10450 <= ~i_15_) {
                  is_11_[i_12_] = i_15_;
               } else {
                  is_11_[i_12_] = this.anInt10450;
               }
            } else {
               is_11_[i_12_] = this.anInt10453;
            }
         }
      }

      return is;
   }
}
