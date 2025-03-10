package net.openvpn.openvpn;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ClientAPI_TransportStats {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ClientAPI_TransportStats(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ClientAPI_TransportStats obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(ClientAPI_TransportStats obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ovpncliJNI.delete_ClientAPI_TransportStats(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBytesIn(long value) {
    ovpncliJNI.ClientAPI_TransportStats_bytesIn_set(swigCPtr, this, value);
  }

  public long getBytesIn() {
    return ovpncliJNI.ClientAPI_TransportStats_bytesIn_get(swigCPtr, this);
  }

  public void setBytesOut(long value) {
    ovpncliJNI.ClientAPI_TransportStats_bytesOut_set(swigCPtr, this, value);
  }

  public long getBytesOut() {
    return ovpncliJNI.ClientAPI_TransportStats_bytesOut_get(swigCPtr, this);
  }

  public void setPacketsIn(long value) {
    ovpncliJNI.ClientAPI_TransportStats_packetsIn_set(swigCPtr, this, value);
  }

  public long getPacketsIn() {
    return ovpncliJNI.ClientAPI_TransportStats_packetsIn_get(swigCPtr, this);
  }

  public void setPacketsOut(long value) {
    ovpncliJNI.ClientAPI_TransportStats_packetsOut_set(swigCPtr, this, value);
  }

  public long getPacketsOut() {
    return ovpncliJNI.ClientAPI_TransportStats_packetsOut_get(swigCPtr, this);
  }

  public void setLastPacketReceived(int value) {
    ovpncliJNI.ClientAPI_TransportStats_lastPacketReceived_set(swigCPtr, this, value);
  }

  public int getLastPacketReceived() {
    return ovpncliJNI.ClientAPI_TransportStats_lastPacketReceived_get(swigCPtr, this);
  }

  public ClientAPI_TransportStats() {
    this(ovpncliJNI.new_ClientAPI_TransportStats(), true);
  }

}
