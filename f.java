import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Ticker;
import java.io.IOException;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.game.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public class f extends GameCanvas
{
    private e a;
    private Font a;
    private String a;
    private String[] a;
    private String b;
    private Image a;
    private int a;
    private int b;
    private final String[] b;
    private int c;
    private int d;
    
    public f(final e a, final String b) {
        super(false);
        this.a = Font.getDefaultFont();
        this.a = "";
        this.a = new String[0];
        this.b = new String[2];
        this.setFullScreenMode(true);
        this.a = a;
        this.b = b;
        if (h.a != null && h.a.length() > 0) {
            try {
                this.a = Image.createImage(this.getClass().getResourceAsStream(h.a));
            }
            catch (IOException ex) {}
        }
        this.sizeChanged(this.getWidth(), this.getHeight());
    }
    
    protected void sizeChanged(final int c, final int d) {
        super.sizeChanged(c, d);
        this.c = c;
        this.d = d;
        this.a = 0;
        this.b = this.d / this.a.getHeight() - 2;
        if (this.a == null) {
            --this.b;
        }
        this.a(this.a);
        this.b();
    }
    
    public void a(final int n, final String s) {
        this.b[n] = s;
        this.b();
    }
    
    public void a(final int n) {
        this.b[n] = null;
        this.b();
    }
    
    public void a(String a) {
        if (a == null) {
            a = "text is null!";
        }
        this.a = a;
        this.a = this.a(a, this.c - 2);
        this.a = 0;
        this.b();
    }
    
    public void setTicker(final Ticker ticker) {
        if (this.a == null) {
            super.setTicker(ticker);
        }
    }
    
    private void b() {
        this.a();
        this.flushGraphics();
    }
    
    protected void a() {
        final Graphics graphics = this.getGraphics();
        graphics.setFont(this.a);
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, this.c, this.d);
        if (this.a.length == 0 && this.a != null) {
            graphics.drawImage(this.a, this.c / 2, this.d / 2, 3);
            return;
        }
        graphics.setColor(0);
        int n = 0;
        if (this.b != null && this.b.trim().length() > 0) {
            graphics.drawString(this.b, this.c / 2, n, 17);
            n += this.a.getHeight();
            graphics.drawLine(0, n, this.c, n);
        }
        for (int i = this.a; i < this.a.length; ++i) {
            graphics.drawString(this.a[i], this.c / 2, n, 17);
            n += this.a.getHeight() + 1;
        }
        final int n2 = this.d - this.a.getHeight();
        graphics.setColor(16777215);
        graphics.fillRect(0, n2, this.c, this.a.getHeight());
        graphics.setColor(0);
        graphics.drawLine(0, n2, this.c, n2);
        if (this.b[0] != null) {
            graphics.drawString(this.b[0], 1, n2, 20);
        }
        if (this.b[1] != null) {
            graphics.drawString(this.b[1], this.c, n2, 24);
        }
    }
    
    protected void keyPressed(final int n) {
        if ((n == -6 || n == 0) && this.b[0] != null) {
            this.a.a(0);
            this.b();
            return;
        }
        if ((n == -7 || n == 0) && this.b[1] != null) {
            this.a.a(1);
            this.b();
            return;
        }
        int gameAction = 0;
        try {
            gameAction = this.getGameAction(n);
        }
        catch (Exception ex) {}
        if (n == 53 || gameAction == 8) {
            if (this.b[0] != null) {
                this.a.a(0);
            }
            else if (this.b[1] != null) {
                this.a.a(1);
            }
            this.b();
            return;
        }
        if ((n == 50 || gameAction == 1) && this.a > 0) {
            --this.a;
            this.b();
        }
        if ((n == 56 || gameAction == 6) && this.a < this.a.length - this.b) {
            ++this.a;
            this.b();
        }
    }
    
    protected void pointerPressed(final int n, final int n2) {
        if (n2 > this.d - this.a.getHeight() * 2) {
            if (n < this.c / 3) {
                this.keyPressed(-6);
            }
            else if (n > this.c * 2 / 3) {
                this.keyPressed(-7);
            }
        }
    }
    
    private String[] a(String substring, final int n) {
        final Vector vector = new Vector<String>();
        while (substring.length() != 0) {
            int endIndex = substring.indexOf(10);
            if (endIndex == -1) {
                endIndex = substring.length();
            }
            String obj = substring.substring(0, endIndex);
            if (endIndex == substring.length()) {
                substring = "";
            }
            else {
                substring = substring.substring(endIndex + 1, substring.length());
            }
            int n2 = 0;
            int i = 0;
            int n3 = 0;
            while (i < obj.length()) {
                final char char1 = obj.charAt(i);
                n2 += this.a.charWidth(char1);
                if (char1 == ' ') {
                    n3 = i;
                }
                if (n2 > n) {
                    if (n3 == 0) {
                        n3 = i;
                    }
                    String obj2 = obj.substring(0, n3);
                    if (obj2.length() > 0 && obj2.charAt(0) == ' ') {
                        obj2 = obj2.substring(1, obj2.length());
                    }
                    vector.addElement(obj2);
                    obj = obj.substring(n3, obj.length());
                    i = 0;
                    n2 = 0;
                    n3 = 0;
                }
                else {
                    ++i;
                }
            }
            if (obj.length() > 0 && obj.charAt(0) == ' ') {
                obj = obj.substring(1, obj.length());
            }
            vector.addElement(obj);
        }
        final String[] anArray = new String[vector.size()];
        vector.copyInto(anArray);
        return anArray;
    }
}
