public class Mobile_Sub4 extends Mobile {
   static int anInt10962;
   static int anInt10963;
   static int anInt10964;
   private EntityNode_Sub4 anEntityNode_Sub4_10965;
   static int anInt10966;
   static int anInt10967;
   private Animator anAnimator10968;
   private int anInt10969;
   static int anInt10970;
   static int anInt10971;
   static int anInt10972;
   static int anInt10973;
   static int anInt10974;
   static int anInt10975;
   private int anInt10976 = 0;
   private boolean aBoolean10977;
   static int anInt10978;
   private int anInt10979;
   static int anInt10980;
   static int anInt10981 = 0;
   static int anInt10982;
   static int anInt10983;
   static int anInt10984;
   static int anInt10985;
   static int anInt10986;
   static int playerPositionX;
   static boolean aBoolean10988 = false;
   static int anInt10989;
   static int anInt10990;
   private int anInt10991;
   static OutgoingPacket aClass318_10992 = new OutgoingPacket(62, 3);
   static int anInt10993;
   static int anInt10994;
   static int anInt10995;

   private final void method907(Class336 class336, DrawableModel drawablemodel, int i, GraphicsToolkit graphicstoolkit) {
      drawablemodel.method614(class336);
      ++anInt10994;
      Class300[] class300s = drawablemodel.method620();
      if (i != -1228) {
         playerPositionX = 20;
      }

      Class218[] class218s = drawablemodel.method618();
      if ((this.anEntityNode_Sub4_10965 == null || this.anEntityNode_Sub4_10965.aBoolean5972) && (class300s != null || class218s != null)) {
         this.anEntityNode_Sub4_10965 = EntityNode_Sub4.method963(Class174.clientCycle, true);
      }

      if (this.anEntityNode_Sub4_10965 != null) {
         this.anEntityNode_Sub4_10965.method952(graphicstoolkit, (long)Class174.clientCycle, class300s, class218s, false);
         this.anEntityNode_Sub4_10965.method967(this.plane, this.aShort9119, this.aShort9130, this.aShort9120, this.aShort9124);
      }
   }

   private final DrawableModel method908(int i, int i_0_, GraphicsToolkit graphicstoolkit, int i_1_) {
      ++anInt10984;
      Class195 class195 = Class16.aClass101_228.method1090(-81, i_0_);
      if (i != 14437) {
         this.method823((byte)29);
      }

      Plane plane = Node_Sub38_Sub37.aPlaneArray10466[this.plane];
      Plane plane_2_ = this.aByte5931 < 3 ? Node_Sub38_Sub37.aPlaneArray10466[1 + this.aByte5931] : null;
      return this.anAnimator10968 != null && !this.anAnimator10968.method238(-18)
         ? class195.method1986((byte)2, true, this.y, this.anAnimator10968, plane_2_, (byte)-122, this.x, plane, i_1_, this.anInt5937, graphicstoolkit)
         : class195.method1986((byte)2, true, this.y, null, plane_2_, (byte)104, this.x, plane, i_1_, this.anInt5937, graphicstoolkit);
   }

   @Override
   protected final void finalize() {
      ++anInt10982;
      if (this.anEntityNode_Sub4_10965 != null) {
         this.anEntityNode_Sub4_10965.method953();
      }
   }

   @Override
   final void method820(GraphicsToolkit graphicstoolkit, int i) {
      if (i != -5) {
         this.method820(null, 72);
      }

      ++anInt10985;
      DrawableModel drawablemodel = this.method908(14437, this.anInt10979, graphicstoolkit, 0);
      if (drawablemodel != null) {
         Class336 class336 = graphicstoolkit.A();
         class336.method3854(this.x, this.anInt5937, this.y);
         this.method907(class336, drawablemodel, -1228, graphicstoolkit);
      }
   }

   @Override
   final boolean method821(int i) {
      if (i != 0) {
         playerPositionX = 119;
      }

      ++anInt10986;
      return false;
   }

