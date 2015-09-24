/**
 * QueueMessagePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.playmobile.channel.utils;

public interface QueueMessagePortType extends java.rmi.Remote {
    public void cancelMessage(java.lang.String systemName, java.lang.String systemId) throws java.rmi.RemoteException, org.p4.esb.ServiceFault;
    public void queueMessage(pl.project4.utils.QueueMessage queueMessage) throws java.rmi.RemoteException, org.p4.esb.ServiceFault;
    public void queueMessages(pl.project4.utils.QueueMessageType[] message) throws java.rmi.RemoteException, org.p4.esb.ServiceFault;
}
