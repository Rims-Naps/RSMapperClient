import java.util.Random;

public class Node_Sub38_Sub23 extends Node_Sub38 {
   static int anInt10326;
   private int anInt10327 = 2048;
   static int anInt10328;
   static OutgoingPacket aClass318_10329 = new OutgoingPacket(19, 3);
   static int anInt10330;
   static int anInt10331;
   private int anInt10332;
   private int anInt10333 = 2;
   private int anInt10334 = 5;
   private int anInt10335;
   static int anInt10336;
   private short[] aShortArray10337 = new short[512];
   static int anInt10338;
   static int anInt10339;
   private int anInt10340;
   private byte[] aByteArray10341;
   static int anInt10342;
   static CacheNode_Sub13 aCacheNode_Sub13_10343;
   static Class124 aClass124_10344 = new Class124(50);
   static short aShort10345;
   static int anInt10346 = -1;
   static int anInt10347 = -1;

   private final void method2861(byte b) {
      ++anInt10338;
      Random random = new Random((long)this.anInt10335);
      if (b < 97) {
         adjustWidgetPositions(null, 73, -116, 76);
      }

      this.aShortArray10337 = new short[512];
      if (this.anInt10327 > 0) {
         for(int i = 0; i < 512; ++i) {
            this.aShortArray10337[i] = (short)Class330.method3838(-5208, this.anInt10327, random);
         }
      }
   }

   static final void adjustWidgetPositions(IComponentDefinitions widget, int i, int i_0_, int i_1_) {
      if (i_1_ != -8525) {
         method2864(22);
      }

      ++anInt10336;
      if (widget.aspectYType != 0) {
         if (widget.aspectYType != 1) {
            if (widget.aspectYType == 2) {
               widget.positionY = -widget.height + i_0_ + -widget.basePositionY;
            } else if (~widget.aspectYType != -4) {
               if (~widget.aspectYType == -5) {
                  widget.positionY = (i_0_ - widget.height) / 2 + (i_0_ * widget.basePositionY >> 14);
               } else {
                  widget.positionY = -(widget.basePositionY * i_0_ >> 14) + -widget.height + i_0_;
               }
            } else {
               widget.positionY = widget.basePositionY * i_0_ >> 14;
            }
         } else {
            widget.positionY = widget.basePositionY + (-widget.height + i_0_) / 2;
         }
      } else {
         widget.positionY = widget.basePositionY;
      }

      if (~widget.aspectXType == -1) {
         widget.positionX = widget.basePositionX;
      } else if (widget.aspectXType == 1) {
         widget.positionX = widget.basePositionX + (i - widget.width) / 2;
      } else if (widget.aspectXType != 2) {
         if (~widget.aspectXType == -4) {
            widget.positionX = widget.basePositionX * i >> 14;
         } else if (widget.aspectXType == 4) {
            widget.positionX = (-widget.width + i) / 2 + (i * widget.basePositionX >> 14);
         } else {
            widget.positionX = -(i * widget.basePositionX >> 14) + i - widget.width;
         }
      } else {
         widget.positionX = -widget.width + i + -widget.basePositionX;
      }

      if (Class54.aBoolean817 && (Client.method113(widget).settingsHash != 0 || widget.type == 0)) {
         if (widget.positionX < 0) {
            widget.positionX = 0;
         } else if (i < widget.width + widget.positionX) {
            widget.positionX = i + -widget.width;
         }

         if (~widget.positionY > -1) {
            widget.positionY = 0;
         } else if (widget.positionY - -widget.height > i_0_) {
            widget.positionY = i_0_ + -widget.height;
         }
      }
   }

   public Node_Sub38_Sub23() {
      super(0, true);
      this.anInt10332 = 1;
      this.aByteArray10341 = new byte[512];
      this.anInt10340 = 5;
      this.anInt10335 = 0;
   }

