package net.openvpn.openvpn;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ClientAPI_AppCustomControlMessageEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ClientAPI_AppCustomControlMessageEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ClientAPI_AppCustomControlMessageEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(ClientAPI_AppCustomControlMessageEvent obj) {
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
        ovpncliJNI.delete_ClientAPI_AppCustomControlMessageEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProtocol(String value) {
    ovpncliJNI.ClientAPI_AppCustomControlMessageEvent_protocol_set(swigCPtr, this, value);
  }

  public String getProtocol() {
    return ovpncliJNI.ClientAPI_AppCustomControlMessageEvent_protocol_get(swigCPtr, this);
  }

  public void setPayload(String value) {
    ovpncliJNI.ClientAPI_AppCustomControlMessageEvent_payload_set(swigCPtr, this, value);
  }

  public String getPayload() {
    return ovpncliJNI.ClientAPI_AppCustomControlMessageEvent_payload_get(swigCPtr, this);
  }

  public ClientAPI_AppCustomControlMessageEvent() {
    this(ovpncliJNI.new_ClientAPI_AppCustomControlMessageEvent(), true);
  }

}
