public class Class154 {
   static int anInt1949;
   static int anInt1950;
   static IncommingPacket aClass192_1951 = new IncommingPacket(19, 8);

   static final Class329[] method1698(int i) {
      if (i < 9) {
         return null;
      } else {
         ++anInt1950;
         return new Class329[]{
            Class240.aClass329_2943,
            Class189_Sub1.aClass329_6887,
            Class379.aClass329_4873,
            Class229.aClass329_2730,
            CacheNode_Sub2.aClass329_9436,
            WorldmapAreaDetail.aClass329_9538,
            Class362.aClass329_4498
         };
      }
   }

   static final String method1699(long l, int i) {
      ++anInt1949;
      if (l <= 0L || ~l <= -6582952005840035282L) {
         return null;
      } else if (~(l % 37L) == -1L) {
         return null;
      } else {
         if (i != 25589) {
            method1698(61);
         }

         int i_0_ = 0;

         for(long l_1_ = l; l_1_ != 0L; ++i_0_) {
            l_1_ /= 37L;
         }

         StringBuffer stringbuffer = new StringBuffer(i_0_);

         while(l != 0L) {
            long l_2_ = l;
            l /= 37L;
            stringbuffer.append(Class174.aCharArray2095[(int)(-(l * 37L) + l_2_)]);
         }

         return stringbuffer.reverse().toString();
      }
   }

   public static void method1700(int i) {
      aClass192_1951 = null;
      if (i != 37) {
         aClass192_1951 = null;
      }
   }
}