   final boolean method909(int i) {
      ++anInt10980;
      if (i != 16) {
         playerPositionX = -4;
      }

      return this.anAnimator10968 != null && !this.anAnimator10968.method242((byte)-77);
   }

   @Override
   final void method811(int i) {
      ++anInt10978;
      if (i == 27811) {
         throw new IllegalStateException();
      }
   }

   @Override
   final int method817(int i) {
      ++anInt10964;
      if (i != 2) {
         this.method813(113);
      }

      return this.anInt10991;
   }

   static final void method910(int i) {
      ++anInt10974;
      if (!aBoolean10988) {
         if (i != 0) {
            aBoolean10988 = true;
         }

         Node_Sub25_Sub1.aBoolean9950 = true;
         Node_Sub36_Sub1.cameraRotationVerticalIncrement += (-12.0F - Node_Sub36_Sub1.cameraRotationVerticalIncrement) / 2.0F;
         aBoolean10988 = true;
      }
   }

   @Override
   final int method823(byte b) {
      ++anInt10993;
      if (b != -21) {
         this.finalize();
      }

      return this.anInt10969;
   }

   static final void method911(byte b) {
      ++anInt10995;
      if (b >= 2) {
         CacheNode_Sub17.anInt8835 = 0;
         int i = (Class295.myPlayer.x >> 9) + Node_Sub53.gameSceneBaseX;
         int i_3_ = Class320_Sub4.gameSceneBaseY + (Class295.myPlayer.y >> 9);
         if (i >= 3053 && ~i >= -3157 && i_3_ >= 3056 && ~i_3_ >= -3137) {
            CacheNode_Sub17.anInt8835 = 1;
         }

         if (i >= 3072 && i <= 3118 && i_3_ >= 9492 && ~i_3_ >= -9536) {
            CacheNode_Sub17.anInt8835 = 1;
         }

         if (CacheNode_Sub17.anInt8835 == 1 && i >= 3139 && ~i >= -3200 && i_3_ >= 3008 && i_3_ <= 3062) {
            CacheNode_Sub17.anInt8835 = 0;
         }
      }
   }

   final void method912(int i, int i_4_) {
      if (this.anAnimator10968 != null && !this.anAnimator10968.method238(-72)) {
         this.anAnimator10968.method248(-92, i_4_);
      }

      ++anInt10963;
      if (i != -24396) {
         anInt10981 = 65;
      }
   }

   @Override
   final boolean method813(int i) {
      if (i != 0) {
         return false;
      } else {
         ++anInt10975;
         return this.aBoolean10977;
      }
   }

   @Override
   final boolean method810(int i, int i_5_, boolean bool, GraphicsToolkit graphicstoolkit) {
      ++anInt10989;
      if (bool) {
         this.method817(-24);
      }

      return false;
   }

   Mobile_Sub4(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool) {
      super(i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, false, (byte)0);
      this.anInt10969 = 0;
      this.aBoolean10977 = true;
      this.anInt10991 = 0;
      this.anInt10979 = i;
      this.anInt10976 = i_16_;
      Class195 class195 = Class16.aClass101_228.method1090(-122, this.anInt10979);
      int i_17_ = class195.anInt2394;
      if (i_17_ != -1) {
         this.anAnimator10968 = new AnimableAnimator(this, false);
         int i_18_ = !class195.aBoolean2402 ? 2 : 0;
         if (bool) {
            i_18_ = 1;
         }

         this.anAnimator10968.setAnimation(i_17_, i_6_, (byte)-87, i_18_, false);
      }
   }

