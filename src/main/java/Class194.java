import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

class Class194 {
   static int anInt2370;
   static int anInt2371;
   static Class151 aClass151_2372 = new Class151(9, 0, 4, 1);
   static byte[][] npcFileData;
   static long aLong2374;
   static int anInt2375;
   static int anInt2376;
   static Class228 aClass228_2377 = new Class228();

   static final void method1960(String[] array) {
      if (array.length <= 1) {
         Node_Sub10.stringInConsole = Node_Sub10.stringInConsole + array[0];
         Class315.anInt4034 += array[0].length();
      } else {
         for(int i = 0; ~i > ~array.length; ++i) {
            if (array[i].startsWith("pause")) {
               int delay = 5;

               try {
                  delay = Integer.parseInt(array[i].substring(6));
               } catch (Exception var4) {
               }

               Node_Sub7.writeToConsole((byte)43, "Pausing for " + delay + " seconds...");
               Class339_Sub1.aStringArray8631 = array;
               Class194_Sub3.anInt6904 = 1 + i;
               Class163.aLong2020 = (long)(1000 * delay) + Class313.method3650(false);
               break;
            }

            Node_Sub10.stringInConsole = array[i];
            Node_Sub21.method2618(false, 0);
         }
      }
   }

   static final int method1961(int i, int i_2_, int i_3_) {
      ++anInt2376;
      if (~CacheNode_Sub4.aClass1_9466.anInt110 == 0) {
         return 1;
      } else {
         if (~i_2_ != ~Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false)) {
            Class356.method4024(true, true, Class22.aClass22_376.getStoredString(Class35.language), i_2_);
            if (i_2_ != Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false)) {
               return -1;
            }
         }

