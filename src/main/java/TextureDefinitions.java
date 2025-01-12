public class TextureDefinitions {
   protected int combinedMode;
   protected byte speedV;
   protected boolean skipTriangles;
   protected boolean translucent;
   protected int effectParam2;
   protected byte mipmaps;
   static int anInt1208;
   static int anInt1209;
   protected boolean repeatTop;
   protected byte speedU;
   protected boolean repeatSides;
   protected byte effectParam1;
   protected byte effect;
   protected boolean hdr;
   protected boolean brickTile;
   protected byte brightness;
   static IncommingPacket aClass192_1218 = new IncommingPacket(22, 10);
   static int anInt1219;
   static OutgoingPacket aClass318_1220 = new OutgoingPacket(33, 0);
   protected short colorIndex;
   protected boolean unknown;
   protected boolean meshGround;
   static int anInt1224;
   protected byte shadowFactor;
   protected int unknown1;
   static int anInt1227;
   static long[][][] aLongArrayArrayArray1228;

   static final void decodePlayerMasks(int i, Player player, int playerIndex, Packet packet, int mask) {
      ++anInt1209;
      byte temporaryMovementType = -1;
      if ((32768 & mask) != 0) {
         int i_2_ = packet.readUnsignedByte();
         int[] is = new int[i_2_];
         int[] is_3_ = new int[i_2_];
         int[] is_4_ = new int[i_2_];

         for(int i_5_ = 0; i_2_ > i_5_; ++i_5_) {
            int i_6_ = packet.readUnsignedShort();
            if (i_6_ == 65535) {
               i_6_ = -1;
            }

            is[i_5_] = i_6_;
            is_3_[i_5_] = packet.readUnsignedByteC();
            is_4_[i_5_] = packet.readUnsignedShortLE128();
         }

         Node_Sub38_Sub13.method2831(is_4_, -31813, is, is_3_, player);
      }

      if (~(64 & mask) != -1) {
         int[] emotes = new int[4];

         for(int i_7_ = 0; i_7_ < 4; ++i_7_) {
            emotes[i_7_] = packet.readUnsignedShortLE();
            if (~emotes[i_7_] == -65536) {
               emotes[i_7_] = -1;
            }
         }

         int i_8_ = packet.readUnsignedByte128();
         Class352.method4011(emotes, i_8_, false, player, -63);
      }

      if ((mask & 262144) != 0) {
         int i_9_ = packet.readUnsignedShortLE128();
         int i_10_ = packet.readIntV2();
         if (i_9_ == 65535) {
            i_9_ = -1;
         }

         int i_11_ = packet.readUnsignedByteC();
         int i_12_ = 7 & i_11_;
         int i_13_ = 15 & i_11_ >> 3;
         if (i_13_ == 15) {
            i_13_ = -1;
         }

         boolean bool = ~((i_11_ & 202) >> 7) == -2;
         player.sendGraphics(2, i_12_, bool, i_10_, i_13_, i_9_);
      }

      if (~(mask & 131072) != -1) {
         player.aByte10896 = packet.read128Byte();
         player.aByte10878 = packet.read128Byte();
         player.aByte10884 = packet.readByteC();
         player.aByte10888 = (byte)packet.readUnsignedByte();
         player.anInt10895 = Class174.clientCycle - -packet.readUnsignedShortLE128();
         player.anInt10882 = Class174.clientCycle + packet.readUnsignedShort();
      }

      if ((512 & mask) != 0) {
         temporaryMovementType = packet.readByteC();
      }

      if (~(8192 & mask) != -1) {
         int i_14_ = packet.readUnsignedShort128();
         player.anInt10856 = packet.readUnsignedByte();
         player.anInt10848 = packet.readUnsignedByteC();
         player.aBoolean10871 = ~(i_14_ & 32768) != -1;
         player.anInt10855 = i_14_ & 32767;
         player.anInt10835 = player.anInt10856 + player.anInt10855 + Class174.clientCycle;
      }

      if (~(524288 & mask) != -1) {
         int i_15_ = packet.readUnsignedShortLE();
         int settingsHash = packet.readIntV2();
         if (~i_15_ == -65536) {
            i_15_ = -1;
         }

         int i_17_ = packet.readUnsignedByteC();
         int i_18_ = 7 & i_17_;
         int i_19_ = (i_17_ & 124) >> 3;
         if (~i_19_ == -16) {
            i_19_ = -1;
         }

         boolean bool = (i_17_ & 172) >> 7 == 1;
         player.sendGraphics(3, i_18_, bool, settingsHash, i_19_, i_15_);
      }

      if (~(1048576 & mask) != -1) {
         player.aBoolean11135 = ~packet.readUnsignedByteC() == -2;
      }

      if (~(4 & mask) != -1) {
         int hitsCount = packet.readUnsignedByte();
         if (~hitsCount < -1) {
            for(int i_21_ = 0; i_21_ < hitsCount; ++i_21_) {
               int soakingMark = -1;
               int damage = -1;
               int type = packet.readSmart();
               int soakingDamage = -1;
               if (type == 32767) {
                  type = packet.readSmart();
                  damage = packet.readSmart();
                  soakingMark = packet.readSmart();
                  soakingDamage = packet.readSmart();
               } else if (type == 32766) {
                  type = -1;
               } else {
                  damage = packet.readSmart();
               }

               int delay = packet.readSmart();
               int currentHp = packet.readUnsignedByteC();
               player.method852(soakingDamage, delay, currentHp, (byte)-122, damage, Class174.clientCycle, soakingMark, type);
            }
         }
      }

      if (~(mask & 65536) != -1) {
         int i_28_ = packet.readUnsigned128Byte();
         int[] is = new int[i_28_];
         int[] is_29_ = new int[i_28_];

         for(int i_30_ = 0; ~i_30_ > ~i_28_; ++i_30_) {
            int i_31_ = packet.readUnsignedShort128();
            if ((i_31_ & 49152) != 49152) {
               is[i_30_] = i_31_;
            } else {
               int i_32_ = packet.readUnsignedShort();
               is[i_30_] = Node_Sub16.method2590(i_32_, i_31_ << 16);
            }

            is_29_[i_30_] = packet.readUnsignedShort128();
         }

         player.method866(is_29_, is, (byte)103);
      }

      if ((8 & mask) != 0) {
         int size = packet.readUnsigned128Byte();
         byte[] data = new byte[size];
         Buffer buffer = new Buffer(data);
         packet.readBytes(data, 0, size);
         Class249.cachedAppearences[playerIndex] = buffer;
         player.decodeAppearence(buffer, i + 1);
      }

      if (~(mask & 16384) != -1) {
         String string = packet.readString();
         if (string.charAt(0) == '~') {
            string = string.substring(1);
            Class28.method331(string, player.method893(false, true), -110, 0, player.displayName, player.method891(false, i + 2), 2);
         } else if (player == Class295.myPlayer) {
            Class28.method331(string, player.method893(false, true), i + -62, 0, player.displayName, player.method891(false, 1), 2);
         }

         player.method882(0, 0, string, (byte)117);
      }

      if ((mask & 1024) != 0) {
         player.aBoolean11157 = packet.readUnsigned128Byte() == 1;
      }

      if (~(1 & mask) != -1) {
         Class73.movementTypes[playerIndex] = packet.read128Byte();
      }

      if (~(mask & 16) != i) {
         int i_34_ = packet.readUnsignedShort128();
         if (i_34_ == 65535) {
            i_34_ = -1;
         }

         player.faceEntity = i_34_;
      }

      if (~(mask & 4096) != -1) {
         player.toFirstTileX = packet.read128Byte();
         player.toFirstTileY = packet.readByte();
         player.toSecondTileX = packet.readByte128();
         player.toSecondTileY = packet.readByte128();
         player.toFirstTileTicketDelay = packet.readUnsignedShortLE() - -Class174.clientCycle;
         player.toSecondTileTicketDelay = packet.readUnsignedShortLE128() + Class174.clientCycle;
         player.forceMovementDirection = packet.readUnsignedByte128();
         if (!player.aBoolean11156) {
            player.toSecondTileX += player.scenePositionXQueue[0];
            player.anInt10904 = 1;
            player.toSecondTileY += player.scenePositionYQueue[0];
            player.toFirstTileY += player.scenePositionYQueue[0];
            player.toFirstTileX += player.scenePositionXQueue[0];
         } else {
            player.anInt10904 = 0;
            player.toSecondTileY += player.anInt11160;
            player.toFirstTileX += player.anInt11147;
            player.toFirstTileY += player.anInt11160;
            player.toSecondTileX += player.anInt11147;
         }

         player.anInt10900 = 0;
      }

      if ((32 & mask) != 0) {
         player.anInt11180 = packet.readUnsignedShort();
         if (~player.anInt10904 == -1) {
            player.method856((byte)-107, player.anInt11180);
            player.anInt11180 = -1;
         }
      }

      if ((2 & mask) != 0) {
         int id = packet.readUnsignedShort();
         int settingsHash = packet.readIntLE();
         if (~id == -65536) {
            id = -1;
         }

         int settings2Hash = packet.readUnsignedByte128();
         int rotation = 7 & settings2Hash;
         int i_39_ = settings2Hash >> 3 & 15;
         if (i_39_ == 15) {
            i_39_ = -1;
         }

         boolean bool = (settings2Hash & 216) >> 7 == 1;
         player.sendGraphics(0, rotation, bool, settingsHash, i_39_, id);
      }

      if ((mask & 256) != 0) {
         int i_40_ = packet.readUnsignedShortLE128();
         if (i_40_ == 65535) {
            i_40_ = -1;
         }

         int i_41_ = packet.readIntV2();
         int i_42_ = packet.readUnsignedByteC();
         int i_43_ = 7 & i_42_;
         int i_44_ = (124 & i_42_) >> 3;
         if (~i_44_ == -16) {
            i_44_ = -1;
         }

         boolean bool = (i_42_ >> 7 & 1) == 1;
         player.sendGraphics(1, i_43_, bool, i_41_, i_44_, i_40_);
      }

      if (player.aBoolean11156) {
         if (temporaryMovementType != 127) {
            byte b_45_;
            if (~temporaryMovementType != 0) {
               b_45_ = temporaryMovementType;
            } else {
               b_45_ = Class73.movementTypes[playerIndex];
            }

            Class372.method4103(65, player, b_45_);
            player.processMovement(player.anInt11160, player.anInt11147, i + -9379, b_45_);
         } else {
            player.method888(player.anInt11147, -89, player.anInt11160);
         }
      }
   }

   static final void method1033(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_) {
      ++anInt1224;
      System.out.println("method1033 (sound): " + i + " - " + i_46_ + " - " + i_47_ + " - " + i_48_ + " - " + i_49_ + " - " + i_50_);
      if (i_50_ != Class213.aNode_Sub27_2512.aClass320_Sub25_7295.method3776(false) && i_48_ != 0 && ~Class23.anInt434 > -51 && ~i_47_ != 0) {
         Node_Sub38_Sub19.aClass78Array10284[Class23.anInt434++] = new Class78((byte)1, i_47_, i_48_, i_46_, i_49_, 0, i, null);
      }
   }

   public static void method1034(byte b) {
      aClass192_1218 = null;
      aLongArrayArrayArray1228 = null;
      if (b < -7) {
         aClass318_1220 = null;
      }
   }

   static final void method1035(int i) {
      ++anInt1219;
      Packet packet = Class218.aClass123_2566.aPacket1570;

      while(~packet.method2264(Class218.aClass123_2566.anInt1581, -92) <= -16) {
         int index = packet.readBits(15);
         if (~index == -32768) {
            break;
         }

         boolean bool = false;
         Node_Sub41 node_sub41 = (Node_Sub41)Class12.aHashTable187.get(3512, (long)index);
         if (node_sub41 == null) {
            Npc npc = new Npc();
            npc.index = index;
            node_sub41 = new Node_Sub41(npc);
            Class12.aHashTable187.put((long)index, node_sub41, -123);
            Class314.LocalNPCs[Node_Sub32.cachedNPCcsCount++] = node_sub41;
            bool = true;
         }

         Npc npc = node_sub41.aNpc7518;
         Class54.LocalNPCsIndexes[Node_Sub25_Sub3.localNPCsCount++] = index;
         npc.anInt10880 = Plane.anInt3423;
         if (npc.definitions != null && npc.definitions.method2998((byte)91)) {
            Node_Sub38_Sub4.method2799(i + -107, npc);
         }

         int i_52_ = 14958 & 4 + packet.readBits(3) << 11;
         int i_53_ = packet.readBits(1);
         if (i_53_ == 1) {
            Class194_Sub1_Sub1.anIntArray9370[Node_Sub38_Sub6.anInt10132++] = index;
         }

         int i_54_ = packet.readBits(5);
         if (~i_54_ < -16) {
            i_54_ -= 32;
         }

         int i_55_ = packet.readBits(2);
         npc.method879(Class366.aClass279_4526.getNPCDefinitions(packet.readBits(15), (byte)107), true);
         int i_56_ = packet.readBits(5);
         if (i_56_ > 15) {
            i_56_ -= 32;
         }

         int i_57_ = packet.readBits(1);
         npc.method861(-1000, npc.definitions.size);
         npc.anInt10890 = npc.definitions.anInt2876 << 3;
         if (bool) {
            npc.method849(i_52_, -62, true);
         }

         npc.method877(
            -15694,
            i_57_ == 1,
            i_54_ + Class295.myPlayer.scenePositionYQueue[0],
            i_56_ + Class295.myPlayer.scenePositionXQueue[0],
            i_55_,
            npc.getSize((byte)91)
         );
         if (npc.definitions.method2998((byte)91)) {
            Class262_Sub1.method3150(npc.plane, null, npc.scenePositionXQueue[0], npc.scenePositionYQueue[0], npc, null, 0);
         }
      }

      packet.finishBitAccess();
      if (i != 4) {
         method1033(-63, -75, 81, -64, -90, 72);
      }
   }

   static final int method1036(int i, float f, float f_58_, float f_59_) {
      ++anInt1208;
      if (i != 2) {
         method1034((byte)-50);
      }

      float f_60_ = f_58_ >= 0.0F ? f_58_ : -f_58_;
      float f_61_ = f_59_ < 0.0F ? -f_59_ : f_59_;
      float f_62_ = f >= 0.0F ? f : -f;
      if (!(f_61_ <= f_60_) && !(f_62_ >= f_61_)) {
         return f_59_ <= 0.0F ? 1 : 0;
      } else if (!(f_60_ >= f_62_) && !(f_61_ >= f_62_)) {
         return f <= 0.0F ? 3 : 2;
      } else {
         return f_58_ > 0.0F ? 4 : 5;
      }
   }
}
