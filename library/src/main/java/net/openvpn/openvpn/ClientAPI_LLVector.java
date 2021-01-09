package net.openvpn.openvpn;

import java.util.Iterator;
import java.util.RandomAccess;
import java.util.AbstractList;

public class ClientAPI_LLVector extends AbstractList<Long> implements RandomAccess
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_LLVector() {
        this(ovpncliJNI.new_ClientAPI_LLVector__SWIG_0(), true);
    }
    
    public ClientAPI_LLVector(final int n, final long n2) {
        this(ovpncliJNI.new_ClientAPI_LLVector__SWIG_2(n, n2), true);
    }
    
    protected ClientAPI_LLVector(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    public ClientAPI_LLVector(final Iterable<Long> iterable) {
        this();
        final Iterator<Long> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.add((long)iterator.next());
        }
    }
    
    public ClientAPI_LLVector(final ClientAPI_LLVector clientAPI_LLVector) {
        this(ovpncliJNI.new_ClientAPI_LLVector__SWIG_1(getCPtr(clientAPI_LLVector), clientAPI_LLVector), true);
    }
    
    public ClientAPI_LLVector(final long[] array) {
        this();
        this.reserve(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.add(array[i]);
        }
    }
    
    private void doAdd(final int n, final long n2) {
        ovpncliJNI.ClientAPI_LLVector_doAdd__SWIG_1(this.swigCPtr, this, n, n2);
    }
    
    private void doAdd(final long n) {
        ovpncliJNI.ClientAPI_LLVector_doAdd__SWIG_0(this.swigCPtr, this, n);
    }
    
    private long doGet(final int n) {
        return ovpncliJNI.ClientAPI_LLVector_doGet(this.swigCPtr, this, n);
    }
    
    private long doRemove(final int n) {
        return ovpncliJNI.ClientAPI_LLVector_doRemove(this.swigCPtr, this, n);
    }
    
    private void doRemoveRange(final int n, final int n2) {
        ovpncliJNI.ClientAPI_LLVector_doRemoveRange(this.swigCPtr, this, n, n2);
    }
    
    private long doSet(final int n, final long n2) {
        return ovpncliJNI.ClientAPI_LLVector_doSet(this.swigCPtr, this, n, n2);
    }
    
    private int doSize() {
        return ovpncliJNI.ClientAPI_LLVector_doSize(this.swigCPtr, this);
    }
    
    protected static long getCPtr(final ClientAPI_LLVector clientAPI_LLVector) {
        long swigCPtr;
        if (clientAPI_LLVector == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_LLVector.swigCPtr;
        }
        return swigCPtr;
    }
    
    @Override
    public void add(final int n, final Long n2) {
        ++this.modCount;
        this.doAdd(n, n2);
    }
    
    @Override
    public boolean add(final Long n) {
        ++this.modCount;
        this.doAdd(n);
        return true;
    }
    
    public long capacity() {
        return ovpncliJNI.ClientAPI_LLVector_capacity(this.swigCPtr, this);
    }
    
    @Override
    public void clear() {
        ovpncliJNI.ClientAPI_LLVector_clear(this.swigCPtr, this);
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_LLVector(this.swigCPtr);
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
    public Long get(final int n) {
        return this.doGet(n);
    }
    
    @Override
    public boolean isEmpty() {
        return ovpncliJNI.ClientAPI_LLVector_isEmpty(this.swigCPtr, this);
    }
    
    @Override
    public Long remove(final int n) {
        ++this.modCount;
        return this.doRemove(n);
    }
    
    @Override
    protected void removeRange(final int n, final int n2) {
        ++this.modCount;
        this.doRemoveRange(n, n2);
    }
    
    public void reserve(final long n) {
        ovpncliJNI.ClientAPI_LLVector_reserve(this.swigCPtr, this, n);
    }
    
    @Override
    public Long set(final int n, final Long n2) {
        return this.doSet(n, n2);
    }
    
    @Override
    public int size() {
        return this.doSize();
    }
}