   @Override
   final void method2780(boolean bool, Buffer buffer, int i) {
      if (!bool) {
         ++anInt10326;
         if (~i == -1) {
            this.anInt10334 = this.anInt10340 = buffer.readUnsignedByte();
            return;
         }

         if (~i == -2) {
            this.anInt10335 = buffer.readUnsignedByte();
            return;
         }

         if (i == 2) {
            this.anInt10327 = buffer.readUnsignedShort();
            return;
         }

         if (~i == -4) {
            this.anInt10333 = buffer.readUnsignedByte();
            return;
         }

         if (i == 4) {
            this.anInt10332 = buffer.readUnsignedByte();
            return;
         }

         if (~i == -6) {
            this.anInt10334 = buffer.readUnsignedByte();
            return;
         }

         if (~i == -7) {
            this.anInt10340 = buffer.readUnsignedByte();
         }
      }
   }

   static final void method2863(int i) {
      ++anInt10328;
      if (Class87.removeWalkHere) {
         IComponentDefinitions widget = Node_Sub3.method2169(i ^ 19223, Class46.anInt681, Node_Sub15_Sub9.anInt9839);
         if (widget != null && widget.anObjectArray4771 != null) {
            Node_Sub37 node_sub37 = new Node_Sub37();
            node_sub37.parameters = widget.anObjectArray4771;
            node_sub37.aWidget7437 = widget;
            ClientScriptsExecutor.sendRunScript(node_sub37);
         }

         if (i != -19316) {
            adjustWidgetPositions(null, 60, -116, -94);
         }

         Class239.anInt2928 = -1;
         Class87.removeWalkHere = false;
         Class92.anInt1230 = -1;
         if (widget != null) {
            ClientScript.method2321(-1, widget);
         }
      }
   }

   @Override
   final void method2785(int i) {
      this.aByteArray10341 = Class169_Sub3.method1778(this.anInt10335, true);
      if (i != 7) {
         this.anInt10340 = 6;
      }

      ++anInt10330;
      this.method2861((byte)120);
   }