   static final void method913(int i, String string, boolean bool) {
      ++anInt10973;
      string = string.toLowerCase();
      short[] ses = new short[16];
      int i_19_ = 0;
      int i_20_ = !bool ? 0 : '\u8000';
      int i_21_ = (bool ? Node_Sub36_Sub1.aClass109_10035.anInt1369 : Node_Sub36_Sub1.aClass109_10035.anInt1373) + i_20_;

      for(int i_22_ = i_20_; i_22_ < i_21_; ++i_22_) {
         CacheNode_Sub10 cachenode_sub10 = Node_Sub36_Sub1.aClass109_10035.method1128(i_22_, false);
         if (cachenode_sub10.aBoolean9521 && ~cachenode_sub10.method2332(-19244).toLowerCase().indexOf(string) != 0) {
            if (~i_19_ <= -51) {
               Node_Sub20.aShortArray7175 = null;
               Class365_Sub1.anInt8759 = -1;
               return;
            }

            if (~i_19_ <= ~ses.length) {
               short[] ses_23_ = new short[ses.length * 2];

               for(int i_24_ = 0; i_19_ > i_24_; ++i_24_) {
                  ses_23_[i_24_] = ses[i_24_];
               }

               ses = ses_23_;
            }

            ses[i_19_++] = (short)i_22_;
         }
      }

      Animable_Sub1.anInt9096 = 0;
      Class365_Sub1.anInt8759 = i_19_;
      Node_Sub20.aShortArray7175 = ses;
      String[] strings = new String[Class365_Sub1.anInt8759];

      for(int i_26_ = 0; ~Class365_Sub1.anInt8759 < ~i_26_; ++i_26_) {
         strings[i_26_] = Node_Sub36_Sub1.aClass109_10035.method1128(ses[i_26_], false).method2332(-19244);
      }

      Class293.method3461(strings, Node_Sub20.aShortArray7175, -43);
   }

   final void method914(int i) {
      ++anInt10970;
      if (this.anEntityNode_Sub4_10965 != null) {
         this.anEntityNode_Sub4_10965.method953();
      }

      if (i >= -76) {
         this.anInt10976 = -126;
      }
   }

   @Override
   final Class171 method809(GraphicsToolkit graphicstoolkit, int i) {
      ++anInt10983;
      if (i >= -93) {
         this.method810(-78, 64, true, null);
      }

      return null;
   }

