public class Class279 {
   private Index aClass302_3549;
   static int anInt3550;
   static int anInt3551;
   static int anInt3552;
   protected Class353 aClass353_3553;
   static int anInt3554;
   static Node_Sub21 aNode_Sub21_3555 = new Node_Sub21(0, 0);
   protected boolean aBoolean3556;
   static int anInt3557;
   static int anInt3558;
   static int anInt3559;
   private Class61 aClass61_3560 = new Class61(64);
   static int anInt3561;
   private int anInt3562;
   static int anInt3563;
   protected Index aClass302_3564;
   protected Class61 aClass61_3565 = new Class61(50);
   protected Class61 aClass61_3566 = new Class61(5);
   protected int anInt3567;
   private String[] aStringArray3568;

   final void method3369(int i, int i_0_) {
      synchronized(this.aClass61_3560) {
         this.aClass61_3560.method598(i, -11819);
      }

      ++anInt3559;
      synchronized(this.aClass61_3565) {
         if (i_0_ != -759) {
            this.method3370((byte)81);
         }

         this.aClass61_3565.method598(i, -11819);
      }

      synchronized(this.aClass61_3566) {
         this.aClass61_3566.method598(i, -11819);
      }
   }

   final void method3370(byte b) {
      synchronized(this.aClass61_3560) {
         this.aClass61_3560.method608(false);
      }

      ++anInt3551;
      synchronized(this.aClass61_3565) {
         this.aClass61_3565.method608(false);
      }

      synchronized(this.aClass61_3566) {
         if (b != -40) {
            this.method3369(0, 92);
         }

         this.aClass61_3566.method608(false);
      }
   }

   static final void method3371(byte b, int i, int i_1_, int i_2_, int i_3_) {
      ++anInt3558;
      CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 10, (long)i_1_);
      cachenode_sub2.method2288(0);
      cachenode_sub2.anInt9432 = i_2_;
      if (b == -4) {
         cachenode_sub2.anInt9434 = i_3_;
         cachenode_sub2.anInt9429 = i;
      }
   }

   public static void method3372(int i) {
      aNode_Sub21_3555 = null;
      if (i != 5) {
         aNode_Sub21_3555 = null;
      }
   }

   final void method3373(byte b) {
      synchronized(this.aClass61_3560) {
         this.aClass61_3560.method602((byte)-125);
      }

      ++anInt3563;
      synchronized(this.aClass61_3565) {
         this.aClass61_3565.method602((byte)-117);
      }

      synchronized(this.aClass61_3566) {
         this.aClass61_3566.method602((byte)-119);
      }

      if (b != -52) {
         this.method3369(40, -113);
      }
   }

   final void method3374(byte b, boolean bool) {
      ++anInt3557;
      if (bool != this.aBoolean3556) {
         this.aBoolean3556 = bool;
         if (b != -50) {
            this.aClass302_3549 = null;
         }

         this.method3370((byte)-40);
      }
   }

   final void method3375(byte b) {
      synchronized(this.aClass61_3565) {
         this.aClass61_3565.method608(false);
      }

      ++anInt3561;
      synchronized(this.aClass61_3566) {
         this.aClass61_3566.method608(false);
      }

      if (b < 8) {
         method3371((byte)-33, -14, -40, -58, -77);
      }
   }

   final NpcDefinition getNPCDefinitions(int i, byte b) {
      ++anInt3554;
      if (b != 107) {
         this.method3373((byte)-117);
      }

      NpcDefinition npcdefinition;
      synchronized(this.aClass61_3560) {
         npcdefinition = (NpcDefinition)this.aClass61_3560.method607((long)i, 0);
      }

      if (npcdefinition != null) {
         return npcdefinition;
      } else {
         byte[] bs;
         synchronized(this.aClass302_3549) {
            bs = this.aClass302_3549.getFile(false, Node_Sub47.method2952(false, i), Class379.method4164(i, (byte)104));
         }

         npcdefinition = new NpcDefinition();
         npcdefinition.aClass279_2861 = this;
         npcdefinition.anInt2867 = i;
         npcdefinition.rightClickActions = (String[])this.aStringArray3568.clone();
         if (bs != null) {
            npcdefinition.method3000((byte)61, new Buffer(bs));
         }

         npcdefinition.method2997((byte)-110);
         synchronized(this.aClass61_3560) {
            this.aClass61_3560.method601(npcdefinition, b ^ 25525, (long)i);
            return npcdefinition;
         }
      }
   }

   final void method3377(boolean bool, int i) {
      this.anInt3567 = i;
      ++anInt3552;
      synchronized(this.aClass61_3565) {
         this.aClass61_3565.method608(bool);
      }

      synchronized(this.aClass61_3566) {
         this.aClass61_3566.method608(false);
      }
   }

   Class279(Class353 class353, int i, boolean bool, Index class302, Index class302_4_) {
      this.aClass302_3564 = class302_4_;
      this.aClass302_3549 = class302;
      this.aBoolean3556 = bool;
      this.anInt3562 = i;
      this.aClass353_3553 = class353;
      if (this.aClass302_3549 != null) {
         int i_5_ = -1 + this.aClass302_3549.method3526(-20871);
         this.aClass302_3549.method3537(-2, i_5_);
      }

      if (Node_Sub38_Sub34.aClass353_10443 != this.aClass353_3553) {
         this.aStringArray3568 = new String[6];
      } else {
         this.aStringArray3568 = new String[]{null, null, null, null, null, Class22.aClass22_385.getStoredString(this.anInt3562)};
      }
   }
}
