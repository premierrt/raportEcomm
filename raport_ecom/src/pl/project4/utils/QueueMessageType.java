/**
 * QueueMessageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.project4.utils;

public class QueueMessageType  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String title;

    private java.lang.String content;

    private java.lang.String signature;

    private java.lang.String attachments;

    private java.lang.String inlines;

    private java.lang.String addressTo;

    private java.lang.String addressFrom;

    private java.util.Calendar dateToSend;

    private java.lang.Integer validity;

    private java.lang.Integer hourFrom;

    private java.lang.Integer hourTo;

    private java.lang.Boolean deliveryReport;

    private java.lang.String systemName;

    private java.lang.String systemUserName;

    private java.lang.String systemId;

    public QueueMessageType() {
    }

    public QueueMessageType(
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
           this.type = type;
           this.title = title;
           this.content = content;
           this.signature = signature;
           this.attachments = attachments;
           this.inlines = inlines;
           this.addressTo = addressTo;
           this.addressFrom = addressFrom;
           this.dateToSend = dateToSend;
           this.validity = validity;
           this.hourFrom = hourFrom;
           this.hourTo = hourTo;
           this.deliveryReport = deliveryReport;
           this.systemName = systemName;
           this.systemUserName = systemUserName;
           this.systemId = systemId;
    }


    /**
     * Gets the type value for this QueueMessageType.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this QueueMessageType.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the title value for this QueueMessageType.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this QueueMessageType.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the content value for this QueueMessageType.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this QueueMessageType.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the signature value for this QueueMessageType.
     * 
     * @return signature
     */
    public java.lang.String getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this QueueMessageType.
     * 
     * @param signature
     */
    public void setSignature(java.lang.String signature) {
        this.signature = signature;
    }


    /**
     * Gets the attachments value for this QueueMessageType.
     * 
     * @return attachments
     */
    public java.lang.String getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this QueueMessageType.
     * 
     * @param attachments
     */
    public void setAttachments(java.lang.String attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the inlines value for this QueueMessageType.
     * 
     * @return inlines
     */
    public java.lang.String getInlines() {
        return inlines;
    }


    /**
     * Sets the inlines value for this QueueMessageType.
     * 
     * @param inlines
     */
    public void setInlines(java.lang.String inlines) {
        this.inlines = inlines;
    }


    /**
     * Gets the addressTo value for this QueueMessageType.
     * 
     * @return addressTo
     */
    public java.lang.String getAddressTo() {
        return addressTo;
    }


    /**
     * Sets the addressTo value for this QueueMessageType.
     * 
     * @param addressTo
     */
    public void setAddressTo(java.lang.String addressTo) {
        this.addressTo = addressTo;
    }


    /**
     * Gets the addressFrom value for this QueueMessageType.
     * 
     * @return addressFrom
     */
    public java.lang.String getAddressFrom() {
        return addressFrom;
    }


    /**
     * Sets the addressFrom value for this QueueMessageType.
     * 
     * @param addressFrom
     */
    public void setAddressFrom(java.lang.String addressFrom) {
        this.addressFrom = addressFrom;
    }


    /**
     * Gets the dateToSend value for this QueueMessageType.
     * 
     * @return dateToSend
     */
    public java.util.Calendar getDateToSend() {
        return dateToSend;
    }


    /**
     * Sets the dateToSend value for this QueueMessageType.
     * 
     * @param dateToSend
     */
    public void setDateToSend(java.util.Calendar dateToSend) {
        this.dateToSend = dateToSend;
    }


    /**
     * Gets the validity value for this QueueMessageType.
     * 
     * @return validity
     */
    public java.lang.Integer getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this QueueMessageType.
     * 
     * @param validity
     */
    public void setValidity(java.lang.Integer validity) {
        this.validity = validity;
    }


    /**
     * Gets the hourFrom value for this QueueMessageType.
     * 
     * @return hourFrom
     */
    public java.lang.Integer getHourFrom() {
        return hourFrom;
    }


    /**
     * Sets the hourFrom value for this QueueMessageType.
     * 
     * @param hourFrom
     */
    public void setHourFrom(java.lang.Integer hourFrom) {
        this.hourFrom = hourFrom;
    }


    /**
     * Gets the hourTo value for this QueueMessageType.
     * 
     * @return hourTo
     */
    public java.lang.Integer getHourTo() {
        return hourTo;
    }


    /**
     * Sets the hourTo value for this QueueMessageType.
     * 
     * @param hourTo
     */
    public void setHourTo(java.lang.Integer hourTo) {
        this.hourTo = hourTo;
    }


    /**
     * Gets the deliveryReport value for this QueueMessageType.
     * 
     * @return deliveryReport
     */
    public java.lang.Boolean getDeliveryReport() {
        return deliveryReport;
    }


    /**
     * Sets the deliveryReport value for this QueueMessageType.
     * 
     * @param deliveryReport
     */
    public void setDeliveryReport(java.lang.Boolean deliveryReport) {
        this.deliveryReport = deliveryReport;
    }


    /**
     * Gets the systemName value for this QueueMessageType.
     * 
     * @return systemName
     */
    public java.lang.String getSystemName() {
        return systemName;
    }


    /**
     * Sets the systemName value for this QueueMessageType.
     * 
     * @param systemName
     */
    public void setSystemName(java.lang.String systemName) {
        this.systemName = systemName;
    }


    /**
     * Gets the systemUserName value for this QueueMessageType.
     * 
     * @return systemUserName
     */
    public java.lang.String getSystemUserName() {
        return systemUserName;
    }


    /**
     * Sets the systemUserName value for this QueueMessageType.
     * 
     * @param systemUserName
     */
    public void setSystemUserName(java.lang.String systemUserName) {
        this.systemUserName = systemUserName;
    }


    /**
     * Gets the systemId value for this QueueMessageType.
     * 
     * @return systemId
     */
    public java.lang.String getSystemId() {
        return systemId;
    }


    /**
     * Sets the systemId value for this QueueMessageType.
     * 
     * @param systemId
     */
    public void setSystemId(java.lang.String systemId) {
        this.systemId = systemId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueueMessageType)) return false;
        QueueMessageType other = (QueueMessageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.inlines==null && other.getInlines()==null) || 
             (this.inlines!=null &&
              this.inlines.equals(other.getInlines()))) &&
            ((this.addressTo==null && other.getAddressTo()==null) || 
             (this.addressTo!=null &&
              this.addressTo.equals(other.getAddressTo()))) &&
            ((this.addressFrom==null && other.getAddressFrom()==null) || 
             (this.addressFrom!=null &&
              this.addressFrom.equals(other.getAddressFrom()))) &&
            ((this.dateToSend==null && other.getDateToSend()==null) || 
             (this.dateToSend!=null &&
              this.dateToSend.equals(other.getDateToSend()))) &&
            ((this.validity==null && other.getValidity()==null) || 
             (this.validity!=null &&
              this.validity.equals(other.getValidity()))) &&
            ((this.hourFrom==null && other.getHourFrom()==null) || 
             (this.hourFrom!=null &&
              this.hourFrom.equals(other.getHourFrom()))) &&
            ((this.hourTo==null && other.getHourTo()==null) || 
             (this.hourTo!=null &&
              this.hourTo.equals(other.getHourTo()))) &&
            ((this.deliveryReport==null && other.getDeliveryReport()==null) || 
             (this.deliveryReport!=null &&
              this.deliveryReport.equals(other.getDeliveryReport()))) &&
            ((this.systemName==null && other.getSystemName()==null) || 
             (this.systemName!=null &&
              this.systemName.equals(other.getSystemName()))) &&
            ((this.systemUserName==null && other.getSystemUserName()==null) || 
             (this.systemUserName!=null &&
              this.systemUserName.equals(other.getSystemUserName()))) &&
            ((this.systemId==null && other.getSystemId()==null) || 
             (this.systemId!=null &&
              this.systemId.equals(other.getSystemId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getInlines() != null) {
            _hashCode += getInlines().hashCode();
        }
        if (getAddressTo() != null) {
            _hashCode += getAddressTo().hashCode();
        }
        if (getAddressFrom() != null) {
            _hashCode += getAddressFrom().hashCode();
        }
        if (getDateToSend() != null) {
            _hashCode += getDateToSend().hashCode();
        }
        if (getValidity() != null) {
            _hashCode += getValidity().hashCode();
        }
        if (getHourFrom() != null) {
            _hashCode += getHourFrom().hashCode();
        }
        if (getHourTo() != null) {
            _hashCode += getHourTo().hashCode();
        }
        if (getDeliveryReport() != null) {
            _hashCode += getDeliveryReport().hashCode();
        }
        if (getSystemName() != null) {
            _hashCode += getSystemName().hashCode();
        }
        if (getSystemUserName() != null) {
            _hashCode += getSystemUserName().hashCode();
        }
        if (getSystemId() != null) {
            _hashCode += getSystemId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueueMessageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://project4.pl/utils", "queueMessageType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inlines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "inlines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "addressTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "addressFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateToSend");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "dateToSend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "validity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hourFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "hourFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hourTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "hourTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryReport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "deliveryReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "systemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "systemUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://project4.pl/utils", "systemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
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
