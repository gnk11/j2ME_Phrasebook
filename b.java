import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Canvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class b extends Canvas implements CommandListener
{
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    static boolean a;
    private static Command a;
    private static Command b;
    public static int f;
    public static int g;
    public static Graphics a;
    static int h;
    static int i;
    static int j;
    private static long a;
    private static int k;
    private static int l;
    
    public b() {
        this.setFullScreenMode(true);
    }
    
    public final void a() {
        this.repaint();
        this.serviceRepaints();
    }
    
    public final void paint(final Graphics a) {
        b.a = a;
        a.b();
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        final int commandType;
        if ((commandType = command.getCommandType()) == 4 || commandType == 1) {
            this.keyPressed((commandType == 4 ^ b.a) ? b.a : b.c);
        }
    }
    
    protected final void keyPressed(final int n) {
        if (n == b.a || n == b.b) {
            b.e = 10;
            return;
        }
        if (n == b.c || n == b.d) {
            b.e = 11;
            return;
        }
        switch (n) {
            case 49: {
                b.e = 14;
            }
            case 51: {
                b.e = 6;
            }
            case 53: {
                b.e = 9;
            }
            case 55: {
                b.e = 7;
            }
            case 57: {
                b.e = 8;
            }
            case 35: {
                b.e = 12;
            }
            case 42: {
                b.e = 13;
            }
            default: {
                int gameAction = -1;
                try {
                    gameAction = this.getGameAction(n);
                }
                catch (Exception ex) {}
                switch (gameAction) {
                    case 2: {
                        b.e = 1;
                    }
                    case 5: {
                        b.e = 2;
                    }
                    case 1: {
                        b.e = 3;
                    }
                    case 6: {
                        b.e = 4;
                    }
                    case 8: {
                        b.e = 9;
                        break;
                    }
                }
            }
        }
    }
    
    protected final void keyReleased(final int n) {
    }
    
    protected final void pointerPressed(final int k, final int l) {
        if (b.h == -1) {
            b.k = k;
            b.l = l;
            b.h = -1;
            b.a = Main.a;
            a.a = false;
        }
    }
    
    protected final void pointerReleased(final int n, final int n2) {
        if (Main.a - b.a < 300L) {
            b.i = b.k;
            b.j = b.l;
            b.h = 0;
            a.a = true;
            return;
        }
        b.h = -1;
    }
    
    protected final void pointerDragged(final int n, final int n2) {
        if (!a.a && Math.abs(n2 - b.l) > 5 && Main.a - b.a >= 300L) {
            b.k = n;
            b.i = n;
            b.l = n2;
            b.j = n2;
            b.h = 1;
            a.a = true;
        }
    }
    
    protected final void sizeChanged(final int f, final int g) {
        b.f = f;
        b.g = g;
        a.e();
    }
    
    public final void b() {
        ((Displayable)this).setCommandListener((CommandListener)this);
        ((Displayable)this).addCommand(b.a);
        ((Displayable)this).addCommand(b.b);
    }
    
    static {
        b.a = -6;
        b.b = 0;
        b.c = -7;
        b.d = 0;
        b.e = -1;
        b.a = new Command(" ", 4, 1);
        b.b = new Command(" ", 1, 2);
        b.h = -1;
        b.i = -1;
        b.j = -1;
    }
}
