package com.example.dipto.volleypractice;

/**
 * Created by Dipto on 2/10/2018.
 */

class IPResponse {

    private String country;
    private String loc;
    private String hostname;
    private String city;
    private String org;
    private String ip;
    private String postal;
    private String region;

    public IPResponse(String country, String loc, String city, String ip){
        this.country = country ;
        this.loc = loc ;
        this.ip = ip ;
        this.city = city ;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry(){
        return country;
    }

    public void setLoc(String loc){
        this.loc = loc;
    }

    public String getLoc(){
        return loc;
    }

    public void setHostname(String hostname){
        this.hostname = hostname;
    }

    public String getHostname(){
        return hostname;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public void setOrg(String org){
        this.org = org;
    }

    public String getOrg(){
        return org;
    }

    public void setIp(String ip){
        this.ip = ip;
    }

    public String getIp(){
        return ip;
    }

    public void setPostal(String postal){
        this.postal = postal;
    }

    public String getPostal(){
        return postal;
    }

    public void setRegion(String region){
        this.region = region;
    }

    public String getRegion(){
        return region;
    }

}