         try {
            Dimension dimension = Node_Sub38_Sub20.GAME_CANVAS.getSize();
            if (i_3_ != 13968) {
               method1963((byte)-54);
            }

            Class169_Sub3.method1779(
               Class93.aGraphicsToolkit1241,
               Class22.aClass22_376.getStoredString(Class35.language),
               true,
               Class169_Sub3.aClass357_8820,
               StandardSprite.aClass52_8945,
               -16777216
            );
            Model model = Renderer.method3448(CacheNode_Sub4.aClass1_9466.anInt110, 7, 0, Class107.index7);
            long l = Class313.method3650(false);
            Class93.aGraphicsToolkit1241.la();
            Class290_Sub6.aClass336_8114.method3854(0, Class135.INT_9_, 0);
            Class93.aGraphicsToolkit1241.a(Class290_Sub6.aClass336_8114);
            Class93.aGraphicsToolkit1241.DA(dimension.width / 2, dimension.height / 2, 512, 512);
            Class93.aGraphicsToolkit1241.xa(1.0F);
            Class93.aGraphicsToolkit1241.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            DrawableModel drawablemodel = Class93.aGraphicsToolkit1241.a(model, 2048, 64, 64, 768);
            int i_4_ = 0;

            label46:
            for(int i_5_ = 0; i_5_ < 500; ++i_5_) {
               Class93.aGraphicsToolkit1241.GA(0);
               Class93.aGraphicsToolkit1241.ya();

               for(int i_6_ = 15; ~i_6_ <= -1; --i_6_) {
                  for(int i_7_ = 0; i_6_ >= i_7_; ++i_7_) {
                     Node_Sub5.aClass336_7032
                        .method3854((int)((float)Class179.INT_18 * (-((float)i_6_ / 2.0F) + (float)i_7_)), 0, (i_6_ + 1) * Class179.INT_18);
                     drawablemodel.method611(Node_Sub5.aClass336_7032, null, 0);
                     ++i_4_;
                     if ((long)i <= -l + Class313.method3650(false)) {
                        break label46;
                     }
                  }
               }
            }

            Class93.aGraphicsToolkit1241.j();
            long l_8_ = (long)(1000 * i_4_) / (-l + Class313.method3650(false));
            Class93.aGraphicsToolkit1241.GA(0);
            Class93.aGraphicsToolkit1241.ya();
            return (int)l_8_;
         } catch (Throwable var12) {
            var12.printStackTrace();
            return -1;
         }
      }
   }

   static final void method1962(int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool) {
      ++anInt2371;
      if (i_11_ > 13) {
         if (DrawableModel.aFrame907 != null && (i_10_ != 3 || ~i_12_ != ~Node_Sub38_Sub15.anInt10263 || Node_Sub10.anInt7083 != i_9_)) {
            Node_Sub25_Sub4.method2679(Class240.aSignLink2946, 0, DrawableModel.aFrame907);
            DrawableModel.aFrame907 = null;
         }

         if (i_10_ == 3 && DrawableModel.aFrame907 == null) {
            DrawableModel.aFrame907 = r_Sub2.method2371(0, Class240.aSignLink2946, -28769, i_9_, i_12_, 0);
            if (DrawableModel.aFrame907 != null) {
               Node_Sub38_Sub15.anInt10263 = i_12_;
               Node_Sub10.anInt7083 = i_9_;
               Node_Sub38_Sub31.method2893(1);
            }
         }

         if (i_10_ == 3 && DrawableModel.aFrame907 == null) {
            method1962(i, -1, Class213.aNode_Sub27_2512.aClass320_Sub1_7287.method3678(false), 43, -1, true);
         } else {
            Container container;
            if (DrawableModel.aFrame907 == null) {
               if (Node_Sub29.aFrame7344 == null) {
                  if (Class96.anApplet1270 != null) {
                     container = Class96.anApplet1270;
                  } else {
                     container = Class82.aGameStub1123;
                  }

                  Class36.anInt542 = container.getSize().width;
                  CacheNode_Sub3.anInt9441 = container.getSize().height;
               } else {
                  Insets insets = Node_Sub29.aFrame7344.getInsets();
                  Class36.anInt542 = Node_Sub29.aFrame7344.getSize().width - insets.right - insets.left;
                  CacheNode_Sub3.anInt9441 = Node_Sub29.aFrame7344.getSize().height + -insets.top + -insets.bottom;
                  container = Node_Sub29.aFrame7344;
               }
            } else {
               CacheNode_Sub3.anInt9441 = i_9_;
               Class36.anInt542 = i_12_;
               container = DrawableModel.aFrame907;
            }

            if (~i_10_ != -2) {
               Class170.method1789(-17);
            } else {
               Class131.canvasOffsetY = 0;
               Class270_Sub1.canvasOffsetX = (Class36.anInt542 - Node_Sub38_Sub12.anInt10225) / 2;
               Class205.canvasHeight = Class257.anInt3244;
               Class360.canvasWidth = Node_Sub38_Sub12.anInt10225;
            }

            if (Node_Sub38_Sub1.aClass329_10086 != Class240.aClass329_2943 && ~Class360.canvasWidth > -1025) {
               ;
            }

            if (bool) {
               InputStream_Sub2.method128(30000);
            } else {
               Node_Sub38_Sub20.GAME_CANVAS.setSize(Class360.canvasWidth, Class205.canvasHeight);
               if (!Class71.aBoolean967) {
                  Class93.aGraphicsToolkit1241.a(Node_Sub38_Sub20.GAME_CANVAS, Class360.canvasWidth, Class205.canvasHeight);
               } else {
                  Index.method3535(Node_Sub38_Sub20.GAME_CANVAS, true);
               }

               if (container != Node_Sub29.aFrame7344) {
                  Node_Sub38_Sub20.GAME_CANVAS.setLocation(Class270_Sub1.canvasOffsetX, Class131.canvasOffsetY);
               } else {
                  Insets insets = Node_Sub29.aFrame7344.getInsets();
                  Node_Sub38_Sub20.GAME_CANVAS.setLocation(Class270_Sub1.canvasOffsetX + insets.left, Class131.canvasOffsetY + insets.top);
               }
            }

            if (i_10_ >= 2) {
               EntityNode.aBoolean1128 = true;
            } else {
               EntityNode.aBoolean1128 = false;
            }

            if (Class320_Sub15.WINDOWS_PANE_ID != -1) {
               Node_Sub29_Sub3.method2717(1, true);
            }

            if (Class218.aClass123_2566.aClass365_1557 != null && Class58.method577(Class151.anInt1843, -22906)) {
               Class202.method2027(200);
            }

            for(int i_13_ = 0; ~i_13_ > -101; ++i_13_) {
               Class195.aBooleanArray2387[i_13_] = true;
            }

            Class355.aBoolean4366 = true;
         }
      }
   }

   public static void method1963(byte b) {
      aClass228_2377 = null;
      aClass151_2372 = null;
      npcFileData = null;
      if (b >= -16) {
         method1962(74, 107, 34, 53, -99, true);
      }
   }
}
