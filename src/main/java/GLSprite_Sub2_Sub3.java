public class GLSprite_Sub2_Sub3 extends GLSprite_Sub2 {
   private byte[] aByteArray10571;
   private int[] anIntArray10572;

   @Override
   final void method1191(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
      if (this.aPureJavaToolkit8886.method1492()) {
         throw new IllegalStateException();
      } else {
         int i_4_ = this.aPureJavaToolkit8886.anInt6789;
         i += this.anInt8889;
         i_0_ += this.anInt8899;
         int i_5_ = i_0_ * i_4_ + i;
         int i_6_ = 0;
         int i_7_ = this.anInt8897;
         int i_8_ = this.anInt8893;
         int i_9_ = i_4_ - i_8_;
         int i_10_ = 0;
         if (i_0_ < this.aPureJavaToolkit8886.anInt6760) {
            int i_11_ = this.aPureJavaToolkit8886.anInt6760 - i_0_;
            i_7_ -= i_11_;
            i_0_ = this.aPureJavaToolkit8886.anInt6760;
            i_6_ += i_11_ * i_8_;
            i_5_ += i_11_ * i_4_;
         }

         if (i_0_ + i_7_ > this.aPureJavaToolkit8886.anInt6772) {
            i_7_ -= i_0_ + i_7_ - this.aPureJavaToolkit8886.anInt6772;
         }

         if (i < this.aPureJavaToolkit8886.anInt6767) {
            int i_12_ = this.aPureJavaToolkit8886.anInt6767 - i;
            i_8_ -= i_12_;
            i = this.aPureJavaToolkit8886.anInt6767;
            i_6_ += i_12_;
            i_5_ += i_12_;
            i_10_ += i_12_;
            i_9_ += i_12_;
         }

         if (i + i_8_ > this.aPureJavaToolkit8886.anInt6778) {
            int i_13_ = i + i_8_ - this.aPureJavaToolkit8886.anInt6778;
            i_8_ -= i_13_;
            i_10_ += i_13_;
            i_9_ += i_13_;
         }

         if (i_8_ > 0 && i_7_ > 0) {
            int[] is = this.aPureJavaToolkit8886.anIntArray6787;
            if (i_3_ == 0) {
               if (i_1_ == 1) {
                  for(int i_14_ = -i_7_; i_14_ < 0; ++i_14_) {
                     int i_15_;
                     for(i_15_ = i_5_ + i_8_ - 3; i_5_ < i_15_; is[i_5_++] = this.anIntArray10572[this.aByteArray10571[i_6_++] & 255]) {
                        is[i_5_++] = this.anIntArray10572[this.aByteArray10571[i_6_++] & 255];
                        is[i_5_++] = this.anIntArray10572[this.aByteArray10571[i_6_++] & 255];
                        is[i_5_++] = this.anIntArray10572[this.aByteArray10571[i_6_++] & 255];
                     }

                     i_15_ += 3;

                     while(i_5_ < i_15_) {
                        is[i_5_++] = this.anIntArray10572[this.aByteArray10571[i_6_++] & 255];
                     }

                     i_5_ += i_9_;
                     i_6_ += i_10_;
                  }
               } else if (i_1_ == 0) {
                  int i_16_ = (i_2_ & 0xFF0000) >> 16;
                  int i_17_ = (i_2_ & 0xFF00) >> 8;
                  int i_18_ = i_2_ & 0xFF;

                  for(int i_19_ = -i_7_; i_19_ < 0; ++i_19_) {
                     for(int i_20_ = -i_8_; i_20_ < 0; ++i_20_) {
                        int i_21_ = this.anIntArray10572[this.aByteArray10571[i_6_++] & 255];
                        int i_22_ = (i_21_ & 0xFF0000) * i_16_ & 0xFF000000;
                        int i_23_ = (i_21_ & 0xFF00) * i_17_ & 0xFF0000;
                        int i_24_ = (i_21_ & 0xFF) * i_18_ & 0xFF00;
                        is[i_5_++] = (i_22_ | i_23_ | i_24_) >>> 8;
                     }

                     i_5_ += i_9_;
                     i_6_ += i_10_;
                  }
               } else if (i_1_ == 3) {
                  for(int i_25_ = -i_7_; i_25_ < 0; ++i_25_) {
                     for(int i_26_ = -i_8_; i_26_ < 0; ++i_26_) {
                        int i_27_ = this.anIntArray10572[this.aByteArray10571[i_6_++] & 255];
                        int i_28_ = i_27_ + i_2_;
                        int i_29_ = (i_27_ & 16711935) + (i_2_ & 16711935);
                        int i_30_ = (i_29_ & 16777472) + (i_28_ - i_29_ & 65536);
                        is[i_5_++] = i_28_ - i_30_ | i_30_ - (i_30_ >>> 8);
                     }

                     i_5_ += i_9_;
                     i_6_ += i_10_;
                  }
               } else if (i_1_ != 2) {
                  throw new IllegalArgumentException();
               } else {
                  int i_31_ = i_2_ >>> 24;
                  int i_32_ = 256 - i_31_;
                  int i_33_ = (i_2_ & 16711935) * i_32_ & -16711936;
                  int i_34_ = (i_2_ & 0xFF00) * i_32_ & 0xFF0000;
                  i_2_ = (i_33_ | i_34_) >>> 8;

                  for(int i_35_ = -i_7_; i_35_ < 0; ++i_35_) {
                     for(int i_36_ = -i_8_; i_36_ < 0; ++i_36_) {
                        int i_37_ = this.anIntArray10572[this.aByteArray10571[i_6_++] & 255];
                        i_33_ = (i_37_ & 16711935) * i_31_ & -16711936;
                        i_34_ = (i_37_ & 0xFF00) * i_31_ & 0xFF0000;
                        is[i_5_++] = ((i_33_ | i_34_) >>> 8) + i_2_;
                     }

                     i_5_ += i_9_;
                     i_6_ += i_10_;
                  }
               }
            } else if (i_3_ == 1) {
               if (i_1_ == 1) {
                  for(int i_38_ = -i_7_; i_38_ < 0; ++i_38_) {
                     for(int i_39_ = -i_8_; i_39_ < 0; ++i_39_) {
                        int i_40_ = this.aByteArray10571[i_6_++];
                        if (i_40_ != 0) {
                           int i_41_ = this.anIntArray10572[i_40_ & 0xFF] | 0xFF000000;
                           int i_42_ = 255;
                           int i_43_ = 0;
                           int i_44_ = is[i_5_];
                           is[i_5_++] = (((i_41_ & 16711935) * i_42_ + (i_44_ & 16711935) * i_43_ & -16711936) >> 8)
                              + (((i_41_ & -16711936) >>> 8) * i_42_ + ((i_44_ & -16711936) >>> 8) * i_43_ & -16711936);
                        } else {
                           ++i_5_;
                        }
                     }

                     i_5_ += i_9_;
                     i_6_ += i_10_;
                  }
               } else if (i_1_ == 0) {
                  if ((i_2_ & 16777215) == 16777215) {
                     int i_45_ = i_2_ >>> 24;
                     int i_46_ = 256 - i_45_;

                     for(int i_47_ = -i_7_; i_47_ < 0; ++i_47_) {
                        for(int i_48_ = -i_8_; i_48_ < 0; ++i_48_) {
                           int i_49_ = this.aByteArray10571[i_6_++];
                           if (i_49_ != 0) {
                              int i_50_ = this.anIntArray10572[i_49_ & 0xFF];
                              int i_51_ = is[i_5_];
                              is[i_5_++] = ((i_50_ & 16711935) * i_45_ + (i_51_ & 16711935) * i_46_ & -16711936)
                                    + ((i_50_ & 0xFF00) * i_45_ + (i_51_ & 0xFF00) * i_46_ & 0xFF0000)
                                 >> 8;
                           } else {
                              ++i_5_;
                           }
                        }

                        i_5_ += i_9_;
                        i_6_ += i_10_;
                     }
                  } else {
                     int i_52_ = (i_2_ & 0xFF0000) >> 16;
                     int i_53_ = (i_2_ & 0xFF00) >> 8;
                     int i_54_ = i_2_ & 0xFF;
                     int i_55_ = i_2_ >>> 24;
                     int i_56_ = 256 - i_55_;

                     for(int i_57_ = -i_7_; i_57_ < 0; ++i_57_) {
                        for(int i_58_ = -i_8_; i_58_ < 0; ++i_58_) {
                           int i_59_ = this.aByteArray10571[i_6_++];
                           if (i_59_ != 0) {
                              int i_60_ = this.anIntArray10572[i_59_ & 0xFF];
                              if (i_55_ != 255) {
                                 int i_61_ = (i_60_ & 0xFF0000) * i_52_ & 0xFF000000;
                                 int i_62_ = (i_60_ & 0xFF00) * i_53_ & 0xFF0000;
                                 int i_63_ = (i_60_ & 0xFF) * i_54_ & 0xFF00;
                                 i_60_ = (i_61_ | i_62_ | i_63_) >>> 8;
                                 int i_64_ = is[i_5_];
                                 is[i_5_++] = ((i_60_ & 16711935) * i_55_ + (i_64_ & 16711935) * i_56_ & -16711936)
                                       + ((i_60_ & 0xFF00) * i_55_ + (i_64_ & 0xFF00) * i_56_ & 0xFF0000)
                                    >> 8;
                              } else {
                                 int i_65_ = (i_60_ & 0xFF0000) * i_52_ & 0xFF000000;
                                 int i_66_ = (i_60_ & 0xFF00) * i_53_ & 0xFF0000;
                                 int i_67_ = (i_60_ & 0xFF) * i_54_ & 0xFF00;
                                 is[i_5_++] = (i_65_ | i_66_ | i_67_) >>> 8;
                              }
                           } else {
                              ++i_5_;
                           }
                        }

                        i_5_ += i_9_;
                        i_6_ += i_10_;
                     }
                  }
               } else if (i_1_ == 3) {
                  int i_68_ = i_2_ >>> 24;
                  int i_69_ = 256 - i_68_;

                  for(int i_70_ = -i_7_; i_70_ < 0; ++i_70_) {
                     for(int i_71_ = -i_8_; i_71_ < 0; ++i_71_) {
                        byte b = this.aByteArray10571[i_6_++];
                        int i_72_ = b > 0 ? this.anIntArray10572[b] : 0;
                        int i_73_ = i_72_ + i_2_;
                        int i_74_ = (i_72_ & 16711935) + (i_2_ & 16711935);
                        int i_75_ = (i_74_ & 16777472) + (i_73_ - i_74_ & 65536);
                        i_75_ = i_73_ - i_75_ | i_75_ - (i_75_ >>> 8);
                        if (i_72_ == 0 && i_68_ != 255) {
                           int var144 = is[i_5_];
                           i_75_ = ((i_75_ & 16711935) * i_68_ + (var144 & 16711935) * i_69_ & -16711936)
                                 + ((i_75_ & 0xFF00) * i_68_ + (var144 & 0xFF00) * i_69_ & 0xFF0000)
                              >> 8;
                        }

                        is[i_5_++] = i_75_;
                     }

                     i_5_ += i_9_;
                     i_6_ += i_10_;
                  }
               } else if (i_1_ != 2) {
                  throw new IllegalArgumentException();
               } else {
                  int i_76_ = i_2_ >>> 24;
                  int i_77_ = 256 - i_76_;
                  int i_78_ = (i_2_ & 16711935) * i_77_ & -16711936;
                  int i_79_ = (i_2_ & 0xFF00) * i_77_ & 0xFF0000;
                  i_2_ = (i_78_ | i_79_) >>> 8;

                  for(int i_80_ = -i_7_; i_80_ < 0; ++i_80_) {
                     for(int i_81_ = -i_8_; i_81_ < 0; ++i_81_) {
                        int i_82_ = this.aByteArray10571[i_6_++];
                        if (i_82_ != 0) {
                           int i_83_ = this.anIntArray10572[i_82_ & 0xFF];
                           i_78_ = (i_83_ & 16711935) * i_76_ & -16711936;
                           i_79_ = (i_83_ & 0xFF00) * i_76_ & 0xFF0000;
                           is[i_5_++] = ((i_78_ | i_79_) >>> 8) + i_2_;
                        } else {
                           ++i_5_;
                        }
                     }

                     i_5_ += i_9_;
                     i_6_ += i_10_;
                  }
               }
            } else if (i_3_ != 2) {
               throw new IllegalArgumentException();
            } else if (i_1_ == 1) {
               for(int i_84_ = -i_7_; i_84_ < 0; ++i_84_) {
                  for(int i_85_ = -i_8_; i_85_ < 0; ++i_85_) {
                     int i_86_ = this.aByteArray10571[i_6_++];
                     if (i_86_ != 0) {
                        int i_87_ = this.anIntArray10572[i_86_ & 0xFF];
                        int i_88_ = is[i_5_];
                        int i_89_ = i_87_ + i_88_;
                        int i_90_ = (i_87_ & 16711935) + (i_88_ & 16711935);
                        i_88_ = (i_90_ & 16777472) + (i_89_ - i_90_ & 65536);
                        is[i_5_++] = i_89_ - i_88_ | i_88_ - (i_88_ >>> 8);
                     } else {
                        ++i_5_;
                     }
                  }

                  i_5_ += i_9_;
                  i_6_ += i_10_;
               }
            } else if (i_1_ == 0) {
               int i_91_ = (i_2_ & 0xFF0000) >> 16;
               int i_92_ = (i_2_ & 0xFF00) >> 8;
               int i_93_ = i_2_ & 0xFF;

               for(int i_94_ = -i_7_; i_94_ < 0; ++i_94_) {
                  for(int i_95_ = -i_8_; i_95_ < 0; ++i_95_) {
                     int i_96_ = this.aByteArray10571[i_6_++];
                     if (i_96_ != 0) {
                        int i_97_ = this.anIntArray10572[i_96_ & 0xFF];
                        int i_98_ = (i_97_ & 0xFF0000) * i_91_ & 0xFF000000;
                        int i_99_ = (i_97_ & 0xFF00) * i_92_ & 0xFF0000;
                        int i_100_ = (i_97_ & 0xFF) * i_93_ & 0xFF00;
                        i_97_ = (i_98_ | i_99_ | i_100_) >>> 8;
                        int i_101_ = is[i_5_];
                        int i_102_ = i_97_ + i_101_;
                        int i_103_ = (i_97_ & 16711935) + (i_101_ & 16711935);
                        i_101_ = (i_103_ & 16777472) + (i_102_ - i_103_ & 65536);
                        is[i_5_++] = i_102_ - i_101_ | i_101_ - (i_101_ >>> 8);
                     } else {
                        ++i_5_;
                     }
                  }

                  i_5_ += i_9_;
                  i_6_ += i_10_;
               }
            } else if (i_1_ == 3) {
               for(int i_104_ = -i_7_; i_104_ < 0; ++i_104_) {
                  for(int i_105_ = -i_8_; i_105_ < 0; ++i_105_) {
                     byte b = this.aByteArray10571[i_6_++];
                     int i_106_ = b > 0 ? this.anIntArray10572[b] : 0;
                     int i_107_ = i_106_ + i_2_;
                     int i_108_ = (i_106_ & 16711935) + (i_2_ & 16711935);
                     int i_109_ = (i_108_ & 16777472) + (i_107_ - i_108_ & 65536);
                     i_106_ = i_107_ - i_109_ | i_109_ - (i_109_ >>> 8);
                     i_109_ = is[i_5_];
                     i_107_ = i_106_ + i_109_;
                     i_108_ = (i_106_ & 16711935) + (i_109_ & 16711935);
                     i_109_ = (i_108_ & 16777472) + (i_107_ - i_108_ & 65536);
                     is[i_5_++] = i_107_ - i_109_ | i_109_ - (i_109_ >>> 8);
                  }

                  i_5_ += i_9_;
                  i_6_ += i_10_;
               }
            } else if (i_1_ != 2) {
               throw new IllegalArgumentException();
            } else {
               int i_110_ = i_2_ >>> 24;
               int i_111_ = 256 - i_110_;
               int i_112_ = (i_2_ & 16711935) * i_111_ & -16711936;
               int i_113_ = (i_2_ & 0xFF00) * i_111_ & 0xFF0000;
               i_2_ = (i_112_ | i_113_) >>> 8;

               for(int i_114_ = -i_7_; i_114_ < 0; ++i_114_) {
                  for(int i_115_ = -i_8_; i_115_ < 0; ++i_115_) {
                     int i_116_ = this.aByteArray10571[i_6_++];
                     if (i_116_ != 0) {
                        int i_117_ = this.anIntArray10572[i_116_ & 0xFF];
                        i_112_ = (i_117_ & 16711935) * i_110_ & -16711936;
                        i_113_ = (i_117_ & 0xFF00) * i_110_ & 0xFF0000;
                        i_117_ = ((i_112_ | i_113_) >>> 8) + i_2_;
                        int i_118_ = is[i_5_];
                        int i_119_ = i_117_ + i_118_;
                        int i_120_ = (i_117_ & 16711935) + (i_118_ & 16711935);
                        i_118_ = (i_120_ & 16777472) + (i_119_ - i_120_ & 65536);
                        is[i_5_++] = i_119_ - i_118_ | i_118_ - (i_118_ >>> 8);
                     } else {
                        ++i_5_;
                     }
                  }

                  i_5_ += i_9_;
                  i_6_ += i_10_;
               }
            }
         }
      }
   }

   @Override
   final void method1210(int[] is, int[] is_121_, int i, int i_122_) {
      int[] is_123_ = this.aPureJavaToolkit8886.anIntArray6787;
      if (GLSprite_Sub2.anInt8913 == 0) {
         if (GLSprite_Sub2.anInt8900 == 0) {
            for(int i_124_ = GLSprite_Sub2.anInt8888; i_124_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
               int i_125_ = i_124_ + i_122_;
               if (i_125_ >= 0) {
                  if (i_125_ >= is.length) {
                     break;
                  }

                  int i_126_ = GLSprite_Sub2.anInt8882;
                  int i_127_ = GLSprite_Sub2.anInt8901;
                  int i_128_ = GLSprite_Sub2.anInt8908;
                  int i_129_ = GLSprite_Sub2.anInt8894;
                  if (i_127_ >= 0 && i_128_ >= 0 && i_127_ - (this.anInt8893 << 12) < 0 && i_128_ - (this.anInt8897 << 12) < 0) {
                     int i_130_ = is[i_125_] - i;
                     int i_131_ = -is_121_[i_125_];
                     int i_132_ = i_130_ - (i_126_ - GLSprite_Sub2.anInt8882);
                     if (i_132_ > 0) {
                        i_126_ += i_132_;
                        i_129_ += i_132_;
                        i_127_ += GLSprite_Sub2.anInt8913 * i_132_;
                        i_128_ += GLSprite_Sub2.anInt8900 * i_132_;
                     } else {
                        i_131_ -= i_132_;
                     }

                     if (i_129_ < i_131_) {
                        i_129_ = i_131_;
                     }

                     for(; i_129_ < 0; ++i_129_) {
                        int i_133_ = this.aByteArray10571[(i_128_ >> 12) * this.anInt8893 + (i_127_ >> 12)];
                        if (i_133_ != 0) {
                           is_123_[i_126_++] = this.anIntArray10572[i_133_ & 0xFF];
                        } else {
                           ++i_126_;
                        }
                     }
                  }
               }

               ++i_124_;
            }
         } else if (GLSprite_Sub2.anInt8900 < 0) {
            for(int i_134_ = GLSprite_Sub2.anInt8888; i_134_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
               int i_135_ = i_134_ + i_122_;
               if (i_135_ >= 0) {
                  if (i_135_ >= is.length) {
                     break;
                  }

                  int i_136_ = GLSprite_Sub2.anInt8882;
                  int i_137_ = GLSprite_Sub2.anInt8901;
                  int i_138_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
                  int i_139_ = GLSprite_Sub2.anInt8894;
                  if (i_137_ >= 0 && i_137_ - (this.anInt8893 << 12) < 0) {
                     int i_140_;
                     if ((i_140_ = i_138_ - (this.anInt8897 << 12)) >= 0) {
                        i_140_ = (GLSprite_Sub2.anInt8900 - i_140_) / GLSprite_Sub2.anInt8900;
                        i_139_ += i_140_;
                        i_138_ += GLSprite_Sub2.anInt8900 * i_140_;
                        i_136_ += i_140_;
                     }

                     if ((i_140_ = (i_138_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_139_) {
                        i_139_ = i_140_;
                     }

                     int i_141_ = is[i_135_] - i;
                     int i_142_ = -is_121_[i_135_];
                     int i_143_ = i_141_ - (i_136_ - GLSprite_Sub2.anInt8882);
                     if (i_143_ > 0) {
                        i_136_ += i_143_;
                        i_139_ += i_143_;
                        i_137_ += GLSprite_Sub2.anInt8913 * i_143_;
                        i_138_ += GLSprite_Sub2.anInt8900 * i_143_;
                     } else {
                        i_142_ -= i_143_;
                     }

                     if (i_139_ < i_142_) {
                        i_139_ = i_142_;
                     }

                     while(i_139_ < 0) {
                        int i_144_ = this.aByteArray10571[(i_138_ >> 12) * this.anInt8893 + (i_137_ >> 12)];
                        if (i_144_ != 0) {
                           is_123_[i_136_++] = this.anIntArray10572[i_144_ & 0xFF];
                        } else {
                           ++i_136_;
                        }

                        i_138_ += GLSprite_Sub2.anInt8900;
                        ++i_139_;
                     }
                  }
               }

               ++i_134_;
               GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
            }
         } else {
            for(int i_145_ = GLSprite_Sub2.anInt8888; i_145_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
               int i_146_ = i_145_ + i_122_;
               if (i_146_ >= 0) {
                  if (i_146_ >= is.length) {
                     break;
                  }

                  int i_147_ = GLSprite_Sub2.anInt8882;
                  int i_148_ = GLSprite_Sub2.anInt8901;
                  int i_149_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
                  int i_150_ = GLSprite_Sub2.anInt8894;
                  if (i_148_ >= 0 && i_148_ - (this.anInt8893 << 12) < 0) {
                     if (i_149_ < 0) {
                        int i_151_ = (GLSprite_Sub2.anInt8900 - 1 - i_149_) / GLSprite_Sub2.anInt8900;
                        i_150_ += i_151_;
                        i_149_ += GLSprite_Sub2.anInt8900 * i_151_;
                        i_147_ += i_151_;
                     }

                     int i_152_;
                     if ((i_152_ = (1 + i_149_ - (this.anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_150_) {
                        i_150_ = i_152_;
                     }

                     int i_153_ = is[i_146_] - i;
                     int i_154_ = -is_121_[i_146_];
                     int i_155_ = i_153_ - (i_147_ - GLSprite_Sub2.anInt8882);
                     if (i_155_ > 0) {
                        i_147_ += i_155_;
                        i_150_ += i_155_;
                        i_148_ += GLSprite_Sub2.anInt8913 * i_155_;
                        i_149_ += GLSprite_Sub2.anInt8900 * i_155_;
                     } else {
                        i_154_ -= i_155_;
                     }

                     if (i_150_ < i_154_) {
                        i_150_ = i_154_;
                     }

                     while(i_150_ < 0) {
                        int i_156_ = this.aByteArray10571[(i_149_ >> 12) * this.anInt8893 + (i_148_ >> 12)];
                        if (i_156_ != 0) {
                           is_123_[i_147_++] = this.anIntArray10572[i_156_ & 0xFF];
                        } else {
                           ++i_147_;
                        }

                        i_149_ += GLSprite_Sub2.anInt8900;
                        ++i_150_;
                     }
                  }
               }

               ++i_145_;
               GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
            }
         }
      } else if (GLSprite_Sub2.anInt8913 < 0) {
         if (GLSprite_Sub2.anInt8900 == 0) {
            for(int i_157_ = GLSprite_Sub2.anInt8888; i_157_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
               int i_158_ = i_157_ + i_122_;
               if (i_158_ >= 0) {
                  if (i_158_ >= is.length) {
                     break;
                  }

                  int i_159_ = GLSprite_Sub2.anInt8882;
                  int i_160_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
                  int i_161_ = GLSprite_Sub2.anInt8908;
                  int i_162_ = GLSprite_Sub2.anInt8894;
                  if (i_161_ >= 0 && i_161_ - (this.anInt8897 << 12) < 0) {
                     int i_163_;
                     if ((i_163_ = i_160_ - (this.anInt8893 << 12)) >= 0) {
                        i_163_ = (GLSprite_Sub2.anInt8913 - i_163_) / GLSprite_Sub2.anInt8913;
                        i_162_ += i_163_;
                        i_160_ += GLSprite_Sub2.anInt8913 * i_163_;
                        i_159_ += i_163_;
                     }

                     if ((i_163_ = (i_160_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_162_) {
                        i_162_ = i_163_;
                     }

                     int i_164_ = is[i_158_] - i;
                     int i_165_ = -is_121_[i_158_];
                     int i_166_ = i_164_ - (i_159_ - GLSprite_Sub2.anInt8882);
                     if (i_166_ > 0) {
                        i_159_ += i_166_;
                        i_162_ += i_166_;
                        i_160_ += GLSprite_Sub2.anInt8913 * i_166_;
                        i_161_ += GLSprite_Sub2.anInt8900 * i_166_;
                     } else {
                        i_165_ -= i_166_;
                     }

                     if (i_162_ < i_165_) {
                        i_162_ = i_165_;
                     }

                     while(i_162_ < 0) {
                        int i_167_ = this.aByteArray10571[(i_161_ >> 12) * this.anInt8893 + (i_160_ >> 12)];
                        if (i_167_ != 0) {
                           is_123_[i_159_++] = this.anIntArray10572[i_167_ & 0xFF];
                        } else {
                           ++i_159_;
                        }

                        i_160_ += GLSprite_Sub2.anInt8913;
                        ++i_162_;
                     }
                  }
               }

               ++i_157_;
               GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
            }
         } else if (GLSprite_Sub2.anInt8900 < 0) {
            for(int i_168_ = GLSprite_Sub2.anInt8888; i_168_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
               int i_169_ = i_168_ + i_122_;
               if (i_169_ >= 0) {
                  if (i_169_ >= is.length) {
                     break;
                  }

                  int i_170_ = GLSprite_Sub2.anInt8882;
                  int i_171_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
                  int i_172_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
                  int i_173_ = GLSprite_Sub2.anInt8894;
                  int i_174_;
                  if ((i_174_ = i_171_ - (this.anInt8893 << 12)) >= 0) {
                     i_174_ = (GLSprite_Sub2.anInt8913 - i_174_) / GLSprite_Sub2.anInt8913;
                     i_173_ += i_174_;
                     i_171_ += GLSprite_Sub2.anInt8913 * i_174_;
                     i_172_ += GLSprite_Sub2.anInt8900 * i_174_;
                     i_170_ += i_174_;
                  }

                  if ((i_174_ = (i_171_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_173_) {
                     i_173_ = i_174_;
                  }

                  if ((i_174_ = i_172_ - (this.anInt8897 << 12)) >= 0) {
                     i_174_ = (GLSprite_Sub2.anInt8900 - i_174_) / GLSprite_Sub2.anInt8900;
                     i_173_ += i_174_;
                     i_171_ += GLSprite_Sub2.anInt8913 * i_174_;
                     i_172_ += GLSprite_Sub2.anInt8900 * i_174_;
                     i_170_ += i_174_;
                  }

                  if ((i_174_ = (i_172_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_173_) {
                     i_173_ = i_174_;
                  }

                  int i_175_ = is[i_169_] - i;
                  int i_176_ = -is_121_[i_169_];
                  int i_177_ = i_175_ - (i_170_ - GLSprite_Sub2.anInt8882);
                  if (i_177_ > 0) {
                     i_170_ += i_177_;
                     i_173_ += i_177_;
                     i_171_ += GLSprite_Sub2.anInt8913 * i_177_;
                     i_172_ += GLSprite_Sub2.anInt8900 * i_177_;
                  } else {
                     i_176_ -= i_177_;
                  }

                  if (i_173_ < i_176_) {
                     i_173_ = i_176_;
                  }

                  while(i_173_ < 0) {
                     int i_178_ = this.aByteArray10571[(i_172_ >> 12) * this.anInt8893 + (i_171_ >> 12)];
                     if (i_178_ != 0) {
                        is_123_[i_170_++] = this.anIntArray10572[i_178_ & 0xFF];
                     } else {
                        ++i_170_;
                     }

                     i_171_ += GLSprite_Sub2.anInt8913;
                     i_172_ += GLSprite_Sub2.anInt8900;
                     ++i_173_;
                  }
               }

               ++i_168_;
               GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
               GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
            }
         } else {
            for(int i_179_ = GLSprite_Sub2.anInt8888; i_179_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
               int i_180_ = i_179_ + i_122_;
               if (i_180_ >= 0) {
                  if (i_180_ >= is.length) {
                     break;
                  }

                  int i_181_ = GLSprite_Sub2.anInt8882;
                  int i_182_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
                  int i_183_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
                  int i_184_ = GLSprite_Sub2.anInt8894;
                  int i_185_;
                  if ((i_185_ = i_182_ - (this.anInt8893 << 12)) >= 0) {
                     i_185_ = (GLSprite_Sub2.anInt8913 - i_185_) / GLSprite_Sub2.anInt8913;
                     i_184_ += i_185_;
                     i_182_ += GLSprite_Sub2.anInt8913 * i_185_;
                     i_183_ += GLSprite_Sub2.anInt8900 * i_185_;
                     i_181_ += i_185_;
                  }

                  if ((i_185_ = (i_182_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_184_) {
                     i_184_ = i_185_;
                  }

                  if (i_183_ < 0) {
                     i_185_ = (GLSprite_Sub2.anInt8900 - 1 - i_183_) / GLSprite_Sub2.anInt8900;
                     i_184_ += i_185_;
                     i_182_ += GLSprite_Sub2.anInt8913 * i_185_;
                     i_183_ += GLSprite_Sub2.anInt8900 * i_185_;
                     i_181_ += i_185_;
                  }

                  if ((i_185_ = (1 + i_183_ - (this.anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_184_) {
                     i_184_ = i_185_;
                  }

                  int i_186_ = is[i_180_] - i;
                  int i_187_ = -is_121_[i_180_];
                  int i_188_ = i_186_ - (i_181_ - GLSprite_Sub2.anInt8882);
                  if (i_188_ > 0) {
                     i_181_ += i_188_;
                     i_184_ += i_188_;
                     i_182_ += GLSprite_Sub2.anInt8913 * i_188_;
                     i_183_ += GLSprite_Sub2.anInt8900 * i_188_;
                  } else {
                     i_187_ -= i_188_;
                  }

                  if (i_184_ < i_187_) {
                     i_184_ = i_187_;
                  }

                  while(i_184_ < 0) {
                     int i_189_ = this.aByteArray10571[(i_183_ >> 12) * this.anInt8893 + (i_182_ >> 12)];
                     if (i_189_ != 0) {
                        is_123_[i_181_++] = this.anIntArray10572[i_189_ & 0xFF];
                     } else {
                        ++i_181_;
                     }

                     i_182_ += GLSprite_Sub2.anInt8913;
                     i_183_ += GLSprite_Sub2.anInt8900;
                     ++i_184_;
                  }
               }

               ++i_179_;
               GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
               GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
            }
         }
      } else if (GLSprite_Sub2.anInt8900 == 0) {
         for(int i_190_ = GLSprite_Sub2.anInt8888; i_190_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
            int i_191_ = i_190_ + i_122_;
            if (i_191_ >= 0) {
               if (i_191_ >= is.length) {
                  break;
               }

               int i_192_ = GLSprite_Sub2.anInt8882;
               int i_193_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
               int i_194_ = GLSprite_Sub2.anInt8908;
               int i_195_ = GLSprite_Sub2.anInt8894;
               if (i_194_ >= 0 && i_194_ - (this.anInt8897 << 12) < 0) {
                  if (i_193_ < 0) {
                     int i_196_ = (GLSprite_Sub2.anInt8913 - 1 - i_193_) / GLSprite_Sub2.anInt8913;
                     i_195_ += i_196_;
                     i_193_ += GLSprite_Sub2.anInt8913 * i_196_;
                     i_192_ += i_196_;
                  }

                  int i_197_;
                  if ((i_197_ = (1 + i_193_ - (this.anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_195_) {
                     i_195_ = i_197_;
                  }

                  int i_198_ = is[i_191_] - i;
                  int i_199_ = -is_121_[i_191_];
                  int i_200_ = i_198_ - (i_192_ - GLSprite_Sub2.anInt8882);
                  if (i_200_ > 0) {
                     i_192_ += i_200_;
                     i_195_ += i_200_;
                     i_193_ += GLSprite_Sub2.anInt8913 * i_200_;
                     i_194_ += GLSprite_Sub2.anInt8900 * i_200_;
                  } else {
                     i_199_ -= i_200_;
                  }

                  if (i_195_ < i_199_) {
                     i_195_ = i_199_;
                  }

                  while(i_195_ < 0) {
                     int i_201_ = this.aByteArray10571[(i_194_ >> 12) * this.anInt8893 + (i_193_ >> 12)];
                     if (i_201_ != 0) {
                        is_123_[i_192_++] = this.anIntArray10572[i_201_ & 0xFF];
                     } else {
                        ++i_192_;
                     }

                     i_193_ += GLSprite_Sub2.anInt8913;
                     ++i_195_;
                  }
               }
            }

            ++i_190_;
            GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
            GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
         }
      } else if (GLSprite_Sub2.anInt8900 < 0) {
         for(int i_202_ = GLSprite_Sub2.anInt8888; i_202_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
            int i_203_ = i_202_ + i_122_;
            if (i_203_ >= 0) {
               if (i_203_ >= is.length) {
                  break;
               }

               int i_204_ = GLSprite_Sub2.anInt8882;
               int i_205_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
               int i_206_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
               int i_207_ = GLSprite_Sub2.anInt8894;
               if (i_205_ < 0) {
                  int i_208_ = (GLSprite_Sub2.anInt8913 - 1 - i_205_) / GLSprite_Sub2.anInt8913;
                  i_207_ += i_208_;
                  i_205_ += GLSprite_Sub2.anInt8913 * i_208_;
                  i_206_ += GLSprite_Sub2.anInt8900 * i_208_;
                  i_204_ += i_208_;
               }

               int i_209_;
               if ((i_209_ = (1 + i_205_ - (this.anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_207_) {
                  i_207_ = i_209_;
               }

               if ((i_209_ = i_206_ - (this.anInt8897 << 12)) >= 0) {
                  i_209_ = (GLSprite_Sub2.anInt8900 - i_209_) / GLSprite_Sub2.anInt8900;
                  i_207_ += i_209_;
                  i_205_ += GLSprite_Sub2.anInt8913 * i_209_;
                  i_206_ += GLSprite_Sub2.anInt8900 * i_209_;
                  i_204_ += i_209_;
               }

               if ((i_209_ = (i_206_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_207_) {
                  i_207_ = i_209_;
               }

               int i_210_ = is[i_203_] - i;
               int i_211_ = -is_121_[i_203_];
               int i_212_ = i_210_ - (i_204_ - GLSprite_Sub2.anInt8882);
               if (i_212_ > 0) {
                  i_204_ += i_212_;
                  i_207_ += i_212_;
                  i_205_ += GLSprite_Sub2.anInt8913 * i_212_;
                  i_206_ += GLSprite_Sub2.anInt8900 * i_212_;
               } else {
                  i_211_ -= i_212_;
               }

               if (i_207_ < i_211_) {
                  i_207_ = i_211_;
               }

               while(i_207_ < 0) {
                  int i_213_ = this.aByteArray10571[(i_206_ >> 12) * this.anInt8893 + (i_205_ >> 12)];
                  if (i_213_ != 0) {
                     is_123_[i_204_++] = this.anIntArray10572[i_213_ & 0xFF];
                  } else {
                     ++i_204_;
                  }

                  i_205_ += GLSprite_Sub2.anInt8913;
                  i_206_ += GLSprite_Sub2.anInt8900;
                  ++i_207_;
               }
            }

            ++i_202_;
            GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
            GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
         }
      } else {
         for(int i_214_ = GLSprite_Sub2.anInt8888; i_214_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
            int i_215_ = i_214_ + i_122_;
            if (i_215_ >= 0) {
               if (i_215_ >= is.length) {
                  break;
               }

               int i_216_ = GLSprite_Sub2.anInt8882;
               int i_217_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
               int i_218_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
               int i_219_ = GLSprite_Sub2.anInt8894;
               if (i_217_ < 0) {
                  int i_220_ = (GLSprite_Sub2.anInt8913 - 1 - i_217_) / GLSprite_Sub2.anInt8913;
                  i_219_ += i_220_;
                  i_217_ += GLSprite_Sub2.anInt8913 * i_220_;
                  i_218_ += GLSprite_Sub2.anInt8900 * i_220_;
                  i_216_ += i_220_;
               }

               int i_221_;
               if ((i_221_ = (1 + i_217_ - (this.anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_219_) {
                  i_219_ = i_221_;
               }

               if (i_218_ < 0) {
                  i_221_ = (GLSprite_Sub2.anInt8900 - 1 - i_218_) / GLSprite_Sub2.anInt8900;
                  i_219_ += i_221_;
                  i_217_ += GLSprite_Sub2.anInt8913 * i_221_;
                  i_218_ += GLSprite_Sub2.anInt8900 * i_221_;
                  i_216_ += i_221_;
               }

               if ((i_221_ = (1 + i_218_ - (this.anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_219_) {
                  i_219_ = i_221_;
               }

               int i_222_ = is[i_215_] - i;
               int i_223_ = -is_121_[i_215_];
               int i_224_ = i_222_ - (i_216_ - GLSprite_Sub2.anInt8882);
               if (i_224_ > 0) {
                  i_216_ += i_224_;
                  i_219_ += i_224_;
                  i_217_ += GLSprite_Sub2.anInt8913 * i_224_;
                  i_218_ += GLSprite_Sub2.anInt8900 * i_224_;
               } else {
                  i_223_ -= i_224_;
               }

               if (i_219_ < i_223_) {
                  i_219_ = i_223_;
               }

               while(i_219_ < 0) {
                  int i_225_ = this.aByteArray10571[(i_218_ >> 12) * this.anInt8893 + (i_217_ >> 12)];
                  if (i_225_ != 0) {
                     is_123_[i_216_++] = this.anIntArray10572[i_225_ & 0xFF];
                  } else {
                     ++i_216_;
                  }

                  i_217_ += GLSprite_Sub2.anInt8913;
                  i_218_ += GLSprite_Sub2.anInt8900;
                  ++i_219_;
               }
            }

            ++i_214_;
            GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
            GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
         }
      }
   }

   @Override
   final void method1209(int i, int i_226_) {
      int[] is = this.aPureJavaToolkit8886.anIntArray6787;
      if (GLSprite_Sub2.anInt8913 == 0) {
         if (GLSprite_Sub2.anInt8900 == 0) {
            for(int i_227_ = GLSprite_Sub2.anInt8888; i_227_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
               int i_228_ = GLSprite_Sub2.anInt8882;
               int i_229_ = GLSprite_Sub2.anInt8901;
               int i_230_ = GLSprite_Sub2.anInt8908;
               int i_231_ = GLSprite_Sub2.anInt8894;
               if (i_229_ >= 0 && i_230_ >= 0 && i_229_ - (this.anInt8893 << 12) < 0 && i_230_ - (this.anInt8897 << 12) < 0) {
                  for(; i_231_ < 0; ++i_231_) {
                     int i_232_ = (i_230_ >> 12) * this.anInt8893 + (i_229_ >> 12);
                     int i_233_ = i_228_++;
                     if (i_226_ == 0) {
                        if (i == 1) {
                           is[i_233_] = this.anIntArray10572[this.aByteArray10571[i_232_] & 255];
                        } else if (i == 0) {
                           int i_237_ = this.anIntArray10572[this.aByteArray10571[i_232_] & 255];
                           int i_238_ = (i_237_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                           int i_239_ = (i_237_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                           int i_240_ = (i_237_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                           is[i_233_] = (i_238_ | i_239_ | i_240_) >>> 8;
                        } else if (i == 3) {
                           int i_241_ = this.anIntArray10572[this.aByteArray10571[i_232_] & 255];
                           int i_242_ = GLSprite_Sub2.anInt8904;
                           int i_243_ = i_241_ + i_242_;
                           int i_244_ = (i_241_ & 16711935) + (i_242_ & 16711935);
                           int i_245_ = (i_244_ & 16777472) + (i_243_ - i_244_ & 65536);
                           is[i_233_] = i_243_ - i_245_ | i_245_ - (i_245_ >>> 8);
                        } else {
                           if (i != 2) {
                              throw new IllegalArgumentException();
                           }

                           int i_246_ = this.anIntArray10572[this.aByteArray10571[i_232_] & 255];
                           int i_247_ = (i_246_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                           int i_248_ = (i_246_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                           is[i_233_] = ((i_247_ | i_248_) >>> 8) + GLSprite_Sub2.anInt8896;
                        }
                     } else if (i_226_ == 1) {
                        if (i == 1) {
                           int i_249_ = this.aByteArray10571[i_232_];
                           if (i_249_ != 0) {
                              is[i_233_] = this.anIntArray10572[i_249_ & 0xFF];
                           }
                        } else if (i == 0) {
                           int i_250_ = this.aByteArray10571[i_232_];
                           if (i_250_ != 0) {
                              int i_251_ = this.anIntArray10572[i_250_ & 0xFF];
                              if ((GLSprite_Sub2.anInt8904 & 16777215) == 16777215) {
                                 int i_252_ = GLSprite_Sub2.anInt8904 >>> 24;
                                 int i_253_ = 256 - i_252_;
                                 int i_254_ = is[i_233_];
                                 is[i_233_] = ((i_251_ & 16711935) * i_252_ + (i_254_ & 16711935) * i_253_ & -16711936)
                                       + ((i_251_ & 0xFF00) * i_252_ + (i_254_ & 0xFF00) * i_253_ & 0xFF0000)
                                    >> 8;
                              } else if (GLSprite_Sub2.anInt8895 != 255) {
                                 int i_255_ = (i_251_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                                 int i_256_ = (i_251_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                                 int i_257_ = (i_251_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                                 i_251_ = (i_255_ | i_256_ | i_257_) >>> 8;
                                 int i_258_ = is[i_233_];
                                 is[i_233_] = ((i_251_ & 16711935) * GLSprite_Sub2.anInt8895 + (i_258_ & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                       + ((i_251_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (i_258_ & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                    >> 8;
                              } else {
                                 int i_259_ = (i_251_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                                 int i_260_ = (i_251_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                                 int i_261_ = (i_251_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                                 is[i_233_] = (i_259_ | i_260_ | i_261_) >>> 8;
                              }
                           }
                        } else if (i == 3) {
                           byte b = this.aByteArray10571[i_232_];
                           int i_262_ = b > 0 ? this.anIntArray10572[b] : 0;
                           int i_263_ = GLSprite_Sub2.anInt8904;
                           int i_264_ = i_262_ + i_263_;
                           int i_265_ = (i_262_ & 16711935) + (i_263_ & 16711935);
                           int i_266_ = (i_265_ & 16777472) + (i_264_ - i_265_ & 65536);
                           i_266_ = i_264_ - i_266_ | i_266_ - (i_266_ >>> 8);
                           if (i_262_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                              int var574 = is[i_233_];
                              i_266_ = ((i_266_ & 16711935) * GLSprite_Sub2.anInt8895 + (var574 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                    + ((i_266_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var574 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                 >> 8;
                           }

                           is[i_233_] = i_266_;
                        } else {
                           if (i != 2) {
                              throw new IllegalArgumentException();
                           }

                           int i_267_ = this.aByteArray10571[i_232_];
                           if (i_267_ != 0) {
                              int i_268_ = this.anIntArray10572[i_267_ & 0xFF];
                              int i_269_ = (i_268_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                              int i_270_ = (i_268_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                              is[i_233_++] = ((i_269_ | i_270_) >>> 8) + GLSprite_Sub2.anInt8896;
                           }
                        }
                     } else {
                        if (i_226_ != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (i == 1) {
                           int i_271_ = this.aByteArray10571[i_232_];
                           if (i_271_ != 0) {
                              int i_272_ = this.anIntArray10572[i_271_ & 0xFF];
                              int i_273_ = is[i_233_];
                              int i_274_ = i_272_ + i_273_;
                              int i_275_ = (i_272_ & 16711935) + (i_273_ & 16711935);
                              i_273_ = (i_275_ & 16777472) + (i_274_ - i_275_ & 65536);
                              is[i_233_] = i_274_ - i_273_ | i_273_ - (i_273_ >>> 8);
                           }
                        } else if (i == 0) {
                           int i_276_ = this.aByteArray10571[i_232_];
                           if (i_276_ != 0) {
                              int i_277_ = this.anIntArray10572[i_276_ & 0xFF];
                              int i_278_ = (i_277_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                              int i_279_ = (i_277_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                              int i_280_ = (i_277_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                              i_277_ = (i_278_ | i_279_ | i_280_) >>> 8;
                              int i_281_ = is[i_233_];
                              int i_282_ = i_277_ + i_281_;
                              int i_283_ = (i_277_ & 16711935) + (i_281_ & 16711935);
                              i_281_ = (i_283_ & 16777472) + (i_282_ - i_283_ & 65536);
                              is[i_233_] = i_282_ - i_281_ | i_281_ - (i_281_ >>> 8);
                           }
                        } else if (i == 3) {
                           byte b = this.aByteArray10571[i_232_];
                           int i_284_ = b > 0 ? this.anIntArray10572[b] : 0;
                           int i_285_ = GLSprite_Sub2.anInt8904;
                           int i_286_ = i_284_ + i_285_;
                           int i_287_ = (i_284_ & 16711935) + (i_285_ & 16711935);
                           int i_288_ = (i_287_ & 16777472) + (i_286_ - i_287_ & 65536);
                           i_288_ = i_286_ - i_288_ | i_288_ - (i_288_ >>> 8);
                           if (i_284_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                              int var579 = is[i_233_];
                              i_288_ = ((i_288_ & 16711935) * GLSprite_Sub2.anInt8895 + (var579 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                    + ((i_288_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var579 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                 >> 8;
                           }

                           is[i_233_] = i_288_;
                        } else if (i == 2) {
                           int i_289_ = this.aByteArray10571[i_232_];
                           if (i_289_ != 0) {
                              int i_290_ = this.anIntArray10572[i_289_ & 0xFF];
                              int i_291_ = (i_290_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                              int i_292_ = (i_290_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                              i_290_ = ((i_291_ | i_292_) >>> 8) + GLSprite_Sub2.anInt8896;
                              int i_293_ = is[i_233_];
                              int i_294_ = i_290_ + i_293_;
                              int i_295_ = (i_290_ & 16711935) + (i_293_ & 16711935);
                              i_293_ = (i_295_ & 16777472) + (i_294_ - i_295_ & 65536);
                              is[i_233_] = i_294_ - i_293_ | i_293_ - (i_293_ >>> 8);
                           }
                        }
                     }
                  }
               }

               ++i_227_;
            }
         } else if (GLSprite_Sub2.anInt8900 < 0) {
            for(int i_296_ = GLSprite_Sub2.anInt8888; i_296_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
               int i_297_ = GLSprite_Sub2.anInt8882;
               int i_298_ = GLSprite_Sub2.anInt8901;
               int i_299_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
               int i_300_ = GLSprite_Sub2.anInt8894;
               if (i_298_ >= 0 && i_298_ - (this.anInt8893 << 12) < 0) {
                  int i_301_;
                  if ((i_301_ = i_299_ - (this.anInt8897 << 12)) >= 0) {
                     i_301_ = (GLSprite_Sub2.anInt8900 - i_301_) / GLSprite_Sub2.anInt8900;
                     i_300_ += i_301_;
                     i_299_ += GLSprite_Sub2.anInt8900 * i_301_;
                     i_297_ += i_301_;
                  }

                  if ((i_301_ = (i_299_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_300_) {
                     i_300_ = i_301_;
                  }

                  while(i_300_ < 0) {
                     int i_302_ = (i_299_ >> 12) * this.anInt8893 + (i_298_ >> 12);
                     int i_303_ = i_297_++;
                     if (i_226_ == 0) {
                        if (i == 1) {
                           is[i_303_] = this.anIntArray10572[this.aByteArray10571[i_302_] & 255];
                        } else if (i == 0) {
                           int i_307_ = this.anIntArray10572[this.aByteArray10571[i_302_] & 255];
                           int i_308_ = (i_307_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                           int i_309_ = (i_307_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                           int i_310_ = (i_307_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                           is[i_303_] = (i_308_ | i_309_ | i_310_) >>> 8;
                        } else if (i == 3) {
                           int i_311_ = this.anIntArray10572[this.aByteArray10571[i_302_] & 255];
                           int i_312_ = GLSprite_Sub2.anInt8904;
                           int i_313_ = i_311_ + i_312_;
                           int i_314_ = (i_311_ & 16711935) + (i_312_ & 16711935);
                           int i_315_ = (i_314_ & 16777472) + (i_313_ - i_314_ & 65536);
                           is[i_303_] = i_313_ - i_315_ | i_315_ - (i_315_ >>> 8);
                        } else {
                           if (i != 2) {
                              throw new IllegalArgumentException();
                           }

                           int i_316_ = this.anIntArray10572[this.aByteArray10571[i_302_] & 255];
                           int i_317_ = (i_316_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                           int i_318_ = (i_316_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                           is[i_303_] = ((i_317_ | i_318_) >>> 8) + GLSprite_Sub2.anInt8896;
                        }
                     } else if (i_226_ == 1) {
                        if (i == 1) {
                           int i_319_ = this.aByteArray10571[i_302_];
                           if (i_319_ != 0) {
                              is[i_303_] = this.anIntArray10572[i_319_ & 0xFF];
                           }
                        } else if (i == 0) {
                           int i_320_ = this.aByteArray10571[i_302_];
                           if (i_320_ != 0) {
                              int i_321_ = this.anIntArray10572[i_320_ & 0xFF];
                              if ((GLSprite_Sub2.anInt8904 & 16777215) == 16777215) {
                                 int i_322_ = GLSprite_Sub2.anInt8904 >>> 24;
                                 int i_323_ = 256 - i_322_;
                                 int i_324_ = is[i_303_];
                                 is[i_303_] = ((i_321_ & 16711935) * i_322_ + (i_324_ & 16711935) * i_323_ & -16711936)
                                       + ((i_321_ & 0xFF00) * i_322_ + (i_324_ & 0xFF00) * i_323_ & 0xFF0000)
                                    >> 8;
                              } else if (GLSprite_Sub2.anInt8895 != 255) {
                                 int i_325_ = (i_321_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                                 int i_326_ = (i_321_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                                 int i_327_ = (i_321_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                                 i_321_ = (i_325_ | i_326_ | i_327_) >>> 8;
                                 int i_328_ = is[i_303_];
                                 is[i_303_] = ((i_321_ & 16711935) * GLSprite_Sub2.anInt8895 + (i_328_ & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                       + ((i_321_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (i_328_ & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                    >> 8;
                              } else {
                                 int i_329_ = (i_321_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                                 int i_330_ = (i_321_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                                 int i_331_ = (i_321_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                                 is[i_303_] = (i_329_ | i_330_ | i_331_) >>> 8;
                              }
                           }
                        } else if (i == 3) {
                           byte b = this.aByteArray10571[i_302_];
                           int i_332_ = b > 0 ? this.anIntArray10572[b] : 0;
                           int i_333_ = GLSprite_Sub2.anInt8904;
                           int i_334_ = i_332_ + i_333_;
                           int i_335_ = (i_332_ & 16711935) + (i_333_ & 16711935);
                           int i_336_ = (i_335_ & 16777472) + (i_334_ - i_335_ & 65536);
                           i_336_ = i_334_ - i_336_ | i_336_ - (i_336_ >>> 8);
                           if (i_332_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                              int var665 = is[i_303_];
                              i_336_ = ((i_336_ & 16711935) * GLSprite_Sub2.anInt8895 + (var665 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                    + ((i_336_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var665 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                 >> 8;
                           }

                           is[i_303_] = i_336_;
                        } else {
                           if (i != 2) {
                              throw new IllegalArgumentException();
                           }

                           int i_337_ = this.aByteArray10571[i_302_];
                           if (i_337_ != 0) {
                              int i_338_ = this.anIntArray10572[i_337_ & 0xFF];
                              int i_339_ = (i_338_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                              int i_340_ = (i_338_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                              is[i_303_++] = ((i_339_ | i_340_) >>> 8) + GLSprite_Sub2.anInt8896;
                           }
                        }
                     } else {
                        if (i_226_ != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (i == 1) {
                           int i_341_ = this.aByteArray10571[i_302_];
                           if (i_341_ != 0) {
                              int i_342_ = this.anIntArray10572[i_341_ & 0xFF];
                              int i_343_ = is[i_303_];
                              int i_344_ = i_342_ + i_343_;
                              int i_345_ = (i_342_ & 16711935) + (i_343_ & 16711935);
                              i_343_ = (i_345_ & 16777472) + (i_344_ - i_345_ & 65536);
                              is[i_303_] = i_344_ - i_343_ | i_343_ - (i_343_ >>> 8);
                           }
                        } else if (i == 0) {
                           int i_346_ = this.aByteArray10571[i_302_];
                           if (i_346_ != 0) {
                              int i_347_ = this.anIntArray10572[i_346_ & 0xFF];
                              int i_348_ = (i_347_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                              int i_349_ = (i_347_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                              int i_350_ = (i_347_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                              i_347_ = (i_348_ | i_349_ | i_350_) >>> 8;
                              int i_351_ = is[i_303_];
                              int i_352_ = i_347_ + i_351_;
                              int i_353_ = (i_347_ & 16711935) + (i_351_ & 16711935);
                              i_351_ = (i_353_ & 16777472) + (i_352_ - i_353_ & 65536);
                              is[i_303_] = i_352_ - i_351_ | i_351_ - (i_351_ >>> 8);
                           }
                        } else if (i == 3) {
                           byte b = this.aByteArray10571[i_302_];
                           int i_354_ = b > 0 ? this.anIntArray10572[b] : 0;
                           int i_355_ = GLSprite_Sub2.anInt8904;
                           int i_356_ = i_354_ + i_355_;
                           int i_357_ = (i_354_ & 16711935) + (i_355_ & 16711935);
                           int i_358_ = (i_357_ & 16777472) + (i_356_ - i_357_ & 65536);
                           i_358_ = i_356_ - i_358_ | i_358_ - (i_358_ >>> 8);
                           if (i_354_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                              int var670 = is[i_303_];
                              i_358_ = ((i_358_ & 16711935) * GLSprite_Sub2.anInt8895 + (var670 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                    + ((i_358_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var670 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                 >> 8;
                           }

                           is[i_303_] = i_358_;
                        } else if (i == 2) {
                           int i_359_ = this.aByteArray10571[i_302_];
                           if (i_359_ != 0) {
                              int i_360_ = this.anIntArray10572[i_359_ & 0xFF];
                              int i_361_ = (i_360_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                              int i_362_ = (i_360_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                              i_360_ = ((i_361_ | i_362_) >>> 8) + GLSprite_Sub2.anInt8896;
                              int i_363_ = is[i_303_];
                              int i_364_ = i_360_ + i_363_;
                              int i_365_ = (i_360_ & 16711935) + (i_363_ & 16711935);
                              i_363_ = (i_365_ & 16777472) + (i_364_ - i_365_ & 65536);
                              is[i_303_] = i_364_ - i_363_ | i_363_ - (i_363_ >>> 8);
                           }
                        }
                     }

                     i_299_ += GLSprite_Sub2.anInt8900;
                     ++i_300_;
                  }
               }

               ++i_296_;
               GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
            }
         } else {
            for(int i_366_ = GLSprite_Sub2.anInt8888; i_366_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
               int i_367_ = GLSprite_Sub2.anInt8882;
               int i_368_ = GLSprite_Sub2.anInt8901;
               int i_369_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
               int i_370_ = GLSprite_Sub2.anInt8894;
               if (i_368_ >= 0 && i_368_ - (this.anInt8893 << 12) < 0) {
                  if (i_369_ < 0) {
                     int i_371_ = (GLSprite_Sub2.anInt8900 - 1 - i_369_) / GLSprite_Sub2.anInt8900;
                     i_370_ += i_371_;
                     i_369_ += GLSprite_Sub2.anInt8900 * i_371_;
                     i_367_ += i_371_;
                  }

                  int i_372_;
                  if ((i_372_ = (1 + i_369_ - (this.anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_370_) {
                     i_370_ = i_372_;
                  }

                  while(i_370_ < 0) {
                     int i_373_ = (i_369_ >> 12) * this.anInt8893 + (i_368_ >> 12);
                     int i_374_ = i_367_++;
                     if (i_226_ == 0) {
                        if (i == 1) {
                           is[i_374_] = this.anIntArray10572[this.aByteArray10571[i_373_] & 255];
                        } else if (i == 0) {
                           int i_378_ = this.anIntArray10572[this.aByteArray10571[i_373_] & 255];
                           int i_379_ = (i_378_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                           int i_380_ = (i_378_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                           int i_381_ = (i_378_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                           is[i_374_] = (i_379_ | i_380_ | i_381_) >>> 8;
                        } else if (i == 3) {
                           int i_382_ = this.anIntArray10572[this.aByteArray10571[i_373_] & 255];
                           int i_383_ = GLSprite_Sub2.anInt8904;
                           int i_384_ = i_382_ + i_383_;
                           int i_385_ = (i_382_ & 16711935) + (i_383_ & 16711935);
                           int i_386_ = (i_385_ & 16777472) + (i_384_ - i_385_ & 65536);
                           is[i_374_] = i_384_ - i_386_ | i_386_ - (i_386_ >>> 8);
                        } else {
                           if (i != 2) {
                              throw new IllegalArgumentException();
                           }

                           int i_387_ = this.anIntArray10572[this.aByteArray10571[i_373_] & 255];
                           int i_388_ = (i_387_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                           int i_389_ = (i_387_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                           is[i_374_] = ((i_388_ | i_389_) >>> 8) + GLSprite_Sub2.anInt8896;
                        }
                     } else if (i_226_ == 1) {
                        if (i == 1) {
                           int i_390_ = this.aByteArray10571[i_373_];
                           if (i_390_ != 0) {
                              is[i_374_] = this.anIntArray10572[i_390_ & 0xFF];
                           }
                        } else if (i == 0) {
                           int i_391_ = this.aByteArray10571[i_373_];
                           if (i_391_ != 0) {
                              int i_392_ = this.anIntArray10572[i_391_ & 0xFF];
                              if ((GLSprite_Sub2.anInt8904 & 16777215) == 16777215) {
                                 int i_393_ = GLSprite_Sub2.anInt8904 >>> 24;
                                 int i_394_ = 256 - i_393_;
                                 int i_395_ = is[i_374_];
                                 is[i_374_] = ((i_392_ & 16711935) * i_393_ + (i_395_ & 16711935) * i_394_ & -16711936)
                                       + ((i_392_ & 0xFF00) * i_393_ + (i_395_ & 0xFF00) * i_394_ & 0xFF0000)
                                    >> 8;
                              } else if (GLSprite_Sub2.anInt8895 != 255) {
                                 int i_396_ = (i_392_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                                 int i_397_ = (i_392_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                                 int i_398_ = (i_392_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                                 i_392_ = (i_396_ | i_397_ | i_398_) >>> 8;
                                 int i_399_ = is[i_374_];
                                 is[i_374_] = ((i_392_ & 16711935) * GLSprite_Sub2.anInt8895 + (i_399_ & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                       + ((i_392_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (i_399_ & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                    >> 8;
                              } else {
                                 int i_400_ = (i_392_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                                 int i_401_ = (i_392_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                                 int i_402_ = (i_392_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                                 is[i_374_] = (i_400_ | i_401_ | i_402_) >>> 8;
                              }
                           }
                        } else if (i == 3) {
                           byte b = this.aByteArray10571[i_373_];
                           int i_403_ = b > 0 ? this.anIntArray10572[b] : 0;
                           int i_404_ = GLSprite_Sub2.anInt8904;
                           int i_405_ = i_403_ + i_404_;
                           int i_406_ = (i_403_ & 16711935) + (i_404_ & 16711935);
                           int i_407_ = (i_406_ & 16777472) + (i_405_ - i_406_ & 65536);
                           i_407_ = i_405_ - i_407_ | i_407_ - (i_407_ >>> 8);
                           if (i_403_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                              int var675 = is[i_374_];
                              i_407_ = ((i_407_ & 16711935) * GLSprite_Sub2.anInt8895 + (var675 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                    + ((i_407_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var675 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                 >> 8;
                           }

                           is[i_374_] = i_407_;
                        } else {
                           if (i != 2) {
                              throw new IllegalArgumentException();
                           }

                           int i_408_ = this.aByteArray10571[i_373_];
                           if (i_408_ != 0) {
                              int i_409_ = this.anIntArray10572[i_408_ & 0xFF];
                              int i_410_ = (i_409_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                              int i_411_ = (i_409_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                              is[i_374_++] = ((i_410_ | i_411_) >>> 8) + GLSprite_Sub2.anInt8896;
                           }
                        }
                     } else {
                        if (i_226_ != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (i == 1) {
                           int i_412_ = this.aByteArray10571[i_373_];
                           if (i_412_ != 0) {
                              int i_413_ = this.anIntArray10572[i_412_ & 0xFF];
                              int i_414_ = is[i_374_];
                              int i_415_ = i_413_ + i_414_;
                              int i_416_ = (i_413_ & 16711935) + (i_414_ & 16711935);
                              i_414_ = (i_416_ & 16777472) + (i_415_ - i_416_ & 65536);
                              is[i_374_] = i_415_ - i_414_ | i_414_ - (i_414_ >>> 8);
                           }
                        } else if (i == 0) {
                           int i_417_ = this.aByteArray10571[i_373_];
                           if (i_417_ != 0) {
                              int i_418_ = this.anIntArray10572[i_417_ & 0xFF];
                              int i_419_ = (i_418_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                              int i_420_ = (i_418_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                              int i_421_ = (i_418_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                              i_418_ = (i_419_ | i_420_ | i_421_) >>> 8;
                              int i_422_ = is[i_374_];
                              int i_423_ = i_418_ + i_422_;
                              int i_424_ = (i_418_ & 16711935) + (i_422_ & 16711935);
                              i_422_ = (i_424_ & 16777472) + (i_423_ - i_424_ & 65536);
                              is[i_374_] = i_423_ - i_422_ | i_422_ - (i_422_ >>> 8);
                           }
                        } else if (i == 3) {
                           byte b = this.aByteArray10571[i_373_];
                           int i_425_ = b > 0 ? this.anIntArray10572[b] : 0;
                           int i_426_ = GLSprite_Sub2.anInt8904;
                           int i_427_ = i_425_ + i_426_;
                           int i_428_ = (i_425_ & 16711935) + (i_426_ & 16711935);
                           int i_429_ = (i_428_ & 16777472) + (i_427_ - i_428_ & 65536);
                           i_429_ = i_427_ - i_429_ | i_429_ - (i_429_ >>> 8);
                           if (i_425_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                              int var680 = is[i_374_];
                              i_429_ = ((i_429_ & 16711935) * GLSprite_Sub2.anInt8895 + (var680 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                    + ((i_429_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var680 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                 >> 8;
                           }

                           is[i_374_] = i_429_;
                        } else if (i == 2) {
                           int i_430_ = this.aByteArray10571[i_373_];
                           if (i_430_ != 0) {
                              int i_431_ = this.anIntArray10572[i_430_ & 0xFF];
                              int i_432_ = (i_431_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                              int i_433_ = (i_431_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                              i_431_ = ((i_432_ | i_433_) >>> 8) + GLSprite_Sub2.anInt8896;
                              int i_434_ = is[i_374_];
                              int i_435_ = i_431_ + i_434_;
                              int i_436_ = (i_431_ & 16711935) + (i_434_ & 16711935);
                              i_434_ = (i_436_ & 16777472) + (i_435_ - i_436_ & 65536);
                              is[i_374_] = i_435_ - i_434_ | i_434_ - (i_434_ >>> 8);
                           }
                        }
                     }

                     i_369_ += GLSprite_Sub2.anInt8900;
                     ++i_370_;
                  }
               }

               ++i_366_;
               GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
            }
         }
      } else if (GLSprite_Sub2.anInt8913 < 0) {
         if (GLSprite_Sub2.anInt8900 == 0) {
            for(int i_437_ = GLSprite_Sub2.anInt8888; i_437_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
               int i_438_ = GLSprite_Sub2.anInt8882;
               int i_439_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
               int i_440_ = GLSprite_Sub2.anInt8908;
               int i_441_ = GLSprite_Sub2.anInt8894;
               if (i_440_ >= 0 && i_440_ - (this.anInt8897 << 12) < 0) {
                  int i_442_;
                  if ((i_442_ = i_439_ - (this.anInt8893 << 12)) >= 0) {
                     i_442_ = (GLSprite_Sub2.anInt8913 - i_442_) / GLSprite_Sub2.anInt8913;
                     i_441_ += i_442_;
                     i_439_ += GLSprite_Sub2.anInt8913 * i_442_;
                     i_438_ += i_442_;
                  }

                  if ((i_442_ = (i_439_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_441_) {
                     i_441_ = i_442_;
                  }

                  while(i_441_ < 0) {
                     int i_443_ = (i_440_ >> 12) * this.anInt8893 + (i_439_ >> 12);
                     int i_444_ = i_438_++;
                     if (i_226_ == 0) {
                        if (i == 1) {
                           is[i_444_] = this.anIntArray10572[this.aByteArray10571[i_443_] & 255];
                        } else if (i == 0) {
                           int i_448_ = this.anIntArray10572[this.aByteArray10571[i_443_] & 255];
                           int i_449_ = (i_448_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                           int i_450_ = (i_448_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                           int i_451_ = (i_448_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                           is[i_444_] = (i_449_ | i_450_ | i_451_) >>> 8;
                        } else if (i == 3) {
                           int i_452_ = this.anIntArray10572[this.aByteArray10571[i_443_] & 255];
                           int i_453_ = GLSprite_Sub2.anInt8904;
                           int i_454_ = i_452_ + i_453_;
                           int i_455_ = (i_452_ & 16711935) + (i_453_ & 16711935);
                           int i_456_ = (i_455_ & 16777472) + (i_454_ - i_455_ & 65536);
                           is[i_444_] = i_454_ - i_456_ | i_456_ - (i_456_ >>> 8);
                        } else {
                           if (i != 2) {
                              throw new IllegalArgumentException();
                           }

                           int i_457_ = this.anIntArray10572[this.aByteArray10571[i_443_] & 255];
                           int i_458_ = (i_457_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                           int i_459_ = (i_457_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                           is[i_444_] = ((i_458_ | i_459_) >>> 8) + GLSprite_Sub2.anInt8896;
                        }
                     } else if (i_226_ == 1) {
                        if (i == 1) {
                           int i_460_ = this.aByteArray10571[i_443_];
                           if (i_460_ != 0) {
                              is[i_444_] = this.anIntArray10572[i_460_ & 0xFF];
                           }
                        } else if (i == 0) {
                           int i_461_ = this.aByteArray10571[i_443_];
                           if (i_461_ != 0) {
                              int i_462_ = this.anIntArray10572[i_461_ & 0xFF];
                              if ((GLSprite_Sub2.anInt8904 & 16777215) == 16777215) {
                                 int i_463_ = GLSprite_Sub2.anInt8904 >>> 24;
                                 int i_464_ = 256 - i_463_;
                                 int i_465_ = is[i_444_];
                                 is[i_444_] = ((i_462_ & 16711935) * i_463_ + (i_465_ & 16711935) * i_464_ & -16711936)
                                       + ((i_462_ & 0xFF00) * i_463_ + (i_465_ & 0xFF00) * i_464_ & 0xFF0000)
                                    >> 8;
                              } else if (GLSprite_Sub2.anInt8895 != 255) {
                                 int i_466_ = (i_462_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                                 int i_467_ = (i_462_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                                 int i_468_ = (i_462_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                                 i_462_ = (i_466_ | i_467_ | i_468_) >>> 8;
                                 int i_469_ = is[i_444_];
                                 is[i_444_] = ((i_462_ & 16711935) * GLSprite_Sub2.anInt8895 + (i_469_ & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                       + ((i_462_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (i_469_ & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                    >> 8;
                              } else {
                                 int i_470_ = (i_462_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                                 int i_471_ = (i_462_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                                 int i_472_ = (i_462_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                                 is[i_444_] = (i_470_ | i_471_ | i_472_) >>> 8;
                              }
                           }
                        } else if (i == 3) {
                           byte b = this.aByteArray10571[i_443_];
                           int i_473_ = b > 0 ? this.anIntArray10572[b] : 0;
                           int i_474_ = GLSprite_Sub2.anInt8904;
                           int i_475_ = i_473_ + i_474_;
                           int i_476_ = (i_473_ & 16711935) + (i_474_ & 16711935);
                           int i_477_ = (i_476_ & 16777472) + (i_475_ - i_476_ & 65536);
                           i_477_ = i_475_ - i_477_ | i_477_ - (i_477_ >>> 8);
                           if (i_473_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                              int var685 = is[i_444_];
                              i_477_ = ((i_477_ & 16711935) * GLSprite_Sub2.anInt8895 + (var685 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                    + ((i_477_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var685 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                 >> 8;
                           }

                           is[i_444_] = i_477_;
                        } else {
                           if (i != 2) {
                              throw new IllegalArgumentException();
                           }

                           int i_478_ = this.aByteArray10571[i_443_];
                           if (i_478_ != 0) {
                              int i_479_ = this.anIntArray10572[i_478_ & 0xFF];
                              int i_480_ = (i_479_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                              int i_481_ = (i_479_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                              is[i_444_++] = ((i_480_ | i_481_) >>> 8) + GLSprite_Sub2.anInt8896;
                           }
                        }
                     } else {
                        if (i_226_ != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (i == 1) {
                           int i_482_ = this.aByteArray10571[i_443_];
                           if (i_482_ != 0) {
                              int i_483_ = this.anIntArray10572[i_482_ & 0xFF];
                              int i_484_ = is[i_444_];
                              int i_485_ = i_483_ + i_484_;
                              int i_486_ = (i_483_ & 16711935) + (i_484_ & 16711935);
                              i_484_ = (i_486_ & 16777472) + (i_485_ - i_486_ & 65536);
                              is[i_444_] = i_485_ - i_484_ | i_484_ - (i_484_ >>> 8);
                           }
                        } else if (i == 0) {
                           int i_487_ = this.aByteArray10571[i_443_];
                           if (i_487_ != 0) {
                              int i_488_ = this.anIntArray10572[i_487_ & 0xFF];
                              int i_489_ = (i_488_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                              int i_490_ = (i_488_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                              int i_491_ = (i_488_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                              i_488_ = (i_489_ | i_490_ | i_491_) >>> 8;
                              int i_492_ = is[i_444_];
                              int i_493_ = i_488_ + i_492_;
                              int i_494_ = (i_488_ & 16711935) + (i_492_ & 16711935);
                              i_492_ = (i_494_ & 16777472) + (i_493_ - i_494_ & 65536);
                              is[i_444_] = i_493_ - i_492_ | i_492_ - (i_492_ >>> 8);
                           }
                        } else if (i == 3) {
                           byte b = this.aByteArray10571[i_443_];
                           int i_495_ = b > 0 ? this.anIntArray10572[b] : 0;
                           int i_496_ = GLSprite_Sub2.anInt8904;
                           int i_497_ = i_495_ + i_496_;
                           int i_498_ = (i_495_ & 16711935) + (i_496_ & 16711935);
                           int i_499_ = (i_498_ & 16777472) + (i_497_ - i_498_ & 65536);
                           i_499_ = i_497_ - i_499_ | i_499_ - (i_499_ >>> 8);
                           if (i_495_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                              int var690 = is[i_444_];
                              i_499_ = ((i_499_ & 16711935) * GLSprite_Sub2.anInt8895 + (var690 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                    + ((i_499_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var690 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                 >> 8;
                           }

                           is[i_444_] = i_499_;
                        } else if (i == 2) {
                           int i_500_ = this.aByteArray10571[i_443_];
                           if (i_500_ != 0) {
                              int i_501_ = this.anIntArray10572[i_500_ & 0xFF];
                              int i_502_ = (i_501_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                              int i_503_ = (i_501_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                              i_501_ = ((i_502_ | i_503_) >>> 8) + GLSprite_Sub2.anInt8896;
                              int i_504_ = is[i_444_];
                              int i_505_ = i_501_ + i_504_;
                              int i_506_ = (i_501_ & 16711935) + (i_504_ & 16711935);
                              i_504_ = (i_506_ & 16777472) + (i_505_ - i_506_ & 65536);
                              is[i_444_] = i_505_ - i_504_ | i_504_ - (i_504_ >>> 8);
                           }
                        }
                     }

                     i_439_ += GLSprite_Sub2.anInt8913;
                     ++i_441_;
                  }
               }

               ++i_437_;
               GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
            }
         } else if (GLSprite_Sub2.anInt8900 < 0) {
            for(int i_507_ = GLSprite_Sub2.anInt8888; i_507_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
               int i_508_ = GLSprite_Sub2.anInt8882;
               int i_509_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
               int i_510_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
               int i_511_ = GLSprite_Sub2.anInt8894;
               int i_512_;
               if ((i_512_ = i_509_ - (this.anInt8893 << 12)) >= 0) {
                  i_512_ = (GLSprite_Sub2.anInt8913 - i_512_) / GLSprite_Sub2.anInt8913;
                  i_511_ += i_512_;
                  i_509_ += GLSprite_Sub2.anInt8913 * i_512_;
                  i_510_ += GLSprite_Sub2.anInt8900 * i_512_;
                  i_508_ += i_512_;
               }

               if ((i_512_ = (i_509_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_511_) {
                  i_511_ = i_512_;
               }

               if ((i_512_ = i_510_ - (this.anInt8897 << 12)) >= 0) {
                  i_512_ = (GLSprite_Sub2.anInt8900 - i_512_) / GLSprite_Sub2.anInt8900;
                  i_511_ += i_512_;
                  i_509_ += GLSprite_Sub2.anInt8913 * i_512_;
                  i_510_ += GLSprite_Sub2.anInt8900 * i_512_;
                  i_508_ += i_512_;
               }

               if ((i_512_ = (i_510_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_511_) {
                  i_511_ = i_512_;
               }

               while(i_511_ < 0) {
                  int i_513_ = (i_510_ >> 12) * this.anInt8893 + (i_509_ >> 12);
                  int i_514_ = i_508_++;
                  if (i_226_ == 0) {
                     if (i == 1) {
                        is[i_514_] = this.anIntArray10572[this.aByteArray10571[i_513_] & 255];
                     } else if (i == 0) {
                        int i_518_ = this.anIntArray10572[this.aByteArray10571[i_513_] & 255];
                        int i_519_ = (i_518_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                        int i_520_ = (i_518_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                        int i_521_ = (i_518_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                        is[i_514_] = (i_519_ | i_520_ | i_521_) >>> 8;
                     } else if (i == 3) {
                        int i_522_ = this.anIntArray10572[this.aByteArray10571[i_513_] & 255];
                        int i_523_ = GLSprite_Sub2.anInt8904;
                        int i_524_ = i_522_ + i_523_;
                        int i_525_ = (i_522_ & 16711935) + (i_523_ & 16711935);
                        int i_526_ = (i_525_ & 16777472) + (i_524_ - i_525_ & 65536);
                        is[i_514_] = i_524_ - i_526_ | i_526_ - (i_526_ >>> 8);
                     } else {
                        if (i != 2) {
                           throw new IllegalArgumentException();
                        }

                        int i_527_ = this.anIntArray10572[this.aByteArray10571[i_513_] & 255];
                        int i_528_ = (i_527_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                        int i_529_ = (i_527_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                        is[i_514_] = ((i_528_ | i_529_) >>> 8) + GLSprite_Sub2.anInt8896;
                     }
                  } else if (i_226_ == 1) {
                     if (i == 1) {
                        int i_530_ = this.aByteArray10571[i_513_];
                        if (i_530_ != 0) {
                           is[i_514_] = this.anIntArray10572[i_530_ & 0xFF];
                        }
                     } else if (i == 0) {
                        int i_531_ = this.aByteArray10571[i_513_];
                        if (i_531_ != 0) {
                           int i_532_ = this.anIntArray10572[i_531_ & 0xFF];
                           if ((GLSprite_Sub2.anInt8904 & 16777215) == 16777215) {
                              int i_533_ = GLSprite_Sub2.anInt8904 >>> 24;
                              int i_534_ = 256 - i_533_;
                              int i_535_ = is[i_514_];
                              is[i_514_] = ((i_532_ & 16711935) * i_533_ + (i_535_ & 16711935) * i_534_ & -16711936)
                                    + ((i_532_ & 0xFF00) * i_533_ + (i_535_ & 0xFF00) * i_534_ & 0xFF0000)
                                 >> 8;
                           } else if (GLSprite_Sub2.anInt8895 != 255) {
                              int i_536_ = (i_532_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                              int i_537_ = (i_532_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                              int i_538_ = (i_532_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                              i_532_ = (i_536_ | i_537_ | i_538_) >>> 8;
                              int i_539_ = is[i_514_];
                              is[i_514_] = ((i_532_ & 16711935) * GLSprite_Sub2.anInt8895 + (i_539_ & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                    + ((i_532_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (i_539_ & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                 >> 8;
                           } else {
                              int i_540_ = (i_532_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                              int i_541_ = (i_532_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                              int i_542_ = (i_532_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                              is[i_514_] = (i_540_ | i_541_ | i_542_) >>> 8;
                           }
                        }
                     } else if (i == 3) {
                        byte b = this.aByteArray10571[i_513_];
                        int i_543_ = b > 0 ? this.anIntArray10572[b] : 0;
                        int i_544_ = GLSprite_Sub2.anInt8904;
                        int i_545_ = i_543_ + i_544_;
                        int i_546_ = (i_543_ & 16711935) + (i_544_ & 16711935);
                        int i_547_ = (i_546_ & 16777472) + (i_545_ - i_546_ & 65536);
                        i_547_ = i_545_ - i_547_ | i_547_ - (i_547_ >>> 8);
                        if (i_543_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                           int var695 = is[i_514_];
                           i_547_ = ((i_547_ & 16711935) * GLSprite_Sub2.anInt8895 + (var695 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                 + ((i_547_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var695 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                              >> 8;
                        }

                        is[i_514_] = i_547_;
                     } else {
                        if (i != 2) {
                           throw new IllegalArgumentException();
                        }

                        int i_548_ = this.aByteArray10571[i_513_];
                        if (i_548_ != 0) {
                           int i_549_ = this.anIntArray10572[i_548_ & 0xFF];
                           int i_550_ = (i_549_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                           int i_551_ = (i_549_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                           is[i_514_++] = ((i_550_ | i_551_) >>> 8) + GLSprite_Sub2.anInt8896;
                        }
                     }
                  } else {
                     if (i_226_ != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (i == 1) {
                        int i_552_ = this.aByteArray10571[i_513_];
                        if (i_552_ != 0) {
                           int i_553_ = this.anIntArray10572[i_552_ & 0xFF];
                           int i_554_ = is[i_514_];
                           int i_555_ = i_553_ + i_554_;
                           int i_556_ = (i_553_ & 16711935) + (i_554_ & 16711935);
                           i_554_ = (i_556_ & 16777472) + (i_555_ - i_556_ & 65536);
                           is[i_514_] = i_555_ - i_554_ | i_554_ - (i_554_ >>> 8);
                        }
                     } else if (i == 0) {
                        int i_557_ = this.aByteArray10571[i_513_];
                        if (i_557_ != 0) {
                           int i_558_ = this.anIntArray10572[i_557_ & 0xFF];
                           int i_559_ = (i_558_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                           int i_560_ = (i_558_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                           int i_561_ = (i_558_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                           i_558_ = (i_559_ | i_560_ | i_561_) >>> 8;
                           int i_562_ = is[i_514_];
                           int i_563_ = i_558_ + i_562_;
                           int i_564_ = (i_558_ & 16711935) + (i_562_ & 16711935);
                           i_562_ = (i_564_ & 16777472) + (i_563_ - i_564_ & 65536);
                           is[i_514_] = i_563_ - i_562_ | i_562_ - (i_562_ >>> 8);
                        }
                     } else if (i == 3) {
                        byte b = this.aByteArray10571[i_513_];
                        int i_565_ = b > 0 ? this.anIntArray10572[b] : 0;
                        int i_566_ = GLSprite_Sub2.anInt8904;
                        int i_567_ = i_565_ + i_566_;
                        int i_568_ = (i_565_ & 16711935) + (i_566_ & 16711935);
                        int i_569_ = (i_568_ & 16777472) + (i_567_ - i_568_ & 65536);
                        i_569_ = i_567_ - i_569_ | i_569_ - (i_569_ >>> 8);
                        if (i_565_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                           int var700 = is[i_514_];
                           i_569_ = ((i_569_ & 16711935) * GLSprite_Sub2.anInt8895 + (var700 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                 + ((i_569_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var700 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                              >> 8;
                        }

                        is[i_514_] = i_569_;
                     } else if (i == 2) {
                        int i_570_ = this.aByteArray10571[i_513_];
                        if (i_570_ != 0) {
                           int i_571_ = this.anIntArray10572[i_570_ & 0xFF];
                           int i_572_ = (i_571_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                           int i_573_ = (i_571_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                           i_571_ = ((i_572_ | i_573_) >>> 8) + GLSprite_Sub2.anInt8896;
                           int i_574_ = is[i_514_];
                           int i_575_ = i_571_ + i_574_;
                           int i_576_ = (i_571_ & 16711935) + (i_574_ & 16711935);
                           i_574_ = (i_576_ & 16777472) + (i_575_ - i_576_ & 65536);
                           is[i_514_] = i_575_ - i_574_ | i_574_ - (i_574_ >>> 8);
                        }
                     }
                  }

                  i_509_ += GLSprite_Sub2.anInt8913;
                  i_510_ += GLSprite_Sub2.anInt8900;
                  ++i_511_;
               }

               ++i_507_;
               GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
               GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
            }
         } else {
            for(int i_577_ = GLSprite_Sub2.anInt8888; i_577_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
               int i_578_ = GLSprite_Sub2.anInt8882;
               int i_579_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
               int i_580_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
               int i_581_ = GLSprite_Sub2.anInt8894;
               int i_582_;
               if ((i_582_ = i_579_ - (this.anInt8893 << 12)) >= 0) {
                  i_582_ = (GLSprite_Sub2.anInt8913 - i_582_) / GLSprite_Sub2.anInt8913;
                  i_581_ += i_582_;
                  i_579_ += GLSprite_Sub2.anInt8913 * i_582_;
                  i_580_ += GLSprite_Sub2.anInt8900 * i_582_;
                  i_578_ += i_582_;
               }

               if ((i_582_ = (i_579_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_581_) {
                  i_581_ = i_582_;
               }

               if (i_580_ < 0) {
                  i_582_ = (GLSprite_Sub2.anInt8900 - 1 - i_580_) / GLSprite_Sub2.anInt8900;
                  i_581_ += i_582_;
                  i_579_ += GLSprite_Sub2.anInt8913 * i_582_;
                  i_580_ += GLSprite_Sub2.anInt8900 * i_582_;
                  i_578_ += i_582_;
               }

               if ((i_582_ = (1 + i_580_ - (this.anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_581_) {
                  i_581_ = i_582_;
               }

               while(i_581_ < 0) {
                  int i_583_ = (i_580_ >> 12) * this.anInt8893 + (i_579_ >> 12);
                  int i_584_ = i_578_++;
                  if (i_226_ == 0) {
                     if (i == 1) {
                        is[i_584_] = this.anIntArray10572[this.aByteArray10571[i_583_] & 255];
                     } else if (i == 0) {
                        int i_588_ = this.anIntArray10572[this.aByteArray10571[i_583_] & 255];
                        int i_589_ = (i_588_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                        int i_590_ = (i_588_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                        int i_591_ = (i_588_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                        is[i_584_] = (i_589_ | i_590_ | i_591_) >>> 8;
                     } else if (i == 3) {
                        int i_592_ = this.anIntArray10572[this.aByteArray10571[i_583_] & 255];
                        int i_593_ = GLSprite_Sub2.anInt8904;
                        int i_594_ = i_592_ + i_593_;
                        int i_595_ = (i_592_ & 16711935) + (i_593_ & 16711935);
                        int i_596_ = (i_595_ & 16777472) + (i_594_ - i_595_ & 65536);
                        is[i_584_] = i_594_ - i_596_ | i_596_ - (i_596_ >>> 8);
                     } else {
                        if (i != 2) {
                           throw new IllegalArgumentException();
                        }

                        int i_597_ = this.anIntArray10572[this.aByteArray10571[i_583_] & 255];
                        int i_598_ = (i_597_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                        int i_599_ = (i_597_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                        is[i_584_] = ((i_598_ | i_599_) >>> 8) + GLSprite_Sub2.anInt8896;
                     }
                  } else if (i_226_ == 1) {
                     if (i == 1) {
                        int i_600_ = this.aByteArray10571[i_583_];
                        if (i_600_ != 0) {
                           is[i_584_] = this.anIntArray10572[i_600_ & 0xFF];
                        }
                     } else if (i == 0) {
                        int i_601_ = this.aByteArray10571[i_583_];
                        if (i_601_ != 0) {
                           int i_602_ = this.anIntArray10572[i_601_ & 0xFF];
                           if ((GLSprite_Sub2.anInt8904 & 16777215) == 16777215) {
                              int i_603_ = GLSprite_Sub2.anInt8904 >>> 24;
                              int i_604_ = 256 - i_603_;
                              int i_605_ = is[i_584_];
                              is[i_584_] = ((i_602_ & 16711935) * i_603_ + (i_605_ & 16711935) * i_604_ & -16711936)
                                    + ((i_602_ & 0xFF00) * i_603_ + (i_605_ & 0xFF00) * i_604_ & 0xFF0000)
                                 >> 8;
                           } else if (GLSprite_Sub2.anInt8895 != 255) {
                              int i_606_ = (i_602_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                              int i_607_ = (i_602_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                              int i_608_ = (i_602_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                              i_602_ = (i_606_ | i_607_ | i_608_) >>> 8;
                              int i_609_ = is[i_584_];
                              is[i_584_] = ((i_602_ & 16711935) * GLSprite_Sub2.anInt8895 + (i_609_ & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                    + ((i_602_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (i_609_ & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                 >> 8;
                           } else {
                              int i_610_ = (i_602_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                              int i_611_ = (i_602_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                              int i_612_ = (i_602_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                              is[i_584_] = (i_610_ | i_611_ | i_612_) >>> 8;
                           }
                        }
                     } else if (i == 3) {
                        byte b = this.aByteArray10571[i_583_];
                        int i_613_ = b > 0 ? this.anIntArray10572[b] : 0;
                        int i_614_ = GLSprite_Sub2.anInt8904;
                        int i_615_ = i_613_ + i_614_;
                        int i_616_ = (i_613_ & 16711935) + (i_614_ & 16711935);
                        int i_617_ = (i_616_ & 16777472) + (i_615_ - i_616_ & 65536);
                        i_617_ = i_615_ - i_617_ | i_617_ - (i_617_ >>> 8);
                        if (i_613_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                           int var705 = is[i_584_];
                           i_617_ = ((i_617_ & 16711935) * GLSprite_Sub2.anInt8895 + (var705 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                 + ((i_617_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var705 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                              >> 8;
                        }

                        is[i_584_] = i_617_;
                     } else {
                        if (i != 2) {
                           throw new IllegalArgumentException();
                        }

                        int i_618_ = this.aByteArray10571[i_583_];
                        if (i_618_ != 0) {
                           int i_619_ = this.anIntArray10572[i_618_ & 0xFF];
                           int i_620_ = (i_619_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                           int i_621_ = (i_619_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                           is[i_584_++] = ((i_620_ | i_621_) >>> 8) + GLSprite_Sub2.anInt8896;
                        }
                     }
                  } else {
                     if (i_226_ != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (i == 1) {
                        int i_622_ = this.aByteArray10571[i_583_];
                        if (i_622_ != 0) {
                           int i_623_ = this.anIntArray10572[i_622_ & 0xFF];
                           int i_624_ = is[i_584_];
                           int i_625_ = i_623_ + i_624_;
                           int i_626_ = (i_623_ & 16711935) + (i_624_ & 16711935);
                           i_624_ = (i_626_ & 16777472) + (i_625_ - i_626_ & 65536);
                           is[i_584_] = i_625_ - i_624_ | i_624_ - (i_624_ >>> 8);
                        }
                     } else if (i == 0) {
                        int i_627_ = this.aByteArray10571[i_583_];
                        if (i_627_ != 0) {
                           int i_628_ = this.anIntArray10572[i_627_ & 0xFF];
                           int i_629_ = (i_628_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                           int i_630_ = (i_628_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                           int i_631_ = (i_628_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                           i_628_ = (i_629_ | i_630_ | i_631_) >>> 8;
                           int i_632_ = is[i_584_];
                           int i_633_ = i_628_ + i_632_;
                           int i_634_ = (i_628_ & 16711935) + (i_632_ & 16711935);
                           i_632_ = (i_634_ & 16777472) + (i_633_ - i_634_ & 65536);
                           is[i_584_] = i_633_ - i_632_ | i_632_ - (i_632_ >>> 8);
                        }
                     } else if (i == 3) {
                        byte b = this.aByteArray10571[i_583_];
                        int i_635_ = b > 0 ? this.anIntArray10572[b] : 0;
                        int i_636_ = GLSprite_Sub2.anInt8904;
                        int i_637_ = i_635_ + i_636_;
                        int i_638_ = (i_635_ & 16711935) + (i_636_ & 16711935);
                        int i_639_ = (i_638_ & 16777472) + (i_637_ - i_638_ & 65536);
                        i_639_ = i_637_ - i_639_ | i_639_ - (i_639_ >>> 8);
                        if (i_635_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                           int var710 = is[i_584_];
                           i_639_ = ((i_639_ & 16711935) * GLSprite_Sub2.anInt8895 + (var710 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                 + ((i_639_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var710 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                              >> 8;
                        }

                        is[i_584_] = i_639_;
                     } else if (i == 2) {
                        int i_640_ = this.aByteArray10571[i_583_];
                        if (i_640_ != 0) {
                           int i_641_ = this.anIntArray10572[i_640_ & 0xFF];
                           int i_642_ = (i_641_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                           int i_643_ = (i_641_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                           i_641_ = ((i_642_ | i_643_) >>> 8) + GLSprite_Sub2.anInt8896;
                           int i_644_ = is[i_584_];
                           int i_645_ = i_641_ + i_644_;
                           int i_646_ = (i_641_ & 16711935) + (i_644_ & 16711935);
                           i_644_ = (i_646_ & 16777472) + (i_645_ - i_646_ & 65536);
                           is[i_584_] = i_645_ - i_644_ | i_644_ - (i_644_ >>> 8);
                        }
                     }
                  }

                  i_579_ += GLSprite_Sub2.anInt8913;
                  i_580_ += GLSprite_Sub2.anInt8900;
                  ++i_581_;
               }

               ++i_577_;
               GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
               GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
            }
         }
      } else if (GLSprite_Sub2.anInt8900 == 0) {
         for(int i_647_ = GLSprite_Sub2.anInt8888; i_647_ < 0; GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881) {
            int i_648_ = GLSprite_Sub2.anInt8882;
            int i_649_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
            int i_650_ = GLSprite_Sub2.anInt8908;
            int i_651_ = GLSprite_Sub2.anInt8894;
            if (i_650_ >= 0 && i_650_ - (this.anInt8897 << 12) < 0) {
               if (i_649_ < 0) {
                  int i_652_ = (GLSprite_Sub2.anInt8913 - 1 - i_649_) / GLSprite_Sub2.anInt8913;
                  i_651_ += i_652_;
                  i_649_ += GLSprite_Sub2.anInt8913 * i_652_;
                  i_648_ += i_652_;
               }

               int i_653_;
               if ((i_653_ = (1 + i_649_ - (this.anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_651_) {
                  i_651_ = i_653_;
               }

               while(i_651_ < 0) {
                  int i_654_ = (i_650_ >> 12) * this.anInt8893 + (i_649_ >> 12);
                  int i_655_ = i_648_++;
                  if (i_226_ == 0) {
                     if (i == 1) {
                        is[i_655_] = this.anIntArray10572[this.aByteArray10571[i_654_] & 255];
                     } else if (i == 0) {
                        int i_659_ = this.anIntArray10572[this.aByteArray10571[i_654_] & 255];
                        int i_660_ = (i_659_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                        int i_661_ = (i_659_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                        int i_662_ = (i_659_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                        is[i_655_] = (i_660_ | i_661_ | i_662_) >>> 8;
                     } else if (i == 3) {
                        int i_663_ = this.anIntArray10572[this.aByteArray10571[i_654_] & 255];
                        int i_664_ = GLSprite_Sub2.anInt8904;
                        int i_665_ = i_663_ + i_664_;
                        int i_666_ = (i_663_ & 16711935) + (i_664_ & 16711935);
                        int i_667_ = (i_666_ & 16777472) + (i_665_ - i_666_ & 65536);
                        is[i_655_] = i_665_ - i_667_ | i_667_ - (i_667_ >>> 8);
                     } else {
                        if (i != 2) {
                           throw new IllegalArgumentException();
                        }

                        int i_668_ = this.anIntArray10572[this.aByteArray10571[i_654_] & 255];
                        int i_669_ = (i_668_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                        int i_670_ = (i_668_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                        is[i_655_] = ((i_669_ | i_670_) >>> 8) + GLSprite_Sub2.anInt8896;
                     }
                  } else if (i_226_ == 1) {
                     if (i == 1) {
                        int i_671_ = this.aByteArray10571[i_654_];
                        if (i_671_ != 0) {
                           is[i_655_] = this.anIntArray10572[i_671_ & 0xFF];
                        }
                     } else if (i == 0) {
                        int i_672_ = this.aByteArray10571[i_654_];
                        if (i_672_ != 0) {
                           int i_673_ = this.anIntArray10572[i_672_ & 0xFF];
                           if ((GLSprite_Sub2.anInt8904 & 16777215) == 16777215) {
                              int i_674_ = GLSprite_Sub2.anInt8904 >>> 24;
                              int i_675_ = 256 - i_674_;
                              int i_676_ = is[i_655_];
                              is[i_655_] = ((i_673_ & 16711935) * i_674_ + (i_676_ & 16711935) * i_675_ & -16711936)
                                    + ((i_673_ & 0xFF00) * i_674_ + (i_676_ & 0xFF00) * i_675_ & 0xFF0000)
                                 >> 8;
                           } else if (GLSprite_Sub2.anInt8895 != 255) {
                              int i_677_ = (i_673_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                              int i_678_ = (i_673_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                              int i_679_ = (i_673_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                              i_673_ = (i_677_ | i_678_ | i_679_) >>> 8;
                              int i_680_ = is[i_655_];
                              is[i_655_] = ((i_673_ & 16711935) * GLSprite_Sub2.anInt8895 + (i_680_ & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                    + ((i_673_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (i_680_ & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                                 >> 8;
                           } else {
                              int i_681_ = (i_673_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                              int i_682_ = (i_673_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                              int i_683_ = (i_673_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                              is[i_655_] = (i_681_ | i_682_ | i_683_) >>> 8;
                           }
                        }
                     } else if (i == 3) {
                        byte b = this.aByteArray10571[i_654_];
                        int i_684_ = b > 0 ? this.anIntArray10572[b] : 0;
                        int i_685_ = GLSprite_Sub2.anInt8904;
                        int i_686_ = i_684_ + i_685_;
                        int i_687_ = (i_684_ & 16711935) + (i_685_ & 16711935);
                        int i_688_ = (i_687_ & 16777472) + (i_686_ - i_687_ & 65536);
                        i_688_ = i_686_ - i_688_ | i_688_ - (i_688_ >>> 8);
                        if (i_684_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                           int var715 = is[i_655_];
                           i_688_ = ((i_688_ & 16711935) * GLSprite_Sub2.anInt8895 + (var715 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                 + ((i_688_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var715 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                              >> 8;
                        }

                        is[i_655_] = i_688_;
                     } else {
                        if (i != 2) {
                           throw new IllegalArgumentException();
                        }

                        int i_689_ = this.aByteArray10571[i_654_];
                        if (i_689_ != 0) {
                           int i_690_ = this.anIntArray10572[i_689_ & 0xFF];
                           int i_691_ = (i_690_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                           int i_692_ = (i_690_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                           is[i_655_++] = ((i_691_ | i_692_) >>> 8) + GLSprite_Sub2.anInt8896;
                        }
                     }
                  } else {
                     if (i_226_ != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (i == 1) {
                        int i_693_ = this.aByteArray10571[i_654_];
                        if (i_693_ != 0) {
                           int i_694_ = this.anIntArray10572[i_693_ & 0xFF];
                           int i_695_ = is[i_655_];
                           int i_696_ = i_694_ + i_695_;
                           int i_697_ = (i_694_ & 16711935) + (i_695_ & 16711935);
                           i_695_ = (i_697_ & 16777472) + (i_696_ - i_697_ & 65536);
                           is[i_655_] = i_696_ - i_695_ | i_695_ - (i_695_ >>> 8);
                        }
                     } else if (i == 0) {
                        int i_698_ = this.aByteArray10571[i_654_];
                        if (i_698_ != 0) {
                           int i_699_ = this.anIntArray10572[i_698_ & 0xFF];
                           int i_700_ = (i_699_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                           int i_701_ = (i_699_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                           int i_702_ = (i_699_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                           i_699_ = (i_700_ | i_701_ | i_702_) >>> 8;
                           int i_703_ = is[i_655_];
                           int i_704_ = i_699_ + i_703_;
                           int i_705_ = (i_699_ & 16711935) + (i_703_ & 16711935);
                           i_703_ = (i_705_ & 16777472) + (i_704_ - i_705_ & 65536);
                           is[i_655_] = i_704_ - i_703_ | i_703_ - (i_703_ >>> 8);
                        }
                     } else if (i == 3) {
                        byte b = this.aByteArray10571[i_654_];
                        int i_706_ = b > 0 ? this.anIntArray10572[b] : 0;
                        int i_707_ = GLSprite_Sub2.anInt8904;
                        int i_708_ = i_706_ + i_707_;
                        int i_709_ = (i_706_ & 16711935) + (i_707_ & 16711935);
                        int i_710_ = (i_709_ & 16777472) + (i_708_ - i_709_ & 65536);
                        i_710_ = i_708_ - i_710_ | i_710_ - (i_710_ >>> 8);
                        if (i_706_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                           int var720 = is[i_655_];
                           i_710_ = ((i_710_ & 16711935) * GLSprite_Sub2.anInt8895 + (var720 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                 + ((i_710_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var720 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                              >> 8;
                        }

                        is[i_655_] = i_710_;
                     } else if (i == 2) {
                        int i_711_ = this.aByteArray10571[i_654_];
                        if (i_711_ != 0) {
                           int i_712_ = this.anIntArray10572[i_711_ & 0xFF];
                           int i_713_ = (i_712_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                           int i_714_ = (i_712_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                           i_712_ = ((i_713_ | i_714_) >>> 8) + GLSprite_Sub2.anInt8896;
                           int i_715_ = is[i_655_];
                           int i_716_ = i_712_ + i_715_;
                           int i_717_ = (i_712_ & 16711935) + (i_715_ & 16711935);
                           i_715_ = (i_717_ & 16777472) + (i_716_ - i_717_ & 65536);
                           is[i_655_] = i_716_ - i_715_ | i_715_ - (i_715_ >>> 8);
                        }
                     }
                  }

                  i_649_ += GLSprite_Sub2.anInt8913;
                  ++i_651_;
               }
            }

            ++i_647_;
            GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
            GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
         }
      } else if (GLSprite_Sub2.anInt8900 < 0) {
         for(int i_718_ = GLSprite_Sub2.anInt8888; i_718_ < 0; ++i_718_) {
            int i_719_ = GLSprite_Sub2.anInt8882;
            int i_720_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
            int i_721_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
            int i_722_ = GLSprite_Sub2.anInt8894;
            if (i_720_ < 0) {
               int i_723_ = (GLSprite_Sub2.anInt8913 - 1 - i_720_) / GLSprite_Sub2.anInt8913;
               i_722_ += i_723_;
               i_720_ += GLSprite_Sub2.anInt8913 * i_723_;
               i_721_ += GLSprite_Sub2.anInt8900 * i_723_;
               i_719_ += i_723_;
            }

            int i_724_;
            if ((i_724_ = (1 + i_720_ - (this.anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_722_) {
               i_722_ = i_724_;
            }

            if ((i_724_ = i_721_ - (this.anInt8897 << 12)) >= 0) {
               i_724_ = (GLSprite_Sub2.anInt8900 - i_724_) / GLSprite_Sub2.anInt8900;
               i_722_ += i_724_;
               i_720_ += GLSprite_Sub2.anInt8913 * i_724_;
               i_721_ += GLSprite_Sub2.anInt8900 * i_724_;
               i_719_ += i_724_;
            }

            if ((i_724_ = (i_721_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_722_) {
               i_722_ = i_724_;
            }

            while(i_722_ < 0) {
               int i_725_ = (i_721_ >> 12) * this.anInt8893 + (i_720_ >> 12);
               int i_726_ = i_719_++;
               if (i_226_ == 0) {
                  if (i == 1) {
                     is[i_726_] = this.anIntArray10572[this.aByteArray10571[i_725_] & 255];
                  } else if (i == 0) {
                     int i_730_ = this.anIntArray10572[this.aByteArray10571[i_725_] & 255];
                     int i_731_ = (i_730_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                     int i_732_ = (i_730_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                     int i_733_ = (i_730_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                     is[i_726_] = (i_731_ | i_732_ | i_733_) >>> 8;
                  } else if (i == 3) {
                     int i_734_ = this.anIntArray10572[this.aByteArray10571[i_725_] & 255];
                     int i_735_ = GLSprite_Sub2.anInt8904;
                     int i_736_ = i_734_ + i_735_;
                     int i_737_ = (i_734_ & 16711935) + (i_735_ & 16711935);
                     int i_738_ = (i_737_ & 16777472) + (i_736_ - i_737_ & 65536);
                     is[i_726_] = i_736_ - i_738_ | i_738_ - (i_738_ >>> 8);
                  } else {
                     if (i != 2) {
                        throw new IllegalArgumentException();
                     }

                     int i_739_ = this.anIntArray10572[this.aByteArray10571[i_725_] & 255];
                     int i_740_ = (i_739_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                     int i_741_ = (i_739_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                     is[i_726_] = ((i_740_ | i_741_) >>> 8) + GLSprite_Sub2.anInt8896;
                  }
               } else if (i_226_ == 1) {
                  if (i == 1) {
                     int i_742_ = this.aByteArray10571[i_725_];
                     if (i_742_ != 0) {
                        is[i_726_] = this.anIntArray10572[i_742_ & 0xFF];
                     }
                  } else if (i == 0) {
                     int i_743_ = this.aByteArray10571[i_725_];
                     if (i_743_ != 0) {
                        int i_744_ = this.anIntArray10572[i_743_ & 0xFF];
                        if ((GLSprite_Sub2.anInt8904 & 16777215) == 16777215) {
                           int i_745_ = GLSprite_Sub2.anInt8904 >>> 24;
                           int i_746_ = 256 - i_745_;
                           int i_747_ = is[i_726_];
                           is[i_726_] = ((i_744_ & 16711935) * i_745_ + (i_747_ & 16711935) * i_746_ & -16711936)
                                 + ((i_744_ & 0xFF00) * i_745_ + (i_747_ & 0xFF00) * i_746_ & 0xFF0000)
                              >> 8;
                        } else if (GLSprite_Sub2.anInt8895 != 255) {
                           int i_748_ = (i_744_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                           int i_749_ = (i_744_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                           int i_750_ = (i_744_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                           i_744_ = (i_748_ | i_749_ | i_750_) >>> 8;
                           int i_751_ = is[i_726_];
                           is[i_726_] = ((i_744_ & 16711935) * GLSprite_Sub2.anInt8895 + (i_751_ & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                 + ((i_744_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (i_751_ & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                              >> 8;
                        } else {
                           int i_752_ = (i_744_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                           int i_753_ = (i_744_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                           int i_754_ = (i_744_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                           is[i_726_] = (i_752_ | i_753_ | i_754_) >>> 8;
                        }
                     }
                  } else if (i == 3) {
                     byte b = this.aByteArray10571[i_725_];
                     int i_755_ = b > 0 ? this.anIntArray10572[b] : 0;
                     int i_756_ = GLSprite_Sub2.anInt8904;
                     int i_757_ = i_755_ + i_756_;
                     int i_758_ = (i_755_ & 16711935) + (i_756_ & 16711935);
                     int i_759_ = (i_758_ & 16777472) + (i_757_ - i_758_ & 65536);
                     i_759_ = i_757_ - i_759_ | i_759_ - (i_759_ >>> 8);
                     if (i_755_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                        int var725 = is[i_726_];
                        i_759_ = ((i_759_ & 16711935) * GLSprite_Sub2.anInt8895 + (var725 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                              + ((i_759_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var725 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                           >> 8;
                     }

                     is[i_726_] = i_759_;
                  } else {
                     if (i != 2) {
                        throw new IllegalArgumentException();
                     }

                     int i_760_ = this.aByteArray10571[i_725_];
                     if (i_760_ != 0) {
                        int i_761_ = this.anIntArray10572[i_760_ & 0xFF];
                        int i_762_ = (i_761_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                        int i_763_ = (i_761_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                        is[i_726_++] = ((i_762_ | i_763_) >>> 8) + GLSprite_Sub2.anInt8896;
                     }
                  }
               } else {
                  if (i_226_ != 2) {
                     throw new IllegalArgumentException();
                  }

                  if (i == 1) {
                     int i_764_ = this.aByteArray10571[i_725_];
                     if (i_764_ != 0) {
                        int i_765_ = this.anIntArray10572[i_764_ & 0xFF];
                        int i_766_ = is[i_726_];
                        int i_767_ = i_765_ + i_766_;
                        int i_768_ = (i_765_ & 16711935) + (i_766_ & 16711935);
                        i_766_ = (i_768_ & 16777472) + (i_767_ - i_768_ & 65536);
                        is[i_726_] = i_767_ - i_766_ | i_766_ - (i_766_ >>> 8);
                     }
                  } else if (i == 0) {
                     int i_769_ = this.aByteArray10571[i_725_];
                     if (i_769_ != 0) {
                        int i_770_ = this.anIntArray10572[i_769_ & 0xFF];
                        int i_771_ = (i_770_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                        int i_772_ = (i_770_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                        int i_773_ = (i_770_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                        i_770_ = (i_771_ | i_772_ | i_773_) >>> 8;
                        int i_774_ = is[i_726_];
                        int i_775_ = i_770_ + i_774_;
                        int i_776_ = (i_770_ & 16711935) + (i_774_ & 16711935);
                        i_774_ = (i_776_ & 16777472) + (i_775_ - i_776_ & 65536);
                        is[i_726_] = i_775_ - i_774_ | i_774_ - (i_774_ >>> 8);
                     }
                  } else if (i == 3) {
                     byte b = this.aByteArray10571[i_725_];
                     int i_777_ = b > 0 ? this.anIntArray10572[b] : 0;
                     int i_778_ = GLSprite_Sub2.anInt8904;
                     int i_779_ = i_777_ + i_778_;
                     int i_780_ = (i_777_ & 16711935) + (i_778_ & 16711935);
                     int i_781_ = (i_780_ & 16777472) + (i_779_ - i_780_ & 65536);
                     i_781_ = i_779_ - i_781_ | i_781_ - (i_781_ >>> 8);
                     if (i_777_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                        int var730 = is[i_726_];
                        i_781_ = ((i_781_ & 16711935) * GLSprite_Sub2.anInt8895 + (var730 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                              + ((i_781_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var730 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                           >> 8;
                     }

                     is[i_726_] = i_781_;
                  } else if (i == 2) {
                     int i_782_ = this.aByteArray10571[i_725_];
                     if (i_782_ != 0) {
                        int i_783_ = this.anIntArray10572[i_782_ & 0xFF];
                        int i_784_ = (i_783_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                        int i_785_ = (i_783_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                        i_783_ = ((i_784_ | i_785_) >>> 8) + GLSprite_Sub2.anInt8896;
                        int i_786_ = is[i_726_];
                        int i_787_ = i_783_ + i_786_;
                        int i_788_ = (i_783_ & 16711935) + (i_786_ & 16711935);
                        i_786_ = (i_788_ & 16777472) + (i_787_ - i_788_ & 65536);
                        is[i_726_] = i_787_ - i_786_ | i_786_ - (i_786_ >>> 8);
                     }
                  }
               }

               i_720_ += GLSprite_Sub2.anInt8913;
               i_721_ += GLSprite_Sub2.anInt8900;
               ++i_722_;
            }

            GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
            GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
            GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
         }
      } else {
         for(int i_789_ = GLSprite_Sub2.anInt8888; i_789_ < 0; ++i_789_) {
            int i_790_ = GLSprite_Sub2.anInt8882;
            int i_791_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
            int i_792_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
            int i_793_ = GLSprite_Sub2.anInt8894;
            if (i_791_ < 0) {
               int i_794_ = (GLSprite_Sub2.anInt8913 - 1 - i_791_) / GLSprite_Sub2.anInt8913;
               i_793_ += i_794_;
               i_791_ += GLSprite_Sub2.anInt8913 * i_794_;
               i_792_ += GLSprite_Sub2.anInt8900 * i_794_;
               i_790_ += i_794_;
            }

            int i_795_;
            if ((i_795_ = (1 + i_791_ - (this.anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_793_) {
               i_793_ = i_795_;
            }

            if (i_792_ < 0) {
               i_795_ = (GLSprite_Sub2.anInt8900 - 1 - i_792_) / GLSprite_Sub2.anInt8900;
               i_793_ += i_795_;
               i_791_ += GLSprite_Sub2.anInt8913 * i_795_;
               i_792_ += GLSprite_Sub2.anInt8900 * i_795_;
               i_790_ += i_795_;
            }

            if ((i_795_ = (1 + i_792_ - (this.anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_793_) {
               i_793_ = i_795_;
            }

            while(i_793_ < 0) {
               int i_796_ = (i_792_ >> 12) * this.anInt8893 + (i_791_ >> 12);
               int i_797_ = i_790_++;
               if (i_226_ == 0) {
                  if (i == 1) {
                     is[i_797_] = this.anIntArray10572[this.aByteArray10571[i_796_] & 255];
                  } else if (i == 0) {
                     int i_801_ = this.anIntArray10572[this.aByteArray10571[i_796_] & 255];
                     int i_802_ = (i_801_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                     int i_803_ = (i_801_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                     int i_804_ = (i_801_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                     is[i_797_] = (i_802_ | i_803_ | i_804_) >>> 8;
                  } else if (i == 3) {
                     int i_805_ = this.anIntArray10572[this.aByteArray10571[i_796_] & 255];
                     int i_806_ = GLSprite_Sub2.anInt8904;
                     int i_807_ = i_805_ + i_806_;
                     int i_808_ = (i_805_ & 16711935) + (i_806_ & 16711935);
                     int i_809_ = (i_808_ & 16777472) + (i_807_ - i_808_ & 65536);
                     is[i_797_] = i_807_ - i_809_ | i_809_ - (i_809_ >>> 8);
                  } else {
                     if (i != 2) {
                        throw new IllegalArgumentException();
                     }

                     int i_810_ = this.anIntArray10572[this.aByteArray10571[i_796_] & 255];
                     int i_811_ = (i_810_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                     int i_812_ = (i_810_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                     is[i_797_] = ((i_811_ | i_812_) >>> 8) + GLSprite_Sub2.anInt8896;
                  }
               } else if (i_226_ == 1) {
                  if (i == 1) {
                     int i_813_ = this.aByteArray10571[i_796_];
                     if (i_813_ != 0) {
                        is[i_797_] = this.anIntArray10572[i_813_ & 0xFF];
                     }
                  } else if (i == 0) {
                     int i_814_ = this.aByteArray10571[i_796_];
                     if (i_814_ != 0) {
                        int i_815_ = this.anIntArray10572[i_814_ & 0xFF];
                        if ((GLSprite_Sub2.anInt8904 & 16777215) == 16777215) {
                           int i_816_ = GLSprite_Sub2.anInt8904 >>> 24;
                           int i_817_ = 256 - i_816_;
                           int i_818_ = is[i_797_];
                           is[i_797_] = ((i_815_ & 16711935) * i_816_ + (i_818_ & 16711935) * i_817_ & -16711936)
                                 + ((i_815_ & 0xFF00) * i_816_ + (i_818_ & 0xFF00) * i_817_ & 0xFF0000)
                              >> 8;
                        } else if (GLSprite_Sub2.anInt8895 != 255) {
                           int i_819_ = (i_815_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                           int i_820_ = (i_815_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                           int i_821_ = (i_815_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                           i_815_ = (i_819_ | i_820_ | i_821_) >>> 8;
                           int i_822_ = is[i_797_];
                           is[i_797_] = ((i_815_ & 16711935) * GLSprite_Sub2.anInt8895 + (i_822_ & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                                 + ((i_815_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (i_822_ & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                              >> 8;
                        } else {
                           int i_823_ = (i_815_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                           int i_824_ = (i_815_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                           int i_825_ = (i_815_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                           is[i_797_] = (i_823_ | i_824_ | i_825_) >>> 8;
                        }
                     }
                  } else if (i == 3) {
                     byte b = this.aByteArray10571[i_796_];
                     int i_826_ = b > 0 ? this.anIntArray10572[b] : 0;
                     int i_827_ = GLSprite_Sub2.anInt8904;
                     int i_828_ = i_826_ + i_827_;
                     int i_829_ = (i_826_ & 16711935) + (i_827_ & 16711935);
                     int i_830_ = (i_829_ & 16777472) + (i_828_ - i_829_ & 65536);
                     i_830_ = i_828_ - i_830_ | i_830_ - (i_830_ >>> 8);
                     if (i_826_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                        int var735 = is[i_797_];
                        i_830_ = ((i_830_ & 16711935) * GLSprite_Sub2.anInt8895 + (var735 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                              + ((i_830_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var735 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                           >> 8;
                     }

                     is[i_797_] = i_830_;
                  } else {
                     if (i != 2) {
                        throw new IllegalArgumentException();
                     }

                     int i_831_ = this.aByteArray10571[i_796_];
                     if (i_831_ != 0) {
                        int i_832_ = this.anIntArray10572[i_831_ & 0xFF];
                        int i_833_ = (i_832_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                        int i_834_ = (i_832_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                        is[i_797_++] = ((i_833_ | i_834_) >>> 8) + GLSprite_Sub2.anInt8896;
                     }
                  }
               } else {
                  if (i_226_ != 2) {
                     throw new IllegalArgumentException();
                  }

                  if (i == 1) {
                     int i_835_ = this.aByteArray10571[i_796_];
                     if (i_835_ != 0) {
                        int i_836_ = this.anIntArray10572[i_835_ & 0xFF];
                        int i_837_ = is[i_797_];
                        int i_838_ = i_836_ + i_837_;
                        int i_839_ = (i_836_ & 16711935) + (i_837_ & 16711935);
                        i_837_ = (i_839_ & 16777472) + (i_838_ - i_839_ & 65536);
                        is[i_797_] = i_838_ - i_837_ | i_837_ - (i_837_ >>> 8);
                     }
                  } else if (i == 0) {
                     int i_840_ = this.aByteArray10571[i_796_];
                     if (i_840_ != 0) {
                        int i_841_ = this.anIntArray10572[i_840_ & 0xFF];
                        int i_842_ = (i_841_ & 0xFF0000) * GLSprite_Sub2.anInt8910 & 0xFF000000;
                        int i_843_ = (i_841_ & 0xFF00) * GLSprite_Sub2.anInt8890 & 0xFF0000;
                        int i_844_ = (i_841_ & 0xFF) * GLSprite_Sub2.anInt8906 & 0xFF00;
                        i_841_ = (i_842_ | i_843_ | i_844_) >>> 8;
                        int i_845_ = is[i_797_];
                        int i_846_ = i_841_ + i_845_;
                        int i_847_ = (i_841_ & 16711935) + (i_845_ & 16711935);
                        i_845_ = (i_847_ & 16777472) + (i_846_ - i_847_ & 65536);
                        is[i_797_] = i_846_ - i_845_ | i_845_ - (i_845_ >>> 8);
                     }
                  } else if (i == 3) {
                     byte b = this.aByteArray10571[i_796_];
                     int i_848_ = b > 0 ? this.anIntArray10572[b] : 0;
                     int i_849_ = GLSprite_Sub2.anInt8904;
                     int i_850_ = i_848_ + i_849_;
                     int i_851_ = (i_848_ & 16711935) + (i_849_ & 16711935);
                     int i_852_ = (i_851_ & 16777472) + (i_850_ - i_851_ & 65536);
                     i_852_ = i_850_ - i_852_ | i_852_ - (i_852_ >>> 8);
                     if (i_848_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
                        int var740 = is[i_797_];
                        i_852_ = ((i_852_ & 16711935) * GLSprite_Sub2.anInt8895 + (var740 & 16711935) * GLSprite_Sub2.anInt8903 & -16711936)
                              + ((i_852_ & 0xFF00) * GLSprite_Sub2.anInt8895 + (var740 & 0xFF00) * GLSprite_Sub2.anInt8903 & 0xFF0000)
                           >> 8;
                     }

                     is[i_797_] = i_852_;
                  } else if (i == 2) {
                     int i_853_ = this.aByteArray10571[i_796_];
                     if (i_853_ != 0) {
                        int i_854_ = this.anIntArray10572[i_853_ & 0xFF];
                        int i_855_ = (i_854_ & 16711935) * GLSprite_Sub2.anInt8895 & -16711936;
                        int i_856_ = (i_854_ & 0xFF00) * GLSprite_Sub2.anInt8895 & 0xFF0000;
                        i_854_ = ((i_855_ | i_856_) >>> 8) + GLSprite_Sub2.anInt8896;
                        int i_857_ = is[i_797_];
                        int i_858_ = i_854_ + i_857_;
                        int i_859_ = (i_854_ & 16711935) + (i_857_ & 16711935);
                        i_857_ = (i_859_ & 16777472) + (i_858_ - i_859_ & 65536);
                        is[i_797_] = i_858_ - i_857_ | i_857_ - (i_857_ >>> 8);
                     }
                  }
               }

               i_791_ += GLSprite_Sub2.anInt8913;
               i_792_ += GLSprite_Sub2.anInt8900;
               ++i_793_;
            }

            GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
            GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
            GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
         }
      }
   }

   @Override
   final void method1195(int i, int i_860_, int i_861_, int i_862_, int i_863_, int i_864_) {
      throw new IllegalStateException();
   }

   @Override
   final void method1190(int i, int i_865_, int i_866_) {
      throw new IllegalStateException();
   }

   @Override
   final void method1208(int i, int i_867_, int i_868_, int i_869_, int i_870_, int i_871_, int i_872_, int i_873_, int i_874_) {
      if (i_869_ > 0 && i_870_ > 0) {
         int i_875_ = 0;
         int i_876_ = 0;
         int i_877_ = this.anInt8889 + this.anInt8893 + this.anInt8885;
         int i_878_ = this.anInt8899 + this.anInt8897 + this.anInt8884;
         int i_879_ = (i_877_ << 16) / i_869_;
         int i_880_ = (i_878_ << 16) / i_870_;
         if (this.anInt8889 > 0) {
            int i_881_ = ((this.anInt8889 << 16) + i_879_ - 1) / i_879_;
            i += i_881_;
            i_875_ += i_881_ * i_879_ - (this.anInt8889 << 16);
         }

         if (this.anInt8899 > 0) {
            int i_882_ = ((this.anInt8899 << 16) + i_880_ - 1) / i_880_;
            i_867_ += i_882_;
            i_876_ += i_882_ * i_880_ - (this.anInt8899 << 16);
         }

         if (this.anInt8893 < i_877_) {
            i_869_ = ((this.anInt8893 << 16) - i_875_ + i_879_ - 1) / i_879_;
         }

         if (this.anInt8897 < i_878_) {
            i_870_ = ((this.anInt8897 << 16) - i_876_ + i_880_ - 1) / i_880_;
         }

         int i_883_ = i + i_867_ * this.aPureJavaToolkit8886.anInt6789;
         int i_884_ = this.aPureJavaToolkit8886.anInt6789 - i_869_;
         if (i_867_ + i_870_ > this.aPureJavaToolkit8886.anInt6772) {
            i_870_ -= i_867_ + i_870_ - this.aPureJavaToolkit8886.anInt6772;
         }

         if (i_867_ < this.aPureJavaToolkit8886.anInt6760) {
            int i_885_ = this.aPureJavaToolkit8886.anInt6760 - i_867_;
            i_870_ -= i_885_;
            i_883_ += i_885_ * this.aPureJavaToolkit8886.anInt6789;
            i_876_ += i_880_ * i_885_;
         }

         if (i + i_869_ > this.aPureJavaToolkit8886.anInt6778) {
            int i_886_ = i + i_869_ - this.aPureJavaToolkit8886.anInt6778;
            i_869_ -= i_886_;
            i_884_ += i_886_;
         }

         if (i < this.aPureJavaToolkit8886.anInt6767) {
            int i_887_ = this.aPureJavaToolkit8886.anInt6767 - i;
            i_869_ -= i_887_;
            i_883_ += i_887_;
            i_875_ += i_879_ * i_887_;
            i_884_ += i_887_;
         }

         float[] fs = this.aPureJavaToolkit8886.aFloatArray6782;
         int[] is = this.aPureJavaToolkit8886.anIntArray6787;
         if (i_873_ == 0) {
            if (i_871_ == 1) {
               int i_888_ = i_875_;

               for(int i_889_ = -i_870_; i_889_ < 0; ++i_889_) {
                  int i_890_ = (i_876_ >> 16) * this.anInt8893;

                  for(int i_891_ = -i_869_; i_891_ < 0; ++i_891_) {
                     if ((float)i_868_ < fs[i_883_]) {
                        is[i_883_] = this.anIntArray10572[this.aByteArray10571[(i_875_ >> 16) + i_890_] & 255];
                        fs[i_883_] = (float)i_868_;
                     }

                     i_875_ += i_879_;
                     ++i_883_;
                  }

                  i_876_ += i_880_;
                  i_875_ = i_888_;
                  i_883_ += i_884_;
               }
            } else if (i_871_ == 0) {
               int i_892_ = (i_872_ & 0xFF0000) >> 16;
               int i_893_ = (i_872_ & 0xFF00) >> 8;
               int i_894_ = i_872_ & 0xFF;
               int i_895_ = i_875_;

               for(int i_896_ = -i_870_; i_896_ < 0; ++i_896_) {
                  int i_897_ = (i_876_ >> 16) * this.anInt8893;

                  for(int i_898_ = -i_869_; i_898_ < 0; ++i_898_) {
                     if ((float)i_868_ < fs[i_883_]) {
                        int i_899_ = this.anIntArray10572[this.aByteArray10571[(i_875_ >> 16) + i_897_] & 255];
                        int i_900_ = (i_899_ & 0xFF0000) * i_892_ & 0xFF000000;
                        int i_901_ = (i_899_ & 0xFF00) * i_893_ & 0xFF0000;
                        int i_902_ = (i_899_ & 0xFF) * i_894_ & 0xFF00;
                        is[i_883_] = (i_900_ | i_901_ | i_902_) >>> 8;
                        fs[i_883_] = (float)i_868_;
                     }

                     i_875_ += i_879_;
                     ++i_883_;
                  }

                  i_876_ += i_880_;
                  i_875_ = i_895_;
                  i_883_ += i_884_;
               }
            } else if (i_871_ == 3) {
               int i_903_ = i_875_;

               for(int i_904_ = -i_870_; i_904_ < 0; ++i_904_) {
                  int i_905_ = (i_876_ >> 16) * this.anInt8893;

                  for(int i_906_ = -i_869_; i_906_ < 0; ++i_906_) {
                     if ((float)i_868_ < fs[i_883_]) {
                        byte b = this.aByteArray10571[(i_875_ >> 16) + i_905_];
                        int i_907_ = b > 0 ? this.anIntArray10572[b] : 0;
                        int i_908_ = i_907_ + i_872_;
                        int i_909_ = (i_907_ & 16711935) + (i_872_ & 16711935);
                        int i_910_ = (i_909_ & 16777472) + (i_908_ - i_909_ & 65536);
                        is[i_883_] = i_908_ - i_910_ | i_910_ - (i_910_ >>> 8);
                        fs[i_883_] = (float)i_868_;
                     }

                     i_875_ += i_879_;
                     ++i_883_;
                  }

                  i_876_ += i_880_;
                  i_875_ = i_903_;
                  i_883_ += i_884_;
               }
            } else if (i_871_ != 2) {
               throw new IllegalArgumentException();
            } else {
               int i_911_ = i_872_ >>> 24;
               int i_912_ = 256 - i_911_;
               int i_913_ = (i_872_ & 16711935) * i_912_ & -16711936;
               int i_914_ = (i_872_ & 0xFF00) * i_912_ & 0xFF0000;
               i_872_ = (i_913_ | i_914_) >>> 8;
               int i_915_ = i_875_;

               for(int i_916_ = -i_870_; i_916_ < 0; ++i_916_) {
                  int i_917_ = (i_876_ >> 16) * this.anInt8893;

                  for(int i_918_ = -i_869_; i_918_ < 0; ++i_918_) {
                     if ((float)i_868_ < fs[i_883_]) {
                        int i_919_ = this.anIntArray10572[this.aByteArray10571[(i_875_ >> 16) + i_917_] & 255];
                        i_913_ = (i_919_ & 16711935) * i_911_ & -16711936;
                        i_914_ = (i_919_ & 0xFF00) * i_911_ & 0xFF0000;
                        is[i_883_] = ((i_913_ | i_914_) >>> 8) + i_872_;
                        fs[i_883_] = (float)i_868_;
                     }

                     i_875_ += i_879_;
                     ++i_883_;
                  }

                  i_876_ += i_880_;
                  i_875_ = i_915_;
                  i_883_ += i_884_;
               }
            }
         } else if (i_873_ == 1) {
            if (i_871_ == 1) {
               int i_920_ = i_875_;

               for(int i_921_ = -i_870_; i_921_ < 0; ++i_921_) {
                  int i_922_ = (i_876_ >> 16) * this.anInt8893;

                  for(int i_923_ = -i_869_; i_923_ < 0; ++i_923_) {
                     if ((float)i_868_ < fs[i_883_]) {
                        int i_924_ = this.aByteArray10571[(i_875_ >> 16) + i_922_];
                        if (i_924_ != 0) {
                           is[i_883_] = this.anIntArray10572[i_924_ & 0xFF];
                           fs[i_883_] = (float)i_868_;
                        }
                     }

                     i_875_ += i_879_;
                     ++i_883_;
                  }

                  i_876_ += i_880_;
                  i_875_ = i_920_;
                  i_883_ += i_884_;
               }
            } else if (i_871_ == 0) {
               int i_925_ = i_875_;
               if ((i_872_ & 16777215) == 16777215) {
                  int i_926_ = i_872_ >>> 24;
                  int i_927_ = 256 - i_926_;

                  for(int i_928_ = -i_870_; i_928_ < 0; ++i_928_) {
                     int i_929_ = (i_876_ >> 16) * this.anInt8893;

                     for(int i_930_ = -i_869_; i_930_ < 0; ++i_930_) {
                        if ((float)i_868_ < fs[i_883_]) {
                           int i_931_ = this.aByteArray10571[(i_875_ >> 16) + i_929_];
                           if (i_931_ != 0) {
                              int i_932_ = this.anIntArray10572[i_931_ & 0xFF];
                              int i_933_ = is[i_883_];
                              is[i_883_] = ((i_932_ & 16711935) * i_926_ + (i_933_ & 16711935) * i_927_ & -16711936)
                                    + ((i_932_ & 0xFF00) * i_926_ + (i_933_ & 0xFF00) * i_927_ & 0xFF0000)
                                 >> 8;
                              fs[i_883_] = (float)i_868_;
                           }
                        }

                        i_875_ += i_879_;
                        ++i_883_;
                     }

                     i_876_ += i_880_;
                     i_875_ = i_925_;
                     i_883_ += i_884_;
                  }
               } else {
                  int i_934_ = (i_872_ & 0xFF0000) >> 16;
                  int i_935_ = (i_872_ & 0xFF00) >> 8;
                  int i_936_ = i_872_ & 0xFF;
                  int i_937_ = i_872_ >>> 24;
                  int i_938_ = 256 - i_937_;

                  for(int i_939_ = -i_870_; i_939_ < 0; ++i_939_) {
                     int i_940_ = (i_876_ >> 16) * this.anInt8893;

                     for(int i_941_ = -i_869_; i_941_ < 0; ++i_941_) {
                        if ((float)i_868_ < fs[i_883_]) {
                           int i_942_ = this.aByteArray10571[(i_875_ >> 16) + i_940_];
                           if (i_942_ != 0) {
                              int i_943_ = this.anIntArray10572[i_942_ & 0xFF];
                              if (i_937_ != 255) {
                                 int i_944_ = (i_943_ & 0xFF0000) * i_934_ & 0xFF000000;
                                 int i_945_ = (i_943_ & 0xFF00) * i_935_ & 0xFF0000;
                                 int i_946_ = (i_943_ & 0xFF) * i_936_ & 0xFF00;
                                 i_943_ = (i_944_ | i_945_ | i_946_) >>> 8;
                                 int i_947_ = is[i_883_];
                                 is[i_883_] = ((i_943_ & 16711935) * i_937_ + (i_947_ & 16711935) * i_938_ & -16711936)
                                       + ((i_943_ & 0xFF00) * i_937_ + (i_947_ & 0xFF00) * i_938_ & 0xFF0000)
                                    >> 8;
                                 fs[i_883_] = (float)i_868_;
                              } else {
                                 int i_948_ = (i_943_ & 0xFF0000) * i_934_ & 0xFF000000;
                                 int i_949_ = (i_943_ & 0xFF00) * i_935_ & 0xFF0000;
                                 int i_950_ = (i_943_ & 0xFF) * i_936_ & 0xFF00;
                                 is[i_883_] = (i_948_ | i_949_ | i_950_) >>> 8;
                                 fs[i_883_] = (float)i_868_;
                              }
                           }
                        }

                        i_875_ += i_879_;
                        ++i_883_;
                     }

                     i_876_ += i_880_;
                     i_875_ = i_925_;
                     i_883_ += i_884_;
                  }
               }
            } else if (i_871_ == 3) {
               int i_951_ = i_875_;
               int i_952_ = i_872_ >>> 24;
               int i_953_ = 256 - i_952_;

               for(int i_954_ = -i_870_; i_954_ < 0; ++i_954_) {
                  int i_955_ = (i_876_ >> 16) * this.anInt8893;

                  for(int i_956_ = -i_869_; i_956_ < 0; ++i_956_) {
                     if ((float)i_868_ < fs[i_883_]) {
                        byte b = this.aByteArray10571[(i_875_ >> 16) + i_955_];
                        int i_957_ = b > 0 ? this.anIntArray10572[b] : 0;
                        int i_958_ = i_957_ + i_872_;
                        int i_959_ = (i_957_ & 16711935) + (i_872_ & 16711935);
                        int i_960_ = (i_959_ & 16777472) + (i_958_ - i_959_ & 65536);
                        i_960_ = i_958_ - i_960_ | i_960_ - (i_960_ >>> 8);
                        if (i_957_ == 0 && i_952_ != 255) {
                           int var165 = is[i_883_];
                           i_960_ = ((i_960_ & 16711935) * i_952_ + (var165 & 16711935) * i_953_ & -16711936)
                                 + ((i_960_ & 0xFF00) * i_952_ + (var165 & 0xFF00) * i_953_ & 0xFF0000)
                              >> 8;
                        }

                        is[i_883_] = i_960_;
                        fs[i_883_] = (float)i_868_;
                     }

                     i_875_ += i_879_;
                     ++i_883_;
                  }

                  i_876_ += i_880_;
                  i_875_ = i_951_;
                  i_883_ += i_884_;
               }
            } else if (i_871_ != 2) {
               throw new IllegalArgumentException();
            } else {
               int i_961_ = i_872_ >>> 24;
               int i_962_ = 256 - i_961_;
               int i_963_ = (i_872_ & 16711935) * i_962_ & -16711936;
               int i_964_ = (i_872_ & 0xFF00) * i_962_ & 0xFF0000;
               i_872_ = (i_963_ | i_964_) >>> 8;
               int i_965_ = i_875_;

               for(int i_966_ = -i_870_; i_966_ < 0; ++i_966_) {
                  int i_967_ = (i_876_ >> 16) * this.anInt8893;

                  for(int i_968_ = -i_869_; i_968_ < 0; ++i_968_) {
                     if ((float)i_868_ < fs[i_883_]) {
                        int i_969_ = this.aByteArray10571[(i_875_ >> 16) + i_967_];
                        if (i_969_ != 0) {
                           int i_970_ = this.anIntArray10572[i_969_ & 0xFF];
                           i_963_ = (i_970_ & 16711935) * i_961_ & -16711936;
                           i_964_ = (i_970_ & 0xFF00) * i_961_ & 0xFF0000;
                           is[i_883_] = ((i_963_ | i_964_) >>> 8) + i_872_;
                           fs[i_883_] = (float)i_868_;
                        }
                     }

                     i_875_ += i_879_;
                     ++i_883_;
                  }

                  i_876_ += i_880_;
                  i_875_ = i_965_;
                  i_883_ += i_884_;
               }
            }
         } else if (i_873_ != 2) {
            throw new IllegalArgumentException();
         } else if (i_871_ == 1) {
            int i_971_ = i_875_;

            for(int i_972_ = -i_870_; i_972_ < 0; ++i_972_) {
               int i_973_ = (i_876_ >> 16) * this.anInt8893;

               for(int i_974_ = -i_869_; i_974_ < 0; ++i_974_) {
                  if ((float)i_868_ < fs[i_883_]) {
                     int i_975_ = this.aByteArray10571[(i_875_ >> 16) + i_973_];
                     if (i_975_ != 0) {
                        int i_976_ = this.anIntArray10572[i_975_ & 0xFF];
                        int i_977_ = is[i_883_];
                        int i_978_ = i_976_ + i_977_;
                        int i_979_ = (i_976_ & 16711935) + (i_977_ & 16711935);
                        i_977_ = (i_979_ & 16777472) + (i_978_ - i_979_ & 65536);
                        is[i_883_] = i_978_ - i_977_ | i_977_ - (i_977_ >>> 8);
                        fs[i_883_] = (float)i_868_;
                     }
                  }

                  i_875_ += i_879_;
                  ++i_883_;
               }

               i_876_ += i_880_;
               i_875_ = i_971_;
               i_883_ += i_884_;
            }
         } else if (i_871_ == 0) {
            int i_980_ = i_875_;
            int i_981_ = (i_872_ & 0xFF0000) >> 16;
            int i_982_ = (i_872_ & 0xFF00) >> 8;
            int i_983_ = i_872_ & 0xFF;

            for(int i_984_ = -i_870_; i_984_ < 0; ++i_984_) {
               int i_985_ = (i_876_ >> 16) * this.anInt8893;

               for(int i_986_ = -i_869_; i_986_ < 0; ++i_986_) {
                  if ((float)i_868_ < fs[i_883_]) {
                     int i_987_ = this.aByteArray10571[(i_875_ >> 16) + i_985_];
                     if (i_987_ != 0) {
                        int i_988_ = this.anIntArray10572[i_987_ & 0xFF];
                        int i_989_ = (i_988_ & 0xFF0000) * i_981_ & 0xFF000000;
                        int i_990_ = (i_988_ & 0xFF00) * i_982_ & 0xFF0000;
                        int i_991_ = (i_988_ & 0xFF) * i_983_ & 0xFF00;
                        i_988_ = (i_989_ | i_990_ | i_991_) >>> 8;
                        int i_992_ = is[i_883_];
                        int i_993_ = i_988_ + i_992_;
                        int i_994_ = (i_988_ & 16711935) + (i_992_ & 16711935);
                        i_992_ = (i_994_ & 16777472) + (i_993_ - i_994_ & 65536);
                        is[i_883_] = i_993_ - i_992_ | i_992_ - (i_992_ >>> 8);
                        fs[i_883_] = (float)i_868_;
                     }
                  }

                  i_875_ += i_879_;
                  ++i_883_;
               }

               i_876_ += i_880_;
               i_875_ = i_980_;
               i_883_ += i_884_;
            }
         } else if (i_871_ == 3) {
            int i_995_ = i_875_;

            for(int i_996_ = -i_870_; i_996_ < 0; ++i_996_) {
               int i_997_ = (i_876_ >> 16) * this.anInt8893;

               for(int i_998_ = -i_869_; i_998_ < 0; ++i_998_) {
                  if ((float)i_868_ < fs[i_883_]) {
                     byte b = this.aByteArray10571[(i_875_ >> 16) + i_997_];
                     int i_999_ = b > 0 ? this.anIntArray10572[b] : 0;
                     int i_1000_ = i_999_ + i_872_;
                     int i_1001_ = (i_999_ & 16711935) + (i_872_ & 16711935);
                     int i_1002_ = (i_1001_ & 16777472) + (i_1000_ - i_1001_ & 65536);
                     i_999_ = i_1000_ - i_1002_ | i_1002_ - (i_1002_ >>> 8);
                     i_1002_ = is[i_883_];
                     i_1000_ = i_999_ + i_1002_;
                     i_1001_ = (i_999_ & 16711935) + (i_1002_ & 16711935);
                     i_1002_ = (i_1001_ & 16777472) + (i_1000_ - i_1001_ & 65536);
                     is[i_883_] = i_1000_ - i_1002_ | i_1002_ - (i_1002_ >>> 8);
                     fs[i_883_] = (float)i_868_;
                  }

                  i_875_ += i_879_;
                  ++i_883_;
               }

               i_876_ += i_880_;
               i_875_ = i_995_;
               i_883_ += i_884_;
            }
         } else if (i_871_ != 2) {
            throw new IllegalArgumentException();
         } else {
            int i_1003_ = i_872_ >>> 24;
            int i_1004_ = 256 - i_1003_;
            int i_1005_ = (i_872_ & 16711935) * i_1004_ & -16711936;
            int i_1006_ = (i_872_ & 0xFF00) * i_1004_ & 0xFF0000;
            i_872_ = (i_1005_ | i_1006_) >>> 8;
            int i_1007_ = i_875_;

            for(int i_1008_ = -i_870_; i_1008_ < 0; ++i_1008_) {
               int i_1009_ = (i_876_ >> 16) * this.anInt8893;

               for(int i_1010_ = -i_869_; i_1010_ < 0; ++i_1010_) {
                  if ((float)i_868_ < fs[i_883_]) {
                     int i_1011_ = this.aByteArray10571[(i_875_ >> 16) + i_1009_];
                     if (i_1011_ != 0) {
                        int i_1012_ = this.anIntArray10572[i_1011_ & 0xFF];
                        i_1005_ = (i_1012_ & 16711935) * i_1003_ & -16711936;
                        i_1006_ = (i_1012_ & 0xFF00) * i_1003_ & 0xFF0000;
                        i_1012_ = ((i_1005_ | i_1006_) >>> 8) + i_872_;
                        int i_1013_ = is[i_883_];
                        int i_1014_ = i_1012_ + i_1013_;
                        int i_1015_ = (i_1012_ & 16711935) + (i_1013_ & 16711935);
                        i_1013_ = (i_1015_ & 16777472) + (i_1014_ - i_1015_ & 65536);
                        is[i_883_] = i_1014_ - i_1013_ | i_1013_ - (i_1013_ >>> 8);
                        fs[i_883_] = (float)i_868_;
                     }
                  }

                  i_875_ += i_879_;
                  ++i_883_;
               }

               i_876_ += i_880_;
               i_875_ = i_1007_;
               i_883_ += i_884_;
            }
         }
      }
   }

   GLSprite_Sub2_Sub3(PureJavaToolkit purejavatoolkit, byte[] bs, int[] is, int i, int i_1016_) {
      super(purejavatoolkit, i, i_1016_);
      this.aByteArray10571 = bs;
      this.anIntArray10572 = is;
   }

   @Override
   final void method1207(int i, int i_1017_, int i_1018_, int i_1019_, int i_1020_, int i_1021_, int i_1022_, int i_1023_, int i_1024_) {
      if (i_1019_ > 0 && i_1020_ > 0) {
         int i_1025_ = 0;
         int i_1026_ = 0;
         int i_1027_ = this.anInt8889 + this.anInt8893 + this.anInt8885;
         int i_1028_ = this.anInt8899 + this.anInt8897 + this.anInt8884;
         int i_1029_ = (i_1027_ << 16) / i_1019_;
         int i_1030_ = (i_1028_ << 16) / i_1020_;
         if (this.anInt8889 > 0) {
            int i_1031_ = ((this.anInt8889 << 16) + i_1029_ - 1) / i_1029_;
            i += i_1031_;
            i_1025_ += i_1031_ * i_1029_ - (this.anInt8889 << 16);
         }

         if (this.anInt8899 > 0) {
            int i_1032_ = ((this.anInt8899 << 16) + i_1030_ - 1) / i_1030_;
            i_1017_ += i_1032_;
            i_1026_ += i_1032_ * i_1030_ - (this.anInt8899 << 16);
         }

         if (this.anInt8893 < i_1027_) {
            i_1019_ = ((this.anInt8893 << 16) - i_1025_ + i_1029_ - 1) / i_1029_;
         }

         if (this.anInt8897 < i_1028_) {
            i_1020_ = ((this.anInt8897 << 16) - i_1026_ + i_1030_ - 1) / i_1030_;
         }

         int i_1033_ = i + i_1017_ * this.aPureJavaToolkit8886.anInt6789;
         int i_1034_ = this.aPureJavaToolkit8886.anInt6789 - i_1019_;
         if (i_1017_ + i_1020_ > this.aPureJavaToolkit8886.anInt6772) {
            i_1020_ -= i_1017_ + i_1020_ - this.aPureJavaToolkit8886.anInt6772;
         }

         if (i_1017_ < this.aPureJavaToolkit8886.anInt6760) {
            int i_1035_ = this.aPureJavaToolkit8886.anInt6760 - i_1017_;
            i_1020_ -= i_1035_;
            i_1033_ += i_1035_ * this.aPureJavaToolkit8886.anInt6789;
            i_1026_ += i_1030_ * i_1035_;
         }

         if (i + i_1019_ > this.aPureJavaToolkit8886.anInt6778) {
            int i_1036_ = i + i_1019_ - this.aPureJavaToolkit8886.anInt6778;
            i_1019_ -= i_1036_;
            i_1034_ += i_1036_;
         }

         if (i < this.aPureJavaToolkit8886.anInt6767) {
            int i_1037_ = this.aPureJavaToolkit8886.anInt6767 - i;
            i_1019_ -= i_1037_;
            i_1033_ += i_1037_;
            i_1025_ += i_1029_ * i_1037_;
            i_1034_ += i_1037_;
         }

         float[] fs = this.aPureJavaToolkit8886.aFloatArray6782;
         int[] is = this.aPureJavaToolkit8886.anIntArray6787;
         if (i_1023_ == 0) {
            if (i_1021_ == 1) {
               int i_1038_ = i_1025_;

               for(int i_1039_ = -i_1020_; i_1039_ < 0; ++i_1039_) {
                  int i_1040_ = (i_1026_ >> 16) * this.anInt8893;

                  for(int i_1041_ = -i_1019_; i_1041_ < 0; ++i_1041_) {
                     if ((float)i_1018_ < fs[i_1033_]) {
                        is[i_1033_] = this.anIntArray10572[this.aByteArray10571[(i_1025_ >> 16) + i_1040_] & 255];
                        fs[i_1033_] = (float)i_1018_;
                     }

                     i_1025_ += i_1029_;
                     ++i_1033_;
                  }

                  i_1026_ += i_1030_;
                  i_1025_ = i_1038_;
                  i_1033_ += i_1034_;
               }
            } else if (i_1021_ == 0) {
               int i_1042_ = (i_1022_ & 0xFF0000) >> 16;
               int i_1043_ = (i_1022_ & 0xFF00) >> 8;
               int i_1044_ = i_1022_ & 0xFF;
               int i_1045_ = i_1025_;

               for(int i_1046_ = -i_1020_; i_1046_ < 0; ++i_1046_) {
                  int i_1047_ = (i_1026_ >> 16) * this.anInt8893;

                  for(int i_1048_ = -i_1019_; i_1048_ < 0; ++i_1048_) {
                     if ((float)i_1018_ < fs[i_1033_]) {
                        int i_1049_ = this.anIntArray10572[this.aByteArray10571[(i_1025_ >> 16) + i_1047_] & 255];
                        int i_1050_ = (i_1049_ & 0xFF0000) * i_1042_ & 0xFF000000;
                        int i_1051_ = (i_1049_ & 0xFF00) * i_1043_ & 0xFF0000;
                        int i_1052_ = (i_1049_ & 0xFF) * i_1044_ & 0xFF00;
                        is[i_1033_] = (i_1050_ | i_1051_ | i_1052_) >>> 8;
                        fs[i_1033_] = (float)i_1018_;
                     }

                     i_1025_ += i_1029_;
                     ++i_1033_;
                  }

                  i_1026_ += i_1030_;
                  i_1025_ = i_1045_;
                  i_1033_ += i_1034_;
               }
            } else if (i_1021_ == 3) {
               int i_1053_ = i_1025_;

               for(int i_1054_ = -i_1020_; i_1054_ < 0; ++i_1054_) {
                  int i_1055_ = (i_1026_ >> 16) * this.anInt8893;

                  for(int i_1056_ = -i_1019_; i_1056_ < 0; ++i_1056_) {
                     if ((float)i_1018_ < fs[i_1033_]) {
                        byte b = this.aByteArray10571[(i_1025_ >> 16) + i_1055_];
                        int i_1057_ = b > 0 ? this.anIntArray10572[b] : 0;
                        int i_1058_ = i_1057_ + i_1022_;
                        int i_1059_ = (i_1057_ & 16711935) + (i_1022_ & 16711935);
                        int i_1060_ = (i_1059_ & 16777472) + (i_1058_ - i_1059_ & 65536);
                        is[i_1033_] = i_1058_ - i_1060_ | i_1060_ - (i_1060_ >>> 8);
                        fs[i_1033_] = (float)i_1018_;
                     }

                     i_1025_ += i_1029_;
                     ++i_1033_;
                  }

                  i_1026_ += i_1030_;
                  i_1025_ = i_1053_;
                  i_1033_ += i_1034_;
               }
            } else if (i_1021_ != 2) {
               throw new IllegalArgumentException();
            } else {
               int i_1061_ = i_1022_ >>> 24;
               int i_1062_ = 256 - i_1061_;
               int i_1063_ = (i_1022_ & 16711935) * i_1062_ & -16711936;
               int i_1064_ = (i_1022_ & 0xFF00) * i_1062_ & 0xFF0000;
               i_1022_ = (i_1063_ | i_1064_) >>> 8;
               int i_1065_ = i_1025_;

               for(int i_1066_ = -i_1020_; i_1066_ < 0; ++i_1066_) {
                  int i_1067_ = (i_1026_ >> 16) * this.anInt8893;

                  for(int i_1068_ = -i_1019_; i_1068_ < 0; ++i_1068_) {
                     if ((float)i_1018_ < fs[i_1033_]) {
                        int i_1069_ = this.anIntArray10572[this.aByteArray10571[(i_1025_ >> 16) + i_1067_] & 255];
                        i_1063_ = (i_1069_ & 16711935) * i_1061_ & -16711936;
                        i_1064_ = (i_1069_ & 0xFF00) * i_1061_ & 0xFF0000;
                        is[i_1033_] = ((i_1063_ | i_1064_) >>> 8) + i_1022_;
                        fs[i_1033_] = (float)i_1018_;
                     }

                     i_1025_ += i_1029_;
                     ++i_1033_;
                  }

                  i_1026_ += i_1030_;
                  i_1025_ = i_1065_;
                  i_1033_ += i_1034_;
               }
            }
         } else if (i_1023_ == 1) {
            if (i_1021_ == 1) {
               int i_1070_ = i_1025_;

               for(int i_1071_ = -i_1020_; i_1071_ < 0; ++i_1071_) {
                  int i_1072_ = (i_1026_ >> 16) * this.anInt8893;

                  for(int i_1073_ = -i_1019_; i_1073_ < 0; ++i_1073_) {
                     if ((float)i_1018_ < fs[i_1033_]) {
                        int i_1074_ = this.aByteArray10571[(i_1025_ >> 16) + i_1072_];
                        if (i_1074_ != 0) {
                           is[i_1033_] = this.anIntArray10572[i_1074_ & 0xFF];
                           fs[i_1033_] = (float)i_1018_;
                        }
                     }

                     i_1025_ += i_1029_;
                     ++i_1033_;
                  }

                  i_1026_ += i_1030_;
                  i_1025_ = i_1070_;
                  i_1033_ += i_1034_;
               }
            } else if (i_1021_ == 0) {
               int i_1075_ = i_1025_;
               if ((i_1022_ & 16777215) == 16777215) {
                  int i_1076_ = i_1022_ >>> 24;
                  int i_1077_ = 256 - i_1076_;

                  for(int i_1078_ = -i_1020_; i_1078_ < 0; ++i_1078_) {
                     int i_1079_ = (i_1026_ >> 16) * this.anInt8893;

                     for(int i_1080_ = -i_1019_; i_1080_ < 0; ++i_1080_) {
                        if ((float)i_1018_ < fs[i_1033_]) {
                           int i_1081_ = this.aByteArray10571[(i_1025_ >> 16) + i_1079_];
                           if (i_1081_ != 0) {
                              int i_1082_ = this.anIntArray10572[i_1081_ & 0xFF];
                              int i_1083_ = is[i_1033_];
                              is[i_1033_] = ((i_1082_ & 16711935) * i_1076_ + (i_1083_ & 16711935) * i_1077_ & -16711936)
                                    + ((i_1082_ & 0xFF00) * i_1076_ + (i_1083_ & 0xFF00) * i_1077_ & 0xFF0000)
                                 >> 8;
                              fs[i_1033_] = (float)i_1018_;
                           }
                        }

                        i_1025_ += i_1029_;
                        ++i_1033_;
                     }

                     i_1026_ += i_1030_;
                     i_1025_ = i_1075_;
                     i_1033_ += i_1034_;
                  }
               } else {
                  int i_1084_ = (i_1022_ & 0xFF0000) >> 16;
                  int i_1085_ = (i_1022_ & 0xFF00) >> 8;
                  int i_1086_ = i_1022_ & 0xFF;
                  int i_1087_ = i_1022_ >>> 24;
                  int i_1088_ = 256 - i_1087_;

                  for(int i_1089_ = -i_1020_; i_1089_ < 0; ++i_1089_) {
                     int i_1090_ = (i_1026_ >> 16) * this.anInt8893;

                     for(int i_1091_ = -i_1019_; i_1091_ < 0; ++i_1091_) {
                        if ((float)i_1018_ < fs[i_1033_]) {
                           int i_1092_ = this.aByteArray10571[(i_1025_ >> 16) + i_1090_];
                           if (i_1092_ != 0) {
                              int i_1093_ = this.anIntArray10572[i_1092_ & 0xFF];
                              if (i_1087_ != 255) {
                                 int i_1094_ = (i_1093_ & 0xFF0000) * i_1084_ & 0xFF000000;
                                 int i_1095_ = (i_1093_ & 0xFF00) * i_1085_ & 0xFF0000;
                                 int i_1096_ = (i_1093_ & 0xFF) * i_1086_ & 0xFF00;
                                 i_1093_ = (i_1094_ | i_1095_ | i_1096_) >>> 8;
                                 int i_1097_ = is[i_1033_];
                                 is[i_1033_] = ((i_1093_ & 16711935) * i_1087_ + (i_1097_ & 16711935) * i_1088_ & -16711936)
                                       + ((i_1093_ & 0xFF00) * i_1087_ + (i_1097_ & 0xFF00) * i_1088_ & 0xFF0000)
                                    >> 8;
                                 fs[i_1033_] = (float)i_1018_;
                              } else {
                                 int i_1098_ = (i_1093_ & 0xFF0000) * i_1084_ & 0xFF000000;
                                 int i_1099_ = (i_1093_ & 0xFF00) * i_1085_ & 0xFF0000;
                                 int i_1100_ = (i_1093_ & 0xFF) * i_1086_ & 0xFF00;
                                 is[i_1033_] = (i_1098_ | i_1099_ | i_1100_) >>> 8;
                                 fs[i_1033_] = (float)i_1018_;
                              }
                           }
                        }

                        i_1025_ += i_1029_;
                        ++i_1033_;
                     }

                     i_1026_ += i_1030_;
                     i_1025_ = i_1075_;
                     i_1033_ += i_1034_;
                  }
               }
            } else if (i_1021_ == 3) {
               int i_1101_ = i_1025_;
               int i_1102_ = i_1022_ >>> 24;
               int i_1103_ = 256 - i_1102_;

               for(int i_1104_ = -i_1020_; i_1104_ < 0; ++i_1104_) {
                  int i_1105_ = (i_1026_ >> 16) * this.anInt8893;

                  for(int i_1106_ = -i_1019_; i_1106_ < 0; ++i_1106_) {
                     if ((float)i_1018_ < fs[i_1033_]) {
                        byte b = this.aByteArray10571[(i_1025_ >> 16) + i_1105_];
                        int i_1107_ = b > 0 ? this.anIntArray10572[b] : 0;
                        int i_1108_ = i_1107_ + i_1022_;
                        int i_1109_ = (i_1107_ & 16711935) + (i_1022_ & 16711935);
                        int i_1110_ = (i_1109_ & 16777472) + (i_1108_ - i_1109_ & 65536);
                        i_1110_ = i_1108_ - i_1110_ | i_1110_ - (i_1110_ >>> 8);
                        if (i_1107_ == 0 && i_1102_ != 255) {
                           int var165 = is[i_1033_];
                           i_1110_ = ((i_1110_ & 16711935) * i_1102_ + (var165 & 16711935) * i_1103_ & -16711936)
                                 + ((i_1110_ & 0xFF00) * i_1102_ + (var165 & 0xFF00) * i_1103_ & 0xFF0000)
                              >> 8;
                        }

                        is[i_1033_] = i_1110_;
                        fs[i_1033_] = (float)i_1018_;
                     }

                     i_1025_ += i_1029_;
                     ++i_1033_;
                  }

                  i_1026_ += i_1030_;
                  i_1025_ = i_1101_;
                  i_1033_ += i_1034_;
               }
            } else if (i_1021_ != 2) {
               throw new IllegalArgumentException();
            } else {
               int i_1111_ = i_1022_ >>> 24;
               int i_1112_ = 256 - i_1111_;
               int i_1113_ = (i_1022_ & 16711935) * i_1112_ & -16711936;
               int i_1114_ = (i_1022_ & 0xFF00) * i_1112_ & 0xFF0000;
               i_1022_ = (i_1113_ | i_1114_) >>> 8;
               int i_1115_ = i_1025_;

               for(int i_1116_ = -i_1020_; i_1116_ < 0; ++i_1116_) {
                  int i_1117_ = (i_1026_ >> 16) * this.anInt8893;

                  for(int i_1118_ = -i_1019_; i_1118_ < 0; ++i_1118_) {
                     if ((float)i_1018_ < fs[i_1033_]) {
                        int i_1119_ = this.aByteArray10571[(i_1025_ >> 16) + i_1117_];
                        if (i_1119_ != 0) {
                           int i_1120_ = this.anIntArray10572[i_1119_ & 0xFF];
                           i_1113_ = (i_1120_ & 16711935) * i_1111_ & -16711936;
                           i_1114_ = (i_1120_ & 0xFF00) * i_1111_ & 0xFF0000;
                           is[i_1033_] = ((i_1113_ | i_1114_) >>> 8) + i_1022_;
                           fs[i_1033_] = (float)i_1018_;
                        }
                     }

                     i_1025_ += i_1029_;
                     ++i_1033_;
                  }

                  i_1026_ += i_1030_;
                  i_1025_ = i_1115_;
                  i_1033_ += i_1034_;
               }
            }
         } else if (i_1023_ != 2) {
            throw new IllegalArgumentException();
         } else if (i_1021_ == 1) {
            int i_1121_ = i_1025_;

            for(int i_1122_ = -i_1020_; i_1122_ < 0; ++i_1122_) {
               int i_1123_ = (i_1026_ >> 16) * this.anInt8893;

               for(int i_1124_ = -i_1019_; i_1124_ < 0; ++i_1124_) {
                  if ((float)i_1018_ < fs[i_1033_]) {
                     int i_1125_ = this.aByteArray10571[(i_1025_ >> 16) + i_1123_];
                     if (i_1125_ != 0) {
                        int i_1126_ = this.anIntArray10572[i_1125_ & 0xFF];
                        int i_1127_ = is[i_1033_];
                        int i_1128_ = i_1126_ + i_1127_;
                        int i_1129_ = (i_1126_ & 16711935) + (i_1127_ & 16711935);
                        i_1127_ = (i_1129_ & 16777472) + (i_1128_ - i_1129_ & 65536);
                        is[i_1033_] = i_1128_ - i_1127_ | i_1127_ - (i_1127_ >>> 8);
                        fs[i_1033_] = (float)i_1018_;
                     }
                  }

                  i_1025_ += i_1029_;
                  ++i_1033_;
               }

               i_1026_ += i_1030_;
               i_1025_ = i_1121_;
               i_1033_ += i_1034_;
            }
         } else if (i_1021_ == 0) {
            int i_1130_ = i_1025_;
            int i_1131_ = (i_1022_ & 0xFF0000) >> 16;
            int i_1132_ = (i_1022_ & 0xFF00) >> 8;
            int i_1133_ = i_1022_ & 0xFF;

            for(int i_1134_ = -i_1020_; i_1134_ < 0; ++i_1134_) {
               int i_1135_ = (i_1026_ >> 16) * this.anInt8893;

               for(int i_1136_ = -i_1019_; i_1136_ < 0; ++i_1136_) {
                  if ((float)i_1018_ < fs[i_1033_]) {
                     int i_1137_ = this.aByteArray10571[(i_1025_ >> 16) + i_1135_];
                     if (i_1137_ != 0) {
                        int i_1138_ = this.anIntArray10572[i_1137_ & 0xFF];
                        int i_1139_ = (i_1138_ & 0xFF0000) * i_1131_ & 0xFF000000;
                        int i_1140_ = (i_1138_ & 0xFF00) * i_1132_ & 0xFF0000;
                        int i_1141_ = (i_1138_ & 0xFF) * i_1133_ & 0xFF00;
                        i_1138_ = (i_1139_ | i_1140_ | i_1141_) >>> 8;
                        int i_1142_ = is[i_1033_];
                        int i_1143_ = i_1138_ + i_1142_;
                        int i_1144_ = (i_1138_ & 16711935) + (i_1142_ & 16711935);
                        i_1142_ = (i_1144_ & 16777472) + (i_1143_ - i_1144_ & 65536);
                        is[i_1033_] = i_1143_ - i_1142_ | i_1142_ - (i_1142_ >>> 8);
                        fs[i_1033_] = (float)i_1018_;
                     }
                  }

                  i_1025_ += i_1029_;
                  ++i_1033_;
               }

               i_1026_ += i_1030_;
               i_1025_ = i_1130_;
               i_1033_ += i_1034_;
            }
         } else if (i_1021_ == 3) {
            int i_1145_ = i_1025_;

            for(int i_1146_ = -i_1020_; i_1146_ < 0; ++i_1146_) {
               int i_1147_ = (i_1026_ >> 16) * this.anInt8893;

               for(int i_1148_ = -i_1019_; i_1148_ < 0; ++i_1148_) {
                  if ((float)i_1018_ < fs[i_1033_]) {
                     byte b = this.aByteArray10571[(i_1025_ >> 16) + i_1147_];
                     int i_1149_ = b > 0 ? this.anIntArray10572[b] : 0;
                     int i_1150_ = i_1149_ + i_1022_;
                     int i_1151_ = (i_1149_ & 16711935) + (i_1022_ & 16711935);
                     int i_1152_ = (i_1151_ & 16777472) + (i_1150_ - i_1151_ & 65536);
                     i_1149_ = i_1150_ - i_1152_ | i_1152_ - (i_1152_ >>> 8);
                     i_1152_ = is[i_1033_];
                     i_1150_ = i_1149_ + i_1152_;
                     i_1151_ = (i_1149_ & 16711935) + (i_1152_ & 16711935);
                     i_1152_ = (i_1151_ & 16777472) + (i_1150_ - i_1151_ & 65536);
                     is[i_1033_] = i_1150_ - i_1152_ | i_1152_ - (i_1152_ >>> 8);
                     fs[i_1033_] = (float)i_1018_;
                  }

                  i_1025_ += i_1029_;
                  ++i_1033_;
               }

               i_1026_ += i_1030_;
               i_1025_ = i_1145_;
               i_1033_ += i_1034_;
            }
         } else if (i_1021_ != 2) {
            throw new IllegalArgumentException();
         } else {
            int i_1153_ = i_1022_ >>> 24;
            int i_1154_ = 256 - i_1153_;
            int i_1155_ = (i_1022_ & 16711935) * i_1154_ & -16711936;
            int i_1156_ = (i_1022_ & 0xFF00) * i_1154_ & 0xFF0000;
            i_1022_ = (i_1155_ | i_1156_) >>> 8;
            int i_1157_ = i_1025_;

            for(int i_1158_ = -i_1020_; i_1158_ < 0; ++i_1158_) {
               int i_1159_ = (i_1026_ >> 16) * this.anInt8893;

               for(int i_1160_ = -i_1019_; i_1160_ < 0; ++i_1160_) {
                  if ((float)i_1018_ < fs[i_1033_]) {
                     int i_1161_ = this.aByteArray10571[(i_1025_ >> 16) + i_1159_];
                     if (i_1161_ != 0) {
                        int i_1162_ = this.anIntArray10572[i_1161_ & 0xFF];
                        i_1155_ = (i_1162_ & 16711935) * i_1153_ & -16711936;
                        i_1156_ = (i_1162_ & 0xFF00) * i_1153_ & 0xFF0000;
                        i_1162_ = ((i_1155_ | i_1156_) >>> 8) + i_1022_;
                        int i_1163_ = is[i_1033_];
                        int i_1164_ = i_1162_ + i_1163_;
                        int i_1165_ = (i_1162_ & 16711935) + (i_1163_ & 16711935);
                        i_1163_ = (i_1165_ & 16777472) + (i_1164_ - i_1165_ & 65536);
                        is[i_1033_] = i_1164_ - i_1163_ | i_1163_ - (i_1163_ >>> 8);
                        fs[i_1033_] = (float)i_1018_;
                     }
                  }

                  i_1025_ += i_1029_;
                  ++i_1033_;
               }

               i_1026_ += i_1030_;
               i_1025_ = i_1157_;
               i_1033_ += i_1034_;
            }
         }
      }
   }

   @Override
   final void method1189(int i, int i_1166_, aa var_aa, int i_1167_, int i_1168_) {
      if (this.aPureJavaToolkit8886.method1492()) {
         throw new IllegalStateException();
      } else {
         i += this.anInt8889;
         i_1166_ += this.anInt8899;
         int i_1169_ = 0;
         int i_1170_ = this.aPureJavaToolkit8886.anInt6789;
         int i_1171_ = this.anInt8893;
         int i_1172_ = this.anInt8897;
         int i_1173_ = i_1170_ - i_1171_;
         int i_1174_ = 0;
         int i_1175_ = i + i_1166_ * i_1170_;
         if (i_1166_ < this.aPureJavaToolkit8886.anInt6760) {
            int i_1176_ = this.aPureJavaToolkit8886.anInt6760 - i_1166_;
            i_1172_ -= i_1176_;
            i_1166_ = this.aPureJavaToolkit8886.anInt6760;
            i_1169_ += i_1176_ * i_1171_;
            i_1175_ += i_1176_ * i_1170_;
         }

         if (i_1166_ + i_1172_ > this.aPureJavaToolkit8886.anInt6772) {
            i_1172_ -= i_1166_ + i_1172_ - this.aPureJavaToolkit8886.anInt6772;
         }

         if (i < this.aPureJavaToolkit8886.anInt6767) {
            int i_1177_ = this.aPureJavaToolkit8886.anInt6767 - i;
            i_1171_ -= i_1177_;
            i = this.aPureJavaToolkit8886.anInt6767;
            i_1169_ += i_1177_;
            i_1175_ += i_1177_;
            i_1174_ += i_1177_;
            i_1173_ += i_1177_;
         }

         if (i + i_1171_ > this.aPureJavaToolkit8886.anInt6778) {
            int i_1178_ = i + i_1171_ - this.aPureJavaToolkit8886.anInt6778;
            i_1171_ -= i_1178_;
            i_1174_ += i_1178_;
            i_1173_ += i_1178_;
         }

         if (i_1171_ > 0 && i_1172_ > 0) {
            aa_Sub1 var_aa_Sub1 = (aa_Sub1)var_aa;
            int[] is = var_aa_Sub1.anIntArray5487;
            int[] is_1179_ = var_aa_Sub1.anIntArray5488;
            int[] is_1180_ = this.aPureJavaToolkit8886.anIntArray6787;
            int i_1181_ = i_1166_;
            if (i_1168_ > i_1166_) {
               i_1181_ = i_1168_;
               i_1175_ += (i_1168_ - i_1166_) * i_1170_;
               i_1169_ += (i_1168_ - i_1166_) * this.anInt8893;
            }

            int i_1182_ = i_1168_ + is.length < i_1166_ + i_1172_ ? i_1168_ + is.length : i_1166_ + i_1172_;

            for(int i_1183_ = i_1181_; i_1183_ < i_1182_; ++i_1183_) {
               int i_1184_ = is[i_1183_ - i_1168_] + i_1167_;
               int i_1185_ = is_1179_[i_1183_ - i_1168_];
               int i_1186_ = i_1171_;
               if (i > i_1184_) {
                  int i_1187_ = i - i_1184_;
                  if (i_1187_ >= i_1185_) {
                     i_1169_ += i_1171_ + i_1174_;
                     i_1175_ += i_1171_ + i_1173_;
                     continue;
                  }

                  i_1185_ -= i_1187_;
               } else {
                  int i_1188_ = i_1184_ - i;
                  if (i_1188_ >= i_1171_) {
                     i_1169_ += i_1171_ + i_1174_;
                     i_1175_ += i_1171_ + i_1173_;
                     continue;
                  }

                  i_1169_ += i_1188_;
                  i_1186_ = i_1171_ - i_1188_;
                  i_1175_ += i_1188_;
               }

               int i_1189_ = 0;
               if (i_1186_ < i_1185_) {
                  i_1185_ = i_1186_;
               } else {
                  i_1189_ = i_1186_ - i_1185_;
               }

               for(int i_1190_ = -i_1185_; i_1190_ < 0; ++i_1190_) {
                  int i_1191_ = this.aByteArray10571[i_1169_++];
                  if (i_1191_ != 0) {
                     is_1180_[i_1175_++] = this.anIntArray10572[i_1191_ & 0xFF];
                  } else {
                     ++i_1175_;
                  }
               }

               i_1169_ += i_1189_ + i_1174_;
               i_1175_ += i_1189_ + i_1173_;
            }
         }
      }
   }

   @Override
   final void method1184(int i, int i_1192_, int i_1193_, int i_1194_, int i_1195_, int i_1196_, int i_1197_, int i_1198_) {
      if (this.aPureJavaToolkit8886.method1492()) {
         throw new IllegalStateException();
      } else if (i_1193_ > 0 && i_1194_ > 0) {
         int i_1199_ = 0;
         int i_1200_ = 0;
         int i_1201_ = this.aPureJavaToolkit8886.anInt6789;
         int i_1202_ = this.anInt8889 + this.anInt8893 + this.anInt8885;
         int i_1203_ = this.anInt8899 + this.anInt8897 + this.anInt8884;
         int i_1204_ = (i_1202_ << 16) / i_1193_;
         int i_1205_ = (i_1203_ << 16) / i_1194_;
         if (this.anInt8889 > 0) {
            int i_1206_ = ((this.anInt8889 << 16) + i_1204_ - 1) / i_1204_;
            i += i_1206_;
            i_1199_ += i_1206_ * i_1204_ - (this.anInt8889 << 16);
         }

         if (this.anInt8899 > 0) {
            int i_1207_ = ((this.anInt8899 << 16) + i_1205_ - 1) / i_1205_;
            i_1192_ += i_1207_;
            i_1200_ += i_1207_ * i_1205_ - (this.anInt8899 << 16);
         }

         if (this.anInt8893 < i_1202_) {
            i_1193_ = ((this.anInt8893 << 16) - i_1199_ + i_1204_ - 1) / i_1204_;
         }

         if (this.anInt8897 < i_1203_) {
            i_1194_ = ((this.anInt8897 << 16) - i_1200_ + i_1205_ - 1) / i_1205_;
         }

         int i_1208_ = i + i_1192_ * i_1201_;
         int i_1209_ = i_1201_ - i_1193_;
         if (i_1192_ + i_1194_ > this.aPureJavaToolkit8886.anInt6772) {
            i_1194_ -= i_1192_ + i_1194_ - this.aPureJavaToolkit8886.anInt6772;
         }

         if (i_1192_ < this.aPureJavaToolkit8886.anInt6760) {
            int i_1210_ = this.aPureJavaToolkit8886.anInt6760 - i_1192_;
            i_1194_ -= i_1210_;
            i_1208_ += i_1210_ * i_1201_;
            i_1200_ += i_1205_ * i_1210_;
         }

         if (i + i_1193_ > this.aPureJavaToolkit8886.anInt6778) {
            int i_1211_ = i + i_1193_ - this.aPureJavaToolkit8886.anInt6778;
            i_1193_ -= i_1211_;
            i_1209_ += i_1211_;
         }

         if (i < this.aPureJavaToolkit8886.anInt6767) {
            int i_1212_ = this.aPureJavaToolkit8886.anInt6767 - i;
            i_1193_ -= i_1212_;
            i_1208_ += i_1212_;
            i_1199_ += i_1204_ * i_1212_;
            i_1209_ += i_1212_;
         }

         int[] is = this.aPureJavaToolkit8886.anIntArray6787;
         if (i_1197_ == 0) {
            if (i_1195_ == 1) {
               int i_1213_ = i_1199_;

               for(int i_1214_ = -i_1194_; i_1214_ < 0; ++i_1214_) {
                  int i_1215_ = (i_1200_ >> 16) * this.anInt8893;

                  for(int i_1216_ = -i_1193_; i_1216_ < 0; ++i_1216_) {
                     is[i_1208_++] = this.anIntArray10572[this.aByteArray10571[(i_1199_ >> 16) + i_1215_] & 255];
                     i_1199_ += i_1204_;
                  }

                  i_1200_ += i_1205_;
                  i_1199_ = i_1213_;
                  i_1208_ += i_1209_;
               }
            } else if (i_1195_ == 0) {
               int i_1217_ = (i_1196_ & 0xFF0000) >> 16;
               int i_1218_ = (i_1196_ & 0xFF00) >> 8;
               int i_1219_ = i_1196_ & 0xFF;
               int i_1220_ = i_1199_;

               for(int i_1221_ = -i_1194_; i_1221_ < 0; ++i_1221_) {
                  int i_1222_ = (i_1200_ >> 16) * this.anInt8893;

                  for(int i_1223_ = -i_1193_; i_1223_ < 0; ++i_1223_) {
                     int i_1224_ = this.anIntArray10572[this.aByteArray10571[(i_1199_ >> 16) + i_1222_] & 255];
                     int i_1225_ = (i_1224_ & 0xFF0000) * i_1217_ & 0xFF000000;
                     int i_1226_ = (i_1224_ & 0xFF00) * i_1218_ & 0xFF0000;
                     int i_1227_ = (i_1224_ & 0xFF) * i_1219_ & 0xFF00;
                     is[i_1208_++] = (i_1225_ | i_1226_ | i_1227_) >>> 8;
                     i_1199_ += i_1204_;
                  }

                  i_1200_ += i_1205_;
                  i_1199_ = i_1220_;
                  i_1208_ += i_1209_;
               }
            } else if (i_1195_ == 3) {
               int i_1228_ = i_1199_;

               for(int i_1229_ = -i_1194_; i_1229_ < 0; ++i_1229_) {
                  int i_1230_ = (i_1200_ >> 16) * this.anInt8893;

                  for(int i_1231_ = -i_1193_; i_1231_ < 0; ++i_1231_) {
                     byte b = this.aByteArray10571[(i_1199_ >> 16) + i_1230_];
                     int i_1232_ = b > 0 ? this.anIntArray10572[b] : 0;
                     int i_1233_ = i_1232_ + i_1196_;
                     int i_1234_ = (i_1232_ & 16711935) + (i_1196_ & 16711935);
                     int i_1235_ = (i_1234_ & 16777472) + (i_1233_ - i_1234_ & 65536);
                     is[i_1208_++] = i_1233_ - i_1235_ | i_1235_ - (i_1235_ >>> 8);
                     i_1199_ += i_1204_;
                  }

                  i_1200_ += i_1205_;
                  i_1199_ = i_1228_;
                  i_1208_ += i_1209_;
               }
            } else if (i_1195_ != 2) {
               throw new IllegalArgumentException();
            } else {
               int i_1236_ = i_1196_ >>> 24;
               int i_1237_ = 256 - i_1236_;
               int i_1238_ = (i_1196_ & 16711935) * i_1237_ & -16711936;
               int i_1239_ = (i_1196_ & 0xFF00) * i_1237_ & 0xFF0000;
               i_1196_ = (i_1238_ | i_1239_) >>> 8;
               int i_1240_ = i_1199_;

               for(int i_1241_ = -i_1194_; i_1241_ < 0; ++i_1241_) {
                  int i_1242_ = (i_1200_ >> 16) * this.anInt8893;

                  for(int i_1243_ = -i_1193_; i_1243_ < 0; ++i_1243_) {
                     int i_1244_ = this.anIntArray10572[this.aByteArray10571[(i_1199_ >> 16) + i_1242_] & 255];
                     i_1238_ = (i_1244_ & 16711935) * i_1236_ & -16711936;
                     i_1239_ = (i_1244_ & 0xFF00) * i_1236_ & 0xFF0000;
                     is[i_1208_++] = ((i_1238_ | i_1239_) >>> 8) + i_1196_;
                     i_1199_ += i_1204_;
                  }

                  i_1200_ += i_1205_;
                  i_1199_ = i_1240_;
                  i_1208_ += i_1209_;
               }
            }
         } else if (i_1197_ == 1) {
            if (i_1195_ == 1) {
               int i_1245_ = i_1199_;

               for(int i_1246_ = -i_1194_; i_1246_ < 0; ++i_1246_) {
                  int i_1247_ = (i_1200_ >> 16) * this.anInt8893;

                  for(int i_1248_ = -i_1193_; i_1248_ < 0; ++i_1248_) {
                     int i_1249_ = this.aByteArray10571[(i_1199_ >> 16) + i_1247_];
                     if (i_1249_ != 0) {
                        is[i_1208_++] = this.anIntArray10572[i_1249_ & 0xFF];
                     } else {
                        ++i_1208_;
                     }

                     i_1199_ += i_1204_;
                  }

                  i_1200_ += i_1205_;
                  i_1199_ = i_1245_;
                  i_1208_ += i_1209_;
               }
            } else if (i_1195_ == 0) {
               int i_1250_ = i_1199_;
               if ((i_1196_ & 16777215) == 16777215) {
                  int i_1251_ = i_1196_ >>> 24;
                  int i_1252_ = 256 - i_1251_;

                  for(int i_1253_ = -i_1194_; i_1253_ < 0; ++i_1253_) {
                     int i_1254_ = (i_1200_ >> 16) * this.anInt8893;

                     for(int i_1255_ = -i_1193_; i_1255_ < 0; ++i_1255_) {
                        int i_1256_ = this.aByteArray10571[(i_1199_ >> 16) + i_1254_];
                        if (i_1256_ != 0) {
                           int i_1257_ = this.anIntArray10572[i_1256_ & 0xFF];
                           int i_1258_ = is[i_1208_];
                           is[i_1208_++] = ((i_1257_ & 16711935) * i_1251_ + (i_1258_ & 16711935) * i_1252_ & -16711936)
                                 + ((i_1257_ & 0xFF00) * i_1251_ + (i_1258_ & 0xFF00) * i_1252_ & 0xFF0000)
                              >> 8;
                        } else {
                           ++i_1208_;
                        }

                        i_1199_ += i_1204_;
                     }

                     i_1200_ += i_1205_;
                     i_1199_ = i_1250_;
                     i_1208_ += i_1209_;
                  }
               } else {
                  int i_1259_ = (i_1196_ & 0xFF0000) >> 16;
                  int i_1260_ = (i_1196_ & 0xFF00) >> 8;
                  int i_1261_ = i_1196_ & 0xFF;
                  int i_1262_ = i_1196_ >>> 24;
                  int i_1263_ = 256 - i_1262_;

                  for(int i_1264_ = -i_1194_; i_1264_ < 0; ++i_1264_) {
                     int i_1265_ = (i_1200_ >> 16) * this.anInt8893;

                     for(int i_1266_ = -i_1193_; i_1266_ < 0; ++i_1266_) {
                        int i_1267_ = this.aByteArray10571[(i_1199_ >> 16) + i_1265_];
                        if (i_1267_ != 0) {
                           int i_1268_ = this.anIntArray10572[i_1267_ & 0xFF];
                           if (i_1262_ != 255) {
                              int i_1269_ = (i_1268_ & 0xFF0000) * i_1259_ & 0xFF000000;
                              int i_1270_ = (i_1268_ & 0xFF00) * i_1260_ & 0xFF0000;
                              int i_1271_ = (i_1268_ & 0xFF) * i_1261_ & 0xFF00;
                              i_1268_ = (i_1269_ | i_1270_ | i_1271_) >>> 8;
                              int i_1272_ = is[i_1208_];
                              is[i_1208_++] = ((i_1268_ & 16711935) * i_1262_ + (i_1272_ & 16711935) * i_1263_ & -16711936)
                                    + ((i_1268_ & 0xFF00) * i_1262_ + (i_1272_ & 0xFF00) * i_1263_ & 0xFF0000)
                                 >> 8;
                           } else {
                              int i_1273_ = (i_1268_ & 0xFF0000) * i_1259_ & 0xFF000000;
                              int i_1274_ = (i_1268_ & 0xFF00) * i_1260_ & 0xFF0000;
                              int i_1275_ = (i_1268_ & 0xFF) * i_1261_ & 0xFF00;
                              is[i_1208_++] = (i_1273_ | i_1274_ | i_1275_) >>> 8;
                           }
                        } else {
                           ++i_1208_;
                        }

                        i_1199_ += i_1204_;
                     }

                     i_1200_ += i_1205_;
                     i_1199_ = i_1250_;
                     i_1208_ += i_1209_;
                  }
               }
            } else if (i_1195_ == 3) {
               int i_1276_ = i_1199_;
               int i_1277_ = i_1196_ >>> 24;
               int i_1278_ = 256 - i_1277_;

               for(int i_1279_ = -i_1194_; i_1279_ < 0; ++i_1279_) {
                  int i_1280_ = (i_1200_ >> 16) * this.anInt8893;

                  for(int i_1281_ = -i_1193_; i_1281_ < 0; ++i_1281_) {
                     byte b = this.aByteArray10571[(i_1199_ >> 16) + i_1280_];
                     int i_1282_ = b > 0 ? this.anIntArray10572[b] : 0;
                     int i_1283_ = i_1282_ + i_1196_;
                     int i_1284_ = (i_1282_ & 16711935) + (i_1196_ & 16711935);
                     int i_1285_ = (i_1284_ & 16777472) + (i_1283_ - i_1284_ & 65536);
                     i_1285_ = i_1283_ - i_1285_ | i_1285_ - (i_1285_ >>> 8);
                     if (i_1282_ == 0 && i_1277_ != 255) {
                        int var164 = is[i_1208_];
                        i_1285_ = ((i_1285_ & 16711935) * i_1277_ + (var164 & 16711935) * i_1278_ & -16711936)
                              + ((i_1285_ & 0xFF00) * i_1277_ + (var164 & 0xFF00) * i_1278_ & 0xFF0000)
                           >> 8;
                     }

                     is[i_1208_++] = i_1285_;
                     i_1199_ += i_1204_;
                  }

                  i_1200_ += i_1205_;
                  i_1199_ = i_1276_;
                  i_1208_ += i_1209_;
               }
            } else if (i_1195_ != 2) {
               throw new IllegalArgumentException();
            } else {
               int i_1286_ = i_1196_ >>> 24;
               int i_1287_ = 256 - i_1286_;
               int i_1288_ = (i_1196_ & 16711935) * i_1287_ & -16711936;
               int i_1289_ = (i_1196_ & 0xFF00) * i_1287_ & 0xFF0000;
               i_1196_ = (i_1288_ | i_1289_) >>> 8;
               int i_1290_ = i_1199_;

               for(int i_1291_ = -i_1194_; i_1291_ < 0; ++i_1291_) {
                  int i_1292_ = (i_1200_ >> 16) * this.anInt8893;

                  for(int i_1293_ = -i_1193_; i_1293_ < 0; ++i_1293_) {
                     int i_1294_ = this.aByteArray10571[(i_1199_ >> 16) + i_1292_];
                     if (i_1294_ != 0) {
                        int i_1295_ = this.anIntArray10572[i_1294_ & 0xFF];
                        i_1288_ = (i_1295_ & 16711935) * i_1286_ & -16711936;
                        i_1289_ = (i_1295_ & 0xFF00) * i_1286_ & 0xFF0000;
                        is[i_1208_++] = ((i_1288_ | i_1289_) >>> 8) + i_1196_;
                     } else {
                        ++i_1208_;
                     }

                     i_1199_ += i_1204_;
                  }

                  i_1200_ += i_1205_;
                  i_1199_ = i_1290_;
                  i_1208_ += i_1209_;
               }
            }
         } else if (i_1197_ != 2) {
            throw new IllegalArgumentException();
         } else if (i_1195_ == 1) {
            int i_1296_ = i_1199_;

            for(int i_1297_ = -i_1194_; i_1297_ < 0; ++i_1297_) {
               int i_1298_ = (i_1200_ >> 16) * this.anInt8893;

               for(int i_1299_ = -i_1193_; i_1299_ < 0; ++i_1299_) {
                  int i_1300_ = this.aByteArray10571[(i_1199_ >> 16) + i_1298_];
                  if (i_1300_ != 0) {
                     int i_1301_ = this.anIntArray10572[i_1300_ & 0xFF];
                     int i_1302_ = is[i_1208_];
                     int i_1303_ = i_1301_ + i_1302_;
                     int i_1304_ = (i_1301_ & 16711935) + (i_1302_ & 16711935);
                     i_1302_ = (i_1304_ & 16777472) + (i_1303_ - i_1304_ & 65536);
                     is[i_1208_++] = i_1303_ - i_1302_ | i_1302_ - (i_1302_ >>> 8);
                  } else {
                     ++i_1208_;
                  }

                  i_1199_ += i_1204_;
               }

               i_1200_ += i_1205_;
               i_1199_ = i_1296_;
               i_1208_ += i_1209_;
            }
         } else if (i_1195_ == 0) {
            int i_1305_ = i_1199_;
            int i_1306_ = (i_1196_ & 0xFF0000) >> 16;
            int i_1307_ = (i_1196_ & 0xFF00) >> 8;
            int i_1308_ = i_1196_ & 0xFF;

            for(int i_1309_ = -i_1194_; i_1309_ < 0; ++i_1309_) {
               int i_1310_ = (i_1200_ >> 16) * this.anInt8893;

               for(int i_1311_ = -i_1193_; i_1311_ < 0; ++i_1311_) {
                  int i_1312_ = this.aByteArray10571[(i_1199_ >> 16) + i_1310_];
                  if (i_1312_ != 0) {
                     int i_1313_ = this.anIntArray10572[i_1312_ & 0xFF];
                     int i_1314_ = (i_1313_ & 0xFF0000) * i_1306_ & 0xFF000000;
                     int i_1315_ = (i_1313_ & 0xFF00) * i_1307_ & 0xFF0000;
                     int i_1316_ = (i_1313_ & 0xFF) * i_1308_ & 0xFF00;
                     i_1313_ = (i_1314_ | i_1315_ | i_1316_) >>> 8;
                     int i_1317_ = is[i_1208_];
                     int i_1318_ = i_1313_ + i_1317_;
                     int i_1319_ = (i_1313_ & 16711935) + (i_1317_ & 16711935);
                     i_1317_ = (i_1319_ & 16777472) + (i_1318_ - i_1319_ & 65536);
                     is[i_1208_++] = i_1318_ - i_1317_ | i_1317_ - (i_1317_ >>> 8);
                  } else {
                     ++i_1208_;
                  }

                  i_1199_ += i_1204_;
               }

               i_1200_ += i_1205_;
               i_1199_ = i_1305_;
               i_1208_ += i_1209_;
            }
         } else if (i_1195_ == 3) {
            int i_1320_ = i_1199_;

            for(int i_1321_ = -i_1194_; i_1321_ < 0; ++i_1321_) {
               int i_1322_ = (i_1200_ >> 16) * this.anInt8893;

               for(int i_1323_ = -i_1193_; i_1323_ < 0; ++i_1323_) {
                  byte b = this.aByteArray10571[(i_1199_ >> 16) + i_1322_];
                  int i_1324_ = b > 0 ? this.anIntArray10572[b] : 0;
                  int i_1325_ = i_1324_ + i_1196_;
                  int i_1326_ = (i_1324_ & 16711935) + (i_1196_ & 16711935);
                  int i_1327_ = (i_1326_ & 16777472) + (i_1325_ - i_1326_ & 65536);
                  i_1324_ = i_1325_ - i_1327_ | i_1327_ - (i_1327_ >>> 8);
                  i_1327_ = is[i_1208_];
                  i_1325_ = i_1324_ + i_1327_;
                  i_1326_ = (i_1324_ & 16711935) + (i_1327_ & 16711935);
                  i_1327_ = (i_1326_ & 16777472) + (i_1325_ - i_1326_ & 65536);
                  is[i_1208_++] = i_1325_ - i_1327_ | i_1327_ - (i_1327_ >>> 8);
                  i_1199_ += i_1204_;
               }

               i_1200_ += i_1205_;
               i_1199_ = i_1320_;
               i_1208_ += i_1209_;
            }
         } else if (i_1195_ != 2) {
            throw new IllegalArgumentException();
         } else {
            int i_1328_ = i_1196_ >>> 24;
            int i_1329_ = 256 - i_1328_;
            int i_1330_ = (i_1196_ & 16711935) * i_1329_ & -16711936;
            int i_1331_ = (i_1196_ & 0xFF00) * i_1329_ & 0xFF0000;
            i_1196_ = (i_1330_ | i_1331_) >>> 8;
            int i_1332_ = i_1199_;

            for(int i_1333_ = -i_1194_; i_1333_ < 0; ++i_1333_) {
               int i_1334_ = (i_1200_ >> 16) * this.anInt8893;

               for(int i_1335_ = -i_1193_; i_1335_ < 0; ++i_1335_) {
                  int i_1336_ = this.aByteArray10571[(i_1199_ >> 16) + i_1334_];
                  if (i_1336_ != 0) {
                     int i_1337_ = this.anIntArray10572[i_1336_ & 0xFF];
                     i_1330_ = (i_1337_ & 16711935) * i_1328_ & -16711936;
                     i_1331_ = (i_1337_ & 0xFF00) * i_1328_ & 0xFF0000;
                     i_1337_ = ((i_1330_ | i_1331_) >>> 8) + i_1196_;
                     int i_1338_ = is[i_1208_];
                     int i_1339_ = i_1337_ + i_1338_;
                     int i_1340_ = (i_1337_ & 16711935) + (i_1338_ & 16711935);
                     i_1338_ = (i_1340_ & 16777472) + (i_1339_ - i_1340_ & 65536);
                     is[i_1208_++] = i_1339_ - i_1338_ | i_1338_ - (i_1338_ >>> 8);
                  } else {
                     ++i_1208_;
                  }

                  i_1199_ += i_1204_;
               }

               i_1200_ += i_1205_;
               i_1199_ = i_1332_;
               i_1208_ += i_1209_;
            }
         }
      }
   }
}
