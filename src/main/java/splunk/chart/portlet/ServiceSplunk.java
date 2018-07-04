package splunk.chart.portlet;

import com.splunk.Service;
import com.splunk.ServiceArgs;

public class ServiceSplunk {
     private Service service ; 
     private static ServiceSplunk serviceSplunk = null ; 
     
     private ServiceSplunk(){
 	    ServiceArgs loginArgs = new ServiceArgs();
    	 loginArgs.setScheme("http");
         loginArgs.setUsername("oharrari");
         loginArgs.setPassword("test12345");
         loginArgs.setHost("splunk.zango.mu");
         loginArgs.setPort(8089);
         service = Service.connect(loginArgs);
     }
     public static ServiceSplunk getInstance(){
    	 if(serviceSplunk==null)
    		 serviceSplunk = new ServiceSplunk();
    	 return serviceSplunk ; 
     }
     public Service getService(){
    	 return service ; 
     }
     
}