   static final void method915(int i, Class54 class54, int i_27_, GraphicsToolkit graphicstoolkit) {
      ++anInt10971;
      if (class54 != null) {
         if (class54.type >= 20) {
            float f = (float)(GLPlane.anInt7920 + -class54.anIntArray810[0]);
            if (f < 0.0F) {
               f *= -1.0F;
            }

            if (Class320_Sub21.anInt8406 < Node_Sub44.aClass54Array7548.length - 2
               && Class121.method1231(0, -51, class54)
               && Class121.method1231(1, i_27_ ^ -35, class54)
               && Class121.method1231(2, -51, class54)
               && Class121.method1231(3, -51, class54)) {
               Node_Sub44.aClass54Array7548[Class320_Sub21.anInt8406++] = class54;
            }
         } else {
            if (Class290_Sub11.anIntArray8180 != null && i <= class54.aByte824) {
               for(int i_28_ = 0; ~Class290_Sub11.anIntArray8180.length < ~i_28_; ++i_28_) {
                  if (~Class290_Sub11.anIntArray8180[i_28_] != 999999
                     && (
                        class54.anIntArray814[0] <= Class290_Sub11.anIntArray8180[i_28_]
                           || ~Class290_Sub11.anIntArray8180[i_28_] <= ~class54.anIntArray814[1]
                           || ~Class290_Sub11.anIntArray8180[i_28_] <= ~class54.anIntArray814[2]
                           || ~Class290_Sub11.anIntArray8180[i_28_] <= ~class54.anIntArray814[3]
                     )
                     && (
                        ~EntityNode_Sub3_Sub1.anIntArray9161[i_28_] <= ~class54.anIntArray810[0]
                           || class54.anIntArray810[1] <= EntityNode_Sub3_Sub1.anIntArray9161[i_28_]
                           || class54.anIntArray810[2] <= EntityNode_Sub3_Sub1.anIntArray9161[i_28_]
                           || EntityNode_Sub3_Sub1.anIntArray9161[i_28_] >= class54.anIntArray810[3]
                     )
                     && (
                        ~class54.anIntArray810[0] <= ~aa_Sub3.anIntArray5490[i_28_]
                           || aa_Sub3.anIntArray5490[i_28_] <= class54.anIntArray810[1]
                           || class54.anIntArray810[2] >= aa_Sub3.anIntArray5490[i_28_]
                           || aa_Sub3.anIntArray5490[i_28_] <= class54.anIntArray810[3]
                     )
                     && (
                        class54.anIntArray820[0] <= Class121.anIntArray1528[i_28_]
                           || ~class54.anIntArray820[1] >= ~Class121.anIntArray1528[i_28_]
                           || ~Class121.anIntArray1528[i_28_] <= ~class54.anIntArray820[2]
                           || ~Class121.anIntArray1528[i_28_] <= ~class54.anIntArray820[3]
                     )
                     && (
                        ~CacheNode_Sub18.anIntArray9605[i_28_] >= ~class54.anIntArray820[0]
                           || ~CacheNode_Sub18.anIntArray9605[i_28_] >= ~class54.anIntArray820[1]
                           || ~CacheNode_Sub18.anIntArray9605[i_28_] >= ~class54.anIntArray820[2]
                           || ~CacheNode_Sub18.anIntArray9605[i_28_] >= ~class54.anIntArray820[3]
                     )) {
                     return;
                  }
               }
            }

            if (class54.type == 1) {
               int i_29_ = Node_Sub9_Sub1.anInt9656 + -Class216.anInt2551 + class54.aShort821;
               if (~i_29_ <= -1 && i_29_ <= Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656) {
                  int i_30_ = class54.aShort815 - EntityNode_Sub7.anInt6013 - -Node_Sub9_Sub1.anInt9656;
                  if (~i_30_ > -1) {
                     i_30_ = 0;
                  } else if (~i_30_ < ~(Node_Sub9_Sub1.anInt9656 - -Node_Sub9_Sub1.anInt9656)) {
                     return;
                  }

                  int i_31_ = Node_Sub9_Sub1.anInt9656 + class54.aShort819 - EntityNode_Sub7.anInt6013;
                  if (~(Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656) <= ~i_31_) {
                     if (i_31_ < 0) {
                        return;
                     }
                  } else {
                     i_31_ = Node_Sub9_Sub1.anInt9656 - -Node_Sub9_Sub1.anInt9656;
                  }

                  boolean bool = false;

                  while(i_30_ <= i_31_) {
                     if (Class139.aBooleanArrayArray1730[i_29_][i_30_++]) {
                        bool = true;
                        break;
                     }
                  }

                  if (bool) {
                     float f = (float)(GLPlane.anInt7920 + -class54.anIntArray810[0]);
                     if (f < 0.0F) {
                        f *= -1.0F;
                     }

                     if (Class320_Sub21.anInt8406 < Node_Sub44.aClass54Array7548.length - 2
                        && (float)Node_Sub38_Sub6.anInt10139 <= f
                        && Class121.method1231(0, -51, class54)
                        && Class121.method1231(1, i_27_ ^ -35, class54)
                        && Class121.method1231(2, -51, class54)
                        && Class121.method1231(3, -51, class54)) {
                        Node_Sub44.aClass54Array7548[Class320_Sub21.anInt8406++] = class54;
                     }
                  }
               }
            } else if (class54.type == 2) {
               int i_32_ = Node_Sub9_Sub1.anInt9656 + class54.aShort815 - EntityNode_Sub7.anInt6013;
               if (i_32_ >= 0 && ~i_32_ >= ~(Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656)) {
                  int i_33_ = Node_Sub9_Sub1.anInt9656 + class54.aShort821 + -Class216.anInt2551;
                  if (i_33_ < 0) {
                     i_33_ = 0;
                  } else if (i_33_ > Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656) {
                     return;
                  }

                  int i_34_ = Node_Sub9_Sub1.anInt9656 + class54.aShort818 - Class216.anInt2551;
                  if (Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 >= i_34_) {
                     if (i_34_ < 0) {
                        return;
                     }
                  } else {
                     i_34_ = Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656;
                  }

                  boolean bool = false;

                  while(i_33_ <= i_34_) {
                     if (Class139.aBooleanArrayArray1730[i_33_++][i_32_]) {
                        bool = true;
                        break;
                     }
                  }

                  if (bool) {
                     float f = (float)(Class380.anInt4889 + -class54.anIntArray820[0]);
                     if (f < 0.0F) {
                        f *= -1.0F;
                     }

                     if (Class320_Sub21.anInt8406 < Node_Sub44.aClass54Array7548.length - 2
                        && f >= (float)Node_Sub38_Sub6.anInt10139
                        && Class121.method1231(0, -51, class54)
                        && Class121.method1231(1, i_27_ + -67, class54)
                        && Class121.method1231(2, -51, class54)
                        && Class121.method1231(3, i_27_ ^ -35, class54)) {
                        Node_Sub44.aClass54Array7548[Class320_Sub21.anInt8406++] = class54;
                     }
                  }
               }
            } else if (class54.type == i_27_ || class54.type == 8) {
               int i_35_ = -Class216.anInt2551 + class54.aShort821 + Node_Sub9_Sub1.anInt9656;
               if (~i_35_ <= -1 && Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 >= i_35_) {
                  int i_36_ = -EntityNode_Sub7.anInt6013 + class54.aShort815 + Node_Sub9_Sub1.anInt9656;
                  if (i_36_ >= 0 && Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 >= i_36_ && Class139.aBooleanArrayArray1730[i_35_][i_36_]) {
                     float f = (float)(GLPlane.anInt7920 - class54.anIntArray810[0]);
                     if (f < 0.0F) {
                        f *= -1.0F;
                     }

                     float f_37_ = (float)(-class54.anIntArray820[0] + Class380.anInt4889);
                     if (f_37_ < 0.0F) {
                        f_37_ *= -1.0F;
                     }

                     if (Class320_Sub21.anInt8406 < Node_Sub44.aClass54Array7548.length - 2
                        && ((float)Node_Sub38_Sub6.anInt10139 <= f || (float)Node_Sub38_Sub6.anInt10139 <= f_37_)
                        && Class121.method1231(0, -51, class54)
                        && Class121.method1231(1, -51, class54)
                        && Class121.method1231(2, i_27_ ^ -35, class54)
                        && Class121.method1231(3, -51, class54)) {
                        Node_Sub44.aClass54Array7548[Class320_Sub21.anInt8406++] = class54;
                     }
                  }
               }
            } else if (class54.type == 4) {
               float f = (float)(class54.anIntArray814[0] - Class194_Sub3.anInt6900);
               if (f > (float)Class134_Sub4.anInt9047) {
                  int i_38_ = -EntityNode_Sub7.anInt6013 + class54.aShort815 + Node_Sub9_Sub1.anInt9656;
                  if (~i_38_ <= -1) {
                     if (i_38_ > Node_Sub9_Sub1.anInt9656 - -Node_Sub9_Sub1.anInt9656) {
                        return;
                     }
                  } else {
                     i_38_ = 0;
                  }

                  int i_39_ = Node_Sub9_Sub1.anInt9656 + class54.aShort819 + -EntityNode_Sub7.anInt6013;
                  if (Node_Sub9_Sub1.anInt9656 - -Node_Sub9_Sub1.anInt9656 >= i_39_) {
                     if (~i_39_ > -1) {
                        return;
                     }
                  } else {
                     i_39_ = Node_Sub9_Sub1.anInt9656 - -Node_Sub9_Sub1.anInt9656;
                  }

                  int i_40_ = -Class216.anInt2551 + class54.aShort821 - -Node_Sub9_Sub1.anInt9656;
                  if (i_40_ >= 0) {
                     if (~(Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656) > ~i_40_) {
                        return;
                     }
                  } else {
                     i_40_ = 0;
                  }

                  int i_41_ = Node_Sub9_Sub1.anInt9656 + -Class216.anInt2551 + class54.aShort818;
                  if (Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 < i_41_) {
                     i_41_ = Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656;
                  } else if (i_41_ < 0) {
                     return;
                  }

                  boolean bool = false;

                  label237:
                  for(int i_42_ = i_40_; i_41_ >= i_42_; ++i_42_) {
                     for(int i_43_ = i_38_; ~i_39_ <= ~i_43_; ++i_43_) {
                        if (Class139.aBooleanArrayArray1730[i_42_][i_43_]) {
                           bool = true;
                           break label237;
                        }
                     }
                  }

                  if (Class320_Sub21.anInt8406 < Node_Sub44.aClass54Array7548.length - 2
                     && bool
                     && Class121.method1231(0, -51, class54)
                     && Class121.method1231(1, i_27_ ^ -35, class54)
                     && Class121.method1231(2, -51, class54)
                     && Class121.method1231(3, i_27_ ^ -35, class54)) {
                     Node_Sub44.aClass54Array7548[Class320_Sub21.anInt8406++] = class54;
                  }
               }
            }
         }
      }
   }

