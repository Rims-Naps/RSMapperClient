public class Class12 {
   static int anInt180;
   static int anInt181;
   static int anInt182;
   static int anInt183;
   static int anInt184;
   private int anInt185;
   static int anInt186;
   static HashTable aHashTable187 = new HashTable(64);
   private Class158 aClass158_188 = new Class158();
   static int anInt189;
   private HashTable aHashTable190;
   static int anInt191;
   private int anInt192;
   static int anInt193 = 0;
   static boolean aBoolean194 = true;
   static int anInt195;
   static int anInt196;
   static IncommingPacket aClass192_197 = new IncommingPacket(48, 5);
   static Class257 aClass257_198 = new Class257(14, 5);
   static float aFloat199;

   private final void method195(int i, Interface18 interface18) {
      ++anInt180;
      long l = interface18.method67(26165);
      if (i == 0) {
         for(CacheNode_Sub14 cachenode_sub14 = (CacheNode_Sub14)this.aHashTable190.get(i + 3512, l);
            cachenode_sub14 != null;
            cachenode_sub14 = (CacheNode_Sub14)this.aHashTable190.method1524((byte)84)
         ) {
            if (cachenode_sub14.anInterface18_9576.method66(28071, interface18)) {
               this.method198(false, cachenode_sub14);
               break;
            }
         }
      }
   }

   final void method196(boolean bool) {
      this.aClass158_188.method1722(true);
      ++anInt182;
      this.aHashTable190.method1517(bool);
      this.anInt192 = this.anInt185;
   }

   final void method197(byte b) {
      for(CacheNode_Sub14 cachenode_sub14 = (CacheNode_Sub14)this.aClass158_188.method1723(13);
         cachenode_sub14 != null;
         cachenode_sub14 = (CacheNode_Sub14)this.aClass158_188.method1721(0)
      ) {
         if (cachenode_sub14.method2350((byte)-38)) {
            cachenode_sub14.method2160((byte)59);
            cachenode_sub14.method2275(-59);
            this.anInt192 += cachenode_sub14.anInt9574;
         }
      }

      ++anInt189;
      if (b <= 23) {
         this.method199(true, -89);
      }
   }

   private final void method198(boolean bool, CacheNode_Sub14 cachenode_sub14) {
      if (bool) {
         this.anInt185 = -28;
      }

      ++anInt181;
      if (cachenode_sub14 != null) {
         cachenode_sub14.method2160((byte)72);
         cachenode_sub14.method2275(-121);
         this.anInt192 += cachenode_sub14.anInt9574;
      }
   }

   final void method199(boolean bool, int i) {
      ++anInt183;
      if (Node_Sub40.aClass233_7514 != null) {
         for(CacheNode_Sub14 cachenode_sub14 = (CacheNode_Sub14)this.aClass158_188.method1723(13);
            cachenode_sub14 != null;
            cachenode_sub14 = (CacheNode_Sub14)this.aClass158_188.method1721(0)
         ) {
            if (!cachenode_sub14.method2350((byte)-38)) {
               if (~(++cachenode_sub14.aLong7037) < ~((long)i)) {
                  CacheNode_Sub14 cachenode_sub14_0_ = Node_Sub40.aClass233_7514.method2143(cachenode_sub14, 16460);
                  this.aHashTable190.put(cachenode_sub14.scriptId, cachenode_sub14_0_, -125);
                  Node_Sub38_Sub19.method2847(255, cachenode_sub14, cachenode_sub14_0_);
                  cachenode_sub14.method2160((byte)117);
                  cachenode_sub14.method2275(-108);
               }
            } else if (cachenode_sub14.method2347(27670) == null) {
               cachenode_sub14.method2160((byte)35);
               cachenode_sub14.method2275(-77);
               this.anInt192 += cachenode_sub14.anInt9574;
            }
         }
      }

      if (bool) {
         this.method198(false, null);
      }
   }

   final int method200(int i) {
      ++anInt196;
      return i != 0 ? -77 : this.anInt185;
   }

   final int method201(int i) {
      if (i != 48) {
         return 17;
      } else {
         ++anInt191;
         return this.anInt192;
      }
   }

   public static void method202(int i) {
      aClass192_197 = null;
      aClass257_198 = null;
      int i_1_ = -8 % ((i - -59) / 57);
      aHashTable187 = null;
   }

   private final void method203(boolean bool, int i, Object object, Interface18 interface18) {
      ++anInt186;
      if (i > this.anInt185) {
         throw new IllegalStateException("s>cs");
      } else {
         if (!bool) {
            this.method195(0, interface18);
            this.anInt192 -= i;

            while(~this.anInt192 > -1) {
               CacheNode_Sub14 cachenode_sub14 = (CacheNode_Sub14)this.aClass158_188.method1717(-107);
               this.method198(false, cachenode_sub14);
            }

            CacheNode_Sub14_Sub2 cachenode_sub14_sub2 = new CacheNode_Sub14_Sub2(interface18, object, i);
            this.aHashTable190.put(interface18.method67(26165), cachenode_sub14_sub2, -124);
            this.aClass158_188.method1719(!bool, cachenode_sub14_sub2);
            cachenode_sub14_sub2.aLong7037 = 0L;
         }
      }
   }

   final Object method204(Interface18 interface18, byte b) {
      ++anInt195;
      if (b >= -89) {
         this.method200(-93);
      }

      long l = interface18.method67(26165);

      for(CacheNode_Sub14 cachenode_sub14 = (CacheNode_Sub14)this.aHashTable190.get(3512, l);
         cachenode_sub14 != null;
         cachenode_sub14 = (CacheNode_Sub14)this.aHashTable190.method1524((byte)84)
      ) {
         if (cachenode_sub14.anInterface18_9576.method66(28071, interface18)) {
            Object object = cachenode_sub14.method2347(27670);
            if (object != null) {
               if (!cachenode_sub14.method2350((byte)-38)) {
                  this.aClass158_188.method1719(true, cachenode_sub14);
                  cachenode_sub14.aLong7037 = 0L;
               } else {
                  CacheNode_Sub14_Sub2 cachenode_sub14_sub2 = new CacheNode_Sub14_Sub2(interface18, object, cachenode_sub14.anInt9574);
                  this.aHashTable190.put(cachenode_sub14.scriptId, cachenode_sub14_sub2, -124);
                  this.aClass158_188.method1719(true, cachenode_sub14_sub2);
                  cachenode_sub14_sub2.aLong7037 = 0L;
                  cachenode_sub14.method2160((byte)88);
                  cachenode_sub14.method2275(-89);
               }

               return object;
            }

            cachenode_sub14.method2160((byte)100);
            cachenode_sub14.method2275(-56);
            this.anInt192 += cachenode_sub14.anInt9574;
         }
      }

      return null;
   }

   final void method205(Object object, int i, Interface18 interface18) {
      ++anInt184;
      this.method203(false, 1, object, interface18);
      if (i != 0) {
         this.method204(null, (byte)-125);
      }
   }

   Class12(int i) {
      this.anInt185 = i;
      this.anInt192 = i;
      int i_2_ = 1;

      while(i > i_2_ + i_2_) {
         i_2_ += i_2_;
      }

      this.aHashTable190 = new HashTable(i_2_);
   }
}
