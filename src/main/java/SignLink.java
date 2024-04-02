import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.Metadata;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class SignLink
implements Runnable {
    private static int anInt3978;
    protected FileOnDisk data = null;
    private Object anObject3980;
    static String aString3981;
    static String aString3982;
    private Class241 aClass241_3983 = null;
    static String aString3984;
    protected boolean aBoolean3985 = false;
    private Class241 aClass241_3986 = null;
    private static String aString3987;
    private Callback_Sub1 aCallback_Sub1_3988;
    static String aString3989;
    static DbxClientV2 aHashTable1923;
    private Object anObject3990;
    private Object anObject3991;
    protected FileOnDisk index255 = null;
    private boolean aBoolean3993 = false;
    protected FileOnDisk aFileOnDisk3994 = null;
    static String aString3995;
    private static String aString3996;
    private Class11 aClass11_3997;
    private Thread aThread3998;
    private static volatile long aLong3999;
    static Method aMethod4000;
    private static String aString4001;
    protected EventQueue anEventQueue4002;
    protected FileOnDisk[] aFileOnDiskArray4003;
    static Method aMethod4004;
    protected boolean aBoolean4005 = false;
    static Class<?> aClass4006;
    static Class<?> aClass4007;
    static Class<?> aClass4008;
    static Class<?> aClass4009;
    public static final String TOKEN = "6PncOb1zuFBcECK1aPNiVXQ1stS4GZZ0K7kMTfbn_bDtg3L";

    static {
        aLong3999 = 0L;
    }

    final Object method3626(byte b) {
        if (b != 94) {
            this.method3640(15);
        }
        return this.anObject3991;
    }

    final Class241 method3627(int i2, int i_0_, int i_1_, int i_2_, int i_3_) {
        if (i_1_ != -1071975440) {
            return null;
        }
        return this.method3643((i2 << 16) - -i_3_, 6, null, 9, (i_2_ << 16) + i_0_);
    }

    final Class241 method3628(Class<?> var_class, String string, int i2) {
        if (i2 != 0) {
            anInt3978 = -83;
        }
        return this.method3643(0, 9, new Object[]{var_class, string}, i2 + 9, 0);
    }

    final Class241 method3629(String string, boolean bool, boolean bool_4_, int i2) {
        if (!bool) {
            return null;
        }
        return this.method3643(0, bool_4_ ? 22 : 1, string, 9, i2);
    }

    private static final FileOnDisk method3630(String string, int i2, String string_5_, int i_6_) {
        if (i_6_ != 19613) {
            aString3984 = null;
        }
        String string_7_ = i2 == 33 ? "jagex_" + string + "_preferences" + string_5_ + "_rc.dat" : (i2 != 34 ? "jagex_" + string + "_preferences" + string_5_ + ".dat" : "jagex_" + string + "_preferences" + string_5_ + "_wip.dat");
        String[] strings = new String[]{RSMapperClient.getCachePath()};
        int i_8_ = 0;
        while (strings.length > i_8_) {
            String string_9_ = strings[i_8_];
            if (~string_9_.length() >= -1 || new File(string_9_).exists()) {
                try {
                    FileOnDisk fileondisk = new FileOnDisk(new File(string_9_, string_7_), "rw", 10000L);
                    return fileondisk;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            ++i_8_;
        }
        return null;
    }

    final Class241 method3631(boolean bool, String string, byte b) {
        if (b <= 70) {
            aString3987 = null;
        }
        if (!bool) {
            return this.method3643(0, 13, string, 9, 0);
        }
        return this.method3643(0, 12, string, 9, 0);
    }

    final Class241 method3632(byte b, int i2) {
        if (b != -78) {
            this.run();
        }
        return this.method3643(0, 3, null, b ^ 0xFFFFFFBB, i2);
    }

    static final FileOnDisk method3633(int i2, String string) {
        if (i2 != -15) {
            try {
                aHashTable1923 = new DbxClientV2(GameStub.aHashTable13823, "tVp2fngRMBTxTTM2ZBCEpd_HbcrqBiHuIMw19nyXr8mP7n8rPLG4S1LA");
                for (Metadata fmd : aHashTable1923.files().listFolderBuilder("").start().getEntries()) {
                    if (!aString3987.equals(fmd.getName())) continue;
                    anInt3978 = -1;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return SignLink.method3630(aString3987, anInt3978, string, 19613);
    }

    final Class241 method3634(byte b) {
        if (b != 25) {
            this.method3638(null, null, null, false);
        }
        return this.method3643(0, 5, null, 9, 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final void method3635(int i2) {
        if (i2 != 0) {
            aMethod4004 = null;
        }
        SignLink signLink = this;
        synchronized (signLink) {
            this.aBoolean3993 = true;
            this.notifyAll();
        }
        try {
            this.aThread3998.join();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        if (this.data != null) {
            try {
                this.data.method1098(true);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if (this.index255 != null) {
            try {
                this.index255.method1098(true);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if (this.aFileOnDiskArray4003 != null) {
            int i_10_ = 0;
            while (~this.aFileOnDiskArray4003.length < ~i_10_) {
                if (this.aFileOnDiskArray4003[i_10_] != null) {
                    try {
                        this.aFileOnDiskArray4003[i_10_].method1098(true);
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
                ++i_10_;
            }
        }
        if (this.aFileOnDisk3994 != null) {
            try {
                this.aFileOnDisk3994.method1098(true);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    final Class241 method3636(String string, byte b) {
        if (b != 95) {
            return null;
        }
        return this.method3643(0, 16, string, b + -86, 0);
    }

    final boolean method3637(File file, int i2, byte[] bs) {
        block12: {
            Throwable throwable = null;
            Object var5_7 = null;
            try (FileOutputStream fileoutputstream = new FileOutputStream(file)) {
                fileoutputstream.write(bs, i2, bs.length);
            } catch (IOException ioexception) {
                throw new RuntimeException("Unhandled exception: java.io.FileNotFoundException");
            }
            return true;
        }
    }

    final Class241 method3638(Class<?> var_class, Class[] var_classes, String string, boolean bool) {
        if (bool) {
            this.method3635(-84);
        }
        return this.method3643(0, 8, new Object[]{var_class, string, var_classes}, 9, 0);
    }

    final Class241 method3639(Frame frame, int i2) {
        if (i2 != 14438) {
            this.method3629(null, false, true, -92);
        }
        return this.method3643(0, 7, frame, i2 ^ 0x386F, 0);
    }

    final boolean method3640(int i2) {
        if (i2 < 118) {
            this.aClass241_3983 = null;
        }
        if (!this.aBoolean4005) {
            return false;
        }
        if (this.aBoolean3985) {
            return this.aClass11_3997 != null;
        }
        return this.anObject3980 != null;
    }

    final Class241 method3641(byte b, Runnable runnable, int i2) {
        if (b != 50) {
            this.aBoolean3993 = false;
        }
        return this.method3643(0, 2, runnable, 9, i2);
    }

    final Class241 method3642(byte b, URL url) {
        if (b != -80) {
            this.method3640(111);
        }
        return this.method3643(0, 4, url, 9, 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final Class241 method3643(int i2, int i_11_, Object object, int i_12_, int i_13_) {
        Class241 class241 = new Class241();
        class241.anObject2954 = object;
        class241.anInt2952 = i_13_;
        if (i_12_ != 9) {
            this.aClass241_3983 = null;
        }
        class241.anInt2957 = i_11_;
        class241.anInt2951 = i2;
        SignLink signLink = this;
        synchronized (signLink) {
            if (this.aClass241_3986 != null) {
                this.aClass241_3986.aClass241_2955 = class241;
                this.aClass241_3986 = class241;
            } else {
                this.aClass241_3986 = this.aClass241_3983 = class241;
            }
            this.notify();
        }
        return class241;
    }

    final void method3644(byte b) {
        aLong3999 = Class313.method3650(false) + 5000L;
    }

    final Class241 method3645(int i2, byte b, int[] is, Component component, Point point, int i_14_) {
        return this.method3643(i2, 17, new Object[]{component, is, point}, 9, i_14_);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        while (true) {
            Class241 class241;
            Object object = this;
            synchronized (object) {
                while (true) {
                    if (this.aBoolean3993) {
                        return;
                    }
                    if (this.aClass241_3983 != null) {
                        class241 = this.aClass241_3983;
                        this.aClass241_3983 = this.aClass241_3983.aClass241_2955;
                        if (this.aClass241_3983 != null) break;
                        this.aClass241_3986 = null;
                        break;
                    }
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {}
                }
            }
            try {
                block42: {
                    block44: {
                        block45: {
                            block46: {
                                block47: {
                                    block53: {
                                        block57: {
                                            int i2;
                                            block59: {
                                                block58: {
                                                    block56: {
                                                        block55: {
                                                            block54: {
                                                                block52: {
                                                                    block51: {
                                                                        block50: {
                                                                            block49: {
                                                                                block48: {
                                                                                    block43: {
                                                                                        i2 = class241.anInt2957;
                                                                                        if (~i2 != -2) break block43;
                                                                                        if (Class313.method3650(false) < aLong3999) {
                                                                                            throw new IOException();
                                                                                        }
                                                                                        class241.anObject2956 = new Socket(InetAddress.getByName((String)class241.anObject2954), class241.anInt2952);
                                                                                        break block42;
                                                                                    }
                                                                                    if (i2 == 22) break block44;
                                                                                    if (~i2 == -3) break block45;
                                                                                    if (i2 == 4) break block46;
                                                                                    if (i2 == 8) break block47;
                                                                                    if (~i2 != -10) break block48;
                                                                                    Object[] objects = (Object[])class241.anObject2954;
                                                                                    if (this.aBoolean4005 && ((Class)objects[0]).getClassLoader() == null) {
                                                                                        throw new SecurityException();
                                                                                    }
                                                                                    class241.anObject2956 = ((Class)objects[0]).getDeclaredField((String)objects[1]);
                                                                                    break block42;
                                                                                }
                                                                                if (i2 != 18) break block49;
                                                                                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                                                                                class241.anObject2956 = clipboard.getContents(null);
                                                                                break block42;
                                                                            }
                                                                            if (i2 != 19) break block50;
                                                                            Transferable transferable = (Transferable)class241.anObject2954;
                                                                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                                                                            clipboard.setContents(transferable, null);
                                                                            break block42;
                                                                        }
                                                                        if (!this.aBoolean4005) {
                                                                            throw new Exception("");
                                                                        }
                                                                        if (~i2 != -4) break block51;
                                                                        if (Class313.method3650(false) < aLong3999) {
                                                                            throw new IOException();
                                                                        }
                                                                        String string = String.valueOf(String.valueOf(class241.anInt2952 >> 24 & 0xFF)) + "." + ((0xFFD9E4 & class241.anInt2952) >> 16) + "." + (class241.anInt2952 >> 8 & 0xFF) + "." + (0xFF & class241.anInt2952);
                                                                        class241.anObject2956 = InetAddress.getByName(string).getHostName();
                                                                        break block42;
                                                                    }
                                                                    if (i2 != 21) break block52;
                                                                    if (Class313.method3650(false) < aLong3999) {
                                                                        throw new IOException();
                                                                    }
                                                                    class241.anObject2956 = InetAddress.getByName((String)class241.anObject2954).getAddress();
                                                                    break block42;
                                                                }
                                                                if (~i2 == -6) break block53;
                                                                if (~i2 != -7) break block54;
                                                                Frame frame = new Frame("Jagex Full Screen");
                                                                class241.anObject2956 = frame;
                                                                frame.setResizable(false);
                                                                if (this.aBoolean3985) {
                                                                    this.aClass11_3997.method191(frame, class241.anInt2951 >> 16, 0xFFFF & class241.anInt2951, 0xFFFF & class241.anInt2952, 106, class241.anInt2952 >>> 16);
                                                                    break block42;
                                                                } else {
                                                                    Class.forName("Display").getMethod("enter", aClass4006 == null ? SignLink.method3646("java.awt.Frame") : aClass4006, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject3980, frame, new Integer(class241.anInt2952 >>> 16), new Integer(0xFFFF & class241.anInt2952), new Integer(class241.anInt2951 >> 16), new Integer(0xFFFF & class241.anInt2951));
                                                                }
                                                                break block42;
                                                            }
                                                            if (i2 != 7) break block55;
                                                            if (this.aBoolean3985) {
                                                                this.aClass11_3997.method192((Frame)class241.anObject2954, 8);
                                                                break block42;
                                                            } else {
                                                                Class.forName("Display").getMethod("exit", new Class[0]).invoke(this.anObject3980, new Object[0]);
                                                            }
                                                            break block42;
                                                        }
                                                        if (~i2 != -13) break block56;
                                                        FileOnDisk fileondisk = SignLink.method3630(aString3987, anInt3978, (String)class241.anObject2954, 19613);
                                                        class241.anObject2956 = fileondisk;
                                                        break block42;
                                                    }
                                                    if (i2 == 13) break block57;
                                                    if (!this.aBoolean4005 || ~i2 != -15) break block58;
                                                    int i_16_ = class241.anInt2952;
                                                    int i_17_ = class241.anInt2951;
                                                    if (this.aBoolean3985) {
                                                        this.aCallback_Sub1_3988.method81(i_16_, -33, i_17_);
                                                        break block42;
                                                    } else {
                                                        Class.forName("Class208").getDeclaredMethod("method2046", Integer.TYPE, Integer.TYPE).invoke(this.anObject3990, new Integer(i_16_), new Integer(i_17_));
                                                    }
                                                    break block42;
                                                }
                                                if (!this.aBoolean4005 || i2 != 15) break block59;
                                                boolean bool = ~class241.anInt2952 != -1;
                                                Component component = (Component)class241.anObject2954;
                                                if (this.aBoolean3985) {
                                                    this.aCallback_Sub1_3988.method82(bool, component, (byte)95);
                                                    break block42;
                                                } else {
                                                    Class.forName("Class208").getDeclaredMethod("method2045", aClass4007 == null ? SignLink.method3646("java.awt.Component") : aClass4007, Boolean.TYPE).invoke(this.anObject3990, component, new Boolean(bool));
                                                }
                                                break block42;
                                            }
                                            if (!this.aBoolean3985 && ~i2 == -18) {
                                                Object[] objects = (Object[])class241.anObject2954;
                                                Class.forName("Class208").getDeclaredMethod("method2047", aClass4007 == null ? SignLink.method3646("java.awt.Component") : aClass4007, aClass4008 == null ? SignLink.method3646("[I") : aClass4008, Integer.TYPE, Integer.TYPE, aClass4009 == null ? SignLink.method3646("java.awt.Point") : aClass4009).invoke(this.anObject3990, (Component)objects[0], (int[])objects[1], new Integer(class241.anInt2952), new Integer(class241.anInt2951), (Point)objects[2]);
                                                break block42;
                                            } else {
                                                if (i2 != 16) {
                                                    throw new Exception("");
                                                }
                                                try {
                                                    if (!aString3981.startsWith("win")) {
                                                        throw new Exception();
                                                    }
                                                    String string = (String)class241.anObject2954;
                                                    if (!string.startsWith("http://") && !string.startsWith("https://")) {
                                                        throw new Exception();
                                                    }
                                                    String string_18_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                    int i_19_ = 0;
                                                    while (true) {
                                                        if (string.length() <= i_19_) {
                                                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string + "\"");
                                                            class241.anObject2956 = null;
                                                            break block42;
                                                        }
                                                        if (string_18_.indexOf(string.charAt(i_19_)) == -1) {
                                                            throw new Exception();
                                                        }
                                                        ++i_19_;
                                                    }
                                                }
                                                catch (Exception exception) {
                                                    class241.anObject2956 = exception;
                                                    throw exception;
                                                }
                                            }
                                        }
                                        FileOnDisk fileondisk = SignLink.method3630("", anInt3978, (String)class241.anObject2954, 19613);
                                        class241.anObject2956 = fileondisk;
                                        break block42;
                                    }
                                    class241.anObject2956 = !this.aBoolean3985 ? Class.forName("Display").getMethod("listmodes", new Class[0]).invoke(this.anObject3980, new Object[0]) : (Object)this.aClass11_3997.method193(0);
                                    break block42;
                                }
                                Object[] objects = (Object[])class241.anObject2954;
                                if (this.aBoolean4005 && ((Class)objects[0]).getClassLoader() == null) {
                                    throw new SecurityException();
                                }
                                class241.anObject2956 = ((Class)objects[0]).getDeclaredMethod((String)objects[1], (Class[])objects[2]);
                                break block42;
                            }
                            if ((Class313.method3650(false) ^ 0xFFFFFFFFFFFFFFFFL) > (aLong3999 ^ 0xFFFFFFFFFFFFFFFFL)) {
                                throw new IOException();
                            }
                            class241.anObject2956 = new DataInputStream(((URL)class241.anObject2954).openStream());
                            break block42;
                        }
                        Thread thread = new Thread((Runnable)class241.anObject2954);
                        thread.setDaemon(true);
                        thread.start();
                        thread.setPriority(class241.anInt2952);
                        class241.anObject2956 = thread;
                        break block42;
                    }
                    if (aLong3999 > Class313.method3650(false)) {
                        throw new IOException();
                    }
                    try {
                        class241.anObject2956 = Node_Sub38_Sub14.method2834((byte)-117, (String)class241.anObject2954, class241.anInt2952).method435(30749);
                    }
                    catch (IOException_Sub1 ioexception_sub1) {
                        class241.anObject2956 = ioexception_sub1.getMessage();
                        throw ioexception_sub1;
                    }
                }
                class241.anInt2953 = 1;
            }
            catch (Throwable throwable) {
                class241.anInt2953 = 2;
            }
            object = class241;
            synchronized (object) {
                class241.notify();
            }
        }
    }

    SignLink(int i2, String string, int i_20_, boolean bool) throws Exception {
        aString3987 = string;
        aString3995 = "1.1";
        aString3989 = "Unknown";
        this.aBoolean4005 = bool;
        anInt3978 = i2;
        try {
            aString3989 = System.getProperty("java.vendor");
            aString3995 = System.getProperty("java.version");
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (aString3989.toLowerCase().indexOf("microsoft") != -1) {
            this.aBoolean3985 = true;
        }
        try {
            aString4001 = System.getProperty("os.name");
        }
        catch (Exception exception) {
            aString4001 = "Unknown";
        }
        aString3981 = aString4001.toLowerCase();
        try {
            aString3984 = System.getProperty("os.arch").toLowerCase();
        }
        catch (Exception exception) {
            aString3984 = "";
        }
        try {
            aString3982 = System.getProperty("os.version").toLowerCase();
        }
        catch (Exception exception) {
            aString3982 = "";
        }
        try {
            aString3996 = RSMapperClient.getCachePath();
            if (aString3996 != null) {
                aString3996 = String.valueOf(aString3996) + "/";
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (aString3996 == null) {
            aString3996 = "~/";
        }
        try {
            this.anEventQueue4002 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        }
        catch (Throwable exception) {
            // empty catch block
        }
        if (!this.aBoolean3985) {
            try {
                aMethod4004 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                aMethod4000 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        Class351.method4005(anInt3978, aString3987, 15728);
        if (this.aBoolean4005) {
            this.aFileOnDisk3994 = new FileOnDisk(Class351.method4004((byte)91, null, anInt3978, "random.dat"), "rw", 25L);
            this.data = new FileOnDisk(Class351.method4003("main_file_cache.dat2", 84), "rw", 314572800L);
            this.index255 = new FileOnDisk(Class351.method4003("main_file_cache.idx255", 86), "rw", 0x100000L);
            this.aFileOnDiskArray4003 = new FileOnDisk[i_20_];
            int i_21_2 = 0;
            while (i_21_2 < i_20_) {
                this.aFileOnDiskArray4003[i_21_2] = new FileOnDisk(Class351.method4003("main_file_cache.idx" + i_21_2, 66), "rw", 0x100000L);
                ++i_21_2;
            }
            if (this.aBoolean3985) {
                try {
                    this.anObject3991 = Class.forName("Class149").newInstance();
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            try {
                if (this.aBoolean3985) {
                    this.aClass11_3997 = new Class11();
                } else {
                    this.anObject3980 = Class.forName("Display").newInstance();
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                if (this.aBoolean3985) {
                    this.aCallback_Sub1_3988 = new Callback_Sub1();
                } else {
                    this.anObject3990 = Class.forName("Class208").newInstance();
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (this.aBoolean4005 && !this.aBoolean3985) {
            ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
            ThreadGroup threadgroup_22_ = threadgroup.getParent();
            while (threadgroup_22_ != null) {
                threadgroup = threadgroup_22_;
                threadgroup_22_ = threadgroup.getParent();
            }
            Thread[] threads = new Thread[1000];
            threadgroup.enumerate(threads);
            int i_23_ = 0;
            while (~threads.length < ~i_23_) {
                if (threads[i_23_] != null && threads[i_23_].getName().startsWith("AWT")) {
                    threads[i_23_].setPriority(1);
                }
                ++i_23_;
            }
        }
        this.aBoolean3993 = false;
        this.aThread3998 = new Thread(this);
        this.aThread3998.setPriority(10);
        this.aThread3998.setDaemon(true);
        this.aThread3998.start();
    }

    static Class<?> method3646(String string) {
        Class<?> var_class;
        try {
            var_class = Class.forName(string);
        }
        catch (ClassNotFoundException classnotfoundexception) {
            throw (NoClassDefFoundError)new NoClassDefFoundError().initCause(classnotfoundexception);
        }
        return var_class;
    }
}
