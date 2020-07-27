import java.io.InputStream;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

// 
// Decompiled by Procyon v0.5.36
// 

public class Main extends MIDlet implements Runnable
{
    public static boolean a;
    static Main a;
    public static b a;
    private static Thread a;
    public static long a;
    
    public Main() {
        Main.a = this;
        Main.a = new b();
        (Main.a = new Thread(this)).start();
    }
    
    public void startApp() {
        e.a(this);
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)Main.a);
        Main.a = true;
    }
    
    public static final InputStream a(final String name) {
        return Main.a.getClass().getResourceAsStream(name);
    }
    
    public void pauseApp() {
        a.d();
    }
    
    public void destroyApp(final boolean b) {
    }
    
    public void run() {
        while (!Main.a) {
            Thread.yield();
        }
        try {
            while (b.a == null) {
                Main.a.a();
            }
            try {
                a.a();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            while (Main.a) {
                a.c();
                Thread.yield();
                Main.a.a();
                final long n;
                if ((n = 40L - (System.currentTimeMillis() - Main.a)) > 0L) {
                    try {
                        Thread.sleep(n);
                    }
                    catch (Exception ex3) {}
                }
                Main.a = System.currentTimeMillis();
            }
        }
        catch (Exception ex2) {
            ex2.printStackTrace();
        }
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)null);
        Main.a = null;
        System.gc();
        this.notifyDestroyed();
    }
    
    public static final void a(final long n) {
        try {
            Thread.sleep(n);
        }
        catch (InterruptedException ex) {}
    }
    
    static {
        Main.a = 0L;
    }
}
