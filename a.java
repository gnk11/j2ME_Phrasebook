import javax.microedition.lcdui.Font;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import javax.microedition.rms.RecordStore;
import java.io.InputStream;
import java.io.DataInputStream;
import java.util.Hashtable;
import java.util.Vector;
import java.util.Random;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class a
{
    private static boolean b;
    private static int a;
    private static int b;
    private static int c;
    private static short[][] a;
    private static String[][] a;
    private static int d;
    private static int e;
    private static Image a;
    private static Image[] a;
    private static Image[] b;
    private static int f;
    private static Random a;
    private static c a;
    private static c b;
    private static c c;
    private static c d;
    private static int[] a;
    private static int[] b;
    private static int g;
    private static int h;
    private static int i;
    private static boolean c;
    private static int[] c;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static int[] d;
    private static int p;
    private static int[][] a;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static String[] a;
    private static boolean d;
    private static boolean e;
    private static int z;
    private static int A;
    private static int[][] b;
    private static int B;
    private static String[][][][] a;
    private static String[][] b;
    private static int[][] c;
    private static int[][] d;
    private static int[][] e;
    private static int C;
    private static int D;
    private static int E;
    private static Vector a;
    private static short[][] b;
    private static String[] b;
    private static short[][] c;
    private static String[] c;
    private static String[] d;
    private static byte[] a;
    private static int F;
    private static int G;
    private static int H;
    private static int I;
    private static int J;
    private static String[] e;
    private static String[][][] a;
    private static String[][][] b;
    private static int K;
    private static int[] e;
    private static int[] f;
    private static int L;
    private static int[] g;
    private static int[] h;
    private static int M;
    private static int[] i;
    private static long a;
    private static long b;
    private static long c;
    private static long d;
    private static int N;
    private static int O;
    private static int[][][] a;
    private static int P;
    private static int Q;
    static boolean a;
    private static Hashtable a;
    private static int R;
    private static int S;
    private static long e;
    private static int T;
    private static String a;
    private static int U;
    private static int V;
    private static int W;
    private static int X;
    private static int Y;
    private static int Z;
    private static int aa;
    private static int ab;
    private static boolean f;
    private static int[] j;
    private static boolean g;
    private static int ac;
    private static int[] k;
    
    public static final void a() {
        a.e = false;
        a.d = -3;
        final String[] array = { "/res/jourist", "/res/logo" };
        for (int i = 0; i < array.length; ++i) {
            if ((a.a = a(array[i])) != null) {
                Main.a.a();
                Main.a(1500L);
                a.a = null;
                System.gc();
            }
        }
        a.d = -2;
        a.d = true;
        a.ac = 0;
        x();
        a.a = new Random(System.currentTimeMillis());
        a.b = 0;
        a.c = 1;
        try {
            final DataInputStream dataInputStream;
            a.j = new int[(dataInputStream = new DataInputStream(new d("/res/menu"))).readByte()];
            for (int j = 0; j < a.j.length; ++j) {
                a.j[j] = dataInputStream.readByte();
            }
            a.J = dataInputStream.readByte();
            a.I = dataInputStream.readByte();
            a.a = new String[a.J];
            for (int k = 0; k < a.a.length; ++k) {
                a.a[k] = dataInputStream.readUTF();
            }
            r();
            x();
            a.a = new byte[dataInputStream.readShort()];
            a.a = new int[dataInputStream.readByte()][];
            for (int l = 0; l < a.a.length; ++l) {
                final byte byte1 = dataInputStream.readByte();
                a.a[l] = new int[byte1];
                for (byte b = 0; b < byte1; ++b) {
                    a.a[l][b] = dataInputStream.readByte();
                }
            }
            x();
            a.a.a(dataInputStream);
            a.a.a = "/res/blackfont/";
            a.d = a.a;
            final c a = a.a;
            final String a2 = "/res/whitefont/";
            final c c = a;
            final c b2;
            (b2 = new c()).a = c.a;
            b2.b = c.b;
            b2.a = c.a;
            b2.b = c.b;
            b2.a = new Image[c.a.length];
            b2.a = a2;
            a.c = (a.b = b2);
            x();
            dataInputStream.read(a.a);
            x();
            a.s = dataInputStream.readByte();
            final short short1;
            a.h = new int[short1 = dataInputStream.readShort()];
            int n = 0;
            for (short n2 = 0; n2 < short1; ++n2) {
                n += dataInputStream.readShort();
                a.h[n2] = n;
            }
            dataInputStream.close();
            System.gc();
            x();
            a.a = new Vector();
            b(c());
            x();
            f();
            x();
            c(0);
            x();
            a.M = a.h[0];
            a.d = a.b;
            a.F = (a.G = (a.H = 0));
            a("/res/res.dat");
            x();
        }
        catch (Exception ex) {}
        x();
        a(a.a);
        x();
        a(a.b);
        x();
        (a.b = new Image[17])[0] = a("/res/arrowLang");
        a.b[1] = a("/res/arrowA");
        a.b[2] = a("/res/arrowP");
        a.b[5] = a("/res/dotA");
        x();
        a.b[6] = a("/res/dotP");
        a.b[3] = a("/res/itemA");
        a.b[4] = a("/res/itemP");
        a.b[7] = a("/res/blankA");
        a.b[8] = a("/res/blankP");
        x();
        a.b[9] = a("/res/checkA");
        a.b[10] = a("/res/checkP");
        a.b[11] = a("/res/addbook");
        a.b[12] = a("/res/minusA");
        a.b[13] = a("/res/imgMap");
        x();
        a.b[14] = a("/res/butMenu");
        a.b[15] = a("/res/butBack");
        a.b[16] = a("/res/butExit");
        a.b = false;
        a.a = new Image[a.I];
        for (int m = 0; m < a.I; ++m) {
            a.a[m] = a("/res/flag" + m);
        }
        x();
        a.Q = 0;
        a.y = (a.w = Math.max(a.b[7].getWidth(), a.b[7].getHeight())) + 5;
        a.b = new int[a.e][8];
        a.a = new String[a.e][][][];
        a.b = new String[a.e][];
        a.c = new int[a.e][];
        a.d = new int[a.e][];
        a.e = new int[a.e][];
        a.c = new int[10];
        a.d = new int[10];
        a.e = new int[a.e];
        a.f = new int[a.e];
        a.B = -1;
        a.z = 0;
        a.A = -1;
        (a.a = new int[3][][])[0] = new int[2][4];
        a.a[1] = new int[2][4];
        x();
        a.q = a.b[16].getHeight();
        a.r = a.b[16].getHeight() + 4;
        x();
        a.F = (a.G = 0);
        a(0, true);
        x();
        a.b = new int[10];
        a.d = 0;
        a.d = true;
    }
    
    private static void f() {
        try {
            final DataInputStream dataInputStream = new DataInputStream(new d("/res/menu" + a.b));
            a.a = new short[a.s][];
            final int n = dataInputStream.readShort() - a.s;
            for (int i = 0; i < a.s; ++i) {
                final byte byte1 = dataInputStream.readByte();
                a.a[i] = new short[byte1];
                for (byte b = 0; b < byte1; ++b) {
                    a.a[i][b] = dataInputStream.readShort();
                }
            }
            a.b = new short[n][];
            for (int j = 0; j < n; ++j) {
                final byte byte2 = dataInputStream.readByte();
                a.b[j] = new short[byte2];
                for (byte b2 = 0; b2 < byte2; ++b2) {
                    a.b[j][b2] = dataInputStream.readShort();
                }
            }
            final short short1;
            a.b = new String[short1 = dataInputStream.readShort()];
            for (short n2 = 0; n2 < short1; ++n2) {
                a.b[n2] = dataInputStream.readUTF();
            }
            a.a = new String[a.a.length][];
            for (int k = 0; k < a.a.length; ++k) {
                a.a[k] = a(a.b, a.a[k]);
            }
            a.d = a.b;
            dataInputStream.close();
            System.gc();
        }
        catch (Exception ex) {}
    }
    
    public static final void b() {
        if (b.h == 1 && !a.d && a.e) {
            if (a.a[1][1][0] != -1) {
                b.a.setColor(416941);
                final int[] array = a.a[1][0];
                b.a.fillRect(array[0], array[1], array[2] - array[0], array[3] - array[1]);
                b.a.setColor(14090141);
                final int[] array2 = a.a[1][1];
                b.a.fillRect(array2[0], array2[1], array2[2] - array2[0], array2[3] - array2[1]);
            }
            a.e = false;
            return;
        }
        switch (a.d) {
            case -3: {
                b.a.setColor(16777215);
                b.a.fillRect(0, 0, 500, 500);
                b.f = Main.a.getWidth();
                b.g = Main.a.getHeight();
                if (a.a != null) {
                    b.a.drawImage(a.a, b.f >> 1, b.g >> 1, 3);
                    return;
                }
                break;
            }
            case -2: {
                if (a.d) {
                    a.d = false;
                    a(0, 0, b.f, b.g, 12115195, 3442902);
                    if (a.g = ((a.a = a("/res/splash")) != null)) {
                        b.a.drawImage(a.a, b.f >> 1, b.g >> 1, 3);
                        a.a = null;
                        System.gc();
                    }
                }
                final int b = b.f - (a.g ? 0 : (b.f / 3));
                final int n = b.f - b >> 1;
                final int n2 = a.g ? (b.g - 3) : (b.g - 3 >> 1);
                b.a.fillRect(n, n2, b, 3);
                b.a.setColor(15981135);
                b.a.fillRect(n, n2, Math.min(a.ac * b / 20, b), 3);
            }
            case 6: {
                final int r = a.R;
                final int n3 = 3 * (r >> 1);
                final int n4 = b.f - n3 >> 1;
                final int n5 = b.g - r >> 1;
                final int n6 = a.T >> 1;
                a(n4 - 1 - n6, n5 - 1 - n6, n3 + 2 + n6, r + 2 + (n6 << 1), 13231870, 10144255);
                b.a.setColor(416941);
                b.a.drawRect(n4 - 1 - n6, n5 - 1 - n6, n3 + 2 + n6, r + 2 + (n6 << 1));
                b.a.setClip(n4, n5, n3 - a.S, r + 2 + (n6 << 1));
                b.a.drawImage(a.b[11], n4, n5, 20);
                b.a.setClip(0, 0, b.f, b.g);
            }
            case 7: {
                if (a.V == 1 || a.V == 0) {
                    o();
                }
                if (a.d) {
                    a.d = false;
                    j();
                    return;
                }
                break;
            }
            case 0:
            case 1:
            case 2:
            case 4:
            case 5: {
                if (a.d) {
                    a.d = false;
                    g();
                    j();
                    return;
                }
                break;
            }
            case 3: {
                if (a.d) {
                    a.d = a.i;
                    n();
                    g();
                    j();
                    a.d = 3;
                    a(0, false);
                    final int n8;
                    int n7 = -(n8 = a.j[3]);
                    final int a = a.a.a;
                    for (int i = 0; i < a.h; ++i) {
                        n7 += a.b[i].length * a + n8;
                    }
                    b.a.setColor(16251);
                    int n9 = b.g - a.r - n7 - 10;
                    b.a.fillRect(6, n9, a.K + 10, n7 + 10);
                    b.a.setColor(16777215);
                    b.a.drawRect(5, n9, a.K + 1 + 10, n7 + 10);
                    n9 += 5;
                    for (int j = 0; j < a.h; ++j) {
                        final String[][] array3;
                        final int n10 = (array3 = a.b[j]).length * a + n8;
                        if (j == a.g) {
                            a(6, n9 - (n8 >> 1), a.K + 10, n10, 16748590, 15224068);
                        }
                        b(2, j, 6, n9 - (n8 >> 1), a.K + 10, n10);
                        for (int k = 0; k < array3.length; ++k) {
                            a.b.a(array3[k], 11, n9, 20);
                            n9 += a;
                        }
                        n9 += n10 - a;
                    }
                    h();
                    a.d = false;
                    return;
                }
                break;
            }
            case 8: {
                o();
            }
            case 9: {
                if (a.d) {
                    a.d = false;
                    b.a.setColor(0);
                    b.a.fillRect(0, 0, b.f, b.g);
                    break;
                }
                break;
            }
        }
    }
    
    public static final void c() {
        if (b.h != -1 && a.a) {
            a.a = false;
            if (b.h == 1) {
                final int[] array;
                final int n = (array = a.a[1][1])[3] - array[1];
                a.P = 0;
                if (n >= 0) {
                    final int n2 = a.a[1][0][1];
                    final int n3 = a.a[1][0][3];
                    final int n4 = array[1];
                    int j = b.j;
                    if (n4 != j) {
                        final int z = a.z;
                        a.e = true;
                        final boolean b = a(a.z, n2, n3 - n2) < j;
                        a.z -= (b ? 1 : -1);
                        int n5 = 0;
                        final int n6 = (a.a == 0) ? a.u : (a.a.length - 1);
                        int a;
                        int n7;
                        do {
                            a.z += (b ? 1 : -1);
                            a.C += n5 * (b ? 1 : -1);
                            n5 = a(a.z - (b ? 0 : 1)) + a.t;
                            a = a(a.z, n2, n3 - n2);
                            a.C += a(a.z) + a.t;
                            n7 = ((a.z != n6) ? a(a.z + 1, n2, n3 - n2) : a.D);
                            a.C -= a(a.z) + a.t;
                        } while ((a > j || j > n7) && (a.z != 0 || b) && (!b || a.z != n6));
                        a.d = (z != a.z);
                        if (j < n2) {
                            j = n2;
                        }
                        if (j + n > n3) {
                            j = n3 - n;
                        }
                        a.a[1][1][1] = (array[1] = j);
                        a.a[1][1][3] = (array[3] = j + n);
                    }
                }
            }
            else {
                b.h = -1;
                int e;
                final int n8 = a(0, 0) ? (e = 10) : (a(0, 1) ? (e = 11) : (e = -1));
                b.e = e;
                if (n8 == -1) {
                    int n9 = -1;
                    for (int i = 0; i < a.a[2].length; ++i) {
                        if (a(2, i)) {
                            n9 = i;
                            break;
                        }
                    }
                    if ((a.d != 1 || n9 != 0) && n9 != -1) {
                        if (a.d == 3) {
                            a.g = n9;
                        }
                        else if (a.z != n9) {
                            if (a.d == 0 && a.B == 1) {
                                a.z = n9;
                                u();
                            }
                            else {
                                a.Q = 1;
                                a.A = n9;
                                a.a = true;
                                final int[] array2 = a.a[2][n9];
                                final int n10 = a.a[1][0][1];
                                final int n11 = a.a[1][0][3];
                                final int n12 = array2[1];
                                final int n13 = array2[3];
                                if (n10 > n12 || n11 < n13) {
                                    a.z = (a.A = n9);
                                    u();
                                }
                            }
                        }
                        b.e = 9;
                    }
                }
            }
        }
        boolean b2 = true;
        Label_2455: {
            switch (a.d) {
                case 6: {
                    if (a.e == -1L) {
                        if (a.S <= 0) {
                            a.e = Main.a + 1000L;
                            break;
                        }
                        a.S -= 10;
                        break;
                    }
                    else {
                        if (Main.a > a.e) {
                            a.d = a.i;
                            a.d = true;
                            break;
                        }
                        break;
                    }
                    break;
                }
                case 3: {
                    Label_1088: {
                        switch (b.e) {
                            case 3: {
                                if (--a.g < 0) {
                                    a.g = 0;
                                }
                                a.d = true;
                                break;
                            }
                            case 4: {
                                if (++a.g >= a.h) {
                                    a.g = a.h - 1;
                                }
                                a.d = true;
                                break;
                            }
                            case 11: {
                                a.d = a.i;
                                n();
                                break;
                            }
                            case 9:
                            case 10: {
                                n();
                                a.d = a.i;
                                a.a = b();
                                switch (a.b[a.g]) {
                                    case 0: {
                                        final int value = a.H + ((a.a == 4) ? a.z : a.b[a.B][0]) * a.I;
                                        boolean b3 = false;
                                        int size = a.a.size();
                                        while (--size >= 0) {
                                            if (value == (int)a.a.elementAt(size)) {
                                                b3 = true;
                                                break;
                                            }
                                        }
                                        if (!b3) {
                                            a.a.addElement(new Integer(value));
                                            a(c());
                                        }
                                        t();
                                        break Label_2455;
                                    }
                                    case 1: {
                                        l();
                                        break Label_2455;
                                    }
                                    case 2: {
                                        b.e = 9;
                                        c();
                                        break Label_2455;
                                    }
                                    case 3: {
                                        if (a.a == 5) {
                                            n();
                                        }
                                        int z2 = a.z;
                                        a.a.removeElementAt(a.z);
                                        a(c());
                                        n();
                                        s();
                                        a.z = ((--z2 >= 0) ? z2 : false);
                                        a.i = a.d;
                                        t();
                                        break Label_2455;
                                    }
                                    case 4: {
                                        Main.a = false;
                                        a.d = false;
                                        return;
                                    }
                                    default: {
                                        break Label_1088;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
                case 7: {
                    switch (b.e) {
                        case 3: {
                            if (--a.z < 0) {
                                a.z = 0;
                                a.C = 0;
                            }
                            else {
                                a.C -= a(a.z) + a.t;
                            }
                            a.d = true;
                            break Label_2455;
                        }
                        case 4: {
                            if (++a.z >= a.a.length || a.z > a.u) {
                                --a.z;
                            }
                            else {
                                a.C += a(a.z - 1) + a.t;
                            }
                            a.d = true;
                            break Label_2455;
                        }
                        default: {
                            if (b.e != -1 && (a.V != 2 || b.e == 10 || b.e == 11 || b.e == 9)) {
                                v();
                                break Label_2455;
                            }
                            break Label_2455;
                        }
                    }
                    break;
                }
                case 0:
                case 1:
                case 2:
                case 4:
                case 5: {
                    Label_2438: {
                        switch (b.e) {
                            case 3: {
                                if (a.z != a(false)) {
                                    if (--a.z < 0) {
                                        a.z = 0;
                                        a.C = 0;
                                    }
                                    else {
                                        a.ab = b.e;
                                        a.C -= a(a.z) + a.t;
                                    }
                                }
                                a.d = true;
                                break Label_2455;
                            }
                            case 4: {
                                if (a.z != a(true)) {
                                    if (++a.z >= a.a.length || (a.d == 5 && a.z > a.u)) {
                                        --a.z;
                                    }
                                    else {
                                        a.ab = b.e;
                                        a.C += a(a.z - 1) + a.t;
                                    }
                                }
                                a.d = true;
                                break Label_2455;
                            }
                            case 1:
                            case 11: {
                                if (a.d == 1) {
                                    if (b.e != 11) {
                                        break Label_2438;
                                    }
                                }
                                else if (a.B <= 0) {
                                    break Label_2438;
                                }
                                if (a.d == 1 || a.d == 5) {
                                    a.d = 0;
                                }
                                n();
                                if (a.a == 2) {
                                    u();
                                    break Label_2455;
                                }
                                break Label_2438;
                            }
                            case 10: {
                                a.g = 0;
                                a.h = 0;
                                if (a.a != 0) {
                                    if (a.a != 5) {
                                        a.b[a.h++] = 2;
                                    }
                                    switch (a.a) {
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5: {
                                            if (a.d != 2 && a.d != 4) {
                                                if (a.a != 5) {
                                                    a.b[a.h++] = 1;
                                                }
                                                if (a.a == 4 || a.a == 5) {
                                                    a.b[a.h++] = 0;
                                                    break;
                                                }
                                                break;
                                            }
                                            else {
                                                if (a.d == 2) {
                                                    a.b[a.h++] = 3;
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    if (a.B == 0) {
                                        a.b[a.h++] = 4;
                                    }
                                }
                                if (a.h > 0) {
                                    a.i = a.d;
                                    a.d = 3;
                                    a(0, false);
                                    break;
                                }
                                break Label_2438;
                            }
                            case 2:
                            case 9: {
                                if (a.d == 7) {
                                    v();
                                    break;
                                }
                                if (a.Q == 1) {
                                    a.Q = 2;
                                    b2 = false;
                                    break;
                                }
                                if (a.Q == 2) {
                                    a.Q = 0;
                                    a.z = a.A;
                                    u();
                                    a.A = -1;
                                    b.h = -1;
                                    a.a = false;
                                    Main.a(100L);
                                }
                                if (a.d == 0 || a.d == 2 || a.d == 4) {
                                    int z3 = a.z;
                                    boolean b4 = true;
                                    if (a.a == 2 && b(a.z) > 0) {
                                        k();
                                        b4 = false;
                                    }
                                    else if (a.d == 4 && a.a == 3 && a(a.z, false)) {
                                        b4 = false;
                                        final boolean b5 = a.J == 2 && a.I == 2;
                                        if (a.J == 1) {
                                            final int n14 = a.z - 1;
                                            a.c = n14 + ((n14 >= a.b) ? 1 : 0);
                                        }
                                        else if (a.b[a.B][0] == 0) {
                                            if (a.b != a.z - 1) {
                                                a.b = a.z - 1;
                                                q();
                                            }
                                            if (b5) {
                                                a.c = ((a.b == 0) ? 1 : 0);
                                            }
                                        }
                                        else {
                                            a.c = a.z - 2;
                                            if (b5) {
                                                a.b = ((a.c == 0) ? 1 : 0);
                                                q();
                                            }
                                        }
                                        a(a.a);
                                        a(a.b);
                                        a(c());
                                    }
                                    else if (a.a == 3 && !a(a.z, false)) {
                                        b4 = false;
                                        final int z4 = a.z;
                                        z3 = ((a.z <= a.b[a.B][0]) ? a.z : (a.z - a()));
                                        final int c = a.C;
                                        n();
                                        if (a.z != z4) {
                                            a.z = z3;
                                            k();
                                            u();
                                        }
                                        else {
                                            a.C = c;
                                        }
                                    }
                                    if (a.B == 0 && a.z != 0) {
                                        final int n15;
                                        switch (n15 = a.z + ((a.J == 1 && a.I == 2) ? 1 : 0)) {
                                            case 1: {
                                                a.d = 4;
                                                a(a.z, true);
                                                a.z = 0;
                                                break;
                                            }
                                            case 2: {
                                                a.c = false;
                                                s();
                                                break;
                                            }
                                            case 3:
                                            case 4: {
                                                a.c = (n15 == 4);
                                                a.d = 5;
                                                a.v = -1;
                                                a(0, true);
                                                a.z = 0;
                                                a.u = -1;
                                                break;
                                            }
                                            case 5: {
                                                Main.a = false;
                                                break;
                                            }
                                        }
                                    }
                                    else if (b4 && b(z3) > 0) {
                                        a(z3, true);
                                        a.z = 0;
                                    }
                                    break;
                                }
                                if (a.d != 1) {
                                    break;
                                }
                                final int n16 = (((a.z == 0) ? 1 : a.z) == a.l) ? 1 : 0;
                                a.d[a.j] = ((n16 != 0) ? 1 : 2);
                                a.o += n16;
                                if (a.j == a.k - 1) {
                                    a(true, (boolean)(n16 != 0));
                                    break;
                                }
                                if (n16 != 0) {
                                    a.O = a.j;
                                    ++a.j;
                                    p();
                                    a.d = 8;
                                    a.b = Main.a + a.d;
                                    break;
                                }
                                a(false, false);
                                break;
                            }
                        }
                        a.d = true;
                    }
                    break;
                }
                case 8: {
                    if (Main.a > a.b) {
                        a.d = 1;
                        break;
                    }
                    break;
                }
            }
        }
        b.e = (b2 ? -1 : b.e);
    }
    
    public static final void d() {
        a.d = true;
    }
    
    static Image a(final String s) {
        Image image = null;
        try {
            image = Image.createImage(s + ".png");
        }
        catch (Exception ex) {
            try {
                image = Image.createImage(s + ".jpg");
            }
            catch (Exception ex2) {}
        }
        return image;
    }
    
    private static void g() {
        int n = a.j[0] + a.d.a;
        a(0, 0, b.f, b.g, 10144255, 13231870);
        if (a.B == 0 && a.b[13] != null) {
            b.a.drawImage(a.b[13], b.f >> 1, b.g - a.r, 33);
        }
        b.a.setColor(416941);
        b.a.fillRect(0, n, b.f, 5);
        b.a.fillRect(0, n, 5, b.g);
        b.a.fillRect(b.f - a.x, n, a.x, b.g);
        h();
        --n;
        b.a.drawImage(a.a[a.b], 5, n, 36);
        final int n2 = 5 + (a.a[0].getWidth() + 5);
        b.a.drawImage(a.b[0], n2, n - (a.a[a.b].getHeight() >> 1), 6);
        final int n3 = n2 + (a.b[0].getWidth() + 5);
        b.a.drawImage(a.a[a.c], n3, n, 36);
        final int n4 = n3 + a.a[a.c].getWidth();
        final String[] array = (a.d == 1) ? a.a[1] : ((a.B != 0) ? a.a[1][a.b[1][0]][0] : a.a[0]);
        final c d = a.d;
        final int n5 = b.f - 5;
        final int n6 = a.j[0];
        final int n7 = b.f - (5 + a.x) - n4;
        final int n8 = n6;
        final int n9 = n5;
        final c c = d;
        final String[] array2 = array;
        if (c.a(array2) <= n7) {
            c.a(array2, n9, n8, 24);
        }
    }
    
    private static void h() {
        a(0, b.g - a.r, b.f, a.r, 416941, 11349);
        if (a.a != 0) {
            b.a.drawImage(a.b[14], 5, b.g - 2, 36);
            b(0, 0, 0, b.g - a.r, a.q, a.r);
        }
        if (a.B != 0 || a.d == 3 || a.d == 1) {
            b.a.drawImage(a.b[(a.d == 3 || a.d == 1) ? 16 : 15], b.f - a.x, b.g - 2, 40);
            b(0, 1, b.f - a.q - a.x, b.g - a.r, a.q, a.r);
        }
    }
    
    private static void i() {
        a.ab = -1;
        a.D = ((a.a == 3 && a.b[a.B][0] + 1 == a.a[a.B].length) ? 0 : (-a.t));
        a.C = 0;
        for (int i = 0; i < a.a.length; ++i) {
            a.D += a(i) + a.t;
        }
    }
    
    private static void j() {
        switch (a.a) {
            case 6: {
                final int n = a.j[0] + a.a.a;
                a(0, n, b.f, a.r, 11349, 416941);
                final int n2 = (b.f - (5 + a.x) - 2) / a.k - 2;
                final int n3 = a.r - 8;
                int n4 = 5 + (b.f - 5 - a.x + 2 - (n2 + 2) * a.k >> 1);
                final int n5 = a.j[0] + a.a.a + 4;
                for (int i = 0; i < a.k; ++i) {
                    final int n6 = a.d[i];
                    a(n4, n5, n2, n3, a.i[n6 << 1], a.i[(n6 << 1) + 1]);
                    n4 += n2 + 2;
                }
                final int n7 = n + (a.r + 5);
                final int n8 = b.g - a.r - a.j[1] - n7;
                a(15, n7, n8);
                final int n9 = a.j[1] - 5;
                final int n10 = n7 + n9;
                final int n11 = n8 - n9;
                b(n10, n10 + n11, n11);
            }
            case 0: {
                final int n12 = 5 + a.j[1];
                final int n13 = a.j[1] + a.j[0] + a.c.a + 5;
                final int n15;
                final int n14 = (n15 = b.g - a.r - a.j[1] - n13) / a.a.a;
                final int min = Math.min(a.z + n14, a.a.length);
                if (a.u == -1) {
                    a.u = a.a.length - n14;
                }
                int n16 = n13;
                for (int j = a.z; j < min; ++j) {
                    a.a.a(a.a[j][0], n12, n16, 20);
                    n16 += a.a.a;
                }
                b(n13, n13 + n15, n15);
            }
            case 10: {
                if (a.V == 2) {
                    a(0, 0, b.f, b.g, 10144255, 13231870);
                    h();
                }
                final int n17 = b.f >> 1;
                final int n19;
                final int n18 = (n19 = Math.min(b.g - (a.r << 1), a.D) / a.a.a) * a.a.a;
                final int n20 = b.g - n18 >> 1;
                final int min2 = Math.min(a.z + n19, a.a.length);
                if (a.u == -1) {
                    a.u = a.a.length - n19;
                }
                int n21 = n20;
                b.a.setColor(a.U);
                b.a.fillRect(n17 - (a.K >> 1) - 2 - 2, n21 - 2 - 2, a.K + 8, n18 + 8);
                if (a.D > n18) {
                    b.a.fillRect(n17 + (a.K >> 1) + 2 + 2, n21 - 2 - 2, 3, n18 + 8);
                }
                b.a.setColor(16777215);
                b.a.fillRect(n17 - (a.K >> 1) - 2, n21 - 2, a.K + 4, n18 + 4);
                for (int k = a.z; k < min2; ++k) {
                    a.a.a(a.a[k][0], n17, n21, 17);
                    n21 += a.a.a;
                }
                final int n22 = n20;
                final int n23 = n20 + n18;
                int n24 = n18;
                int n25 = n23;
                int n26 = n22;
                if (a.D > n24) {
                    n26 -= 2;
                    n25 += 2;
                    n24 += 4;
                    final int n27 = a.x - 4;
                    final int n28 = (b.f + a.K >> 1) + 4;
                    int a;
                    if ((a = a(a.z, n26, n24)) + 20 > n25) {
                        a = n25 - 20;
                    }
                    b.a.setColor(16777215);
                    b.a.fillRect(n28, a, n27, 20);
                }
            }
            default: {
                int n29 = a.j[1] + a.j[0] + a.c.a + 5;
                int n31;
                if (a.a == 4) {
                    if (a.d != 2) {
                        a.a.a(a.e, 5 + (b.f - 5 - a.x >> 1), n29, 17);
                        final int n30 = n29 + (a.j[1] + a.a.a);
                        b.a.setColor(416941);
                        b.a.fillRect(0, n30, b.f, 5);
                        n29 = n30 + (5 + a.j[1]);
                    }
                    n31 = 5 + (b.f - 5 - a.x - a.K >> 1) - 5;
                }
                else {
                    n31 = 15;
                }
                final int n32 = b.g - a.r - a.j[1] - n29;
                a(n31, n29, n32);
                b(n29, n29 + n32, n32);
            }
        }
    }
    
    private static void a(final int n, final int x, int i) {
        int n2 = 2;
        final int n3 = i >> 1;
        int n4 = x + n3 + (i & 0x1);
        final int n5 = x + i;
        a.X = x;
        a.Y = n5 + 1;
        final int n6 = a(a.z) >> 1;
        if (a.C + n6 < n3 || a.D <= i) {
            n4 = x + a.C;
            n2 = 16;
        }
        else if (a.C + n3 + n6 >= a.D) {
            n4 = n5 - (a.D - a.C);
            n2 = 16;
        }
        for (i = 0; i < a.a.length; ++i) {
            b(2, i, -1, -1, -1, -1);
        }
        b.a.setClip(0, x, b.f, b.g - a.r - x - a.j[1]);
        c c = (a.B == 0) ? a.c : a.b;
        final c c2 = (a.B == 0) ? a.d : a.a;
        if (a.a == 5) {
            c = c2;
        }
        final int a;
        final int aa = a = a(a.z);
        int n8;
        final int n7 = (n2 == 16) ? (n8 = n4 + (aa >> 1)) : ((n2 == 2) ? (n8 = n4) : (n8 = n4 + aa));
        final int n9 = n8;
        a.Z = n7 - (aa >> 1) + (((aa & 0x1) != 0x1) ? 1 : 0);
        final int n10 = a.X + 1 - a.Z;
        a.Z = Math.max(a.Z, a.X - 1);
        a.aa = aa;
        if (a.ab != -1) {
            if (aa > a.Y - a.X) {
                a.W = ((a.ab == 4) ? n10 : (-n10));
            }
            else {
                a.W = 0;
            }
            a.ab = -1;
        }
        a(a.z, n, n4, (a.A == -1 || a.A == a.z) ? c : c2, n2);
        int n12;
        for (int n11 = n9 - (a >> 1) - a.t; n11 + (a(n12 = a.z - 1) + a.t) > x && n12 >= 0; n11 -= a(n12, n, n11, (a.A == n12) ? c : c2, 32) + a.t, --n12) {}
        for (int n13 = n9 + (a >> 1) + (a & 0x1) + a.t, n14 = a.z + 1; n13 < n5 && n14 < a.a.length; n13 += a(n14, n, n13, (a.A == n14) ? c : c2, 16) + a.t, ++n14) {}
        b.a.setClip(0, 0, b.f, b.g);
    }
    
    private static void b(int n, int n2, int a) {
        if (a.D <= a) {
            a.a[1][0][0] = b.f << 1;
            return;
        }
        final int n3 = a.j[1];
        n -= n3;
        n2 += n3;
        a += n3 << 1;
        final int n4 = a.x - 2;
        final int n5 = b.f - a.x + 1;
        if ((a = a(a.z, n, a)) + 20 > n2) {
            a = n2 - 20;
        }
        b.a.setColor(14090141);
        if (b.h != 1) {
            b(1, 1, n5, a, a.x, 20);
        }
        b(1, 0, n5, n, a.x, n2 - n);
        final int[] array;
        if ((array = a.a[1][1])[0] != -1) {
            b.a.fillRect(array[0], array[1], array[2] - array[0], array[3] - array[1]);
            return;
        }
        b.a.fillRect(n5, a, n4, 20);
    }
    
    private static int a(final int n) {
        int max = ((n == -1) ? a.e.length : a.a[n].length) * ((a.B == 0) ? a.c.a : a.a.a);
        switch (a.a) {
            case 4: {
                max += a.j[2] << 1;
                break;
            }
            case 6: {
                max += a.j[2] << 1;
                if (n == 0) {
                    max += a.t + 5;
                    break;
                }
                break;
            }
            case 5: {
                max += (a.j[2] << 1) + a.a[0].getHeight();
                break;
            }
            case 0:
            case 10: {
                break;
            }
            default: {
                max = Math.max(max + a.j[2], a.f);
                break;
            }
        }
        return max;
    }
    
    private static void k() {
        a(a.z, false);
        a.c[a.B] = a(a.c[a.B - 1], a.c[a.B], a.z);
        a.e[a.B] = a(a.e[a.B - 1], a.e[a.B], a.z);
        a.d[a.B] = a(a.d[a.B - 1], a.d[a.B], a.z);
        final String[][][] array = a.a[a.B];
        final String[][][] a = a.a;
        final int z = a.z;
        final String[][][] array2 = a;
        final String[][][] array3 = array;
        final String[][][] a2 = new String[array.length + array2.length][][];
        System.arraycopy(array3, 0, a2, 0, z + 1);
        System.arraycopy(array2, 0, a2, z + 1, array2.length);
        System.arraycopy(array3, z + 1, a2, z + 1 + array2.length, array3.length - z - 1);
        a.a = a2;
        i();
        a.z = a.b[a.B][0];
        a.C = a.b[a.B][1];
        a.a[2] = new int[a.a.length][4];
    }
    
    private static int a(final int n, int n2, int n3, c c, int n4) {
        n3 += a.W;
        final int n5 = (a.A != -1) ? a.A : a.z;
        int k = a.K;
        int n6 = 0;
        int n7 = -1;
        if (a.a == 3) {
            n6 = 1;
            if (a(n, false)) {
                n2 += a.y;
                n6 = 3;
                n7 = 1;
            }
            else if (n == a.b[a.B][0]) {
                n6 = 2;
                n7 = 0;
            }
            else {
                k = a.b[a.B][3];
            }
        }
        else if (a.a == 2) {
            n6 = 1;
        }
        if (a.d == 4 && n7 == 1) {
            if (a.J == 1) {
                final int n8 = n - 1;
                n6 = ((n8 + ((n8 >= a.b) ? 1 : 0) == a.c) ? 5 : 4);
            }
            else if (a.b[a.B][0] == 0) {
                n6 = ((n == a.b + 1) ? 5 : 4);
            }
            else {
                n6 = ((n == a.c + 2) ? 5 : 4);
            }
        }
        final String[][] array = a.a[n];
        final int a = a.a.a;
        final boolean b = a.a == 6 && n == 0;
        int n9 = a(n);
        int n13;
        if (a.a == 4 || a.a == 6 || a.a == 5) {
            final int n10 = (a.a == 6 || a.a == 5) ? (b.f - (5 + a.x) - 30) : k;
            if (n4 == 2) {
                n3 -= n9 >> 1;
            }
            else if (n4 == 32) {
                n3 -= n9;
            }
            if (a.a == 5) {
                final int n11 = (n == 0) ? a.b : a.c;
                b.a.drawImage(a.a[n11], n2, n3, 20);
                final int height = a.a[n11].getHeight();
                n3 += height;
                n9 -= height;
            }
            else if (b) {
                n9 = a.a[n].length * a.a.a + (a.j[2] << 1);
            }
            b(2, n, n2, n3, n10 + 10, n9);
            Label_0553: {
                Label_0513: {
                    if (a.a == 6) {
                        if (n5 != 0 || n != 1) {
                            if (n != n5 || n5 == 0) {
                                break Label_0513;
                            }
                        }
                    }
                    else if (n != n5 || a.a == 5) {
                        break Label_0513;
                    }
                    a(n2, n3, n10 + 10, n9, 16748590, 15224068);
                    break Label_0553;
                }
                a(n2, n3, n10 + 10, n9, 16777215, b ? 8110079 : 14145495);
            }
            b.a.setColor(b ? 3568556 : (((n == n5 && a.a != 5) || (a.a == 6 && n5 == 0 && n == 1)) ? 11089920 : 8355711));
            b.a.fillRect(n2, n3 + n9 - 2, n10 + 10, 2);
            int n12 = n3 + a.j[2];
            if (a.a == 6) {
                if (n5 == 0 && n == 1) {
                    c = a.b;
                }
                if (n == n5 && n == 0) {
                    c = a.a;
                }
            }
            for (int i = 0; i < array.length; ++i) {
                c.a(array[i], n2 + 5, n12, 20);
                n12 += a;
            }
            if (a.a == 5) {
                n9 += a.a[n].getHeight();
            }
            if (b) {
                n3 += n9 + a.t;
                b.a.setColor(416941);
                b.a.fillRect(0, n3, b.f, 5);
                n9 = a(0);
            }
            n13 = n9;
        }
        else {
            final int n16;
            final int n15;
            final int n14 = (n15 = (((n16 = a * array.length + a.j[2] - a.f >> 1) > 0) ? 0 : (-n16))) + (a.j[2] >> 1);
            int n17 = k + 5;
            final int n18 = (n16 > 0) ? n16 : 0;
            if (n4 == 2) {
                n3 -= n9 >> 1;
            }
            else if (n4 == 32) {
                n3 -= n9;
            }
            if (n7 >= 0) {
                if (n7 == 0) {
                    final int n19;
                    n4 = (n19 = (a.p = n17 + a.y)) - a.b[a.B][3] - 2;
                    n17 = (a.p = n19 + ((n4 < 0) ? (-n4 + 2) : 0));
                }
                else {
                    n17 = a.p - a.y;
                }
                n4 = n2 + a.f + 2 - ((n7 == 0) ? 0 : a.y);
                final int n20 = n17 + ((n7 != 0) ? a.y : 0);
                b.a.setColor(14478078);
                b.a.fillRect(n4, n3, n20, n9 + 5);
                b.a.setColor(5924990);
                final boolean b2;
                if (b2 = (n7 > 0 && n == a.b[a.B][0] + a())) {
                    b.a.fillRect(n4, n3 + n9 + 5 - 2, n20, 2);
                }
                b.a.fillRect(n4 + n20, n3, 2, n9 + 5);
            }
            if (n == n5) {
                a(n4 = n2 + a.f + 2, n3, n17, a.f + (n18 << 1) + (n18 & 0x1), 16748590, 15224068);
                a(n2, n3 + n18, a.f, n6, true);
            }
            else {
                a(n2, n3 + n18, a.f, n6, false);
            }
            b(2, n, n2, n3, n17 + a.f + 2, a.f + (n18 << 1) + (n18 & 0x1));
            n4 = n3 + n14;
            for (int j = 0; j < array.length; ++j) {
                c.a(array[j], n2 + a.f + 5, n4, 20);
                n4 += a;
            }
            n13 = n9;
        }
        return n13;
    }
    
    private static void a(int n, int n2, int n3, final int n4, final boolean b) {
        n += n3 >> 1;
        n2 += n3 >> 1;
        n3 = (b ? 0 : 1);
        switch (n4) {
            case 0: {
                ++n3;
                break;
            }
            case 3: {
                n3 += 5;
                break;
            }
            case 1: {
                n3 += 3;
                break;
            }
            case 4: {
                n3 += 7;
                break;
            }
            case 5: {
                n3 += 9;
                break;
            }
            case 2: {
                n3 = 12;
                break;
            }
        }
        b.a.drawImage(a.b[n3], n, n2, 3);
    }
    
    private static String[][] a(final short[] array, final c c, int n) {
        a.E = 0;
        final Vector vector = new Vector<Integer>();
        int n2 = 0;
        final int length = array.length;
        int n3 = 0;
        final int a = c.a('-');
        for (int i = 0; i < length; ++i) {
            final int a2 = c.a(a.d[array[i]]);
            int n4;
            if ((n4 = n2 + a2) > n) {
                if (a2 < n) {
                    vector.addElement(new Integer(n3 | i - 1 << 16));
                    a.E = Math.max(a.E, n4 - a2 - c.b);
                    n4 = a2;
                    n3 = i;
                }
                else {
                    final String s = a.d[array[i]];
                    int n5 = n4 - a2;
                    final int e = n - a;
                    int n6 = a2;
                    for (int length2 = s.length(), j = 0; j < length2; ++j) {
                        final int a3 = c.a(s.charAt(j));
                        if ((n5 += a3) > e) {
                            if (j <= 2 && i != 0) {
                                vector.addElement(new Integer(n3 | i - 1 << 16));
                                n3 = i;
                                n5 = a2 - n6 + a3;
                            }
                            else {
                                vector.addElement(new Integer(n3 | (j - 1 << 24 | i << 16)));
                                n3 = (j - 1 << 8 | i);
                                if (n6 <= e) {
                                    break;
                                }
                                n5 = a3;
                            }
                        }
                        n6 -= a3;
                    }
                    a.E = e;
                    n4 = -c.b;
                    vector.addElement(new Integer(n3 | (0xFF000000 | i << 16)));
                    n3 = i + 1;
                }
            }
            n2 = n4 + c.b;
        }
        a.E = Math.max(a.E, n2 - c.b);
        if (n3 < length) {
            vector.addElement(new Integer(length - 1 << 16 | n3));
        }
        final int size;
        String[][] array2 = new String[size = vector.size()][];
        final int n7 = (size > 1 || length > 1) ? a.d[array[length - 1]].length() : 0;
        for (int k = 0; k < size; ++k) {
            final int intValue;
            n = ((intValue = vector.elementAt(k)) & 0xFF);
            final int n9;
            final int n8 = (n9 = (intValue >> 16 & 0xFF)) - n + 1;
            array2[k] = new String[n8];
            final int endIndex = intValue >> 24;
            final int n10 = intValue >> 8 & 0xFF;
            if (n8 > 1 || endIndex < 0) {
                array2[k][0] = ((n10 != 0) ? a.d[array[n]].substring(n10) : a.d[array[n]]);
                int n11 = n8 - 1;
                while (--n11 >= 1) {
                    array2[k][n11] = a.d[array[n + n11]];
                }
            }
            if (endIndex >= 0) {
                array2[k][n8 - 1] = ((endIndex != 0) ? (a.d[array[n9]].substring(n10, endIndex) + "-") : a.d[array[n9]]);
            }
            final char c2 = (n7 == 1) ? array2[k][n8 - 1].charAt(0) : ' ';
            if (k == size - 1 && ((n7 == 3 && array2[k][n8 - 1].equals("...")) || (n7 == 1 && (c2 == '!' || c2 == '?' || c2 == '.' || c2 == ';')))) {
                final String s2 = array2[k][n8 - 1];
                if (n8 != 1) {
                    final String[] array3 = new String[array2[k].length - 1];
                    System.arraycopy(array2[k], 0, array3, 0, array3.length);
                    final StringBuffer sb = new StringBuffer();
                    final String[] array4 = array3;
                    final int n12 = array3.length - 1;
                    array4[n12] = sb.append(array4[n12]).append(s2).toString();
                    array2[k] = array3;
                }
                else {
                    final StringBuffer sb2 = new StringBuffer();
                    final String[] array5 = array2[k - 1];
                    final int n13 = array2[k - 1].length - 1;
                    array5[n13] = sb2.append(array5[n13]).append(s2).toString();
                    final String[][] array6 = new String[size - 1][];
                    System.arraycopy(array2, 0, array6, 0, size - 1);
                    array2 = array6;
                    a.E += c.a(s2);
                }
            }
        }
        return array2;
    }
    
    private static String[][] a(String str, final c c, final int n) {
        final int length = (str = ((str.charAt(str.length() - 1) == 10) ? str : (str + "\n"))).length();
        final Vector vector = new Vector<String>();
        a.E = 0;
        int i = 0;
        while (i < length) {
            int n2 = 0;
            int a = 0;
            int j;
            for (j = i + 1; j <= length; ++j) {
                a = c.a(str.charAt(j - 1));
                if ((n2 += a) > n) {
                    --j;
                    break;
                }
                if (str.charAt(j - 1) == '\n') {
                    break;
                }
            }
            a.E = Math.max(n2 - a, a.E);
            final int n3 = j;
            while (j > i) {
                boolean b = false;
                switch (str.charAt(j - 1)) {
                    case '&':
                    case ',':
                    case '-':
                    case '.':
                    case ':':
                    case ';':
                    case '@': {
                        vector.addElement(str.substring(i, j));
                        b = true;
                        break;
                    }
                    case '\n':
                    case ' ': {
                        vector.addElement(str.substring(i, j - 1));
                        b = true;
                        break;
                    }
                }
                if (b) {
                    break;
                }
                --j;
            }
            if (j == i && n3 > i) {
                vector.addElement(str.substring(i, j = n3 - 1) + "-");
            }
            for (i = j; i < str.length() && str.charAt(i) == ' '; ++i) {}
        }
        final int size;
        final String[][] array = new String[size = vector.size()][1];
        for (int k = 0; k < size; ++k) {
            array[k][0] = vector.elementAt(k);
        }
        System.gc();
        return array;
    }
    
    private static void l() {
        a.o = 0;
        a.j = 0;
        a.k = 0;
        int b = a.B;
        int z = a.z;
        if (a.a == 4 || (a.a == 3 && a.z == a.b[a.B][0])) {
            b = a.B - 1;
            z = a.b[a.B][0];
        }
        a.m = a.e[b][z];
        ++z;
        while (a.e[b].length <= z) {
            z = a.b[b--][0] + 1;
        }
        final int b2 = ((a.n = a.e[b][z] - a.I) + a.I - a.m) / a.I;
        a.k = Math.min(10, b2);
        for (int i = 0; i < a.k; ++i) {
            a.c[i] = -1;
        }
        for (int j = 0; j < a.k; ++j) {
            int a;
            do {
                a = a(0, b2 - 1);
            } while (a(a.c, j + 1, a));
            a.c[j] = a;
            a.d[j] = 0;
        }
        a.d = 1;
        a(0, true);
        w();
    }
    
    private static int a(final int n, final int n2) {
        return 0 + Math.abs(a.a.nextInt()) % (n2 + 1);
    }
    
    private static void a(final int i) {
        try {
            final RecordStore openRecordStore = RecordStore.openRecordStore("hs" + i, true);
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            final DataOutputStream dataOutputStream;
            (dataOutputStream = new DataOutputStream(out)).writeByte(a.b);
            dataOutputStream.writeByte(a.c);
            final int size = a.a.size();
            dataOutputStream.writeShort(size);
            for (int j = 0; j < size; ++j) {
                dataOutputStream.writeShort((int)a.a.elementAt(j));
            }
            final byte[] byteArray = out.toByteArray();
            if (openRecordStore.getNumRecords() != 0) {
                openRecordStore.setRecord(1, byteArray, 0, byteArray.length);
            }
            else {
                openRecordStore.addRecord(byteArray, 0, byteArray.length);
            }
            openRecordStore.closeRecordStore();
            dataOutputStream.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static void b(final int i) {
        try {
            final RecordStore openRecordStore;
            if ((openRecordStore = RecordStore.openRecordStore("hs" + i, false)).getNumRecords() > 0) {
                final DataInputStream dataInputStream;
                a.b = (dataInputStream = new DataInputStream(new ByteArrayInputStream(openRecordStore.getRecord(1)))).readByte();
                a.c = dataInputStream.readByte();
                for (short short1 = dataInputStream.readShort(), n = 0; n < short1; ++n) {
                    a.a.addElement(new Integer(dataInputStream.readUnsignedShort()));
                }
                dataInputStream.close();
            }
            openRecordStore.closeRecordStore();
            System.gc();
        }
        catch (Exception ex) {}
    }
    
    private static long a(int n, int n2, int n3) {
        n = n;
        n2 = n2;
        n3 = n3;
        a.f[0] = (a.e[0] = (a.L = 0));
        do {
            final byte b;
            if ((b = a.a[n]) > 0) {
                ++a.L;
                a.e[a.L] = 0;
                a.f[a.L] = b;
                ++n2;
            }
            else {
                ++n2;
                n3 -= b * a.I;
                final int[] e = a.e;
                final int l = a.L;
                ++e[l];
            }
            if (a.e[a.L] == a.f[a.L]) {
                while (--a.L > 0 && a.e[a.L] + 1 >= a.f[a.L]) {}
                final int[] e2 = a.e;
                final int i = a.L;
                ++e2[i];
            }
            ++n;
        } while (a.L != 0);
        return (long)n3 << 32 | (long)n << 16 | (long)n2;
    }
    
    private static int a() {
        final byte b;
        if ((b = a.a[a.G]) > 0) {
            return b;
        }
        return -b;
    }
    
    private static int b(int n) {
        if ((n = ((a.a < 5) ? a.a[a.c[a.B][n]] : 0)) >= 0) {
            return n;
        }
        return -n;
    }
    
    private static int b() {
        int n = 0;
        switch (a.d) {
            case 1: {
                n = 6;
                break;
            }
            case 2: {
                n = a.g[a.B + 2];
                break;
            }
            case 5: {
                n = 0;
                break;
            }
            case 3: {
                n = 9;
                break;
            }
            case 7: {
                n = 10;
                break;
            }
            default: {
                n = a.g[a.B];
                break;
            }
        }
        return n;
    }
    
    private static void m() {
        a.K = 0;
        int n = 0;
        switch (a.a) {
            case 9: {
                n = (b.f - 5 >> 1) - 5;
                break;
            }
            case 6: {
                n = b.f - a.a.b - (5 + a.x) - 30;
                break;
            }
            case 4:
            case 5: {
                n = b.f - (5 + a.x) - 30;
                break;
            }
            case 3: {
                n = b.f - a.x - 5 - 2 - (15 + a.y + a.f + 5);
                break;
            }
            case 0: {
                n = b.f - (5 + a.x) - (a.j[1] << 1);
                break;
            }
            case 10: {
                n = b.f - 5 - a.x - 40;
                break;
            }
            default: {
                n = b.f - a.x - 5 - (15 + a.f + 5);
                break;
            }
        }
        final int n2 = n;
        if (a.d == 3) {
            a.b = new String[a.h][][];
            for (int i = 0; i < a.h; ++i) {
                a.b[i] = a(a.a[a.a[a.b[i]]], a.a, n2);
                a.K = Math.max(a.K, a.E);
            }
            return;
        }
        if (a.d == 7) {
            final String[][] a = a(a.a, a.a, n2);
            a.a = null;
            a.a = new String[a.length][1][1];
            for (int j = 0; j < a.a.length; ++j) {
                a.a[j][0][0] = a[j][0];
            }
            a.K = a.E;
            return;
        }
        if (a.d == 1) {
            final int min;
            final int[] array = new int[min = Math.min(4, a.k)];
            for (int k = 1; k < min; ++k) {
                array[k] = -1;
            }
            array[0] = a.c[a.j];
            final int n3 = (a.n + a.I - a.m) / a.I;
            for (int l = 1; l < min; ++l) {
                int a2;
                do {
                    a2 = a(0, n3 - 1);
                } while (a(array, l + 1, a2));
                array[l] = a2;
            }
            a.l = a(0, min - 1);
            array[0] = array[a.l];
            array[a.l] = a.c[a.j];
            ++a.l;
            a.a = new String[min + 1][][];
            a.d = a.c;
            for (int n4 = 0; n4 < min; ++n4) {
                final int n5 = a.m + array[n4] * a.I;
                a.a[n4 + 1] = a(a(n5 + a.c), a.a, n2);
                a.K = Math.max(a.K, a.E);
                if (a.l == n4 + 1) {
                    a.a[0] = a(a(n5 + a.b), a.a, n2);
                    a.K = Math.max(a.K, a.E);
                }
            }
            a.d = a.b;
            return;
        }
        if (a.d == 2) {
            if (a.a == 4) {
                final int size;
                a.a = new String[size = a.a.size()][][];
                a.c[a.B] = new int[size];
                a.d[a.B] = new int[size];
                a.e[a.B] = new int[size];
                a.d = a.c;
                for (int index = 0; index < size; ++index) {
                    final int intValue = a.a.elementAt(index);
                    a.a[index] = a(a(intValue + a.b), a.a, n2);
                    a.K = Math.max(a.K, a.E);
                    a.e[a.B][index] = intValue;
                }
                a.d = a.b;
                return;
            }
            if (a.a == 5) {
                a.a = new String[2][][];
                a.d = a.c;
                for (int n6 = 0; n6 < 2; ++n6) {
                    a.a[n6] = a(a(a.H + ((n6 == 0) ? a.b : a.c)), a.a, n2);
                    a.K = Math.max(a.K, a.E);
                }
                a.d = a.b;
            }
        }
        else {
            if (a.d == 5) {
                String s2;
                if (a.c) {
                    final String appProperty = Main.a.getAppProperty("MIDlet-Version");
                    final String s = "1.0";
                    s2 = a("/res/about", a.b);
                    final int index2;
                    if (appProperty != null && !appProperty.equals(s) && (index2 = s2.indexOf(s)) != -1) {
                        s2 = s2.substring(0, index2) + appProperty + s2.substring(index2 + s.length());
                    }
                }
                else {
                    s2 = a("/res/help", a.b);
                }
                final String[][] a3;
                a.a = new String[(a3 = a(s2, a.a, n2)).length][1][1];
                for (int n7 = 0; n7 < a.a.length; ++n7) {
                    a.a[n7][0][0] = a3[n7][0];
                }
                a.K = a.E;
                return;
            }
            if (a.a < 4) {
                a.e = a(a.b, a.b[a.F]);
                final int a4;
                a.a = new String[a4 = a()][][];
                a.c[a.B] = new int[a4];
                a.d[a.B] = new int[a4];
                a.e[a.B] = new int[a4];
                int n8 = a.G + 1;
                int n9 = a.F + 1;
                int h = a.H;
                final c c = (a.B == 0) ? a.d : a.a;
                for (int n10 = 0; n10 < a4; ++n10) {
                    a.a[n10] = a(a.b[n9], c, n2);
                    a.K = Math.max(a.K, a.E);
                    a.c[a.B][n10] = n8;
                    a.d[a.B][n10] = n9;
                    a.e[a.B][n10] = h;
                    final long a5;
                    h = (int)((a5 = a(n8, n9, h)) >> 32);
                    n8 = (int)(a5 >> 16 & 0xFFFFL);
                    n9 = (int)(a5 & 0xFFFFL);
                }
                return;
            }
            if (a.a == 4) {
                final byte b = (byte)(-a.a[a.G]);
                final int m = a.I;
                a.a = new String[b][][];
                a.c[a.B] = new int[b];
                a.d[a.B] = new int[b];
                a.e[a.B] = new int[b];
                a.d = a.c;
                byte b2 = 0;
                for (int n11 = a.H + a.b; b2 < b; ++b2, n11 += m) {
                    a.a[b2] = a(a(n11), a.a, n2);
                    a.K = Math.max(a.K, a.E);
                    a.e[a.B][b2] = a.H;
                }
                a.d = a.b;
                return;
            }
            a.a = new String[2][][];
            a.d = a.c;
            int n12 = 0;
            final int n13 = a.H + a.z * a.I;
            while (n12 < 2) {
                a.a[n12] = a(a(n13 + ((n12 == 0) ? a.b : a.c)), a.a, n2);
                a.K = Math.max(a.K, a.E);
                ++n12;
            }
            a.d = a.b;
        }
    }
    
    private static void n() {
        a.z = a.b[a.B][0];
        a.C = a.b[a.B][1];
        a.D = a.b[a.B][2];
        a.K = a.b[a.B][3];
        a.H = a.b[a.B][4];
        a.G = a.b[a.B][5];
        a.F = a.b[a.B][6];
        a.a = a.a[a.B];
        a.e = a.b[a.B];
        a.t = ((a.d == 5 || a.d == 7) ? 0 : 5);
        if (--a.B <= 0) {
            a.B = 0;
            a.d = 0;
        }
        a.f = a.w;
        (a.a = b())[2] = new int[a.a.length][4];
        a.ab = 4;
        a.d = true;
    }
    
    private static void a(final int n, final boolean b) {
        ++a.B;
        a.b[a.B][0] = a.z;
        a.b[a.B][1] = a.C;
        a.b[a.B][2] = a.D;
        a.b[a.B][3] = a.K;
        a.b[a.B][4] = a.H;
        a.b[a.B][5] = a.G;
        a.b[a.B][6] = a.F;
        a.b[a.B][7] = a.d;
        a.a[a.B] = a.a;
        a.b[a.B] = a.e;
        a.t = ((a.d == 5 || a.d == 7) ? 0 : 5);
        if (a.B != 0 && a.d != 3 && a.d != 1 && a.d != 5 && a.d != 7) {
            a.G = a.c[a.B - 1][n];
            a.F = a.d[a.B - 1][n];
            a.H = a.e[a.B - 1][n];
        }
        a.f = a.w;
        a.a = b();
        m();
        if (b) {
            i();
        }
        a.a[2] = new int[(a.d == 3) ? a.b.length : a.a.length][4];
        b(1, 1, -1, -1, -1, -1);
        a.ab = 4;
        a.d = true;
    }
    
    private static boolean a(final int n, final boolean b) {
        final int n2 = a.b[a.B][0];
        return n > n2 && n <= n2 + a();
    }
    
    private static int[] a(final int[] array, final int[] array2, final int n) {
        final int[] array3 = new int[array.length + array2.length];
        System.arraycopy(array, 0, array3, 0, n + 1);
        System.arraycopy(array2, 0, array3, n + 1, array2.length);
        System.arraycopy(array, n + 1, array3, n + 1 + array2.length, array.length - n - 1);
        return array3;
    }
    
    private static short[] a(final int i) {
        int n = a.M - a.c.length;
        if (i >= a.M || i < n) {
            int n2;
            for (n2 = 0; i >= a.h[n2]; ++n2) {}
            c(n2);
            n = (a.M = a.h[n2]) - a.c.length;
            if (a.d != a.b) {
                a.d = a.c;
            }
        }
        return a.c[i - n];
    }
    
    private static void c(final int i) {
        try {
            final DataInputStream dataInputStream;
            final short short1;
            a.c = new short[short1 = (dataInputStream = new DataInputStream(new d("/res/article" + i))).readShort()][];
            for (short n = 0; n < short1; ++n) {
                final byte byte1 = dataInputStream.readByte();
                a.c[n] = new short[byte1];
                for (byte b = 0; b < byte1; ++b) {
                    a.c[n][b] = dataInputStream.readShort();
                }
            }
            final short short2;
            a.c = new String[short2 = dataInputStream.readShort()];
            for (short n2 = 0; n2 < short2; ++n2) {
                a.c[n2] = dataInputStream.readUTF();
            }
            dataInputStream.close();
            System.gc();
        }
        catch (Exception ex) {}
    }
    
    private static String[] a(final String[] array, final short[] array2) {
        final String[] array3 = new String[array2.length];
        for (int i = 0; i < array3.length; ++i) {
            array3[i] = array[array2[i]];
        }
        return array3;
    }
    
    private static String a(final String[][] array) {
        String string = "";
        final int n = array.length - 1;
        for (int i = 0; i < n; ++i) {
            string = string + a(array[i]) + " ";
        }
        return string + a(array[n]);
    }
    
    private static String a(final String[] array) {
        String string = "";
        final int n = array.length - 1;
        for (int i = 0; i < n; ++i) {
            string = string + array[i] + " ";
        }
        return string + array[n];
    }
    
    private static boolean a(final int[] array, final int n, final int n2) {
        boolean b = false;
        for (int i = 0; i < n; ++i) {
            if (array[i] == n2) {
                b = true;
                break;
            }
        }
        return b;
    }
    
    private static void a(final int n, final int n2, final int n3, final int n4, int n5, int n6) {
        final int n7 = 65536 / n4;
        final int n8 = n5 & 0xFF0000;
        final int n9 = n5 & 0xFF00;
        n5 &= 0xFF;
        final int n10 = ((n6 & 0xFF0000) - n8 >> 16) * n7;
        final int n11 = ((n6 & 0xFF00) - n9 >> 8) * n7;
        n6 = ((n6 & 0xFF) - n5) * n7;
        int n12 = n2;
        for (int i = 0; i < n4; ++i) {
            b.a.setColor((n8 + n10 * i & 0xFF0000) | (n9 + (n11 * i >> 8) & 0xFF00) | (n5 + (n6 * i >> 16) & 0xFF));
            b.a.fillRect(n, n12, n3, 1);
            ++n12;
        }
        b.a.fillRect(n, n12, n3, n2 + n4 - n12);
    }
    
    private static void o() {
        if (Main.a - a.a > a.c) {
            a.a = Main.a + a.c;
            a.N = ((a.N == 0) ? 1 : 0);
            final int n = (b.f - (5 + a.x) - 2) / a.k - 2;
            final int n2 = a.r - 8;
            final int n3 = 5 + (b.f - 5 - a.x + 2 - (n + 2) * a.k >> 1);
            final int n4 = a.j[0] + a.a.a + 4;
            final int n5 = (a.d[a.O] == 1) ? 65280 : 16711680;
            a(n3 + (n + 2) * a.O, n4, n, n2, (a.N == 0) ? 16777215 : n5, (a.N == 0) ? n5 : 16777215);
        }
    }
    
    private static void p() {
        m();
        i();
        w();
    }
    
    private static void q() {
        final int z = a.z;
        f();
        final int[] array = new int[a.B + 1];
        for (int i = 0; i < array.length; ++i) {
            array[i] = a.b[i][0];
        }
        a.B = -1;
        a.F = (a.G = (a.H = 0));
        for (int j = 0; j < array.length - 1; ++j) {
            a.z = array[j];
            u();
            a(a.z, true);
        }
        a.z = array[array.length - 1];
        k();
        a.z = z;
        u();
        final int n2;
        final int n = (n2 = (a.p = a.K + 5 + a.y)) - a.b[a.B][3] - 2;
        a.p = n2 + ((n < 0) ? (-n + 2) : 0);
    }
    
    private static void a(final c c) {
        final Vector vector = new Vector<Integer>();
        final Vector vector2 = new Vector<Integer>();
        final int[] array = a.a[a.b];
        for (int i = 0; i < array.length; ++i) {
            final Integer n = new Integer(array[i]);
            if (!vector.contains(n)) {
                vector.addElement(n);
            }
        }
        final int[] array2 = a.a[a.c];
        for (int j = 0; j < array2.length; ++j) {
            final Integer n2 = new Integer(array2[j]);
            if (!vector.contains(n2)) {
                vector.addElement(n2);
            }
        }
        for (int k = 2; k < c.a.length; ++k) {
            if (c.a[k] != null && !a(vector2, k) && !a(vector, k)) {
                vector2.addElement(new Integer(k));
            }
        }
        final int[] array3 = new int[vector.size()];
        for (int l = 0; l < array3.length; ++l) {
            array3[l] = vector.elementAt(l);
        }
        final int[] array4 = new int[vector2.size()];
        for (int index = 0; index < array4.length; ++index) {
            array4[index] = vector2.elementAt(index);
        }
        c.a(array3, array4);
        if (c.a[0] == null) {
            c.a[0] = a(c.a + 0);
            c.a[1] = a(c.a + 1);
        }
    }
    
    private static boolean a(final Vector vector, final int n) {
        int size = vector.size();
        while (--size >= 0) {
            if (vector.elementAt(size) == n) {
                return true;
            }
        }
        return false;
    }
    
    private static String a(String s, int endIndex) {
        String s2 = "";
        try {
            final DataInputStream dataInputStream = new DataInputStream(new d(s));
            for (int i = 0; i <= endIndex; ++i) {
                s2 = dataInputStream.readUTF();
            }
            dataInputStream.close();
        }
        catch (Exception ex) {}
        if (a.v != -1) {
            s = "\n";
            int beginIndex = 0;
            endIndex = s2.indexOf(s);
            for (int j = 0; j < a.v; ++j) {
                beginIndex = endIndex;
                endIndex = s2.indexOf(s, beginIndex + 1);
            }
            s2 = s2.substring(beginIndex, endIndex);
        }
        System.gc();
        return s2;
    }
    
    private static void b(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        a.a[n][n2][0] = n3;
        a.a[n][n2][1] = n4;
        a.a[n][n2][2] = n3 + n5;
        a.a[n][n2][3] = n4 + n6;
    }
    
    private static boolean a(final int n, final int n2) {
        final int[] array = a.a[n][n2];
        return b.i >= array[0] && b.i <= array[2] && b.j >= array[1] && b.j <= array[3];
    }
    
    private static int a(final int n, final int n2, final int n3) {
        if (a.a == 0 || a.a == 10) {
            return n2 + (n3 - 20) * n / a.u;
        }
        return n2 + (n3 - 20) * a.C / (a.D - a(n));
    }
    
    private static int a(final Hashtable hashtable, final String key, final int n) {
        final String s;
        if ((s = hashtable.get(key)) != null) {
            return Integer.parseInt(s);
        }
        return n;
    }
    
    private static void a(final String s) {
        a.a = new Hashtable();
        try {
            final DataInputStream dataInputStream = new DataInputStream(new d(s));
            String utf;
            while ((utf = dataInputStream.readUTF()) != null) {
                final Hashtable a = a.a;
                final String s2 = utf;
                final Hashtable hashtable = a;
                final int index;
                if ((index = s2.indexOf(":")) > 0 && index < s2.length() - 1) {
                    hashtable.put(s2.substring(0, index).trim(), s2.substring(index + 1).trim());
                }
            }
            dataInputStream.close();
        }
        catch (Exception ex) {}
        b.a = a(a.a, "ls1", b.a);
        b.b = a(a.a, "ls2", b.b);
        b.c = a(a.a, "rs1", b.c);
        b.d = a(a.a, "rs2", b.d);
        a.x = 5;
        if (a(a.a, "USE_CL", 0) == 1) {
            b.a = (a(a.a, "SKI", 0) == 1);
            Main.a.b();
        }
    }
    
    private static void r() {
        try {
            final String property;
            if ((property = System.getProperty("microedition.locale")) != null && property.length() >= 2) {
                final String substring = property.substring(0, 2);
                for (int i = 0; i < a.a.length; ++i) {
                    if (substring.equals(a.a[i])) {
                        a.c = (((a.b = i) == 0) ? 1 : 0);
                        return;
                    }
                }
            }
        }
        catch (Exception ex) {}
    }
    
    private static void s() {
        if (a.a.size() > 0) {
            a.d = 2;
            a(0, true);
            a.z = 0;
            return;
        }
        a.d = 5;
        a.v = 9;
        a(0, true);
        a.z = 0;
        a.u = -1;
    }
    
    private static void t() {
        a.d = 6;
        a.e = -1L;
        a.R = a.b[11].getHeight();
        a.S = 3 * (a.R >> 1);
        a.T = a.R / 3;
    }
    
    static void e() {
        a.d = true;
    }
    
    private static void u() {
        a.C = 0;
        for (int i = 0; i < a.z; ++i) {
            a.C += a(i) + a.t;
        }
    }
    
    private static void v() {
        a.d = a.b[a.B - 1][7];
        n();
        switch (a.V) {
            case 2: {}
            case 0: {
                if (++a.j < a.k) {
                    a.d = 1;
                    p();
                    return;
                }
                a.d = a.b[a.B - 1][7];
                n();
            }
            case 1: {
                a.d = a.b[a.B - 1][7];
                n();
                break;
            }
        }
    }
    
    private static void a(final boolean v, final boolean b) {
        a.d = 7;
        a.V = (v ? 1 : 0);
        final String string = a(a.a[2]) + ":\n" + a.o + "/" + a.k;
        StringBuffer sb;
        String str;
        if (a.o == a.k) {
            sb = new StringBuffer().append(a(a.a[3])).append("!!!\n");
            str = string;
        }
        else {
            sb = new StringBuffer().append(b ? "" : (a(a.a[4]) + ":\n" + a(a.a[a.l]) + "\n"));
            str = (v ? string : "");
        }
        a.a = sb.append(str).toString();
        a.U = ((a.o == a.k) ? 683801 : 16711680);
        a(0, true);
        a.z = 0;
        a.u = -1;
        a.a = -1L;
        a.O = a.j;
    }
    
    private static int a(final boolean b) {
        int z = a.z;
        final int n = a.Z + a.W;
        if (b) {
            if (n + a.aa > a.Y) {
                a.W -= 10;
            }
            else {
                ++z;
            }
            if (a.a == 6 && a.f && a.z == 0) {
                z = (a.z = 2);
                a.C += a(0) + a(1) + (a.t << 1);
            }
        }
        else {
            if (a.z != 0 || n <= a.X) {
                if (n < a.X) {
                    a.W += 10;
                }
                else {
                    --z;
                }
            }
            if (a.a == 6 && a.z == 2 && z == 1 && n - a.t - a(0) > a.X) {
                z = (a.z = 0);
                a.C -= a(0) + a(1) + (a.t << 1);
            }
        }
        return z;
    }
    
    private static void w() {
        a.z = 0;
        a.f = (a.j[0] + a.a.a + a.r + 5 + a(0) + a.t + a(1) < b.g - a.r - a.j[1]);
    }
    
    private static void x() {
        ++a.ac;
        Main.a.a();
    }
    
    private static int c() {
        String string;
        try {
            final String property;
            string = (((property = System.getProperty("microedition.platform")) != null) ? property : "");
            final int[] array = { 16, 0, 8 };
            for (int i = 0; i < array.length; ++i) {
                final Font font;
                if ((font = Font.getFont(0, (int)((i == 1) ? 1 : 0), array[i])) != null) {
                    string = string + font.stringWidth(string) + new Integer(font.getHeight()).toString() + new Integer(font.getBaselinePosition()).toString();
                }
            }
        }
        catch (Exception ex) {
            string = "error";
        }
        if (a.k == null) {
            a.k = new int[256];
            for (int j = 0; j < a.k.length; ++j) {
                int n = j;
                for (int k = 0; k < 8; ++k) {
                    if ((n & 0x1) != 0x0) {
                        n = (0xEDB88320 ^ n >>> 1);
                    }
                    else {
                        n >>>= 1;
                    }
                }
                a.k[j] = n;
            }
        }
        int n2 = -1;
        for (int length = string.length(), l = 0; l < length; ++l) {
            n2 = (a.k[(n2 ^ string.charAt(l)) & 0xFF] ^ n2 >>> 8);
        }
        return ~n2;
    }
    
    static {
        a.b = false;
        a.a = 0;
        a.d = -100;
        a.e = 10;
        a.a = new c();
        a.b = new c();
        a.c = new c();
        a.d = new c();
        a.a = new int[] { 5, 6, 7, 8, 9 };
        a.d = true;
        a.B = -1;
        a.C = 0;
        a.D = 0;
        a.L = 0;
        a.g = new int[] { -100, 2, 3, 4, 5, -1 };
        a.i = new int[] { 13092807, 16777215, 16777215, 8847178, 16777215, 16332342 };
        a.c = 100L;
        a.d = 1024L;
        a.W = 0;
        a.ac = 0;
    }
}
