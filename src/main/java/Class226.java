import java.awt.Rectangle;

public class Class226 {
   static int anInt2681;
   static int anInt2682;
   protected CacheNode_Sub15 aCacheNode_Sub15_2683;
   static Class103 aClass103_2684 = new Class103();
   protected int anInt2685;
   static int anInt2686;
   protected CacheNode_Sub15 aCacheNode_Sub15_2687;
   protected int anInt2688;
   protected boolean aBoolean2689 = false;
   static int anInt2690;
   protected int anInt2691;
   static int anInt2692;

   final boolean method2110(Class37 class37, byte b, Class48 class48, int i, int i_0_, int[] is) {
      ++anInt2692;
      if (b > -79) {
         this.anInt2688 = 37;
      }

      if (!this.aBoolean2689) {
         if (is.length <= i_0_) {
            return false;
         } else {
            this.anInt2685 = is[i_0_];
            this.aCacheNode_Sub15_2683 = class37.method399(this.anInt2685 >> 16, -124);
            this.anInt2685 &= 65535;
            if (this.aCacheNode_Sub15_2683 == null) {
               return false;
            } else {
               if (class48.aBoolean714 && ~i != 0 && ~is.length < ~i) {
                  this.anInt2688 = is[i];
                  this.aCacheNode_Sub15_2687 = class37.method399(this.anInt2688 >> 16, -122);
                  this.anInt2688 &= 65535;
               }

               if (class48.aBoolean691) {
                  this.anInt2691 |= 512;
               }

               if (this.aCacheNode_Sub15_2683.method2383(this.anInt2685, 105)) {
                  this.anInt2691 |= 128;
               }

               if (this.aCacheNode_Sub15_2683.method2381((byte)102, this.anInt2685)) {
                  this.anInt2691 |= 256;
               }

               if (this.aCacheNode_Sub15_2683.method2382(32, this.anInt2685)) {
                  this.anInt2691 |= 1024;
               }

               if (this.aCacheNode_Sub15_2687 != null) {
                  if (this.aCacheNode_Sub15_2687.method2383(this.anInt2688, 126)) {
                     this.anInt2691 |= 128;
                  }

                  if (this.aCacheNode_Sub15_2687.method2381((byte)120, this.anInt2688)) {
                     this.anInt2691 |= 256;
                  }

                  if (this.aCacheNode_Sub15_2687.method2382(32, this.anInt2688)) {
                     this.anInt2691 |= 1024;
                  }
               }

               this.aBoolean2689 = true;
               this.anInt2691 |= 32;
               return true;
            }
         }
      } else {
         return true;
      }
   }

   public static void method2111(boolean bool) {
      if (!bool) {
         method2113(-89);
      }

      aClass103_2684 = null;
   }

   static final int method2112(int i) {
      if (i != 256) {
         aClass103_2684 = null;
      }

      ++anInt2690;
      return Class320_Sub20.anInt8397 == 1 ? Class166.anInt5100 : 0;
   }

   static final void method2113(int i) {
      Class379.aClass61_4872.method608(false);
      int i_1_ = 121 / ((i - -39) / 36);
      ++anInt2681;
   }

   static final void method2114(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
      ++anInt2682;

      for(int i_6_ = 0; i_6_ < Node_Sub11.anInt7105; ++i_6_) {
         Rectangle rectangle = Node_Sub38_Sub28.aRectangleArray10404[i_6_];
         if (i < rectangle.x - -rectangle.width && ~rectangle.x > ~(i_3_ + i) && ~(rectangle.height + rectangle.y) < ~i_2_ && ~rectangle.y > ~(i_2_ + i_4_)) {
            Class320_Sub21.aBooleanArray8403[i_6_] = true;
         }
      }

      Class362.method4053(i_2_, i_4_ + i_2_, i, (byte)102, i - -i_3_);
      if (i_5_ >= -105) {
         method2114(65, 4, 96, -103, -52);
      }
   }

   final void method2115(byte b) {
      if (b > -82) {
         this.anInt2685 = -78;
      }

      this.anInt2691 = 0;
      ++anInt2686;
      this.aBoolean2689 = false;
      this.aCacheNode_Sub15_2683 = this.aCacheNode_Sub15_2687 = null;
   }
}
