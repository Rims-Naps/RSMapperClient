import java.util.Random;

public class Class227 {
   private Class177 aClass177_2693;
   private Class177 aClass177_2694;
   private int[] anIntArray2695 = new int[5];
   private Class177 aClass177_2696;
   private Class177 aClass177_2697;
   protected int anInt2698;
   private Class177 aClass177_2699;
   private static int[] anIntArray2700;
   private int[] anIntArray2701;
   private static int[] anIntArray2702 = new int[32768];
   private Class177 aClass177_2703;
   private Class196 aClass196_2704;
   private Class177 aClass177_2705;
   private static int[] anIntArray2706;
   protected int anInt2707;
   private Class177 aClass177_2708;
   private int anInt2709 = 0;
   private Class177 aClass177_2710;
   private static int[] anIntArray2711;
   private static int[] anIntArray2712;
   private static int[] anIntArray2713;
   private int[] anIntArray2714;
   private int anInt2715;
   private static int[] anIntArray2716;
   private static int[] anIntArray2717;

   static {
      Random random = new Random(0L);

      for(int i = 0; i < 32768; ++i) {
         anIntArray2702[i] = (random.nextInt() & 2) - 1;
      }

      anIntArray2700 = new int[32768];

      for(int i = 0; i < 32768; ++i) {
         anIntArray2700[i] = (int)(Math.sin((double)i / 5215.1903) * 16384.0);
      }

      anIntArray2706 = new int[220500];
      anIntArray2712 = new int[5];
      anIntArray2711 = new int[5];
      anIntArray2713 = new int[5];
      anIntArray2716 = new int[5];
      anIntArray2717 = new int[5];
   }

   final void method2116(Buffer buffer) {
      this.aClass177_2699 = new Class177();
      this.aClass177_2699.method1810(buffer);
      this.aClass177_2705 = new Class177();
      this.aClass177_2705.method1810(buffer);
      int i = buffer.readUnsignedByte();
      if (i != 0) {
         --buffer.offset;
         this.aClass177_2703 = new Class177();
         this.aClass177_2703.method1810(buffer);
         this.aClass177_2693 = new Class177();
         this.aClass177_2693.method1810(buffer);
      }

      i = buffer.readUnsignedByte();
      if (i != 0) {
         --buffer.offset;
         this.aClass177_2710 = new Class177();
         this.aClass177_2710.method1810(buffer);
         this.aClass177_2694 = new Class177();
         this.aClass177_2694.method1810(buffer);
      }

      i = buffer.readUnsignedByte();
      if (i != 0) {
         --buffer.offset;
         this.aClass177_2696 = new Class177();
         this.aClass177_2696.method1810(buffer);
         this.aClass177_2697 = new Class177();
         this.aClass177_2697.method1810(buffer);
      }

      for(int i_0_ = 0; i_0_ < 10; ++i_0_) {
         int i_1_ = buffer.readSmart();
         if (i_1_ == 0) {
            break;
         }

         this.anIntArray2695[i_0_] = i_1_;
         this.anIntArray2714[i_0_] = buffer.method2197(-129);
         this.anIntArray2701[i_0_] = buffer.readSmart();
      }

      this.anInt2709 = buffer.readSmart();
      this.anInt2715 = buffer.readSmart();
      this.anInt2698 = buffer.readUnsignedShort();
      this.anInt2707 = buffer.readUnsignedShort();
      this.aClass196_2704 = new Class196();
      this.aClass177_2708 = new Class177();
      this.aClass196_2704.method1994(buffer, this.aClass177_2708);
   }

