/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author wlloyd
 */
public class Request {
    String bucketname;
    String filename;
    int row;
    int col;
        private String query;
    public String getQuery(){
        return query;
    }
    
    public void setQuery(String query){
        this.query = query;
    }
    
    
    private float serviceoneturnaroundstarttime;
    public void setServiceoneturnaroundstarttime(float serviceoneturnaroundstarttime){
        this.serviceoneturnaroundstarttime = serviceoneturnaroundstarttime;
    }
    public float getServiceoneturnaroundstarttime(){
        return this.serviceoneturnaroundstarttime;
    }
    
        
    private String clientid;
    public String getClientid(){
        return clientid;
    }
    public void setClientid(String clientid){
        this.clientid = clientid;
    }
    
    public String getBucketname()
    {
        return bucketname;
    }
    public void setBucketname(String bucketname)
    {
        this.bucketname = bucketname;
    }
    public String getFilename()
    {
        return filename;
    }
    public void setFilename(String filename)
    {
        this.filename = filename;
    }
    public Request(String filename,String bucketname, String clientid, float serviceoneturnaroundstarttime, String query)
    {
        this.filename = filename;
        this.bucketname = bucketname;
        this.clientid = clientid;
        this.serviceoneturnaroundstarttime = serviceoneturnaroundstarttime;
        this.query = query;
    }
    public Request()
    {
        
    }
}
