import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public final class d extends InputStream
{
    private static byte[] a;
    private static int a;
    private static int b;
    private static InputStream a;
    
    private d(final InputStream a) {
        if (d.a == null) {
            d.a = new byte[1024];
        }
        d.a = a;
        d.a = 0;
        d.b = 0;
    }
    
    public d(final String s) {
        this(Main.a(s));
    }
    
    public final int read() {
        if (d.a == d.b) {
            d.a = 0;
            d.b = d.a.read(d.a);
        }
        if (d.b != -1) {
            return d.a[d.a++] & 0xFF;
        }
        return -1;
    }
    
    public final int read(final byte[] b, final int n, final int n2) {
        final int n3 = d.b - d.a;
        if (n2 > n3) {
            System.arraycopy(d.a, d.a, b, n, n3);
            d.a = 0;
            d.b = 0;
            return n3 + d.a.read(b, n + n3, n2 - n3);
        }
        System.arraycopy(d.a, d.a, b, n, n2);
        d.a += n2;
        return n2;
    }
    
    public final int read(final byte[] array) {
        return this.read(array, 0, array.length);
    }
    
    public final void close() {
        d.a.close();
    }
}
