public class Class200_Sub1 extends Class200 implements Interface9 {
   static int anInt5134;
   static int anInt5135;
   static int anInt5136;
   static int anInt5137;
   static int anInt5138;
   static Class135 aClass135_5139 = new Class135();
   static float aFloat5140;
   static int anInt5141;
   static int anInt5142;
   static int anInt5143;
   private int anInt5144;
   static int anInt5145 = 0;
   static int anInt5146 = 1337;

   static final void method2013(byte b, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
      if (i_6_ == i_5_ && i == i_4_ && i_3_ == i_7_ && i_1_ == i_2_) {
         Animable_Sub3.method921(1048576, i_7_, i_1_, i_6_, i_0_, i);
      } else {
         int i_8_ = i_6_;
         int i_9_ = i;
         int i_10_ = i_6_ * 3;
         int i_11_ = 3 * i;
         int i_12_ = 3 * i_5_;
         int i_13_ = i_4_ * 3;
         int i_14_ = 3 * i_3_;
         int i_15_ = 3 * i_2_;
         int i_16_ = -i_6_ + i_12_ + i_7_ - i_14_;
         int i_17_ = -i + i_1_ + -i_15_ - -i_13_;
         int i_18_ = -i_12_ + i_14_ - i_12_ + i_10_;
         int i_19_ = -i_13_ + i_15_ - (i_13_ + -i_11_);
         int i_20_ = -i_10_ + i_12_;
         int i_21_ = i_13_ + -i_11_;

         for(int i_22_ = 128; ~i_22_ >= -4097; i_22_ += 128) {
            int i_23_ = i_22_ * i_22_ >> 12;
            int i_24_ = i_23_ * i_22_ >> 12;
            int i_25_ = i_16_ * i_24_;
            int i_26_ = i_17_ * i_24_;
            int i_27_ = i_23_ * i_18_;
            int i_28_ = i_19_ * i_23_;
            int i_29_ = i_22_ * i_20_;
            int i_30_ = i_21_ * i_22_;
            int i_31_ = (i_27_ + i_25_ + i_29_ >> 12) + i_6_;
            int i_32_ = i - -(i_28_ + i_26_ + i_30_ >> 12);
            Animable_Sub3.method921(1048576, i_31_, i_32_, i_8_, i_0_, i_9_);
            i_8_ = i_31_;
            i_9_ = i_32_;
         }
      }

      ++anInt5142;
      if (b >= -111) {
         aClass135_5139 = null;
      }
   }

   static final int method2014(int i) {
      ++anInt5136;
      return i >>> 8;
   }

   @Override
   public final int method21(int i) {
      ++anInt5137;
      return i != 23144 ? -9 : this.anInt5144;
   }

