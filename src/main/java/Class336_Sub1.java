public class Class336_Sub1 extends Class336 {
   static int anInt8506;
   static int anInt8507;
   protected float aFloat8508;
   static int anInt8509;
   static int anInt8510;
   static int anInt8511;
   static int anInt8512;
   static int anInt8513;
   static int anInt8514;
   static int anInt8515;
   static int anInt8516;
   static int anInt8517;
   static int anInt8518;
   static int anInt8519;
   static int anInt8520;
   protected float aFloat8521;
   static int anInt8522;
   static int anInt8523;
   static int anInt8524;
   static int anInt8525;
   static int anInt8526;
   static int anInt8527;
   static int anInt8528;
   protected float aFloat8529;
   protected float aFloat8530;
   protected float aFloat8531;
   static int anInt8532;
   static int anInt8533;
   static int anInt8534;
   protected float aFloat8535;
   static int anInt8536;
   static int anInt8537;
   protected float aFloat8538;
   static int anInt8539;
   static int anInt8540;
   static int anInt8541;
   protected float aFloat8542;
   static boolean aBoolean8543 = false;
   protected float aFloat8544;
   static int anInt8545;
   static int anInt8546;
   protected float aFloat8547;
   static int anInt8548;
   static int anInt8549;
   protected float aFloat8550;
   static int anInt8551;
   static int anInt8552;
   static int anInt8553;
   static int anInt8554;
   static int anInt8555;
   protected float aFloat8556;

   final void method3870(float f, int i, float f_0_, float f_1_) {
      this.aFloat8550 = f_1_;
      ++anInt8534;
      this.aFloat8542 = f;
      this.aFloat8544 = this.aFloat8547 = this.aFloat8531 = this.aFloat8508 = this.aFloat8529 = this.aFloat8535 = (float)i;
      this.aFloat8521 = f_0_;
      this.aFloat8530 = this.aFloat8538 = this.aFloat8556 = 1.0F;
   }

   @Override
   final void method3869(int i, int i_2_, int i_3_, int[] is) {
      i = (int)((float)i - this.aFloat8550);
      i_3_ = (int)((float)i_3_ - this.aFloat8542);
      i_2_ = (int)((float)i_2_ - this.aFloat8521);
      ++anInt8524;
      is[2] = (int)(this.aFloat8556 * (float)i_3_ + this.aFloat8535 * (float)i_2_ + this.aFloat8529 * (float)i);
      is[0] = (int)((float)i * this.aFloat8530 + (float)i_2_ * this.aFloat8544 + (float)i_3_ * this.aFloat8547);
      is[1] = (int)((float)i * this.aFloat8531 + (float)i_2_ * this.aFloat8538 + (float)i_3_ * this.aFloat8508);
   }

   @Override
   final void method3860(int i) {
      ++anInt8539;
      this.aFloat8538 = 1.0F;
      this.aFloat8530 = this.aFloat8556 = Class93.aFloatArray1242[i & 16383];
      this.aFloat8529 = Class93.aFloatArray1238[i & 16383];
      this.aFloat8547 = -this.aFloat8529;
      this.aFloat8531 = this.aFloat8550 = this.aFloat8544 = this.aFloat8535 = this.aFloat8521 = this.aFloat8508 = this.aFloat8542 = 0.0F;
   }

   final void method3871(int i, Class336 class336) {
      ++anInt8540;
      Class336_Sub1 class336_sub1_4_ = (Class336_Sub1)class336;
      float f = this.aFloat8530;
      float f_5_ = this.aFloat8544;
      float f_6_ = this.aFloat8531;
      float f_7_ = this.aFloat8538;
      float f_8_ = this.aFloat8529;
      float f_9_ = this.aFloat8535;
      float f_10_ = this.aFloat8550;
      this.aFloat8544 = class336_sub1_4_.aFloat8535 * this.aFloat8547 + f * class336_sub1_4_.aFloat8544 + f_5_ * class336_sub1_4_.aFloat8538;
      float f_11_ = this.aFloat8521;
      this.aFloat8530 = class336_sub1_4_.aFloat8529 * this.aFloat8547 + class336_sub1_4_.aFloat8530 * f + class336_sub1_4_.aFloat8531 * f_5_;
      if (i > 30) {
         this.aFloat8538 = class336_sub1_4_.aFloat8535 * this.aFloat8508 + class336_sub1_4_.aFloat8538 * f_7_ + class336_sub1_4_.aFloat8544 * f_6_;
         this.aFloat8547 = f * class336_sub1_4_.aFloat8547 + f_5_ * class336_sub1_4_.aFloat8508 + class336_sub1_4_.aFloat8556 * this.aFloat8547;
         this.aFloat8531 = this.aFloat8508 * class336_sub1_4_.aFloat8529 + class336_sub1_4_.aFloat8530 * f_6_ + f_7_ * class336_sub1_4_.aFloat8531;
         this.aFloat8508 = class336_sub1_4_.aFloat8508 * f_7_ + f_6_ * class336_sub1_4_.aFloat8547 + this.aFloat8508 * class336_sub1_4_.aFloat8556;
         this.aFloat8529 = class336_sub1_4_.aFloat8531 * f_9_ + class336_sub1_4_.aFloat8530 * f_8_ + this.aFloat8556 * class336_sub1_4_.aFloat8529;
         this.aFloat8535 = f_9_ * class336_sub1_4_.aFloat8538 + class336_sub1_4_.aFloat8544 * f_8_ + this.aFloat8556 * class336_sub1_4_.aFloat8535;
         this.aFloat8556 = f_9_ * class336_sub1_4_.aFloat8508 + f_8_ * class336_sub1_4_.aFloat8547 + class336_sub1_4_.aFloat8556 * this.aFloat8556;
         this.aFloat8550 = class336_sub1_4_.aFloat8550
            + f_11_ * class336_sub1_4_.aFloat8531
            + f_10_ * class336_sub1_4_.aFloat8530
            + class336_sub1_4_.aFloat8529 * this.aFloat8542;
         this.aFloat8521 = class336_sub1_4_.aFloat8521
            + f_10_ * class336_sub1_4_.aFloat8544
            + class336_sub1_4_.aFloat8538 * f_11_
            + class336_sub1_4_.aFloat8535 * this.aFloat8542;
         this.aFloat8542 = class336_sub1_4_.aFloat8542
            + class336_sub1_4_.aFloat8547 * f_10_
            + class336_sub1_4_.aFloat8508 * f_11_
            + this.aFloat8542 * class336_sub1_4_.aFloat8556;
      }
   }

   @Override
   final void method3859(int i) {
      ++anInt8551;
      float f = Class93.aFloatArray1242[16383 & i];
      float f_12_ = Class93.aFloatArray1238[i & 16383];
      float f_13_ = this.aFloat8544;
      float f_14_ = this.aFloat8538;
      float f_15_ = this.aFloat8535;
      this.aFloat8544 = -(this.aFloat8547 * f_12_) + f * f_13_;
      float f_16_ = this.aFloat8521;
      this.aFloat8547 = f_12_ * f_13_ + this.aFloat8547 * f;
      this.aFloat8538 = f_14_ * f - this.aFloat8508 * f_12_;
      this.aFloat8508 = f_12_ * f_14_ + f * this.aFloat8508;
      this.aFloat8535 = -(this.aFloat8556 * f_12_) + f_15_ * f;
      this.aFloat8521 = f_16_ * f - f_12_ * this.aFloat8542;
      this.aFloat8556 = f * this.aFloat8556 + f_15_ * f_12_;
      this.aFloat8542 = this.aFloat8542 * f + f_16_ * f_12_;
   }

   final void method3872(float f, float f_17_, byte b, float f_18_, float[] fs, float f_19_) {
      ++anInt8512;
      fs[2] = f_19_ * this.aFloat8547 + f_17_ * this.aFloat8508 + this.aFloat8556 * f_18_;
      fs[1] = f_18_ * this.aFloat8535 + f_19_ * this.aFloat8544 + this.aFloat8538 * f_17_;
      fs[0] = f_17_ * this.aFloat8531 + this.aFloat8530 * f_19_ + this.aFloat8529 * f_18_;
      if (b != 86) {
         this.method3865(127);
      }

      float f_20_;
      float f_21_;
      float f_22_;
      if (!(f_19_ <= 0.00390625F) || !(f_19_ >= -0.00390625F)) {
         float f_25_ = -f / f_19_;
         f_20_ = f_25_ * this.aFloat8544 + this.aFloat8521;
         f_21_ = this.aFloat8547 * f_25_ + this.aFloat8542;
         f_22_ = f_25_ * this.aFloat8530 + this.aFloat8550;
      } else if (!(f_17_ > 0.00390625F) && !(f_17_ < -0.00390625F)) {
         float f_24_ = -f / f_18_;
         f_22_ = this.aFloat8529 * f_24_ + this.aFloat8550;
         f_20_ = this.aFloat8535 * f_24_ + this.aFloat8521;
         f_21_ = this.aFloat8542 + f_24_ * this.aFloat8556;
      } else {
         float f_23_ = -f / f_17_;
         f_20_ = this.aFloat8538 * f_23_ + this.aFloat8521;
         f_22_ = this.aFloat8531 * f_23_ + this.aFloat8550;
         f_21_ = this.aFloat8542 + f_23_ * this.aFloat8508;
      }

      fs[3] = -(fs[0] * f_22_ + f_20_ * fs[1] + f_21_ * fs[2]);
   }

   @Override
   final void method3861(int i) {
      ++anInt8525;
      this.aFloat8556 = 1.0F;
      this.aFloat8530 = this.aFloat8538 = Class93.aFloatArray1242[i & 16383];
      this.aFloat8544 = Class93.aFloatArray1238[16383 & i];
      this.aFloat8531 = -this.aFloat8544;
      this.aFloat8529 = this.aFloat8550 = this.aFloat8535 = this.aFloat8521 = this.aFloat8547 = this.aFloat8508 = this.aFloat8542 = 0.0F;
   }

   final void method3873(Class336 class336, byte b) {
      ++anInt8522;
      Class336_Sub1 class336_sub1_26_ = (Class336_Sub1)class336;
      this.aFloat8531 = class336_sub1_26_.aFloat8544;
      this.aFloat8530 = class336_sub1_26_.aFloat8530;
      this.aFloat8529 = class336_sub1_26_.aFloat8547;
      this.aFloat8538 = class336_sub1_26_.aFloat8538;
      this.aFloat8535 = class336_sub1_26_.aFloat8508;
      if (b > 113) {
         this.aFloat8547 = class336_sub1_26_.aFloat8529;
         this.aFloat8544 = class336_sub1_26_.aFloat8531;
         this.aFloat8550 = -(
            class336_sub1_26_.aFloat8521 * this.aFloat8531 + class336_sub1_26_.aFloat8550 * this.aFloat8530 + class336_sub1_26_.aFloat8542 * this.aFloat8529
         );
         this.aFloat8508 = class336_sub1_26_.aFloat8535;
         this.aFloat8556 = class336_sub1_26_.aFloat8556;
         this.aFloat8521 = -(
            this.aFloat8538 * class336_sub1_26_.aFloat8521 + this.aFloat8544 * class336_sub1_26_.aFloat8550 + class336_sub1_26_.aFloat8542 * this.aFloat8535
         );
         this.aFloat8542 = -(
            this.aFloat8556 * class336_sub1_26_.aFloat8542 + this.aFloat8547 * class336_sub1_26_.aFloat8550 + this.aFloat8508 * class336_sub1_26_.aFloat8521
         );
      }
   }

   final float[] method3874(int i, float[] fs) {
      fs[0] = this.aFloat8530;
      fs[15] = 1.0F;
      fs[2] = 0.0F;
      fs[8] = this.aFloat8550;
      fs[4] = this.aFloat8531;
      fs[9] = this.aFloat8521;
      fs[10] = this.aFloat8542;
      fs[11] = 0.0F;
      fs[13] = 0.0F;
      fs[7] = 0.0F;
      ++anInt8526;
      fs[1] = this.aFloat8544;
      fs[3] = 0.0F;
      fs[14] = 0.0F;
      fs[6] = 0.0F;
      fs[i] = this.aFloat8538;
      fs[12] = 0.0F;
      return fs;
   }

   final void method3875(float f, float f_27_, byte b, float f_28_) {
      this.aFloat8521 += f_27_;
      this.aFloat8550 += f_28_;
      this.aFloat8542 += f;
      if (b == 103) {
         ++anInt8536;
      }
   }

   final float method3876(int i, float f, float f_29_, float f_30_) {
      ++anInt8507;
      if (i != 5) {
         this.method3858();
      }

      return this.aFloat8521 + f_29_ * this.aFloat8544 + f_30_ * this.aFloat8538 + f * this.aFloat8535;
   }

   @Override
   final void method3865(int i) {
      this.aFloat8530 = 1.0F;
      ++anInt8546;
      this.aFloat8538 = this.aFloat8556 = Class93.aFloatArray1242[i & 16383];
      this.aFloat8508 = Class93.aFloatArray1238[16383 & i];
      this.aFloat8531 = this.aFloat8529 = this.aFloat8550 = this.aFloat8544 = this.aFloat8521 = this.aFloat8547 = this.aFloat8542 = 0.0F;
      this.aFloat8535 = -this.aFloat8508;
   }

   final void method3877(float f, byte b, float f_31_, float f_32_) {
      if (b != -112) {
         this.aFloat8531 = 0.042019863F;
      }

      ++anInt8537;
      this.aFloat8530 = f_32_;
      this.aFloat8556 = f;
      this.aFloat8542 = 0.0F;
      this.aFloat8535 = 0.0F;
      this.aFloat8529 = 0.0F;
      this.aFloat8531 = 0.0F;
      this.aFloat8508 = 0.0F;
      this.aFloat8521 = 0.0F;
      this.aFloat8538 = f_31_;
      this.aFloat8550 = 0.0F;
      this.aFloat8544 = 0.0F;
      this.aFloat8547 = 0.0F;
   }

   final float method3878(float f, float f_33_, float f_34_, boolean bool) {
      ++anInt8555;
      if (bool) {
         this.aFloat8521 = 2.3998883F;
      }

      return this.aFloat8550 + f_33_ * this.aFloat8529 + f * this.aFloat8531 + this.aFloat8530 * f_34_;
   }

   @Override
   final void method3863(int i, int i_35_, int i_36_) {
      this.aFloat8542 += (float)i_36_;
      ++anInt8511;
      this.aFloat8521 += (float)i_35_;
      this.aFloat8550 += (float)i;
   }

   final void method3879(Class336 class336, byte b) {
      ++anInt8523;
      if (b != 68) {
         method3887(true, null);
      }

      Class336_Sub1 class336_sub1_37_ = (Class336_Sub1)class336;
      this.aFloat8538 = class336_sub1_37_.aFloat8538;
      this.aFloat8535 = class336_sub1_37_.aFloat8535;
      this.aFloat8508 = class336_sub1_37_.aFloat8508;
      this.aFloat8529 = class336_sub1_37_.aFloat8529;
      this.aFloat8550 = 0.0F;
      this.aFloat8556 = class336_sub1_37_.aFloat8556;
      this.aFloat8531 = class336_sub1_37_.aFloat8531;
      this.aFloat8544 = class336_sub1_37_.aFloat8544;
      this.aFloat8542 = 0.0F;
      this.aFloat8547 = class336_sub1_37_.aFloat8547;
      this.aFloat8521 = 0.0F;
      this.aFloat8530 = class336_sub1_37_.aFloat8530;
   }

   final void method3880(float f, byte b, float f_38_, float f_39_, float f_40_, float f_41_, float f_42_, float f_43_, float f_44_, float f_45_) {
      this.aFloat8521 = 0.0F;
      this.aFloat8544 = f_38_;
      this.aFloat8538 = f_45_;
      ++anInt8520;
      this.aFloat8547 = f_44_;
      this.aFloat8508 = f_41_;
      this.aFloat8542 = 0.0F;
      this.aFloat8556 = f_39_;
      this.aFloat8550 = 0.0F;
      this.aFloat8530 = f_40_;
      this.aFloat8535 = f_43_;
      this.aFloat8531 = f;
      this.aFloat8529 = f_42_;
   }

   @Override
   final void method3853(int i, int i_46_, int i_47_, int[] is) {
      is[2] = (int)(this.aFloat8556 * (float)i_47_ + this.aFloat8508 * (float)i_46_ + this.aFloat8547 * (float)i + this.aFloat8542);
      ++anInt8552;
      is[0] = (int)((float)i_47_ * this.aFloat8529 + (float)i_46_ * this.aFloat8531 + this.aFloat8530 * (float)i + this.aFloat8550);
      is[1] = (int)(this.aFloat8538 * (float)i_46_ + (float)i * this.aFloat8544 + (float)i_47_ * this.aFloat8535 + this.aFloat8521);
   }

   final float[] method3881(byte b, float[] fs) {
      fs[7] = this.aFloat8521;
      fs[14] = 0.0F;
      fs[8] = this.aFloat8547;
      fs[1] = this.aFloat8531;
      fs[15] = 1.0F;
      fs[10] = this.aFloat8556;
      fs[4] = this.aFloat8544;
      fs[2] = this.aFloat8529;
      fs[11] = this.aFloat8542;
      fs[3] = this.aFloat8550;
      fs[9] = this.aFloat8508;
      fs[0] = this.aFloat8530;
      fs[5] = this.aFloat8538;
      ++anInt8515;
      fs[6] = this.aFloat8535;
      fs[13] = 0.0F;
      fs[12] = 0.0F;
      return fs;
   }

   final float method3882(float f, float f_48_, float f_49_, boolean bool) {
      ++anInt8532;
      return !bool ? 0.44789165F : this.aFloat8556 * f + this.aFloat8508 * f_48_ + f_49_ * this.aFloat8547 + this.aFloat8542;
   }

   @Override
   final void method3864(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_) {
      ++anInt8553;
      float f = Class93.aFloatArray1242[16383 & i_52_];
      float f_55_ = Class93.aFloatArray1238[16383 & i_52_];
      float f_56_ = Class93.aFloatArray1242[16383 & i_53_];
      float f_57_ = Class93.aFloatArray1238[16383 & i_53_];
      float f_58_ = Class93.aFloatArray1242[i_54_ & 16383];
      float f_59_ = Class93.aFloatArray1238[16383 & i_54_];
      float f_60_ = f_58_ * f_55_;
      float f_61_ = f_55_ * f_59_;
      this.aFloat8529 = f_58_ * -f_57_ + f_61_ * f_56_;
      this.aFloat8531 = f_59_ * f;
      this.aFloat8544 = f_60_ * f_57_ + f_59_ * -f_56_;
      this.aFloat8547 = f_57_ * f;
      this.aFloat8508 = -f_55_;
      this.aFloat8530 = f_58_ * f_56_ + f_61_ * f_57_;
      this.aFloat8535 = f_57_ * f_59_ + f_60_ * f_56_;
      this.aFloat8556 = f_56_ * f;
      this.aFloat8538 = f_58_ * f;
      this.aFloat8550 = -((float)i_51_ * this.aFloat8529) + -(this.aFloat8531 * (float)i_50_) + (float)(-i) * this.aFloat8530;
      this.aFloat8521 = -((float)i_50_ * this.aFloat8538) + (float)(-i) * this.aFloat8544 - this.aFloat8535 * (float)i_51_;
      this.aFloat8542 = -((float)i_51_ * this.aFloat8556) + -(this.aFloat8508 * (float)i_50_) + (float)(-i) * this.aFloat8547;
   }

   final void method3883(Class336 class336, Class336 class336_62_) {
      ++anInt8528;
      Class336_Sub1 class336_sub1_63_ = (Class336_Sub1)class336;
      Class336_Sub1 class336_sub1_64_ = (Class336_Sub1)class336_62_;
      this.aFloat8530 = class336_sub1_64_.aFloat8547 * class336_sub1_63_.aFloat8529
         + class336_sub1_64_.aFloat8530 * class336_sub1_63_.aFloat8530
         + class336_sub1_63_.aFloat8531 * class336_sub1_64_.aFloat8544;
      this.aFloat8544 = class336_sub1_64_.aFloat8544 * class336_sub1_63_.aFloat8538
         + class336_sub1_64_.aFloat8530 * class336_sub1_63_.aFloat8544
         + class336_sub1_64_.aFloat8547 * class336_sub1_63_.aFloat8535;
      this.aFloat8547 = class336_sub1_64_.aFloat8530 * class336_sub1_63_.aFloat8547
         + class336_sub1_63_.aFloat8508 * class336_sub1_64_.aFloat8544
         + class336_sub1_64_.aFloat8547 * class336_sub1_63_.aFloat8556;
      this.aFloat8531 = class336_sub1_63_.aFloat8530 * class336_sub1_64_.aFloat8531
         + class336_sub1_63_.aFloat8531 * class336_sub1_64_.aFloat8538
         + class336_sub1_64_.aFloat8508 * class336_sub1_63_.aFloat8529;
      this.aFloat8538 = class336_sub1_63_.aFloat8538 * class336_sub1_64_.aFloat8538
         + class336_sub1_64_.aFloat8531 * class336_sub1_63_.aFloat8544
         + class336_sub1_63_.aFloat8535 * class336_sub1_64_.aFloat8508;
      this.aFloat8508 = class336_sub1_64_.aFloat8531 * class336_sub1_63_.aFloat8547
         + class336_sub1_64_.aFloat8538 * class336_sub1_63_.aFloat8508
         + class336_sub1_63_.aFloat8556 * class336_sub1_64_.aFloat8508;
      this.aFloat8529 = class336_sub1_63_.aFloat8529 * class336_sub1_64_.aFloat8556
         + class336_sub1_63_.aFloat8531 * class336_sub1_64_.aFloat8535
         + class336_sub1_63_.aFloat8530 * class336_sub1_64_.aFloat8529;
      this.aFloat8535 = class336_sub1_63_.aFloat8535 * class336_sub1_64_.aFloat8556
         + class336_sub1_63_.aFloat8538 * class336_sub1_64_.aFloat8535
         + class336_sub1_64_.aFloat8529 * class336_sub1_63_.aFloat8544;
      this.aFloat8556 = class336_sub1_63_.aFloat8556 * class336_sub1_64_.aFloat8556
         + class336_sub1_63_.aFloat8547 * class336_sub1_64_.aFloat8529
         + class336_sub1_63_.aFloat8508 * class336_sub1_64_.aFloat8535;
      this.aFloat8550 = class336_sub1_63_.aFloat8529 * class336_sub1_64_.aFloat8542
         + class336_sub1_63_.aFloat8531 * class336_sub1_64_.aFloat8521
         + class336_sub1_63_.aFloat8530 * class336_sub1_64_.aFloat8550
         + class336_sub1_63_.aFloat8550;
      this.aFloat8521 = class336_sub1_63_.aFloat8521
         + class336_sub1_64_.aFloat8542 * class336_sub1_63_.aFloat8535
         + class336_sub1_64_.aFloat8550 * class336_sub1_63_.aFloat8544
         + class336_sub1_63_.aFloat8538 * class336_sub1_64_.aFloat8521;
      this.aFloat8542 = class336_sub1_63_.aFloat8542
         + class336_sub1_63_.aFloat8556 * class336_sub1_64_.aFloat8542
         + class336_sub1_64_.aFloat8521 * class336_sub1_63_.aFloat8508
         + class336_sub1_64_.aFloat8550 * class336_sub1_63_.aFloat8547;
   }

   @Override
   final void method3862() {
      ++anInt8509;
      this.aFloat8530 = this.aFloat8538 = this.aFloat8556 = 1.0F;
      this.aFloat8544 = this.aFloat8547 = this.aFloat8531 = this.aFloat8508 = this.aFloat8529 = this.aFloat8535 = this.aFloat8550 = this.aFloat8521 = this.aFloat8542 = 0.0F;
   }

   final float[] method3884(boolean bool, float[] fs) {
      fs[10] = this.aFloat8556;
      if (!bool) {
         aBoolean8543 = false;
      }

      fs[5] = this.aFloat8538;
      fs[1] = this.aFloat8544;
      fs[6] = this.aFloat8508;
      fs[13] = this.aFloat8521;
      fs[8] = this.aFloat8529;
      fs[9] = this.aFloat8535;
      fs[12] = this.aFloat8550;
      fs[4] = this.aFloat8531;
      ++anInt8548;
      fs[0] = this.aFloat8530;
      fs[14] = this.aFloat8542;
      fs[11] = 0.0F;
      fs[2] = this.aFloat8547;
      fs[7] = 0.0F;
      fs[3] = 0.0F;
      fs[15] = 1.0F;
      return fs;
   }

   @Override
   final void method3868(int i) {
      ++anInt8510;
      float f = Class93.aFloatArray1242[16383 & i];
      float f_65_ = Class93.aFloatArray1238[16383 & i];
      float f_66_ = this.aFloat8530;
      float f_67_ = this.aFloat8531;
      float f_68_ = this.aFloat8529;
      this.aFloat8530 = f_66_ * f - this.aFloat8544 * f_65_;
      float f_69_ = this.aFloat8550;
      this.aFloat8544 = f * this.aFloat8544 + f_66_ * f_65_;
      this.aFloat8531 = f_67_ * f - f_65_ * this.aFloat8538;
      this.aFloat8529 = f_68_ * f - f_65_ * this.aFloat8535;
      this.aFloat8538 = f_65_ * f_67_ + this.aFloat8538 * f;
      this.aFloat8535 = f_68_ * f_65_ + this.aFloat8535 * f;
      this.aFloat8550 = f_69_ * f - f_65_ * this.aFloat8521;
      this.aFloat8521 = this.aFloat8521 * f + f_65_ * f_69_;
   }

   final float[] method3885(int i, float[] fs) {
      fs[15] = 0.0F;
      fs[2] = this.aFloat8529;
      fs[4] = this.aFloat8544;
      fs[13] = 0.0F;
      fs[0] = this.aFloat8530;
      fs[7] = 0.0F;
      fs[12] = 0.0F;
      fs[5] = this.aFloat8538;
      fs[14] = 0.0F;
      fs[6] = this.aFloat8535;
      fs[11] = 0.0F;
      fs[9] = this.aFloat8508;
      fs[8] = this.aFloat8547;
      fs[10] = this.aFloat8556;
      fs[1] = this.aFloat8531;
      ++anInt8533;
      fs[3] = (float)i;
      return fs;
   }

   final void method3886(float f, int i, int i_70_, int i_71_, float f_72_, float f_73_, int i_74_) {
      if (i_74_ == 0) {
         this.aFloat8530 = (float)(i_70_ * 2);
         this.aFloat8544 = this.aFloat8547 = this.aFloat8531 = this.aFloat8508 = this.aFloat8529 = this.aFloat8535 = 0.0F;
         this.aFloat8550 = f_73_ - (float)i_70_;
         this.aFloat8556 = 1.0F;
         this.aFloat8521 = f_72_ - (float)i;
         this.aFloat8542 = f;
         this.aFloat8538 = (float)(2 * i);
      } else {
         float f_75_ = Class93.aFloatArray1242[16383 & i_74_];
         float f_76_ = Class93.aFloatArray1238[i_74_ & 16383];
         this.aFloat8521 = f_72_ + (-(f_75_ * 0.5F) + -0.5F * f_76_) * (float)(i * 2);
         this.aFloat8531 = -2.0F * f_76_ * (float)i;
         this.aFloat8542 = f;
         this.aFloat8550 = (float)(i_70_ * 2) * (0.5F * f_76_ - 0.5F * f_75_) + f_73_;
         this.aFloat8530 = (float)i_70_ * f_75_ * 2.0F;
         this.aFloat8547 = this.aFloat8508 = this.aFloat8529 = this.aFloat8535 = 0.0F;
         this.aFloat8544 = (float)i_70_ * f_76_ * 2.0F;
         this.aFloat8556 = 1.0F;
         this.aFloat8538 = (float)i * f_75_ * 2.0F;
      }

      if (i_71_ == 16383) {
         ++anInt8506;
      }
   }

   @Override
   final void method3854(int i, int i_77_, int i_78_) {
      this.aFloat8521 = (float)i_77_;
      this.aFloat8550 = (float)i;
      this.aFloat8530 = this.aFloat8538 = this.aFloat8556 = 1.0F;
      this.aFloat8544 = this.aFloat8547 = this.aFloat8531 = this.aFloat8508 = this.aFloat8529 = this.aFloat8535 = 0.0F;
      this.aFloat8542 = (float)i_78_;
      ++anInt8545;
   }

   static final int method3887(boolean bool, String string) {
      if (bool) {
         return 44;
      } else {
         ++anInt8514;
         int i = string.length();
         int i_79_ = 0;

         for(int i_80_ = 0; i > i_80_; ++i_80_) {
            i_79_ = -i_79_ + (i_79_ << 5) - -Class26.method312(string.charAt(i_80_), (byte)-114);
         }

         return i_79_;
      }
   }

   @Override
   final void method3855(int[] is) {
      ++anInt8516;
      float f = -this.aFloat8550 + (float)is[0];
      float f_81_ = (float)is[1] - this.aFloat8521;
      float f_82_ = -this.aFloat8542 + (float)is[2];
      is[0] = (int)(f * this.aFloat8530 + f_81_ * this.aFloat8544 + this.aFloat8547 * f_82_);
      is[2] = (int)(f * this.aFloat8529 + this.aFloat8535 * f_81_ + f_82_ * this.aFloat8556);
      is[1] = (int)(f_82_ * this.aFloat8508 + f * this.aFloat8531 + this.aFloat8538 * f_81_);
   }

   @Override
   final Class336 method3858() {
      ++anInt8513;
      Class336_Sub1 class336_sub1_83_ = new Class336_Sub1();
      class336_sub1_83_.aFloat8530 = this.aFloat8530;
      class336_sub1_83_.aFloat8550 = this.aFloat8550;
      class336_sub1_83_.aFloat8531 = this.aFloat8531;
      class336_sub1_83_.aFloat8521 = this.aFloat8521;
      class336_sub1_83_.aFloat8556 = this.aFloat8556;
      class336_sub1_83_.aFloat8544 = this.aFloat8544;
      class336_sub1_83_.aFloat8547 = this.aFloat8547;
      class336_sub1_83_.aFloat8529 = this.aFloat8529;
      class336_sub1_83_.aFloat8508 = this.aFloat8508;
      class336_sub1_83_.aFloat8542 = this.aFloat8542;
      class336_sub1_83_.aFloat8538 = this.aFloat8538;
      class336_sub1_83_.aFloat8535 = this.aFloat8535;
      return class336_sub1_83_;
   }

   final void method3888(byte b) {
      this.aFloat8542 = -this.aFloat8542;
      this.aFloat8547 = -this.aFloat8547;
      this.aFloat8538 = -this.aFloat8538;
      ++anInt8519;
      this.aFloat8535 = -this.aFloat8535;
      this.aFloat8508 = -this.aFloat8508;
      this.aFloat8556 = -this.aFloat8556;
      if (b != 81) {
         this.aFloat8550 = 1.0491699F;
      }

      this.aFloat8544 = -this.aFloat8544;
      this.aFloat8521 = -this.aFloat8521;
   }

   @Override
   final void method3856(int i) {
      ++anInt8518;
      float f = Class93.aFloatArray1242[16383 & i];
      float f_84_ = Class93.aFloatArray1238[16383 & i];
      float f_85_ = this.aFloat8530;
      float f_86_ = this.aFloat8531;
      float f_87_ = this.aFloat8529;
      this.aFloat8530 = f_84_ * this.aFloat8547 + f_85_ * f;
      float f_88_ = this.aFloat8550;
      this.aFloat8531 = f_86_ * f + this.aFloat8508 * f_84_;
      this.aFloat8547 = -(f_84_ * f_85_) + f * this.aFloat8547;
      this.aFloat8508 = -(f_84_ * f_86_) + f * this.aFloat8508;
      this.aFloat8529 = f * f_87_ + f_84_ * this.aFloat8556;
      this.aFloat8556 = -(f_84_ * f_87_) + f * this.aFloat8556;
      this.aFloat8550 = f_88_ * f + this.aFloat8542 * f_84_;
      this.aFloat8542 = this.aFloat8542 * f - f_88_ * f_84_;
   }

   @Override
   final void method3867(int i, int i_89_, int i_90_, int[] is) {
      is[0] = (int)(this.aFloat8529 * (float)i_90_ + (float)i_89_ * this.aFloat8531 + (float)i * this.aFloat8530);
      ++anInt8517;
      is[1] = (int)((float)i_89_ * this.aFloat8538 + this.aFloat8544 * (float)i + (float)i_90_ * this.aFloat8535);
      is[2] = (int)((float)i_89_ * this.aFloat8508 + this.aFloat8547 * (float)i + this.aFloat8556 * (float)i_90_);
   }

   final void method3889(float f, byte b, float f_91_, float f_92_) {
      ++anInt8554;
      this.aFloat8529 *= f_91_;
      this.aFloat8547 *= f_92_;
      this.aFloat8508 *= f_92_;
      this.aFloat8535 *= f;
      this.aFloat8530 *= f_91_;
      this.aFloat8550 *= f_91_;
      this.aFloat8544 *= f;
      this.aFloat8542 *= f_92_;
      this.aFloat8521 *= f;
      this.aFloat8531 *= f_91_;
      this.aFloat8556 *= f_92_;
      this.aFloat8538 *= f;
   }

   @Override
   final void method3857(Class336 class336) {
      ++anInt8549;
      Class336_Sub1 class336_sub1_93_ = (Class336_Sub1)class336;
      this.aFloat8547 = class336_sub1_93_.aFloat8547;
      this.aFloat8544 = class336_sub1_93_.aFloat8544;
      this.aFloat8531 = class336_sub1_93_.aFloat8531;
      this.aFloat8538 = class336_sub1_93_.aFloat8538;
      this.aFloat8508 = class336_sub1_93_.aFloat8508;
      this.aFloat8535 = class336_sub1_93_.aFloat8535;
      this.aFloat8529 = class336_sub1_93_.aFloat8529;
      this.aFloat8542 = class336_sub1_93_.aFloat8542;
      this.aFloat8521 = class336_sub1_93_.aFloat8521;
      this.aFloat8530 = class336_sub1_93_.aFloat8530;
      this.aFloat8550 = class336_sub1_93_.aFloat8550;
      this.aFloat8556 = class336_sub1_93_.aFloat8556;
   }

   final void method3890(float f, float[] fs, float f_94_, float f_95_, byte b) {
      fs[2] = f_95_ * this.aFloat8556 + this.aFloat8508 * f_94_ + f * this.aFloat8547;
      fs[0] = this.aFloat8529 * f_95_ + this.aFloat8530 * f + f_94_ * this.aFloat8531;
      ++anInt8541;
      fs[1] = this.aFloat8535 * f_95_ + this.aFloat8538 * f_94_ + this.aFloat8544 * f;
   }

   final float[] method3891(float[] fs, boolean bool) {
      fs[4] = this.aFloat8544;
      fs[3] = this.aFloat8550;
      fs[6] = this.aFloat8535;
      ++anInt8527;
      fs[2] = this.aFloat8529;
      fs[5] = this.aFloat8538;
      fs[1] = this.aFloat8531;
      fs[7] = this.aFloat8521;
      if (!bool) {
         return null;
      } else {
         fs[0] = this.aFloat8530;
         return fs;
      }
   }

   public Class336_Sub1() {
      this.method3862();
   }
}
