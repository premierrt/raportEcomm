package raport_ecom;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import baza.Baza;
import baza.CountLastDay;
import pl.playmobile.channel.utils.QueueMessage1;
import pl.playmobile.channel.utils.QueueMessagePortType;
import pl.playmobile.channel.utils.ServiceFault;


public class Main {
    private static final QName SERVICE_NAME = new QName("http://playmobile.pl/channel/utils", "queueMessage-1");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountLastDay cld = new CountLastDay();
		cld.compute();
		int eshop=cld.getEshopIle();
		int ecomm=cld.getEcomIle();
        URL wsdlURL = QueueMessage1.WSDL_LOCATION;

		QueueMessage1 ss = new QueueMessage1(wsdlURL, SERVICE_NAME);
        QueueMessagePortType port = ss.getDefault();  
        BindingProvider bindingProvider = (BindingProvider) port;
        bindingProvider.getRequestContext().put(
              BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
              "http://localhost:8040/queuemessage");
       
        String content = new String ("Eshop=" +eshop + "   Ecomm="+ecomm+ "   Split="+ Math.round((double)ecomm/(eshop+ecomm)*100) +"%");
        System.out.println(content);
        
        {
        System.out.println("Invoking queueMessage...");
        pl.project4.utils.QueueMessage _queueMessage_queueMessage = new pl.project4.utils.QueueMessage();
        _queueMessage_queueMessage.setType("H");
        _queueMessage_queueMessage.setTitle("Title-2120228112");
        _queueMessage_queueMessage.setContent("Content2071880039");
        _queueMessage_queueMessage.setAddressTo("rafal.tyszewski@play.pl");
        _queueMessage_queueMessage.setAddressFrom("rafal.tyszewski@play.pl");
        _queueMessage_queueMessage.setSystemName("SystemName-737211648");
        _queueMessage_queueMessage.setSystemUserName("SystemUserName1189594724");
        _queueMessage_queueMessage.setSystemId("SystemId-306135295");
        try {
            port.queueMessage(_queueMessage_queueMessage);

        } catch (ServiceFault e) { 
            System.out.println("Expected exception: ServiceFault has occurred.");
            System.out.println(e.toString());
        }


	}		
}
}