   static final boolean method2015(int i, int i_34_, int i_35_, Class84 class84, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
      ++anInt5141;
      int i_43_ = i_36_;
      int i_44_ = i_38_;
      int i_45_ = 64;
      int i_46_ = 64;
      int i_47_ = i_36_ + -i_45_;
      Node_Sub36_Sub2.anIntArrayArray10047[i_45_][i_46_] = 99;
      if (i_37_ != 11564) {
         aClass135_5139 = null;
      }

      int i_48_ = i_38_ - i_46_;
      Class262_Sub23.anIntArrayArray7892[i_45_][i_46_] = 0;
      int i_49_ = 0;
      int i_50_ = 0;
      Node_Sub39.routeFinderXArray[i_49_] = i_36_;
      Class339_Sub6.routeFinderYArray[i_49_++] = i_38_;
      int[][] is = class84.clipMasks;

      while(i_50_ != i_49_) {
         i_44_ = Class339_Sub6.routeFinderYArray[i_50_];
         i_43_ = Node_Sub39.routeFinderXArray[i_50_];
         int i_51_ = i_44_ + -class84.anInt1135;
         int i_52_ = i_43_ + -class84.anInt1139;
         i_50_ = i_50_ - -1 & 4095;
         i_46_ = i_44_ - i_48_;
         i_45_ = -i_47_ + i_43_;
         if (~i_35_ != 3) {
            if (i_35_ != -3) {
               if (i_35_ != -2) {
                  if (~i_35_ != 0) {
                     if (~i_35_ != -1 && ~i_35_ != -2 && ~i_35_ != -3 && ~i_35_ != -4 && i_35_ != 9) {
                        if (class84.method982(i_43_, 25451, i_35_, i_39_, i_40_, i_41_, i_44_, 1)) {
                           Class219.anInt2623 = i_44_;
                           Class315.anInt4033 = i_43_;
                           return true;
                        }
                     } else if (class84.method989(1, i_35_, i_40_, i_44_, i_43_, i_39_, i_41_, i_37_ ^ 2894894)) {
                        Class315.anInt4033 = i_43_;
                        Class219.anInt2623 = i_44_;
                        return true;
                     }
                  } else if (class84.method988(i_40_, i_37_ + -19298, i_42_, i_39_, i_43_, 1, i_34_, i, i_44_)) {
                     Class219.anInt2623 = i_44_;
                     Class315.anInt4033 = i_43_;
                     return true;
                  }
               } else if (class84.method984(1, i_40_, (byte)-98, 1, i_43_, i_39_, i_42_, i_34_, i_44_, i)) {
                  Class219.anInt2623 = i_44_;
                  Class315.anInt4033 = i_43_;
                  return true;
               }
            } else if (Class150_Sub2.method1659(i_39_, 1, i_43_, -40, i, i_34_, i_44_, i_40_, 1)) {
               Class315.anInt4033 = i_43_;
               Class219.anInt2623 = i_44_;
               return true;
            }
         } else if (~i_39_ == ~i_43_ && i_44_ == i_40_) {
            Class315.anInt4033 = i_43_;
            Class219.anInt2623 = i_44_;
            return true;
         }

         int i_53_ = Class262_Sub23.anIntArrayArray7892[i_45_][i_46_] + 1;
         if (~i_45_ < -1 && Node_Sub36_Sub2.anIntArrayArray10047[i_45_ - 1][i_46_] == 0 && ~(is[i_52_ + -1][i_51_] & 1109655552) == -1) {
            Node_Sub39.routeFinderXArray[i_49_] = -1 + i_43_;
            Class339_Sub6.routeFinderYArray[i_49_] = i_44_;
            i_49_ = i_49_ - -1 & 4095;
            Node_Sub36_Sub2.anIntArrayArray10047[i_45_ + -1][i_46_] = 2;
            Class262_Sub23.anIntArrayArray7892[i_45_ - 1][i_46_] = i_53_;
         }

         if (~i_45_ > -128 && Node_Sub36_Sub2.anIntArrayArray10047[i_45_ - -1][i_46_] == 0 && ~(is[i_52_ - -1][i_51_] & 1612972032) == -1) {
            Node_Sub39.routeFinderXArray[i_49_] = 1 + i_43_;
            Class339_Sub6.routeFinderYArray[i_49_] = i_44_;
            i_49_ = 4095 & 1 + i_49_;
            Node_Sub36_Sub2.anIntArrayArray10047[i_45_ - -1][i_46_] = 8;
            Class262_Sub23.anIntArrayArray7892[1 + i_45_][i_46_] = i_53_;
         }

         if (~i_46_ < -1 && ~Node_Sub36_Sub2.anIntArrayArray10047[i_45_][-1 + i_46_] == -1 && (is[i_52_][i_51_ - 1] & 1084489728) == 0) {
            Node_Sub39.routeFinderXArray[i_49_] = i_43_;
            Class339_Sub6.routeFinderYArray[i_49_] = i_44_ + -1;
            i_49_ = 4095 & i_49_ - -1;
            Node_Sub36_Sub2.anIntArrayArray10047[i_45_][-1 + i_46_] = 1;
            Class262_Sub23.anIntArrayArray7892[i_45_][i_46_ + -1] = i_53_;
         }

         if (~i_46_ > -128 && Node_Sub36_Sub2.anIntArrayArray10047[i_45_][i_46_ + 1] == 0 && ~(is[i_52_][i_51_ - -1] & 1210318848) == -1) {
            Node_Sub39.routeFinderXArray[i_49_] = i_43_;
            Class339_Sub6.routeFinderYArray[i_49_] = i_44_ - -1;
            Node_Sub36_Sub2.anIntArrayArray10047[i_45_][1 + i_46_] = 4;
            i_49_ = i_49_ - -1 & 4095;
            Class262_Sub23.anIntArrayArray7892[i_45_][i_46_ - -1] = i_53_;
         }

         if (i_45_ > 0
            && ~i_46_ < -1
            && Node_Sub36_Sub2.anIntArrayArray10047[-1 + i_45_][i_46_ + -1] == 0
            && ~(is[-1 + i_52_][i_51_ + -1] & 1134821376) == -1
            && ~(1109655552 & is[i_52_ + -1][i_51_]) == -1
            && (is[i_52_][-1 + i_51_] & 1084489728) == 0) {
            Node_Sub39.routeFinderXArray[i_49_] = i_43_ - 1;
            Class339_Sub6.routeFinderYArray[i_49_] = i_44_ - 1;
            Node_Sub36_Sub2.anIntArrayArray10047[-1 + i_45_][i_46_ + -1] = 3;
            i_49_ = i_49_ - -1 & 4095;
            Class262_Sub23.anIntArrayArray7892[-1 + i_45_][i_46_ - 1] = i_53_;
         }

         if (~i_45_ > -128
            && i_46_ > 0
            && Node_Sub36_Sub2.anIntArrayArray10047[i_45_ + 1][-1 + i_46_] == 0
            && (is[i_52_ - -1][i_51_ - 1] & 1625554944) == 0
            && (is[1 + i_52_][i_51_] & 1612972032) == 0
            && ~(is[i_52_][-1 + i_51_] & 1084489728) == -1) {
            Node_Sub39.routeFinderXArray[i_49_] = i_43_ - -1;
            Class339_Sub6.routeFinderYArray[i_49_] = -1 + i_44_;
            Node_Sub36_Sub2.anIntArrayArray10047[1 + i_45_][i_46_ - 1] = 9;
            i_49_ = 4095 & i_49_ - -1;
            Class262_Sub23.anIntArrayArray7892[1 + i_45_][-1 + i_46_] = i_53_;
         }

         if (~i_45_ < -1
            && ~i_46_ > -128
            && ~Node_Sub36_Sub2.anIntArrayArray10047[-1 + i_45_][1 + i_46_] == -1
            && (1310982144 & is[-1 + i_52_][1 + i_51_]) == 0
            && ~(is[-1 + i_52_][i_51_] & 1109655552) == -1
            && ~(is[i_52_][i_51_ + 1] & 1210318848) == -1) {
            Node_Sub39.routeFinderXArray[i_49_] = -1 + i_43_;
            Class339_Sub6.routeFinderYArray[i_49_] = i_44_ + 1;
            Node_Sub36_Sub2.anIntArrayArray10047[-1 + i_45_][1 + i_46_] = 6;
            i_49_ = 4095 & i_49_ + 1;
            Class262_Sub23.anIntArrayArray7892[i_45_ - 1][1 + i_46_] = i_53_;
         }

         if (i_45_ < 127
            && ~i_46_ > -128
            && ~Node_Sub36_Sub2.anIntArrayArray10047[1 + i_45_][i_46_ - -1] == -1
            && (is[1 + i_52_][i_51_ - -1] & 2015625216) == 0
            && ~(1612972032 & is[i_52_ + 1][i_51_]) == -1
            && ~(1210318848 & is[i_52_][i_51_ + 1]) == -1) {
            Node_Sub39.routeFinderXArray[i_49_] = 1 + i_43_;
            Class339_Sub6.routeFinderYArray[i_49_] = i_44_ + 1;
            Node_Sub36_Sub2.anIntArrayArray10047[i_45_ + 1][i_46_ + 1] = 12;
            i_49_ = i_49_ + 1 & 4095;
            Class262_Sub23.anIntArrayArray7892[1 + i_45_][1 + i_46_] = i_53_;
         }
      }

      Class219.anInt2623 = i_44_;
      Class315.anInt4033 = i_43_;
      return false;
   }