   final int[] method2117(int i, int i_2_) {
      Class311.method3602(anIntArray2706, 0, i);
      if (i_2_ < 10) {
         return anIntArray2706;
      } else {
         double d = (double)i / ((double)i_2_ + 0.0);
         this.aClass177_2699.method1808();
         this.aClass177_2705.method1808();
         int i_3_ = 0;
         int i_4_ = 0;
         int i_5_ = 0;
         if (this.aClass177_2703 != null) {
            this.aClass177_2703.method1808();
            this.aClass177_2693.method1808();
            i_3_ = (int)((double)(this.aClass177_2703.anInt2111 - this.aClass177_2703.anInt2109) * 32.768 / d);
            i_4_ = (int)((double)this.aClass177_2703.anInt2109 * 32.768 / d);
         }

         int i_6_ = 0;
         int i_7_ = 0;
         int i_8_ = 0;
         if (this.aClass177_2710 != null) {
            this.aClass177_2710.method1808();
            this.aClass177_2694.method1808();
            i_6_ = (int)((double)(this.aClass177_2710.anInt2111 - this.aClass177_2710.anInt2109) * 32.768 / d);
            i_7_ = (int)((double)this.aClass177_2710.anInt2109 * 32.768 / d);
         }

         for(int i_9_ = 0; i_9_ < 5; ++i_9_) {
            if (this.anIntArray2695[i_9_] != 0) {
               anIntArray2712[i_9_] = 0;
               anIntArray2716[i_9_] = (int)((double)this.anIntArray2701[i_9_] * d);
               anIntArray2717[i_9_] = (this.anIntArray2695[i_9_] << 14) / 100;
               anIntArray2711[i_9_] = (int)(
                  (double)(this.aClass177_2699.anInt2111 - this.aClass177_2699.anInt2109)
                     * 32.768
                     * Math.pow(1.0057929410678534, (double)this.anIntArray2714[i_9_])
                     / d
               );
               anIntArray2713[i_9_] = (int)((double)this.aClass177_2699.anInt2109 * 32.768 / d);
            }
         }

         for(int i_10_ = 0; i_10_ < i; ++i_10_) {
            int i_11_ = this.aClass177_2699.method1809(i);
            int i_12_ = this.aClass177_2705.method1809(i);
            if (this.aClass177_2703 != null) {
               int i_13_ = this.aClass177_2703.method1809(i);
               int i_14_ = this.aClass177_2693.method1809(i);
               i_11_ += this.method2118(i_5_, i_14_, this.aClass177_2703.anInt2112) >> 1;
               i_5_ += (i_13_ * i_3_ >> 16) + i_4_;
            }

            if (this.aClass177_2710 != null) {
               int i_15_ = this.aClass177_2710.method1809(i);
               int i_16_ = this.aClass177_2694.method1809(i);
               i_12_ = i_12_ * ((this.method2118(i_8_, i_16_, this.aClass177_2710.anInt2112) >> 1) + 32768) >> 15;
               i_8_ += (i_15_ * i_6_ >> 16) + i_7_;
            }

            for(int i_17_ = 0; i_17_ < 5; ++i_17_) {
               if (this.anIntArray2695[i_17_] != 0) {
                  int i_18_ = i_10_ + anIntArray2716[i_17_];
                  if (i_18_ < i) {
                     anIntArray2706[i_18_] += this.method2118(anIntArray2712[i_17_], i_12_ * anIntArray2717[i_17_] >> 15, this.aClass177_2699.anInt2112);
                     anIntArray2712[i_17_] += (i_11_ * anIntArray2711[i_17_] >> 16) + anIntArray2713[i_17_];
                  }
               }
            }
         }

         if (this.aClass177_2696 != null) {
            this.aClass177_2696.method1808();
            this.aClass177_2697.method1808();
            int i_19_ = 0;
            boolean bool = false;
            boolean bool_20_ = true;

            for(int i_21_ = 0; i_21_ < i; ++i_21_) {
               int i_22_ = this.aClass177_2696.method1809(i);
               int i_23_ = this.aClass177_2697.method1809(i);
               int i_24_;
               if (bool_20_) {
                  i_24_ = this.aClass177_2696.anInt2109 + ((this.aClass177_2696.anInt2111 - this.aClass177_2696.anInt2109) * i_22_ >> 8);
               } else {
                  i_24_ = this.aClass177_2696.anInt2109 + ((this.aClass177_2696.anInt2111 - this.aClass177_2696.anInt2109) * i_23_ >> 8);
               }

               i_19_ += 256;
               if (i_19_ >= i_24_) {
                  i_19_ = 0;
                  bool_20_ = !bool_20_;
               }

               if (bool_20_) {
                  anIntArray2706[i_21_] = 0;
               }
            }
         }

         if (this.anInt2709 > 0 && this.anInt2715 > 0) {
            int i_25_ = (int)((double)this.anInt2709 * d);

            for(int i_26_ = i_25_; i_26_ < i; ++i_26_) {
               anIntArray2706[i_26_] += anIntArray2706[i_26_ - i_25_] * this.anInt2715 / 100;
            }
         }

         if (this.aClass196_2704.anIntArray2409[0] > 0 || this.aClass196_2704.anIntArray2409[1] > 0) {
            this.aClass177_2708.method1808();
            int i_27_ = this.aClass177_2708.method1809(i + 1);
            int i_28_ = this.aClass196_2704.method1993(0, (float)i_27_ / 65536.0F);
            int i_29_ = this.aClass196_2704.method1993(1, (float)i_27_ / 65536.0F);
            if (i >= i_28_ + i_29_) {
               int i_30_ = 0;
               int i_31_ = i_29_;
               if (i_29_ > i - i_28_) {
                  i_31_ = i - i_28_;
               }

               while(i_30_ < i_31_) {
                  int i_32_ = (int)((long)anIntArray2706[i_30_ + i_28_] * (long)Class196.anInt2406 >> 16);

                  for(int i_33_ = 0; i_33_ < i_28_; ++i_33_) {
                     i_32_ += (int)((long)anIntArray2706[i_30_ + i_28_ - 1 - i_33_] * (long)Class196.anIntArrayArray2411[0][i_33_] >> 16);
                  }

                  for(int i_34_ = 0; i_34_ < i_30_; ++i_34_) {
                     i_32_ -= (int)((long)anIntArray2706[i_30_ - 1 - i_34_] * (long)Class196.anIntArrayArray2411[1][i_34_] >> 16);
                  }

                  anIntArray2706[i_30_] = i_32_;
                  i_27_ = this.aClass177_2708.method1809(i + 1);
                  ++i_30_;
               }

               i_31_ = 128;

               while(true) {
                  if (i_31_ > i - i_28_) {
                     i_31_ = i - i_28_;
                  }

                  while(i_30_ < i_31_) {
                     int i_35_ = (int)((long)anIntArray2706[i_30_ + i_28_] * (long)Class196.anInt2406 >> 16);

                     for(int i_36_ = 0; i_36_ < i_28_; ++i_36_) {
                        i_35_ += (int)((long)anIntArray2706[i_30_ + i_28_ - 1 - i_36_] * (long)Class196.anIntArrayArray2411[0][i_36_] >> 16);
                     }

                     for(int i_37_ = 0; i_37_ < i_29_; ++i_37_) {
                        i_35_ -= (int)((long)anIntArray2706[i_30_ - 1 - i_37_] * (long)Class196.anIntArrayArray2411[1][i_37_] >> 16);
                     }

                     anIntArray2706[i_30_] = i_35_;
                     i_27_ = this.aClass177_2708.method1809(i + 1);
                     ++i_30_;
                  }

                  if (i_30_ >= i - i_28_) {
                     while(i_30_ < i) {
                        int i_38_ = 0;

                        for(int i_39_ = i_30_ + i_28_ - i; i_39_ < i_28_; ++i_39_) {
                           i_38_ += (int)((long)anIntArray2706[i_30_ + i_28_ - 1 - i_39_] * (long)Class196.anIntArrayArray2411[0][i_39_] >> 16);
                        }

                        for(int i_40_ = 0; i_40_ < i_29_; ++i_40_) {
                           i_38_ -= (int)((long)anIntArray2706[i_30_ - 1 - i_40_] * (long)Class196.anIntArrayArray2411[1][i_40_] >> 16);
                        }

                        anIntArray2706[i_30_] = i_38_;
                        i_27_ = this.aClass177_2708.method1809(i + 1);
                        ++i_30_;
                     }
                     break;
                  }

                  i_28_ = this.aClass196_2704.method1993(0, (float)i_27_ / 65536.0F);
                  i_29_ = this.aClass196_2704.method1993(1, (float)i_27_ / 65536.0F);
                  i_31_ += 128;
               }
            }
         }

         for(int i_41_ = 0; i_41_ < i; ++i_41_) {
            if (anIntArray2706[i_41_] < -32768) {
               anIntArray2706[i_41_] = -32768;
            }

            if (anIntArray2706[i_41_] > 32767) {
               anIntArray2706[i_41_] = 32767;
            }
         }

         return anIntArray2706;
      }
   }

   private final int method2118(int i, int i_42_, int i_43_) {
      if (i_43_ == 1) {
         return (i & 32767) < 16384 ? i_42_ : -i_42_;
      } else if (i_43_ == 2) {
         return anIntArray2700[i & 32767] * i_42_ >> 14;
      } else if (i_43_ == 3) {
         return ((i & 32767) * i_42_ >> 14) - i_42_;
      } else {
         return i_43_ == 4 ? anIntArray2702[i / 2607 & 32767] * i_42_ : 0;
      }
   }

   public Class227() {
      this.anIntArray2701 = new int[5];
      this.anInt2707 = 0;
      this.anIntArray2714 = new int[5];
      this.anInt2698 = 500;
      this.anInt2715 = 100;
   }

   public static void method2119() {
      anIntArray2706 = null;
      anIntArray2702 = null;
      anIntArray2700 = null;
      anIntArray2712 = null;
      anIntArray2716 = null;
      anIntArray2717 = null;
      anIntArray2711 = null;
      anIntArray2713 = null;
   }
}
