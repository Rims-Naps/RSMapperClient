public class Class43 {
   static long aLong663;
   static int anInt664;
   static IncommingPacket systemUpdate = new IncommingPacket(125, 2);

   static final String method458(int i, int[] is) {
      ++anInt664;
      StringBuffer stringbuffer = new StringBuffer();
      int i_0_ = Class173.anInt2087;

      for(int i_1_ = 0; ~is.length < ~i_1_; ++i_1_) {
         Class184 class184 = Class146.aClass32_1812.method353(is[i_1_], (byte)84);
         if (~class184.anInt2188 != 0) {
            GLSprite glsprite = (GLSprite)CacheNode_Sub12.aClass61_9556.method607((long)class184.anInt2188, i + -4923);
            if (glsprite == null) {
               Class383 class383 = Class383.method4194(Node_Sub38_Sub39.index8, class184.anInt2188, 0);
               if (class383 != null) {
                  glsprite = Class93.aGraphicsToolkit1241.a(class383, true);
                  CacheNode_Sub12.aClass61_9556.method601(glsprite, i ^ 28901, (long)class184.anInt2188);
               }
            }

            if (glsprite != null) {
               Class105.aGLSpriteArray5194[i_0_] = glsprite;
               stringbuffer.append(" <img=").append(i_0_).append(">");
               ++i_0_;
            }
         }
      }

      if (i != 4923) {
         aLong663 = 67L;
      }

      return stringbuffer.toString();
   }

   public static void method459(int i) {
      systemUpdate = null;
      if (i > -42) {
         systemUpdate = null;
      }
   }
}