   @Override
   public final long method23(int i) {
      if (i != 28552) {
         anInt5145 = -8;
      }

      ++anInt5143;
      return this.aBuffer2440.getAddress();
   }

   Class200_Sub1(GLToolkit gltoolkit, int i, byte[] bs, int i_54_) {
      super(gltoolkit, bs, i_54_);
      this.anInt5144 = i;
   }

   @Override
   public final int method24(int i) {
      if (i != 29121) {
         method2015(116, 53, 94, null, 85, -76, -28, 74, 91, 33, 61);
      }

      ++anInt5138;
      return 0;
   }

   public static void method2016(int i) {
      int i_55_ = -35 % ((i - -73) / 44);
      aClass135_5139 = null;
   }

   @Override
   public final void method22(byte[] bs, int i, int i_56_, byte b) {
      this.method2012(bs, i);
      if (b == 74) {
         ++anInt5134;
         this.anInt5144 = i_56_;
      }
   }

   Class200_Sub1(GLToolkit gltoolkit, int i, jaclib.memory.Buffer buffer) {
      super(gltoolkit, buffer);
      this.anInt5144 = i;
   }

   static final int method2017(int i, Index class302) {
      ++anInt5135;
      int i_57_ = i;
      if (class302.method3510(Class89.anInt1197, (byte)63)) {
         i_57_ = i + 1;
      }

      if (class302.method3510(Node_Sub38_Sub20.anInt10313, (byte)63)) {
         ++i_57_;
      }

      if (class302.method3510(Class41.anInt626, (byte)63)) {
         ++i_57_;
      }

      if (class302.method3510(Class162.anInt2004, (byte)63)) {
         ++i_57_;
      }

      if (class302.method3510(Class347.anInt4281, (byte)63)) {
         ++i_57_;
      }

      if (class302.method3510(Node_Sub9_Sub5.anInt9767, (byte)63)) {
         ++i_57_;
      }

      if (class302.method3510(Class169_Sub1.anInt8787, (byte)63)) {
         ++i_57_;
      }

      if (class302.method3510(Node_Sub21.anInt7186, (byte)63)) {
         ++i_57_;
      }

      if (class302.method3510(OutgoingPacket.anInt4045, (byte)63)) {
         ++i_57_;
      }

      if (class302.method3510(Class163.anInt2019, (byte)63)) {
         ++i_57_;
      }

      if (class302.method3510(OverlayDefinition.anInt3645, (byte)63)) {
         ++i_57_;
      }

      if (class302.method3510(Class320_Sub3.anInt8225, (byte)63)) {
         ++i_57_;
      }

      if (class302.method3510(Node_Sub38_Sub32.anInt10436, (byte)63)) {
         ++i_57_;
      }

      if (class302.method3510(Class153.anInt1943, (byte)63)) {
         ++i_57_;
      }

      if (class302.method3510(CacheNode_Sub18.anInt9603, (byte)63)) {
         ++i_57_;
      }

      return i_57_;
   }
}