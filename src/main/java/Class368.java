public class Class368 {
   static int anInt4543;
   static OutgoingPacket aClass318_4544 = new OutgoingPacket(81, 8);
   static int anInt4545;
   static int anInt4546;
   static int anInt4547;
   static Plane[] aPlaneArray4548;
   static Class312 aClass312_4549 = new Class312();
   static int anInt4550 = -1;
   static int anInt4551;

   static final String method4077(int i_0_, int i_1_) {
      int i_2_ = i_0_ + -i_1_;
      if (i_2_ < -9) {
         return "<col=ff0000>";
      } else if (~i_2_ > 5) {
         return "<col=ff3000>";
      } else if (i_2_ < -3) {
         return "<col=ff7000>";
      } else if (~i_2_ > -1) {
         return "<col=ffb000>";
      } else if (~i_2_ < -10) {
         return "<col=00ff00>";
      } else if (~i_2_ < -7) {
         return "<col=40ff00>";
      } else if (i_2_ > 3) {
         return "<col=80ff00>";
      } else {
         return i_2_ > 0 ? "<col=c0ff00>" : "<col=ffff00>";
      }
   }

   static final void method4078(byte[][] bs, byte b, Class277_Sub1 class277_sub1) {
      ++anInt4543;

      for(int i = 0; ~i > ~class277_sub1.maxPlanes; ++i) {
         CacheNode_Sub16_Sub1.method2387((byte)-114);

         for(int i_3_ = 0; ~(Node_Sub54.GAME_SCENE_WDITH >> 3) < ~i_3_; ++i_3_) {
            for(int i_4_ = 0; ~i_4_ > ~(Class377_Sub1.GAME_SCENE_HEIGHT >> 3); ++i_4_) {
               int i_5_ = Class330.anIntArrayArrayArray4128[i][i_3_][i_4_];
               if (~i_5_ != 0) {
                  int i_6_ = i_5_ >> 24 & 3;
                  if (!class277_sub1.undermap || ~i_6_ == -1) {
                     int i_7_ = (6 & i_5_) >> 1;
                     int i_8_ = (i_5_ & 16774693) >> 14;
                     int i_9_ = i_5_ >> 3 & 2047;
                     int i_10_ = i_9_ / 8 + (i_8_ / 8 << 8);

                     for(int i_11_ = 0; Class262_Sub1.MAP_REGION_HASHES.length > i_11_; ++i_11_) {
                        if (i_10_ == Class262_Sub1.MAP_REGION_HASHES[i_11_] && bs[i_11_] != null) {
                           Buffer buffer = new Buffer(bs[i_11_]);
                           class277_sub1.method3349(i, i_6_, 8 * i_3_, i_9_, 8 * i_4_, buffer, i_7_, i_8_, Class304.SCENE_CLIP_DATA_PLANES, (byte)-123);
                           class277_sub1.loadMapEnvironment(
                              8 * i_3_,
                              -1670,
                              Class93.aGraphicsToolkit1241,
                              i_9_,
                              buffer,
                              i,
                              i_8_,
                              i_7_,
                              i_6_,
                              i_4_ * 8,
                              Class262_Sub1.MAP_REGION_HASHES[i_11_]
                           );
                           break;
                        }
                     }
                  }
               }
            }
         }
      }

      if (b > -12) {
         anInt4550 = 30;
      }

      for(int i = 0; i < class277_sub1.maxPlanes; ++i) {
         CacheNode_Sub16_Sub1.method2387((byte)-114);

         for(int i_12_ = 0; Node_Sub54.GAME_SCENE_WDITH >> 3 > i_12_; ++i_12_) {
            for(int i_13_ = 0; Class377_Sub1.GAME_SCENE_HEIGHT >> 3 > i_13_; ++i_13_) {
               int i_14_ = Class330.anIntArrayArrayArray4128[i][i_12_][i_13_];
               if (i_14_ == -1) {
                  class277_sub1.method3347(-13972, 8, 8 * i_13_, i_12_ * 8, i, 8);
               }
            }
         }
      }
   }

   public static void method4079(byte b) {
      aPlaneArray4548 = null;
      aClass318_4544 = null;
      aClass312_4549 = null;
      if (b < 84) {
         method4080((byte)-8);
      }
   }

   static final void method4080(byte b) {
      int i = 0;

      for(int i_15_ = 114 / ((64 - b) / 49); i < 5; ++i) {
         Plane.aBooleanArray3401[i] = false;
      }

      ++anInt4546;
      OutgoingPacketBuffer.anInt7116 = 0;
      Class203.anInt2452 = -1;
      Node_Sub24.anInt7229 = 0;
      Class109.anInt1367 = -1;
      Class320_Sub22.anInt8415 = 1;
      anInt4551 = -1;
      Class367.anInt4541 = -1;
   }

   static final void method4081(int i, int i_16_, int i_17_) {
      if (i_17_ != -278174944) {
         aPlaneArray4548 = null;
      }

      ++anInt4547;
      CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 19, (long)i | (long)i_16_ << 32);
      cachenode_sub2.method2291((byte)121);
   }
}
