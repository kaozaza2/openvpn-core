package net.openvpn.openvpn;

import java.util.Iterator;
import java.util.RandomAccess;
import java.util.AbstractList;

public class ClientAPI_ServerEntryVector extends AbstractList<ClientAPI_ServerEntry> implements RandomAccess
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_ServerEntryVector() {
        this(ovpncliJNI.new_ClientAPI_ServerEntryVector__SWIG_0(), true);
    }
    
    public ClientAPI_ServerEntryVector(final int n, final ClientAPI_ServerEntry clientAPI_ServerEntry) {
        this(ovpncliJNI.new_ClientAPI_ServerEntryVector__SWIG_2(n, ClientAPI_ServerEntry.getCPtr(clientAPI_ServerEntry), clientAPI_ServerEntry), true);
    }
    
    protected ClientAPI_ServerEntryVector(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    public ClientAPI_ServerEntryVector(final Iterable<ClientAPI_ServerEntry> iterable) {
        this();
        final Iterator<ClientAPI_ServerEntry> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.add(iterator.next());
        }
    }
    
    public ClientAPI_ServerEntryVector(final ClientAPI_ServerEntryVector clientAPI_ServerEntryVector) {
        this(ovpncliJNI.new_ClientAPI_ServerEntryVector__SWIG_1(getCPtr(clientAPI_ServerEntryVector), clientAPI_ServerEntryVector), true);
    }
    
    public ClientAPI_ServerEntryVector(final ClientAPI_ServerEntry[] array) {
        this();
        this.reserve(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.add(array[i]);
        }
    }
    
    private void doAdd(final int n, final ClientAPI_ServerEntry clientAPI_ServerEntry) {
        ovpncliJNI.ClientAPI_ServerEntryVector_doAdd__SWIG_1(this.swigCPtr, this, n, ClientAPI_ServerEntry.getCPtr(clientAPI_ServerEntry), clientAPI_ServerEntry);
    }
    
    private void doAdd(final ClientAPI_ServerEntry clientAPI_ServerEntry) {
        ovpncliJNI.ClientAPI_ServerEntryVector_doAdd__SWIG_0(this.swigCPtr, this, ClientAPI_ServerEntry.getCPtr(clientAPI_ServerEntry), clientAPI_ServerEntry);
    }
    
    private ClientAPI_ServerEntry doGet(final int n) {
        return new ClientAPI_ServerEntry(ovpncliJNI.ClientAPI_ServerEntryVector_doGet(this.swigCPtr, this, n), false);
    }
    
    private ClientAPI_ServerEntry doRemove(final int n) {
        return new ClientAPI_ServerEntry(ovpncliJNI.ClientAPI_ServerEntryVector_doRemove(this.swigCPtr, this, n), true);
    }
    
    private void doRemoveRange(final int n, final int n2) {
        ovpncliJNI.ClientAPI_ServerEntryVector_doRemoveRange(this.swigCPtr, this, n, n2);
    }
    
    private ClientAPI_ServerEntry doSet(final int n, final ClientAPI_ServerEntry clientAPI_ServerEntry) {
        return new ClientAPI_ServerEntry(ovpncliJNI.ClientAPI_ServerEntryVector_doSet(this.swigCPtr, this, n, ClientAPI_ServerEntry.getCPtr(clientAPI_ServerEntry), clientAPI_ServerEntry), true);
    }
    
    private int doSize() {
        return ovpncliJNI.ClientAPI_ServerEntryVector_doSize(this.swigCPtr, this);
    }
    
    protected static long getCPtr(final ClientAPI_ServerEntryVector clientAPI_ServerEntryVector) {
        long swigCPtr;
        if (clientAPI_ServerEntryVector == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_ServerEntryVector.swigCPtr;
        }
        return swigCPtr;
    }
    
    @Override
    public void add(final int n, final ClientAPI_ServerEntry clientAPI_ServerEntry) {
        ++this.modCount;
        this.doAdd(n, clientAPI_ServerEntry);
    }
    
    @Override
    public boolean add(final ClientAPI_ServerEntry clientAPI_ServerEntry) {
        ++this.modCount;
        this.doAdd(clientAPI_ServerEntry);
        return true;
    }
    
    public long capacity() {
        return ovpncliJNI.ClientAPI_ServerEntryVector_capacity(this.swigCPtr, this);
    }
    
    @Override
    public void clear() {
        ovpncliJNI.ClientAPI_ServerEntryVector_clear(this.swigCPtr, this);
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_ServerEntryVector(this.swigCPtr);
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
    public ClientAPI_ServerEntry get(final int n) {
        return this.doGet(n);
    }
    
    @Override
    public boolean isEmpty() {
        return ovpncliJNI.ClientAPI_ServerEntryVector_isEmpty(this.swigCPtr, this);
    }
    
    @Override
    public ClientAPI_ServerEntry remove(final int n) {
        ++this.modCount;
        return this.doRemove(n);
    }
    
    @Override
    protected void removeRange(final int n, final int n2) {
        ++this.modCount;
        this.doRemoveRange(n, n2);
    }
    
    public void reserve(final long n) {
        ovpncliJNI.ClientAPI_ServerEntryVector_reserve(this.swigCPtr, this, n);
    }
    
    @Override
    public ClientAPI_ServerEntry set(final int n, final ClientAPI_ServerEntry clientAPI_ServerEntry) {
        return this.doSet(n, clientAPI_ServerEntry);
    }
    
    @Override
    public int size() {
        return this.doSize();
    }
}
