public class Class20_Sub1 extends WorldmapDefinitions {
   static int anInt5506;
   static float[] aFloatArray5507 = new float[2];
   static HashTable aHashTable5508 = new HashTable(16);
   static Class343 aClass343_5509;
   static int[] anIntArray5510 = new int[4];
   static int anInt5511;
   static IncommingPacket aClass192_5512 = new IncommingPacket(124, 1);

   public static void method293(byte b) {
      aClass192_5512 = null;
      if (b < 111) {
         aClass192_5512 = null;
      }

      aClass343_5509 = null;
      aHashTable5508 = null;
      anIntArray5510 = null;
      aFloatArray5507 = null;
   }

   static final char method294(byte b, byte b_0_) {
      if (b_0_ <= 104) {
         anIntArray5510 = null;
      }

      ++anInt5506;
      int i = 255 & b;
      if (i == 0) {
         throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(i, 16) + " provided");
      } else {
         if (i >= 128 && i < 160) {
            int i_1_ = Class204.aCharArray2455[-128 + i];
            if (i_1_ == 0) {
               i_1_ = 63;
            }

            i = i_1_;
         }

         return (char)i;
      }
   }

   static final void decodeLocalNpcUpdate(int i) {
      Class270_Sub2_Sub1.anInt10543 = 0;
      Node_Sub38_Sub6.anInt10132 = 0;
      ++anInt5511;
      ++Plane.anInt3423;
      Class262_Sub10.method3173(false);
      TextureDefinitions.method1035(i + 25136);
      Class284.decodeNPCMasks();
      boolean bool = false;

      for(int i_2_ = 0; ~Class270_Sub2_Sub1.anInt10543 < ~i_2_; ++i_2_) {
         int i_3_ = FileOnDisk.anIntArray1322[i_2_];
         Node_Sub41 node_sub41 = (Node_Sub41)Class12.aHashTable187.get(3512, (long)i_3_);
         Npc npc = node_sub41.aNpc7518;
         if (npc.anInt10880 != Plane.anInt3423) {
            if (Class213.rightClickDialogueIsOpen && Node_Sub23_Sub1.method2640(i_3_, 113)) {
               Class260.method3137(0);
            }

            if (npc.definitions.method2998((byte)91)) {
               Node_Sub38_Sub4.method2799(-125, npc);
            }

            npc.method879(null, true);
            node_sub41.method2160((byte)86);
            bool = true;
         }
      }

      if (bool) {
         Node_Sub32.cachedNPCcsCount = Class12.aHashTable187.method1519((byte)-90);
         Class12.aHashTable187.method1523((byte)-112, Class314.LocalNPCs);
      }

      for(int i_4_ = 0; ~i_4_ > ~Node_Sub25_Sub3.localNPCsCount; ++i_4_) {
         if (Class12.aHashTable187.get(i + 28644, (long)Class54.LocalNPCsIndexes[i_4_]) == null) {
            throw new RuntimeException("gnp2 pos:" + i_4_ + " size:" + Node_Sub25_Sub3.localNPCsCount);
         }
      }

      if (-Node_Sub25_Sub3.localNPCsCount + Node_Sub32.cachedNPCcsCount != 0) {
         System.err
            .println(
               "-Node_Sub25_Sub3.localNPCsCount + Node_Sub32.cachedNPCcsCount != 0 -- (Node_Sub25_Sub3.localNPCsCount == "
                  + Node_Sub25_Sub3.localNPCsCount
                  + " and Node_Sub32.cachedNPCcsCount == "
                  + Node_Sub32.cachedNPCcsCount
                  + ")"
            );
      }

      if (i == -25132) {
         for(int i_5_ = 0; ~i_5_ > ~Node_Sub32.cachedNPCcsCount; ++i_5_) {
            if (~Class314.LocalNPCs[i_5_].aNpc7518.anInt10880 != ~Plane.anInt3423) {
               throw new RuntimeException("gnp4 uk:" + Class314.LocalNPCs[i_5_].aNpc7518.index);
            }
         }
      }
   }
}
