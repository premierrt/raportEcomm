/**
 * QueueMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.project4.utils;

public class QueueMessage  extends pl.project4.utils.QueueMessageType  implements java.io.Serializable {
    public QueueMessage() {
    }

    public QueueMessage(
           java.lang.String type,
           java.lang.String title,
           java.lang.String content,
           java.lang.String signature,
           java.lang.String attachments,
           java.lang.String inlines,
           java.lang.String addressTo,
           java.lang.String addressFrom,
           java.util.Calendar dateToSend,
           java.lang.Integer validity,
           java.lang.Integer hourFrom,
           java.lang.Integer hourTo,
           java.lang.Boolean deliveryReport,
           java.lang.String systemName,
           java.lang.String systemUserName,
           java.lang.String systemId) {
        super(
            type,
            title,
            content,
            signature,
            attachments,
            inlines,
            addressTo,
            addressFrom,
            dateToSend,
            validity,
            hourFrom,
            hourTo,
            deliveryReport,
            systemName,
            systemUserName,
            systemId);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueueMessage)) return false;
        QueueMessage other = (QueueMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueueMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://project4.pl/utils", ">queueMessage"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