   @Override
   final int[] method2775(int i, int i_3_) {
      ++anInt10339;
      int[] is = this.aClass146_7460.method1645(27356, i_3_);
      if (i <= 107) {
         adjustWidgetPositions(null, -42, 121, -79);
      }

      if (this.aClass146_7460.aBoolean1819) {
         int i_4_ = 2048 + Node_Sub25_Sub1.anIntArray9941[i_3_] * this.anInt10340;
         int i_5_ = i_4_ >> 12;
         int i_6_ = i_5_ - -1;

         for(int i_7_ = 0; ~Class339_Sub7.anInt8728 < ~i_7_; ++i_7_) {
            Class92.anInt1229 = Integer.MAX_VALUE;
            Class58.anInt862 = Integer.MAX_VALUE;
            Class134_Sub2.anInt9024 = Integer.MAX_VALUE;
            Animable_Sub1.anInt9098 = Integer.MAX_VALUE;
            int i_8_ = 2048 + this.anInt10334 * CacheNode_Sub3.anIntArray9442[i_7_];
            int i_9_ = i_8_ >> 12;
            int i_10_ = 1 + i_9_;

            for(int i_11_ = -1 + i_5_; ~i_11_ >= ~i_6_; ++i_11_) {
               int i_12_ = 255 & this.aByteArray10341[0xFF & (this.anInt10340 > i_11_ ? i_11_ : -this.anInt10340 + i_11_)];

               for(int i_13_ = -1 + i_9_; ~i_10_ <= ~i_13_; ++i_13_) {
                  int i_14_ = 2 * (255 & this.aByteArray10341[i_12_ + (~i_13_ <= ~this.anInt10334 ? -this.anInt10334 + i_13_ : i_13_) & 0xFF]);
                  int i_15_ = -(i_13_ << 12) - (this.aShortArray10337[i_14_++] - i_8_);
                  int i_16_ = -(i_11_ << 12) - (this.aShortArray10337[i_14_] - i_4_);
                  int i_17_ = this.anInt10332;
                  int i_18_;
                  if (~i_17_ != -2) {
                     if (i_17_ != 3) {
                        if (i_17_ != 4) {
                           if (~i_17_ != -6) {
                              if (~i_17_ == -3) {
                                 i_18_ = (i_15_ >= 0 ? i_15_ : -i_15_) + (~i_16_ > -1 ? -i_16_ : i_16_);
                              } else {
                                 i_18_ = (int)(Math.sqrt((double)((float)(i_16_ * i_16_ + i_15_ * i_15_) / 1.6777216E7F)) * 4096.0);
                              }
                           } else {
                              i_16_ *= i_16_;
                              i_15_ *= i_15_;
                              i_18_ = (int)(Math.sqrt(Math.sqrt((double)((float)(i_16_ + i_15_) / 1.6777216E7F))) * 4096.0);
                           }
                        } else {
                           i_15_ = (int)(4096.0 * Math.sqrt((double)((float)(~i_15_ > -1 ? -i_15_ : i_15_) / 4096.0F)));
                           i_16_ = (int)(4096.0 * Math.sqrt((double)((float)(i_16_ < 0 ? -i_16_ : i_16_) / 4096.0F)));
                           i_18_ = i_16_ + i_15_;
                           i_18_ = i_18_ * i_18_ >> 12;
                        }
                     } else {
                        i_15_ = i_15_ >= 0 ? i_15_ : -i_15_;
                        i_16_ = ~i_16_ <= -1 ? i_16_ : -i_16_;
                        i_18_ = ~i_15_ >= ~i_16_ ? i_16_ : i_15_;
                     }
                  } else {
                     i_18_ = i_15_ * i_15_ + i_16_ * i_16_ >> 12;
                  }

                  if (i_18_ < Animable_Sub1.anInt9098) {
                     Class92.anInt1229 = Class58.anInt862;
                     Class58.anInt862 = Class134_Sub2.anInt9024;
                     Class134_Sub2.anInt9024 = Animable_Sub1.anInt9098;
                     Animable_Sub1.anInt9098 = i_18_;
                  } else if (~i_18_ <= ~Class134_Sub2.anInt9024) {
                     if (i_18_ >= Class58.anInt862) {
                        if (~i_18_ > ~Class92.anInt1229) {
                           Class92.anInt1229 = i_18_;
                        }
                     } else {
                        Class92.anInt1229 = Class58.anInt862;
                        Class58.anInt862 = i_18_;
                     }
                  } else {
                     Class92.anInt1229 = Class58.anInt862;
                     Class58.anInt862 = Class134_Sub2.anInt9024;
                     Class134_Sub2.anInt9024 = i_18_;
                  }
               }
            }

            int i_19_ = this.anInt10333;
            if (~i_19_ != -1) {
               if (i_19_ != 1) {
                  if (i_19_ != 3) {
                     if (i_19_ != 4) {
                        if (~i_19_ == -3) {
                           is[i_7_] = -Animable_Sub1.anInt9098 + Class134_Sub2.anInt9024;
                        }
                     } else {
                        is[i_7_] = Class92.anInt1229;
                     }
                  } else {
                     is[i_7_] = Class58.anInt862;
                  }
               } else {
                  is[i_7_] = Class134_Sub2.anInt9024;
               }
            } else {
               is[i_7_] = Animable_Sub1.anInt9098;
            }
         }
      }

      return is;
   }

   public static void method2864(int i) {
      aClass124_10344 = null;
      if (i != -22994) {
         aCacheNode_Sub13_10343 = null;
      }

      aCacheNode_Sub13_10343 = null;
      aClass318_10329 = null;
   }

   static final void method2865(byte b) {
      ++anInt10342;
      if (!Node_Sub3.aBoolean6948) {
         int i = -80 / ((b - -18) / 46);
         Class291.cameraRotationHorizontalIncrement += (-Class291.cameraRotationHorizontalIncrement + -24.0F) / 2.0F;
         Node_Sub3.aBoolean6948 = true;
         Node_Sub25_Sub1.aBoolean9950 = true;
      }
   }

   static final boolean method2866(boolean bool) {
      ++anInt10331;
      if (~Class151.anInt1843 != -4) {
         return false;
      } else if (Node_Sub38_Sub8.anInt10163 == 0 && ~Class4.anInt124 == -1) {
         if (bool) {
            aClass124_10344 = null;
         }

         return true;
      } else {
         return false;
      }
   }
}
