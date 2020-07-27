import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

// 
// Decompiled by Procyon v0.5.36
// 

public class g implements Runnable
{
    private static final Integer a;
    private static final Integer b;
    private Object a;
    private e a;
    private final String a;
    
    public g(final e a, final String a2) {
        this.a = a;
        this.a = a2;
        this.a = new f(a, a2);
    }
    
    public void a() {
        final Display display = Display.getDisplay((MIDlet)this.a.a);
        if (display.getCurrent() != this.a) {
            display.setCurrent((Displayable)this.a);
        }
    }
    
    public void run() {
    }
    
    public void a(final String s) {
        ((f)this.a).a(s);
    }
    
    public void a(final int n, final String s) {
        ((f)this.a).a(n, s);
    }
    
    public void a(final int n) {
        ((f)this.a).a(n);
    }
    
    static {
        a = new Integer(1);
        b = new Integer(2);
    }
}
