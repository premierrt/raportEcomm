package pl.playmobile.channel.utils;

public class QueueMessagePortTypeProxy implements pl.playmobile.channel.utils.QueueMessagePortType {
  private String _endpoint = null;
  private pl.playmobile.channel.utils.QueueMessagePortType queueMessagePortType = null;
  
  public QueueMessagePortTypeProxy() {
    _initQueueMessagePortTypeProxy();
  }
  
  public QueueMessagePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initQueueMessagePortTypeProxy();
  }
  
  private void _initQueueMessagePortTypeProxy() {
    try {
      queueMessagePortType = (new pl.playmobile.channel.utils.QueueMessage1Locator()).get_default();
      if (queueMessagePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)queueMessagePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)queueMessagePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (queueMessagePortType != null)
      ((javax.xml.rpc.Stub)queueMessagePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pl.playmobile.channel.utils.QueueMessagePortType getQueueMessagePortType() {
    if (queueMessagePortType == null)
      _initQueueMessagePortTypeProxy();
    return queueMessagePortType;
  }
  
  public void cancelMessage(java.lang.String systemName, java.lang.String systemId) throws java.rmi.RemoteException, org.p4.esb.ServiceFault{
    if (queueMessagePortType == null)
      _initQueueMessagePortTypeProxy();
    queueMessagePortType.cancelMessage(systemName, systemId);
  }
  
  public void queueMessage(pl.project4.utils.QueueMessage queueMessage) throws java.rmi.RemoteException, org.p4.esb.ServiceFault{
    if (queueMessagePortType == null)
      _initQueueMessagePortTypeProxy();
    queueMessagePortType.queueMessage(queueMessage);
  }
  
  public void queueMessages(pl.project4.utils.QueueMessageType[] message) throws java.rmi.RemoteException, org.p4.esb.ServiceFault{
    if (queueMessagePortType == null)
      _initQueueMessagePortTypeProxy();
    queueMessagePortType.queueMessages(message);
  }
  
  
}