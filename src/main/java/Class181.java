public class Class181 {
   static IncommingPacket aClass192_2144 = new IncommingPacket(92, 4);
   static int anInt2145 = -50;
   private Class61 aClass61_2146 = new Class61(64);
   static int anInt2147;
   static int anInt2148;
   static int anInt2149;
   static int anInt2150 = 0;
   static int anInt2151;
   static int anInt2152;
   private Index index2;
   static int anInt2154;
   static Class197 aClass197_2155;
   protected Index aClass302_2156;
   static long aLong2157 = 0L;
   static Index index1;
   static int anInt2159;

   final void method1824(int i) {
      ++anInt2151;
      synchronized(this.aClass61_2146) {
         this.aClass61_2146.method602((byte)-122);
      }

      if (i != 64) {
         this.aClass302_2156 = null;
      }
   }

   final Class264 method1825(int i, byte b) {
      ++anInt2148;
      Class264 class264;
      synchronized(this.aClass61_2146) {
         if (b <= 96) {
            this.method1825(125, (byte)50);
         }

         class264 = (Class264)this.aClass61_2146.method607((long)i, 0);
      }

      if (class264 != null) {
         return class264;
      } else {
         byte[] bs;
         synchronized(this.index2) {
            bs = this.index2.getFile(false, i, 3);
         }

         class264 = new Class264();
         class264.aClass181_3360 = this;
         if (bs != null) {
            class264.method3226(new Buffer(bs), (byte)-24);
         }

         synchronized(this.aClass61_2146) {
            this.aClass61_2146.method601(class264, 25566, (long)i);
            return class264;
         }
      }
   }

   static final void method1826(byte b) {
      if (b < -12) {
         ++anInt2149;
         CacheNode_Sub20.anIntArray9628 = Class143.method1622(8, 4, true, 0, 2048, 8, 0.4F, 35);
      }
   }

   final void method1827(int i) {
      synchronized(this.aClass61_2146) {
         this.aClass61_2146.method608(false);
      }

      ++anInt2147;
      int i_0_ = 48 % ((-13 - i) / 62);
   }

   final void method1828(int i, int i_1_) {
      if (i_1_ > 115) {
         synchronized(this.aClass61_2146) {
            this.aClass61_2146.method598(i, -11819);
         }

         ++anInt2154;
      }
   }

   static final void method1829(int i) {
      ++anInt2159;
      if (i != -20412) {
         aClass197_2155 = null;
      }

      if (~Class332.anInt4145 < -1) {
         int i_2_ = 0;

         for(int i_3_ = 0; ~Class210.aStringArray2502.length < ~i_3_; ++i_3_) {
            if (Class210.aStringArray2502[i_3_].indexOf("--> ") != -1) {
               if (Class332.anInt4145 == ++i_2_) {
                  Node_Sub10.stringInConsole = Class210.aStringArray2502[i_3_].substring(2 + Class210.aStringArray2502[i_3_].indexOf(">"));
                  break;
               }
            }
         }
      } else {
         Node_Sub10.stringInConsole = "";
      }
   }

   static final Class119 method1830(boolean bool, int i, int i_4_, int i_5_, int i_6_) {
      ++anInt2152;
      long l = 65535L & (long)i_4_ | (65535L & (long)i_6_) << 16 | (long)i_5_ << 48 & -281474976710656L | (65535L & (long)i) << 32;
      if (bool) {
         return null;
      } else {
         Class119 class119 = (Class119)Class62.aClass61_904.method607(l, 0);
         if (class119 == null) {
            class119 = Class171.aClass278_2062.method3366(CacheNode_Sub6.aClass57_9480, i_6_, i_4_, i, i_5_, true);
            Class62.aClass61_904.method601(class119, 25566, l);
         }

         return class119;
      }
   }

   public static void method1831(int i) {
      aClass192_2144 = null;
      index1 = null;
      if (i == -50) {
         aClass197_2155 = null;
      }
   }

   Class181(Class353 class353, int i, Index class302, Index class302_7_) {
      this.aClass302_2156 = class302_7_;
      this.index2 = class302;
      this.index2.method3537(-2, 3);
   }
}
