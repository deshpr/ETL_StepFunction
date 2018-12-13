/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import faasinspector.fiResponse;
import java.util.List;

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
    
    public List<String> names;
    public List<String> getNames()
    {
        return this.names;
    }
    public void setNames(List<String> names)
    {
        this.names = names;
    }
    
    private String filename;
    public String getFilename(){
        return filename;
    }
    public void setFilename(String databasefilename){
        this.filename = databasefilename;;
    }
    
         private String clientid;
    public String getClientid(){
        return clientid;
    }
    public void setClientid(String clientid){
        this.clientid = clientid;
    }
    
            private String query;
    public String getQuery(){
        return query;
    }
    
    public void setQuery(String query){
        this.query = query;
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

    private float serviceoneturnaroundstarttime;
    public void setServiceoneturnaroundstarttime(float serviceoneturnaroundstarttime){
        this.serviceoneturnaroundstarttime = serviceoneturnaroundstarttime;
    }
    public float getServiceoneturnaroundstarttime(){
        return this.serviceoneturnaroundstarttime;
    }
    
    
    
    @Override
    public String toString()
    {
        return "value=" + this.getValue() + super.toString(); 
    }

}
