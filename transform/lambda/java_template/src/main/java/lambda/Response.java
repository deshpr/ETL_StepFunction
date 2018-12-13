/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import faasinspector.fiResponse;
import java.lang.annotation.Native;

/**
 *
 * @author wlloyd
 */
public class Response extends fiResponse {
    
    //
    // User Defined Attributes
    //
    //
    // ADD getters and setters for custom attributes here.
    //

    // Return value
    private String value;
    public String getValue()
    {
        return value;
    }
    public void setValue(String value)
    {
        this.value = value;
    }
    
     private String clientid;
    public String getClientid(){
        return clientid;
    }
    public void setClientid(String clientid){
        this.clientid = clientid;
    }
    
    private String filename;
    public String getFilename(){
        return filename;
    }
    
    public void setFilename(String filename){
        this.filename = filename;
    }
    
    private String bucketname;
     public String getBucketname()
    {
        return bucketname;
    }
    public void setBucketname(String bucketname)
    {
        this.bucketname = bucketname;
    }  
    
    private String query;
    public String getQuery(){
        return query;
    }
    
    private float serviceoneturnaroundstarttime;
    public void setServiceoneturnaroundstarttime(float serviceoneturnaroundstarttime){
        this.serviceoneturnaroundstarttime = serviceoneturnaroundstarttime;
    }
    public float getServiceoneturnaroundstarttime(){
        return this.serviceoneturnaroundstarttime;
    }
    
    
    public void setQuery(String query){
        this.query = query;
    }
    
    @Override
    public String toString()
    {
        return "value=" + this.getValue() + super.toString(); 
    }

}
