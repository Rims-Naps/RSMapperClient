public class PlayerDefinition {
   static int anInt3424;
   static int anInt3425;
   static int anInt3426;
   static int anInt3427;
   static int anInt3428;
   private int renderEmote;
   protected int[] anIntArray3430;
   private TemporaryItemDefinition[] aClass38Array3431;
   static int anInt3432;
   static int anInt3433;
   protected boolean aBoolean3434;
   private int[] anIntArray3435;
   private long aLong3436;
   static int anInt3437;
   static int anInt3438;
   protected int toNPCId = -1;
   private long aLong3440;
   static int anInt3441;

   private final void method3276(int i) {
      ++anInt3425;
      long[] ls = CacheNode_Sub20.aLongArray9626;
      this.aLong3440 = -1L;
      this.aLong3440 = ls[(int)((this.aLong3440 ^ (long)(this.renderEmote >> 8)) & 255L)] ^ this.aLong3440 >>> 8;
      this.aLong3440 = this.aLong3440 >>> 8 ^ ls[(int)(((long)this.renderEmote ^ this.aLong3440) & 255L)];
      if (i != 21428) {
         this.anIntArray3430 = null;
      }

      for(int i_0_ = 0; this.anIntArray3435.length > i_0_; ++i_0_) {
         this.aLong3440 = ls[(int)(255L & (this.aLong3440 ^ (long)(this.anIntArray3435[i_0_] >> 24)))] ^ this.aLong3440 >>> 8;
         this.aLong3440 = ls[(int)(255L & ((long)(this.anIntArray3435[i_0_] >> 16) ^ this.aLong3440))] ^ this.aLong3440 >>> 8;
         this.aLong3440 = this.aLong3440 >>> 8 ^ ls[(int)(255L & (this.aLong3440 ^ (long)(this.anIntArray3435[i_0_] >> 8)))];
         this.aLong3440 = this.aLong3440 >>> 8 ^ ls[(int)((this.aLong3440 ^ (long)this.anIntArray3435[i_0_]) & 255L)];
      }

      if (this.aClass38Array3431 != null) {
         for(int i_1_ = 0; ~i_1_ > ~this.aClass38Array3431.length; ++i_1_) {
            if (this.aClass38Array3431[i_1_] != null) {
               int[] is;
               int[] is_2_;
               if (!this.aBoolean3434) {
                  is = this.aClass38Array3431[i_1_].anIntArray564;
                  is_2_ = this.aClass38Array3431[i_1_].maleWornModelIds;
               } else {
                  is = this.aClass38Array3431[i_1_].anIntArray568;
                  is_2_ = this.aClass38Array3431[i_1_].femaleWornModelIds;
               }

               if (is_2_ != null) {
                  for(int i_3_ = 0; i_3_ < is_2_.length; ++i_3_) {
                     this.aLong3440 = this.aLong3440 >>> 8 ^ ls[(int)(255L & ((long)(is_2_[i_3_] >> 8) ^ this.aLong3440))];
                     this.aLong3440 = ls[(int)(((long)is_2_[i_3_] ^ this.aLong3440) & 255L)] ^ this.aLong3440 >>> 8;
                  }
               }

               if (is != null) {
                  for(int i_4_ = 0; ~i_4_ > ~is.length; ++i_4_) {
                     this.aLong3440 = this.aLong3440 >>> 8 ^ ls[(int)(255L & (this.aLong3440 ^ (long)(is[i_4_] >> 8)))];
                     this.aLong3440 = this.aLong3440 >>> 8 ^ ls[(int)((this.aLong3440 ^ (long)is[i_4_]) & 255L)];
                  }
               }

               if (this.aClass38Array3431[i_1_].modifiedModelColors != null) {
                  for(int i_5_ = 0; ~this.aClass38Array3431[i_1_].modifiedModelColors.length < ~i_5_; ++i_5_) {
                     this.aLong3440 = this.aLong3440 >>> 8
                        ^ ls[(int)(((long)(this.aClass38Array3431[i_1_].modifiedModelColors[i_5_] >> 8) ^ this.aLong3440) & 255L)];
                     this.aLong3440 = this.aLong3440 >>> 8 ^ ls[(int)(255L & ((long)this.aClass38Array3431[i_1_].modifiedModelColors[i_5_] ^ this.aLong3440))];
                  }
               }

               if (this.aClass38Array3431[i_1_].modifiedTextureColors != null) {
                  for(int i_6_ = 0; ~this.aClass38Array3431[i_1_].modifiedTextureColors.length < ~i_6_; ++i_6_) {
                     this.aLong3440 = this.aLong3440 >>> 8
                        ^ ls[(int)(255L & (this.aLong3440 ^ (long)(this.aClass38Array3431[i_1_].modifiedTextureColors[i_6_] >> 8)))];
                     this.aLong3440 = ls[(int)(((long)this.aClass38Array3431[i_1_].modifiedTextureColors[i_6_] ^ this.aLong3440) & 255L)]
                        ^ this.aLong3440 >>> 8;
                  }
               }
            }
         }
      }

      for(int i_7_ = 0; ~i_7_ > -11; ++i_7_) {
         this.aLong3440 = this.aLong3440 >>> 8 ^ ls[(int)(255L & ((long)this.anIntArray3430[i_7_] ^ this.aLong3440))];
      }

      this.aLong3440 = ls[(int)(255L & ((long)(this.aBoolean3434 ? 1 : 0) ^ this.aLong3440))] ^ this.aLong3440 >>> 8;
   }

   static final Class77[] method3277(int i) {
      ++anInt3432;
      return i != 12247 ? null : new Class77[]{Animable_Sub4_Sub2.aClass77_10805, Class67.aClass77_930, Class260.aClass77_5225};
   }

   final void method3278(int[] is, int[] is_8_, TemporaryItemDefinition[] class38s, int i, int i_9_, boolean bool, byte b) {
      this.aClass38Array3431 = class38s;
      this.anIntArray3430 = is;
      this.aBoolean3434 = bool;
      if (this.renderEmote != i_9_) {
         this.renderEmote = i_9_;
      }

      ++anInt3437;
      this.anIntArray3435 = is_8_;
      this.toNPCId = i;
      this.method3276(21428);
   }

   final DrawableModel method3279(
      Class86 class86,
      Animator animator,
      int i,
      boolean bool,
      Class281 class281,
      Class37 class37,
      int i_11_,
      int[] is,
      Class363 class363,
      Class181 class181,
      GraphicsToolkit graphicstoolkit,
      Class279 class279,
      Animator[] animators,
      int i_12_,
      Animator animator_13_,
      Interface17 interface17
   ) {
      ++anInt3438;
      if (this.toNPCId != -1) {
         return class279.getNPCDefinitions(this.toNPCId, (byte)107)
            .prepareModel(interface17, graphicstoolkit, class281, (byte)-115, animator, i_12_, is, null, animator_13_, i_11_, animators);
      } else {
         int i_14_ = i_11_;
         long l = this.aLong3440;
         int[] is_15_ = this.anIntArray3435;
         boolean bool_16_ = false;
         if (i <= 46) {
            return null;
         } else {
            boolean bool_17_ = false;
            if (animator != null) {
               Class48 class48 = animator.method243((byte)-24);
               if (class48 != null && (class48.anInt716 >= 0 || ~class48.anInt713 <= -1)) {
                  is_15_ = new int[this.anIntArray3435.length];

                  for(int i_18_ = 0; ~i_18_ > ~is_15_.length; ++i_18_) {
                     is_15_[i_18_] = this.anIntArray3435[i_18_];
                  }

                  if (class48.anInt716 >= 0 && ~class363.anInt4506 != 0) {
                     if (~class48.anInt716 == -65536) {
                        is_15_[class363.anInt4506] = 0;

                        for(int i_19_ = 0; ~class363.anIntArray4501.length < ~i_19_; ++i_19_) {
                           is_15_[class363.anIntArray4501[i_19_]] = 0;
                        }

                        l ^= -4294967296L;
                     } else {
                        is_15_[class363.anInt4506] = Node_Sub16.method2590(class48.anInt716, 1073741824);

                        for(int i_20_ = 0; class363.anIntArray4501.length > i_20_; ++i_20_) {
                           is_15_[class363.anIntArray4501[i_20_]] = 0;
                        }

                        l ^= (long)is_15_[class363.anInt4506] << 32;
                     }

                     bool_16_ = true;
                  }

                  if (~class48.anInt713 <= -1 && class363.anInt4504 != -1) {
                     bool_17_ = true;
                     if (class48.anInt713 != 65535) {
                        is_15_[class363.anInt4504] = Node_Sub16.method2590(class48.anInt713, 1073741824);

                        for(int i_21_ = 0; i_21_ < class363.anIntArray4507.length; ++i_21_) {
                           is_15_[class363.anIntArray4507[i_21_]] = 0;
                        }

                        l ^= (long)is_15_[class363.anInt4504];
                     } else {
                        is_15_[class363.anInt4504] = 0;

                        for(int i_22_ = 0; ~class363.anIntArray4507.length < ~i_22_; ++i_22_) {
                           is_15_[class363.anIntArray4507[i_22_]] = 0;
                        }

                        l ^= 4294967295L;
                     }
                  }
               }
            }

            boolean bool_23_ = false;
            int i_24_ = animators == null ? 0 : animators.length;

            for(int i_25_ = 0; i_24_ > i_25_; ++i_25_) {
               if (animators[i_25_] != null) {
                  i_14_ |= animators[i_25_].method237((byte)-128);
                  bool_23_ = true;
               }
            }

            if (animator != null) {
               i_14_ |= animator.method237((byte)-127);
               bool_23_ = true;
            }

            if (animator_13_ != null) {
               bool_23_ = true;
               i_14_ |= animator_13_.method237((byte)-126);
            }

            boolean bool_26_ = false;
            if (is != null) {
               for(int i_27_ = 0; i_27_ < is.length; ++i_27_) {
                  if (~is[i_27_] != 0) {
                     bool_26_ = true;
                     i_14_ |= 32;
                  }
               }
            }

            DrawableModel drawablemodel;
            synchronized(Node_Sub36_Sub4.aClass61_10065) {
               drawablemodel = (DrawableModel)Node_Sub36_Sub4.aClass61_10065.method607(l, 0);
            }

            RenderDefinitions class259 = null;
            if (~this.renderEmote != 0) {
               class259 = class281.getAnimationAndSoundDefinitionsFor(this.renderEmote);
            }

            if (drawablemodel == null || ~graphicstoolkit.b(drawablemodel.ua(), i_14_) != -1) {
               if (drawablemodel != null) {
                  i_14_ = graphicstoolkit.c(i_14_, drawablemodel.ua());
               }

               boolean bool_29_ = false;

               for(int i_30_ = 0; ~i_30_ > ~is_15_.length; ++i_30_) {
                  int i_31_ = is_15_[i_30_];
                  TemporaryItemDefinition class38 = null;
                  boolean bool_32_ = false;
                  if (bool_16_) {
                     if (class363.anInt4506 != i_30_) {
                        for(int i_33_ = 0; ~class363.anIntArray4501.length < ~i_33_; ++i_33_) {
                           if (~i_30_ == ~class363.anIntArray4501[i_33_]) {
                              bool_32_ = true;
                              break;
                           }
                        }
                     } else {
                        bool_32_ = true;
                     }
                  }

                  if (bool_17_) {
                     if (class363.anInt4504 != i_30_) {
                        for(int i_34_ = 0; ~class363.anIntArray4507.length < ~i_34_; ++i_34_) {
                           if (class363.anIntArray4507[i_34_] == i_30_) {
                              bool_32_ = true;
                              break;
                           }
                        }
                     } else {
                        bool_32_ = true;
                     }
                  }

                  if ((i_31_ & 1073741824) == 0) {
                     if ((-2147483648 & i_31_) != 0 && !class181.method1825(i_31_ & 1073741823, (byte)119).method3229(0)) {
                        bool_29_ = true;
                     }
                  } else {
                     if (!bool_32_ && this.aClass38Array3431 != null && this.aClass38Array3431[i_30_] != null) {
                        class38 = this.aClass38Array3431[i_30_];
                     }

                     if (!class86.getItemDefinitionForId(1073741823 & i_31_).method1686(this.aBoolean3434, class38, 110)) {
                        bool_29_ = true;
                     }
                  }
               }

               if (bool_29_) {
                  if (~this.aLong3436 != 0L) {
                     synchronized(Node_Sub36_Sub4.aClass61_10065) {
                        drawablemodel = (DrawableModel)Node_Sub36_Sub4.aClass61_10065.method607(this.aLong3436, 0);
                     }
                  }

                  if (drawablemodel == null || graphicstoolkit.b(drawablemodel.ua(), i_14_) != 0) {
                     return null;
                  }
               } else {
                  Model[] models = new Model[is_15_.length];

                  for(int i_35_ = 0; ~is_15_.length < ~i_35_; ++i_35_) {
                     int i_36_ = is_15_[i_35_];
                     TemporaryItemDefinition class38 = null;
                     boolean bool_37_ = i_35_ == 5 && bool_16_ || i_35_ == 3 && bool_17_;
                     if ((i_36_ & 1073741824) == 0) {
                        if ((-2147483648 & i_36_) != 0) {
                           Model model = class181.method1825(1073741823 & i_36_, (byte)101).method3231(0);
                           if (model != null) {
                              models[i_35_] = model;
                           }
                        }
                     } else {
                        if (!bool_37_ && this.aClass38Array3431 != null && this.aClass38Array3431[i_35_] != null) {
                           class38 = this.aClass38Array3431[i_35_];
                        }

                        Model model = class86.getItemDefinitionForId(1073741823 & i_36_).method1683(class38, this.aBoolean3434, -114);
                        if (model != null) {
                           models[i_35_] = model;
                        }
                     }
                  }

                  if (class259 != null && class259.anIntArrayArray3273 != null) {
                     for(int i_38_ = 0; class259.anIntArrayArray3273.length > i_38_; ++i_38_) {
                        if (models[i_38_] != null) {
                           int i_39_ = 0;
                           int i_40_ = 0;
                           int i_41_ = 0;
                           int i_42_ = 0;
                           int i_43_ = 0;
                           int i_44_ = 0;
                           if (class259.anIntArrayArray3273[i_38_] != null) {
                              i_40_ = class259.anIntArrayArray3273[i_38_][1];
                              i_41_ = class259.anIntArrayArray3273[i_38_][2];
                              i_44_ = class259.anIntArrayArray3273[i_38_][5] << 3;
                              i_39_ = class259.anIntArrayArray3273[i_38_][0];
                              i_43_ = class259.anIntArrayArray3273[i_38_][4] << 3;
                              i_42_ = class259.anIntArrayArray3273[i_38_][3] << 3;
                           }

                           if (~i_42_ != -1 || i_43_ != 0 || ~i_44_ != -1) {
                              models[i_38_].method2085(i_44_, i_42_, -120, i_43_);
                           }

                           if (i_39_ != 0 || i_40_ != 0 || i_41_ != 0) {
                              models[i_38_].method2082(i_39_, i_40_, 105, i_41_);
                           }
                        }
                     }
                  }

                  int drawablemodel_47_ = i_14_ | 16384;
                  Model model = new Model(models, models.length);
                  drawablemodel = graphicstoolkit.a(model, drawablemodel_47_, Class157.anInt1972, 64, 850);

                  for(int i_45_ = 0; i_45_ < 10; ++i_45_) {
                     for(int i_46_ = 0; ~i_46_ > ~Class45.aShortArrayArray5265[i_45_].length; ++i_46_) {
                        if (Class117_Sub2.aShortArrayArrayArray5151[i_45_][i_46_].length > this.anIntArray3430[i_45_]) {
                           drawablemodel.ia(
                              Class45.aShortArrayArray5265[i_45_][i_46_], Class117_Sub2.aShortArrayArrayArray5151[i_45_][i_46_][this.anIntArray3430[i_45_]]
                           );
                        }
                     }
                  }

                  if (bool) {
                     drawablemodel.s(i_14_);
                     synchronized(Node_Sub36_Sub4.aClass61_10065) {
                        Node_Sub36_Sub4.aClass61_10065.method601(drawablemodel, 25566, l);
                     }

                     this.aLong3436 = l;
                  }
               }
            }

            DrawableModel drawablemodel_47_ = drawablemodel.method633((byte)4, i_14_, true);
            if (!bool_23_ && !bool_26_) {
               return drawablemodel_47_;
            } else {
               Class336[] class336s = null;
               if (class259 != null) {
                  class336s = class259.method3131(3, graphicstoolkit);
               }

               if (bool_26_ && class336s != null) {
                  for(int i_48_ = 0; ~i_48_ > ~is.length; ++i_48_) {
                     if (class336s[i_48_] != null) {
                        drawablemodel_47_.method630(class336s[i_48_], 1 << i_48_, true);
                     }
                  }
               }

               int i_49_ = 0;

               for(int i_50_ = 1; ~i_49_ > ~i_24_; i_50_ <<= 1) {
                  if (animators[i_49_] != null) {
                     animators[i_49_].method246(i_50_, 0, true, drawablemodel_47_);
                  }

                  ++i_49_;
               }

               if (bool_26_) {
                  for(int i_51_ = 0; is.length > i_51_; ++i_51_) {
                     if (~is[i_51_] != 0) {
                        int i_52_ = -i_12_ + is[i_51_];
                        i_52_ &= 16383;
                        Class336 class336 = graphicstoolkit.y();
                        class336.method3860(i_52_);
                        drawablemodel_47_.method630(class336, 1 << i_51_, false);
                     }
                  }
               }

               if (bool_26_ && class336s != null) {
                  for(int i_53_ = 0; ~i_53_ > ~is.length; ++i_53_) {
                     if (class336s[i_53_] != null) {
                        drawablemodel_47_.method630(class336s[i_53_], 1 << i_53_, false);
                     }
                  }
               }

               if (animator != null && animator_13_ != null) {
                  Node_Sub36.method2754(animator, drawablemodel_47_, animator_13_, (byte)-109);
               } else if (animator != null) {
                  animator.method225(0, drawablemodel_47_, 0);
               } else if (animator_13_ != null) {
                  animator_13_.method225(0, drawablemodel_47_, 0);
               }

               return drawablemodel_47_;
            }
         }
      }
   }

   final void method3280(int i, boolean bool) {
      this.aBoolean3434 = bool;
      ++anInt3441;
      if (i == 26328) {
         this.method3276(21428);
      }
   }

   final void method3281(int i, byte b, Class181 class181, int i_54_) {
      ++anInt3424;
      int i_55_ = Node.anIntArray2802[i_54_];
      if (class181.method1825(i, (byte)120) != null) {
         if (b <= 93) {
            method3277(110);
         }

         this.anIntArray3435[i_55_] = Node_Sub16.method2590(Integer.MIN_VALUE, i);
         this.method3276(21428);
      }
   }

   final void method3282(int i, int i_56_, byte b) {
      ++anInt3433;
      if (b < -35) {
         this.anIntArray3430[i] = i_56_;
         this.method3276(21428);
      }
   }

   final DrawableModel method3283(
      Animator animator, int i, int i_57_, Class37 class37, GraphicsToolkit graphicstoolkit, byte b, Class181 class181, int i_58_, int i_59_
   ) {
      ++anInt3427;
      int i_60_ = animator == null ? i_59_ : i_59_ | animator.method237((byte)-127);
      long l = (long)i | (long)i_57_ << 32 | (long)(i_58_ << 16);
      DrawableModel drawablemodel;
      synchronized(CacheNode_Sub3.aClass61_9446) {
         drawablemodel = (DrawableModel)CacheNode_Sub3.aClass61_9446.method607(l, 0);
      }

      if (drawablemodel == null || graphicstoolkit.b(drawablemodel.ua(), i_60_) != 0) {
         if (drawablemodel != null) {
            i_60_ = graphicstoolkit.c(i_60_, drawablemodel.ua());
         }

         Model[] models = new Model[3];
         int i_62_ = 0;
         if (!class181.method1825(i, (byte)102).method3228(true)
            || !class181.method1825(i_58_, (byte)109).method3228(true)
            || !class181.method1825(i_57_, (byte)107).method3228(true)) {
            return null;
         }

         Model model = class181.method1825(i, (byte)110).method3227((byte)13);
         if (model != null) {
            models[i_62_++] = model;
         }

         model = class181.method1825(i_58_, (byte)121).method3227((byte)90);
         if (model != null) {
            models[i_62_++] = model;
         }

         model = class181.method1825(i_57_, (byte)112).method3227((byte)41);
         if (model != null) {
            models[i_62_++] = model;
         }

         int var23 = i_60_ | 16384;
         model = new Model(models, i_62_);
         drawablemodel = graphicstoolkit.a(model, var23, Class157.anInt1972, 64, 768);

         for(int i_63_ = 0; ~i_63_ > -11; ++i_63_) {
            for(int i_64_ = 0; Class45.aShortArrayArray5265[i_63_].length > i_64_; ++i_64_) {
               if (this.anIntArray3430[i_63_] < Class117_Sub2.aShortArrayArrayArray5151[i_63_][i_64_].length) {
                  drawablemodel.ia(
                     Class45.aShortArrayArray5265[i_63_][i_64_], Class117_Sub2.aShortArrayArrayArray5151[i_63_][i_64_][this.anIntArray3430[i_63_]]
                  );
               }
            }
         }

         drawablemodel.s(i_60_);
         synchronized(CacheNode_Sub3.aClass61_9446) {
            CacheNode_Sub3.aClass61_9446.method601(drawablemodel, 25566, l);
         }
      }

      if (animator == null) {
         return drawablemodel;
      } else {
         drawablemodel = drawablemodel.method633((byte)4, i_60_, true);
         animator.method225(0, drawablemodel, 0);
         return drawablemodel;
      }
   }

   final void method3284(byte b, int i, int i_66_, Class86 class86) {
      ++anInt3426;
      if (i == -1) {
         this.anIntArray3435[i_66_] = 0;
      } else if (class86.getItemDefinitionForId(i) != null) {
         this.anIntArray3435[i_66_] = Node_Sub16.method2590(i, 1073741824);
         this.method3276(21428);
      }
   }

   final DrawableModel prepareModelToInterface(
      Class181 class181,
      byte b,
      Class37 class37,
      Interface17 interface17,
      Animator animator,
      Class86 class86,
      Class279 class279,
      GraphicsToolkit graphicstoolkit,
      int i
   ) {
      ++anInt3428;
      if (~this.toNPCId != 0) {
         return class279.getNPCDefinitions(this.toNPCId, (byte)107).prepareModelToInterface(i, animator, null, 412761072, graphicstoolkit, interface17);
      } else {
         int i_68_ = animator == null ? i : i | animator.method237((byte)-126);
         DrawableModel drawablemodel;
         synchronized(CacheNode_Sub3.aClass61_9446) {
            drawablemodel = (DrawableModel)CacheNode_Sub3.aClass61_9446.method607(this.aLong3440, b + 82);
         }

         if (drawablemodel == null || ~graphicstoolkit.b(drawablemodel.ua(), i_68_) != -1) {
            if (drawablemodel != null) {
               i_68_ = graphicstoolkit.c(i_68_, drawablemodel.ua());
            }

            boolean bool = false;

            for(int i_70_ = 0; this.anIntArray3435.length > i_70_; ++i_70_) {
               int i_71_ = this.anIntArray3435[i_70_];
               TemporaryItemDefinition class38 = null;
               if (~(i_71_ & 1073741824) != -1) {
                  if (this.aClass38Array3431 != null && this.aClass38Array3431[i_70_] != null) {
                     class38 = this.aClass38Array3431[i_70_];
                  }

                  if (!class86.getItemDefinitionForId(1073741823 & i_71_).method1692(b ^ -82, class38, this.aBoolean3434)) {
                     bool = true;
                  }
               } else if ((-2147483648 & i_71_) != 0 && !class181.method1825(1073741823 & i_71_, (byte)109).method3228(true)) {
                  bool = true;
               }
            }

            if (bool) {
               return null;
            }

            Model[] models = new Model[this.anIntArray3435.length];
            int i_72_ = 0;

            for(int i_73_ = 0; this.anIntArray3435.length > i_73_; ++i_73_) {
               int i_74_ = this.anIntArray3435[i_73_];
               TemporaryItemDefinition class38 = null;
               if ((i_74_ & 1073741824) != 0) {
                  if (this.aClass38Array3431 != null && this.aClass38Array3431[i_73_] != null) {
                     class38 = this.aClass38Array3431[i_73_];
                  }

                  Model model = class86.getItemDefinitionForId(i_74_ & 1073741823).method1685(this.aBoolean3434, class38, -116);
                  if (model != null) {
                     models[i_72_++] = model;
                  }
               } else if (~(-2147483648 & i_74_) != -1) {
                  Model model = class181.method1825(1073741823 & i_74_, (byte)117).method3227((byte)29);
                  if (model != null) {
                     models[i_72_++] = model;
                  }
               }
            }

            Model model = new Model(models, i_72_);
            int var22 = i_68_ | 16384;
            drawablemodel = graphicstoolkit.a(model, var22, Class157.anInt1972, 64, 768);

            for(int i_75_ = 0; i_75_ < 10; ++i_75_) {
               for(int i_76_ = 0; i_76_ < Class45.aShortArrayArray5265[i_75_].length; ++i_76_) {
                  if (this.anIntArray3430[i_75_] < Class117_Sub2.aShortArrayArrayArray5151[i_75_][i_76_].length) {
                     drawablemodel.ia(
                        Class45.aShortArrayArray5265[i_75_][i_76_], Class117_Sub2.aShortArrayArrayArray5151[i_75_][i_76_][this.anIntArray3430[i_75_]]
                     );
                  }
               }
            }

            drawablemodel.s(i_68_);
            synchronized(CacheNode_Sub3.aClass61_9446) {
               CacheNode_Sub3.aClass61_9446.method601(drawablemodel, 25566, this.aLong3440);
            }
         }

         if (animator == null) {
            return drawablemodel;
         } else {
            if (b != -82) {
               this.method3282(122, 89, (byte)-50);
            }

            DrawableModel drawablemodel_77_ = drawablemodel.method633((byte)4, i_68_, true);
            animator.method225(0, drawablemodel_77_, 0);
            return drawablemodel_77_;
         }
      }
   }
}
