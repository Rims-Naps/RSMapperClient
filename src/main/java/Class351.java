import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class351 {
   private static boolean aBoolean4319 = false;
   private static String aString4320;
   private static String aString4321;
   private static int anInt4322;
   private static Hashtable aHashtable4323 = new Hashtable(16);

   public static File method4003(String string, int i) {
      if (i < 45) {
         aHashtable4323 = null;
      }

      return method4004((byte)91, aString4321, anInt4322, string);
   }

   public static File method4004(byte b, String string, int i, String string_0_) {
      if (!aBoolean4319) {
         throw new RuntimeException("");
      } else {
         File file = (File)aHashtable4323.get(string_0_);
         if (file != null) {
            return file;
         } else {
            String[] strings = new String[]{RSMapperClient.getCachePath()};
            if (b != 91) {
               return null;
            } else {
               File f = new File(RSMapperClient.getCachePath() + "/runescape");
               if (!f.exists()) {
                  f.mkdirs();
               }

               for(int i_2_ = 0; i_2_ < 2; ++i_2_) {
                  for(int i_4_ = 0; ~strings.length < ~i_4_; ++i_4_) {
                     String string_5_ = strings[i_4_] + "/" + (string == null ? "" : string + "/") + string_0_;
                     RandomAccessFile randomaccessfile = null;

                     try {
                        File file_6_ = new File(string_5_);
                        if (i_2_ != 0 || file_6_.exists()) {
                           String string_7_ = strings[i_4_];
                           if (i_2_ != 1 || string_7_.length() <= 0 || new File(string_7_).exists()) {
                              new File(strings[i_4_]).mkdir();
                              if (string != null) {
                                 new File(strings[i_4_] + "/" + string).mkdir();
                              }

                              randomaccessfile = new RandomAccessFile(file_6_, "rw");
                              int i_8_ = randomaccessfile.read();
                              randomaccessfile.seek(0L);
                              randomaccessfile.write(i_8_);
                              randomaccessfile.seek(0L);
                              randomaccessfile.close();
                              aHashtable4323.put(string_0_, file_6_);
                              return file_6_;
                           }
                        }
                     } catch (Exception var15) {
                        try {
                           if (randomaccessfile != null) {
                              randomaccessfile.close();
                              Object string_7_ = null;
                           }
                        } catch (Exception var14) {
                        }
                     }
                  }
               }

               throw new RuntimeException();
            }
         }
      }
   }

   public static void method4005(int i, String string, int i_10_) {
      anInt4322 = i;
      aString4321 = string;
      if (i_10_ == 15728) {
         try {
            aString4320 = RSMapperClient.getCachePath();
            if (aString4320 != null) {
               aString4320 = aString4320 + "/";
            }
         } catch (Exception var4) {
         }

         if (aString4320 == null) {
            aString4320 = "~/";
         }

         aBoolean4319 = true;
      }
   }
}
