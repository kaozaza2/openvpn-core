package net.openvpn.openvpn;

import java.util.Iterator;
import java.util.RandomAccess;
import java.util.AbstractList;

public class ClientAPI_StringVec extends AbstractList<String> implements RandomAccess
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_StringVec() {
        this(ovpncliJNI.new_ClientAPI_StringVec__SWIG_0(), true);
    }
    
    public ClientAPI_StringVec(final int n, final String s) {
        this(ovpncliJNI.new_ClientAPI_StringVec__SWIG_2(n, s), true);
    }
    
    protected ClientAPI_StringVec(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    public ClientAPI_StringVec(final Iterable<String> iterable) {
        this();
        final Iterator<String> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.add(iterator.next());
        }
    }
    
    public ClientAPI_StringVec(final ClientAPI_StringVec clientAPI_StringVec) {
        this(ovpncliJNI.new_ClientAPI_StringVec__SWIG_1(getCPtr(clientAPI_StringVec), clientAPI_StringVec), true);
    }
    
    public ClientAPI_StringVec(final String[] array) {
        this();
        this.reserve(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.add(array[i]);
        }
    }
    
    private void doAdd(final int n, final String s) {
        ovpncliJNI.ClientAPI_StringVec_doAdd__SWIG_1(this.swigCPtr, this, n, s);
    }
    
    private void doAdd(final String s) {
        ovpncliJNI.ClientAPI_StringVec_doAdd__SWIG_0(this.swigCPtr, this, s);
    }
    
    private String doGet(final int n) {
        return ovpncliJNI.ClientAPI_StringVec_doGet(this.swigCPtr, this, n);
    }
    
    private String doRemove(final int n) {
        return ovpncliJNI.ClientAPI_StringVec_doRemove(this.swigCPtr, this, n);
    }
    
    private void doRemoveRange(final int n, final int n2) {
        ovpncliJNI.ClientAPI_StringVec_doRemoveRange(this.swigCPtr, this, n, n2);
    }
    
    private String doSet(final int n, final String s) {
        return ovpncliJNI.ClientAPI_StringVec_doSet(this.swigCPtr, this, n, s);
    }
    
    private int doSize() {
        return ovpncliJNI.ClientAPI_StringVec_doSize(this.swigCPtr, this);
    }
    
    protected static long getCPtr(final ClientAPI_StringVec clientAPI_StringVec) {
        long swigCPtr;
        if (clientAPI_StringVec == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_StringVec.swigCPtr;
        }
        return swigCPtr;
    }
    
    @Override
    public void add(final int n, final String s) {
        ++this.modCount;
        this.doAdd(n, s);
    }
    
    @Override
    public boolean add(final String s) {
        ++this.modCount;
        this.doAdd(s);
        return true;
    }
    
    public long capacity() {
        return ovpncliJNI.ClientAPI_StringVec_capacity(this.swigCPtr, this);
    }
    
    @Override
    public void clear() {
        ovpncliJNI.ClientAPI_StringVec_clear(this.swigCPtr, this);
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_StringVec(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    @Override
    public String get(final int n) {
        return this.doGet(n);
    }
    
    @Override
    public boolean isEmpty() {
        return ovpncliJNI.ClientAPI_StringVec_isEmpty(this.swigCPtr, this);
    }
    
    @Override
    public String remove(final int n) {
        ++this.modCount;
        return this.doRemove(n);
    }
    
    @Override
    protected void removeRange(final int n, final int n2) {
        ++this.modCount;
        this.doRemoveRange(n, n2);
    }
    
    public void reserve(final long n) {
        ovpncliJNI.ClientAPI_StringVec_reserve(this.swigCPtr, this, n);
    }
    
    @Override
    public String set(final int n, final String s) {
        return this.doSet(n, s);
    }
    
    @Override
    public int size() {
        return this.doSize();
    }
}
