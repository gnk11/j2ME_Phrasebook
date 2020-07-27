import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

final class c
{
    int[] a;
    int[] b;
    Image[] a;
    int a;
    int b;
    String a;
    private static int c;
    
    final void a(final DataInputStream dataInputStream) {
        final byte byte1 = dataInputStream.readByte();
        this.b = new int[byte1];
        this.a = new Image[byte1];
        for (byte b = 0; b < byte1; ++b) {
            this.b[b] = dataInputStream.readByte();
        }
        this.b = dataInputStream.readByte();
        this.a = new int[dataInputStream.readShort()];
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = dataInputStream.readInt();
        }
    }
    
    final void a(final int[] array, final int[] array2) {
        if (array2 != null) {
            for (int i = 0; i < array2.length; ++i) {
                this.a[array2[i]] = null;
            }
        }
        if (array != null) {
            for (int j = 0; j < array.length; ++j) {
                final int k = array[j];
                if (this.a[k] == null) {
                    this.a[k] = a.a(this.a + k);
                }
            }
            this.a = this.a[array[0]].getHeight();
        }
        System.gc();
    }
    
    private int b(final char c) {
        int n = 0;
        int n2 = this.a.length - 1;
        if ((this.a[n2] & 0xFFFF) == c) {
            n = n2;
        }
        while (n2 - n > 1) {
            final int n3 = n2 + n >> 1;
            final int n4;
            if ((n4 = (this.a[n3] & 0xFFFF)) > c) {
                n2 = n3;
            }
            else if (n4 < c) {
                n = n3;
            }
            else {
                n2 = (n = n3);
            }
        }
        final int c2 = n;
        final int n5 = this.a[c2] >> 16 & 0x7FF;
        final int n6 = this.a[c2 - 1] >> 16 & 0x7FF;
        c.c = c2;
        final int n7;
        if ((n7 = n5 - n6) > 0) {
            return n7;
        }
        return n5;
    }
    
    public final int a(final char c) {
        if (c == ' ') {
            return this.b;
        }
        return this.b(c) + this.b[this.a[c.c] >> 27];
    }
    
    public final int a(final String s) {
        int n = 0;
        int length = s.length();
        while (--length >= 0) {
            n += this.a(s.charAt(length));
        }
        return n;
    }
    
    public final int a(final String[] array) {
        int n = 0;
        int n3;
        final int n2 = n3 = array.length - 1;
        while (--n3 >= 0) {
            n += this.a(array[n3]) + this.b;
        }
        return n + this.a(array[n2]);
    }
    
    final void a(final String[] array, int n, int n2, int n3) {
        final int clipX = b.a.getClipX();
        final int clipY = b.a.getClipY();
        final int clipWidth = b.a.getClipWidth();
        final int clipHeight = b.a.getClipHeight();
        if ((n3 & 0x9) != 0x0) {
            final int a = this.a(array);
            n -= (((n3 & 0x1) != 0x0) ? (a >> 1) : a);
        }
        if ((n3 & 0x22) != 0x0) {
            n2 -= (((n3 & 0x2) != 0x0) ? (this.a >> 1) : this.a);
        }
        for (int i = 0; i < array.length; ++i) {
            final String s;
            if (!(s = array[i]).equals("")) {
                for (int length = s.length(), j = 0; j < length; ++j) {
                    if ((n3 = s.charAt(j)) == 32) {
                        n += this.b;
                    }
                    else {
                        n3 = this.b((char)n3);
                        final int n5;
                        final int n4 = ((n5 = this.a[c.c]) >> 16 & 0x7FF) - n3;
                        final int n6 = n5 >> 27;
                        b.a.clipRect(n, n2, n3, this.a);
                        b.a.drawImage(this.a[n6], n - n4, n2, 20);
                        b.a.setClip(clipX, clipY, clipWidth, clipHeight);
                        n += n3 + this.b[n6];
                    }
                }
                n += this.b;
            }
        }
    }
}
