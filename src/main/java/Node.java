class Node {
   static int anInt2793;
   static int anInt2794;
   static Class61 aClass61_2795 = new Class61(8);
   static int anInt2796;
   protected long scriptId;
   static int anInt2798;
   protected Node aNode2799;
   protected Node aNode2800;
   static int[][] anIntArrayArray2801 = new int[][]{
      {0, 1, 2, 3},
      {1, 2, 3, 0},
      {1, 2, -1, 0},
      {2, 0, -1, 1},
      {0, 1, -1, 2},
      {1, 2, -1, 0},
      {-1, 4, -1, 1},
      {-1, 1, 3, -1},
      {-1, 0, 2, -1},
      {3, 5, 2, 0},
      {0, 2, 5, 3},
      {0, 2, 3, 5},
      {0, 1, 2, 3}
   };
   static int[] anIntArray2802 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};

   final void method2160(byte b) {
      ++anInt2793;
      if (this.aNode2799 != null) {
         this.aNode2799.aNode2800 = this.aNode2800;
         this.aNode2800.aNode2799 = this.aNode2799;
         this.aNode2800 = null;
         if (b < 20) {
            this.method2161(-41);
         }

         this.aNode2799 = null;
      }
   }

   final boolean method2161(int i) {
      ++anInt2798;
      if (i >= -107) {
         return false;
      } else {
         return this.aNode2799 != null;
      }
   }

   static final void method2162(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
      if (i_2_ != 32021) {
         method2164(103);
      }

      if (~Class262_Sub4.anInt7722 >= ~i_5_ && ~i_0_ >= ~za_Sub2.anInt10513 && ~Class384.anInt4906 >= ~i_3_ && ~i_4_ >= ~Node_Sub25_Sub1.anInt9936) {
         Class240.method3031(i_4_, i_0_, i_1_, false, i, i_5_, i_6_, i_3_);
      } else {
         Class288.method3404(i_4_, i_5_, i_1_, true, i_3_, i_0_, i_6_, i);
      }

      ++anInt2794;
   }

   static final boolean method2163(int i, int i_7_, int i_8_, byte b, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
      ++anInt2796;
      if (~i_7_ < -2001 || ~i_12_ < -2001 || ~i_10_ < -2001 || ~i < -2001 || ~i_14_ < -2001 || i_11_ > 2000) {
         return false;
      } else if (~i_7_ <= 1999 && i_12_ >= -2000 && i_10_ >= -2000 && ~i <= 1999 && i_14_ >= -2000 && i_11_ >= -2000) {
         if (Class320_Sub11.anInt8315 == 2) {
            int i_15_ = Class144_Sub1.anInt6806 * i_7_ + i;
            if (i_15_ >= 0 && ~i_15_ > ~Node_Sub38.anIntArray7451.length && ~Node_Sub38.anIntArray7451[i_15_] < ~((i_13_ << 8) - 38400)) {
               return false;
            }

            i_15_ = Class144_Sub1.anInt6806 * i_12_ + i_14_;
            if (i_15_ >= 0 && Node_Sub38.anIntArray7451.length > i_15_ && (i_9_ << 8) - 38400 < Node_Sub38.anIntArray7451[i_15_]) {
               return false;
            }

            i_15_ = i_10_ * Class144_Sub1.anInt6806 + i_11_;
            if (i_15_ >= 0 && ~Node_Sub38.anIntArray7451.length < ~i_15_ && ~((i_8_ << 8) + -38400) > ~Node_Sub38.anIntArray7451[i_15_]) {
               return false;
            }
         }

         int i_16_ = i_14_ - i;
         int i_17_ = -i_7_ + i_12_;
         int i_18_ = i_11_ + -i;
         int i_19_ = -i_7_ + i_10_;
         int i_20_ = -i_13_ + i_9_;
         if (~i_12_ < ~i_7_ && ~i_10_ < ~i_10_) {
            if (i_12_ <= i_10_) {
               ++i_10_;
            } else {
               ++i_12_;
            }

            --i_7_;
         } else if (~i_10_ >= ~i_12_) {
            if (~i_12_ > ~i_7_) {
               ++i_7_;
            } else {
               ++i_12_;
            }

            --i_10_;
         } else {
            if (~i_7_ >= ~i_10_) {
               ++i_10_;
            } else {
               ++i_7_;
            }

            --i_12_;
         }

         int i_21_ = -i_13_ + i_8_;
         int i_22_ = 0;
         if (i_7_ != i_12_) {
            i_22_ = (i_14_ + -i << 12) / (i_12_ + -i_7_);
         }

         int i_23_ = 0;
         if (~i_10_ != ~i_12_) {
            i_23_ = (-i_14_ + i_11_ << 12) / (i_10_ + -i_12_);
         }

         int i_24_ = 0;
         if (b > -27) {
            method2163(-84, 72, -36, (byte)18, -43, 69, -25, 97, -91, -31);
         }

         if (i_10_ != i_7_) {
            i_24_ = (-i_11_ + i << 12) / (i_7_ - i_10_);
         }

         int i_25_ = -(i_17_ * i_18_) + i_19_ * i_16_;
         if (i_25_ == 0) {
            return false;
         } else {
            int i_26_ = (i_19_ * i_20_ - i_21_ * i_17_ << 8) / i_25_;
            int i_27_ = (i_21_ * i_16_ - i_20_ * i_18_ << 8) / i_25_;
            if (i_7_ <= i_12_ && ~i_10_ <= ~i_7_) {
               if (Class331.anInt4130 <= i_7_) {
                  return true;
               } else {
                  if (i_10_ > Class331.anInt4130) {
                     i_10_ = Class331.anInt4130;
                  }

                  i_13_ = i_26_ + (i_13_ << 8) - i_26_ * i;
                  if (Class331.anInt4130 < i_12_) {
                     i_12_ = Class331.anInt4130;
                  }

                  if (i_10_ > i_12_) {
                     int var27;
                     i_11_ = var27 = i << 12;
                     i_14_ <<= 12;
                     if (~i_7_ > -1) {
                        i_13_ -= i_7_ * i_27_;
                        var27 -= i_22_ * i_7_;
                        i_11_ -= i_7_ * i_24_;
                        i_7_ = 0;
                     }

                     if (~i_12_ > -1) {
                        i_14_ -= i_12_ * i_23_;
                        i_12_ = 0;
                     }

                     if ((~i_7_ == ~i_12_ || ~i_22_ >= ~i_24_) && (i_7_ != i_12_ || i_24_ <= i_23_)) {
                        i_10_ -= i_12_;
                        i_12_ -= i_7_;

                        for(i_7_ *= Class144_Sub1.anInt6806; --i_12_ >= 0; i_11_ += i_24_) {
                           if (!Class24.method305((var27 >> 12) + -1, 1 + (i_11_ >> 12), i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
                              return false;
                           }

                           i_13_ += i_27_;
                           i_7_ += Class144_Sub1.anInt6806;
                           var27 += i_22_;
                        }

                        while(--i_10_ >= 0) {
                           if (!Class24.method305((i_14_ >> 12) + -1, (i_11_ >> 12) + 1, i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
                              return false;
                           }

                           i_11_ += i_24_;
                           i_13_ += i_27_;
                           i_7_ += Class144_Sub1.anInt6806;
                           i_14_ += i_23_;
                        }

                        return true;
                     } else {
                        i_10_ -= i_12_;
                        i_12_ -= i_7_;

                        for(i_7_ = Class144_Sub1.anInt6806 * i_7_; ~(--i_12_) <= -1; i_11_ += i_24_) {
                           if (!Class24.method305((i_11_ >> 12) + -1, 1 + (var27 >> 12), i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
                              return false;
                           }

                           var27 += i_22_;
                           i_13_ += i_27_;
                           i_7_ += Class144_Sub1.anInt6806;
                        }

                        while(~(--i_10_) <= -1) {
                           if (!Class24.method305((i_11_ >> 12) + -1, 1 + (i_14_ >> 12), i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
                              return false;
                           }

                           i_11_ += i_24_;
                           i_14_ += i_23_;
                           i_13_ += i_27_;
                           i_7_ += Class144_Sub1.anInt6806;
                        }

                        return true;
                     }
                  } else {
                     int var26;
                     i_14_ = var26 = i << 12;
                     i_11_ <<= 12;
                     if (i_7_ < 0) {
                        i_13_ -= i_7_ * i_27_;
                        var26 -= i_7_ * i_22_;
                        i_14_ -= i_24_ * i_7_;
                        i_7_ = 0;
                     }

                     if (~i_10_ > -1) {
                        i_11_ -= i_10_ * i_23_;
                        i_10_ = 0;
                     }

                     if ((i_7_ == i_10_ || i_24_ >= i_22_) && (i_7_ != i_10_ || ~i_23_ >= ~i_22_)) {
                        i_12_ -= i_10_;
                        i_10_ -= i_7_;

                        for(i_7_ = Class144_Sub1.anInt6806 * i_7_; ~(--i_10_) <= -1; i_13_ += i_27_) {
                           if (!Class24.method305((var26 >> 12) - 1, (i_14_ >> 12) - -1, i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
                              return false;
                           }

                           var26 += i_22_;
                           i_7_ += Class144_Sub1.anInt6806;
                           i_14_ += i_24_;
                        }

                        while(--i_12_ >= 0) {
                           if (!Class24.method305(-1 + (var26 >> 12), 1 + (i_11_ >> 12), i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
                              return false;
                           }

                           i_13_ += i_27_;
                           var26 += i_22_;
                           i_7_ += Class144_Sub1.anInt6806;
                           i_11_ += i_23_;
                        }

                        return true;
                     } else {
                        i_12_ -= i_10_;
                        i_10_ -= i_7_;

                        for(i_7_ = Class144_Sub1.anInt6806 * i_7_; --i_10_ >= 0; i_7_ += Class144_Sub1.anInt6806) {
                           if (!Class24.method305((i_14_ >> 12) + -1, 1 + (var26 >> 12), i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
                              return false;
                           }

                           var26 += i_22_;
                           i_13_ += i_27_;
                           i_14_ += i_24_;
                        }

                        while(~(--i_12_) <= -1) {
                           if (!Class24.method305((i_11_ >> 12) + -1, 1 + (var26 >> 12), i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
                              return false;
                           }

                           i_11_ += i_23_;
                           var26 += i_22_;
                           i_13_ += i_27_;
                           i_7_ += Class144_Sub1.anInt6806;
                        }

                        return true;
                     }
                  }
               }
            } else if (~i_10_ > ~i_12_) {
               if (~Class331.anInt4130 >= ~i_10_) {
                  return true;
               } else {
                  if (~Class331.anInt4130 > ~i_7_) {
                     i_7_ = Class331.anInt4130;
                  }

                  if (~i_12_ < ~Class331.anInt4130) {
                     i_12_ = Class331.anInt4130;
                  }

                  i_8_ = i_26_ + (i_8_ << 8) + -(i_11_ * i_26_);
                  if (~i_12_ < ~i_7_) {
                     int var57;
                     i_14_ = var57 = i_11_ << 12;
                     if (i_10_ < 0) {
                        var57 -= i_24_ * i_10_;
                        i_14_ -= i_10_ * i_23_;
                        i_8_ -= i_10_ * i_27_;
                        i_10_ = 0;
                     }

                     i <<= 12;
                     if (~i_7_ > -1) {
                        i -= i_7_ * i_22_;
                        i_7_ = 0;
                     }

                     if (i_24_ <= i_23_) {
                        i_12_ -= i_7_;
                        i_7_ -= i_10_;

                        for(i_10_ *= Class144_Sub1.anInt6806; --i_7_ >= 0; i_14_ += i_23_) {
                           if (!Class24.method305((var57 >> 12) - 1, 1 + (i_14_ >> 12), i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
                              return false;
                           }

                           i_10_ += Class144_Sub1.anInt6806;
                           var57 += i_24_;
                           i_8_ += i_27_;
                        }

                        while(--i_12_ >= 0) {
                           if (!Class24.method305((i >> 12) - 1, (i_14_ >> 12) + 1, i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
                              return false;
                           }

                           i_8_ += i_27_;
                           i_14_ += i_23_;
                           i_10_ += Class144_Sub1.anInt6806;
                           i += i_22_;
                        }

                        return true;
                     } else {
                        i_12_ -= i_7_;
                        i_7_ -= i_10_;

                        for(i_10_ *= Class144_Sub1.anInt6806; --i_7_ >= 0; i_14_ += i_23_) {
                           if (!Class24.method305(-1 + (i_14_ >> 12), (var57 >> 12) + 1, i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
                              return false;
                           }

                           var57 += i_24_;
                           i_10_ += Class144_Sub1.anInt6806;
                           i_8_ += i_27_;
                        }

                        while(~(--i_12_) <= -1) {
                           if (!Class24.method305(-1 + (i_14_ >> 12), 1 + (i >> 12), i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
                              return false;
                           }

                           i_8_ += i_27_;
                           i_14_ += i_23_;
                           i += i_22_;
                           i_10_ += Class144_Sub1.anInt6806;
                        }

                        return true;
                     }
                  } else {
                     int var56;
                     i = var56 = i_11_ << 12;
                     if (i_10_ < 0) {
                        i -= i_23_ * i_10_;
                        i_8_ -= i_27_ * i_10_;
                        var56 -= i_24_ * i_10_;
                        i_10_ = 0;
                     }

                     i_14_ <<= 12;
                     if (i_12_ < 0) {
                        i_14_ -= i_22_ * i_12_;
                        i_12_ = 0;
                     }

                     if (~i_24_ >= ~i_23_) {
                        i_7_ -= i_12_;
                        i_12_ -= i_10_;

                        for(i_10_ = Class144_Sub1.anInt6806 * i_10_; --i_12_ >= 0; var56 += i_24_) {
                           if (!Class24.method305(-1 + (var56 >> 12), (i >> 12) + 1, i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
                              return false;
                           }

                           i += i_23_;
                           i_10_ += Class144_Sub1.anInt6806;
                           i_8_ += i_27_;
                        }

                        while(~(--i_7_) <= -1) {
                           if (!Class24.method305((var56 >> 12) + -1, (i_14_ >> 12) - -1, i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
                              return false;
                           }

                           i_14_ += i_22_;
                           i_10_ += Class144_Sub1.anInt6806;
                           var56 += i_24_;
                           i_8_ += i_27_;
                        }

                        return true;
                     } else {
                        i_7_ -= i_12_;
                        i_12_ -= i_10_;

                        for(i_10_ *= Class144_Sub1.anInt6806; --i_12_ >= 0; i_10_ += Class144_Sub1.anInt6806) {
                           if (!Class24.method305(-1 + (i >> 12), 1 + (var56 >> 12), i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
                              return false;
                           }

                           i_8_ += i_27_;
                           i += i_23_;
                           var56 += i_24_;
                        }

                        while(--i_7_ >= 0) {
                           if (!Class24.method305(-1 + (i_14_ >> 12), 1 + (var56 >> 12), i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
                              return false;
                           }

                           i_8_ += i_27_;
                           i_10_ += Class144_Sub1.anInt6806;
                           var56 += i_24_;
                           i_14_ += i_22_;
                        }

                        return true;
                     }
                  }
               }
            } else if (~Class331.anInt4130 >= ~i_12_) {
               return true;
            } else {
               if (~Class331.anInt4130 > ~i_10_) {
                  i_10_ = Class331.anInt4130;
               }

               if (~i_7_ < ~Class331.anInt4130) {
                  i_7_ = Class331.anInt4130;
               }

               i_9_ = (i_9_ << 8) - (i_14_ * i_26_ + -i_26_);
               if (i_10_ >= i_7_) {
                  int var74;
                  i_11_ = var74 = i_14_ << 12;
                  if (~i_12_ > -1) {
                     var74 -= i_12_ * i_23_;
                     i_9_ -= i_27_ * i_12_;
                     i_11_ -= i_22_ * i_12_;
                     i_12_ = 0;
                  }

                  i <<= 12;
                  if (~i_7_ > -1) {
                     i -= i_7_ * i_24_;
                     i_7_ = 0;
                  }

                  if (i_23_ > i_22_) {
                     i_10_ -= i_7_;
                     i_7_ -= i_12_;

                     for(i_12_ = Class144_Sub1.anInt6806 * i_12_; ~(--i_7_) <= -1; i_11_ += i_22_) {
                        if (!Class24.method305(-1 + (i_11_ >> 12), 1 + (var74 >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
                           return false;
                        }

                        var74 += i_23_;
                        i_12_ += Class144_Sub1.anInt6806;
                        i_9_ += i_27_;
                     }

                     while(--i_10_ >= 0) {
                        if (!Class24.method305((i >> 12) + -1, 1 + (var74 >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
                           return false;
                        }

                        var74 += i_23_;
                        i += i_24_;
                        i_9_ += i_27_;
                        i_12_ += Class144_Sub1.anInt6806;
                     }

                     return true;
                  } else {
                     i_10_ -= i_7_;
                     i_7_ -= i_12_;

                     for(i_12_ *= Class144_Sub1.anInt6806; --i_7_ >= 0; var74 += i_23_) {
                        if (!Class24.method305((var74 >> 12) + -1, 1 + (i_11_ >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
                           return false;
                        }

                        i_12_ += Class144_Sub1.anInt6806;
                        i_11_ += i_22_;
                        i_9_ += i_27_;
                     }

                     while(--i_10_ >= 0) {
                        if (!Class24.method305((var74 >> 12) + -1, 1 + (i >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
                           return false;
                        }

                        var74 += i_23_;
                        i += i_24_;
                        i_12_ += Class144_Sub1.anInt6806;
                        i_9_ += i_27_;
                     }

                     return true;
                  }
               } else {
                  int var73;
                  i = var73 = i_14_ << 12;
                  if (~i_12_ > -1) {
                     i_9_ -= i_27_ * i_12_;
                     var73 -= i_12_ * i_23_;
                     i -= i_12_ * i_22_;
                     i_12_ = 0;
                  }

                  i_11_ <<= 12;
                  if (~i_10_ > -1) {
                     i_11_ -= i_24_ * i_10_;
                     i_10_ = 0;
                  }

                  if ((i_12_ == i_10_ || ~i_23_ >= ~i_22_) && (i_10_ != i_12_ || ~i_24_ <= ~i_22_)) {
                     i_7_ -= i_10_;
                     i_10_ -= i_12_;

                     for(i_12_ *= Class144_Sub1.anInt6806; ~(--i_10_) <= -1; var73 += i_23_) {
                        if (!Class24.method305(-1 + (var73 >> 12), (i >> 12) + 1, i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
                           return false;
                        }

                        i_9_ += i_27_;
                        i += i_22_;
                        i_12_ += Class144_Sub1.anInt6806;
                     }

                     while(~(--i_7_) <= -1) {
                        if (!Class24.method305((i_11_ >> 12) - 1, 1 + (i >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
                           return false;
                        }

                        i_9_ += i_27_;
                        i_12_ += Class144_Sub1.anInt6806;
                        i += i_22_;
                        i_11_ += i_24_;
                     }

                     return true;
                  } else {
                     i_7_ -= i_10_;
                     i_10_ -= i_12_;

                     for(i_12_ = Class144_Sub1.anInt6806 * i_12_; ~(--i_10_) <= -1; var73 += i_23_) {
                        if (!Class24.method305((i >> 12) + -1, 1 + (var73 >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
                           return false;
                        }

                        i += i_22_;
                        i_9_ += i_27_;
                        i_12_ += Class144_Sub1.anInt6806;
                     }

                     while(~(--i_7_) <= -1) {
                        if (!Class24.method305(-1 + (i >> 12), 1 + (i_11_ >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
                           return false;
                        }

                        i += i_22_;
                        i_9_ += i_27_;
                        i_12_ += Class144_Sub1.anInt6806;
                        i_11_ += i_24_;
                     }

                     return true;
                  }
               }
            }
         }
      } else {
         return false;
      }
   }

   public static void method2164(int i) {
      if (i != -1) {
         aClass61_2795 = null;
      }

      aClass61_2795 = null;
      anIntArrayArray2801 = null;
      anIntArray2802 = null;
   }

   public Node() {
   }
}