   @Override
   final void method816(int i, boolean bool, GraphicsToolkit graphicstoolkit, int i_44_, byte b, int i_45_, Animable animable) {
      if (b < 101) {
         this.method807(35, null);
      }

      ++anInt10962;
      throw new IllegalStateException();
   }

   @Override
   final EntityNode_Sub6 method807(int i, GraphicsToolkit graphicstoolkit) {
      ++anInt10990;
      DrawableModel drawablemodel = this.method908(14437, this.anInt10979, graphicstoolkit, (~this.anInt10976 == -1 ? 0 : 5) | 2048);
      if (drawablemodel == null) {
         return null;
      } else {
         if (this.anInt10976 != 0) {
            drawablemodel.a(2048 * this.anInt10976);
         }

         Class336 class336 = graphicstoolkit.A();
         class336.method3854(this.x, this.anInt5937, this.y);
         this.method907(class336, drawablemodel, -1228, graphicstoolkit);
         EntityNode_Sub6 entitynode_sub6 = Class345.method3972(false, (byte)99, 1);
         if (Node_Sub15_Sub10.aBoolean9850) {
            drawablemodel.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], Class308.anInt3912, 0);
         } else {
            drawablemodel.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], 0);
         }

         if (this.anEntityNode_Sub4_10965 != null) {
            Class198 class198 = this.anEntityNode_Sub4_10965.method954();
            if (!Node_Sub15_Sub10.aBoolean9850) {
               graphicstoolkit.a(class198);
            } else {
               graphicstoolkit.a(class198, Class308.anInt3912);
            }
         }

         this.aBoolean10977 = drawablemodel.F();
         this.anInt10991 = drawablemodel.fa();
         this.anInt10969 = drawablemodel.ma();
         return entitynode_sub6;
      }
   }

   @Override
   final boolean method814(byte b) {
      ++anInt10966;
      return false;
   }

   public static void method916(int i) {
      aClass318_10992 = null;
      if (i != -1) {
         playerPositionX = -72;
      }
   }

   final boolean method917(int i) {
      ++anInt10967;
      if (i != -12978) {
         return false;
      } else {
         return this.anAnimator10968 == null || this.anAnimator10968.method238(i + 12910);
      }
   }
}
