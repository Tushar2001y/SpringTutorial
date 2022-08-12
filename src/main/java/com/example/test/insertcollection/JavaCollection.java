package com.example.test.insertcollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
    List addressList;
    Set addressSet;
    Map addressMap;
    Properties addressProp;


    public List getAddressList(){
        System.out.println("List elements : "+addressList);
        return addressList;
    }
    public void setAddressSet(Set addressSet){
        this.addressSet=addressSet;
    }
    public Set getAddressSet(){
        System.out.println("Set Elements : "+addressSet);
        return addressSet;
    }
    public void setAddressMap(Map addressMap){
        this.addressMap = addressMap;
    }
    public Map getAddressMap(){
        System.out.println("Map Elements : "+addressMap);
        return addressMap;
    }
    public void setAddressProp(Properties addressProp){
        this.addressProp = addressProp;
    }
    public Properties getAddressProp(){
        System.out.println("Property elements : "+addressProp);
        return addressProp;
    }

    public void setAddressList(List addressList) {
        this.addressList=addressList;
    }
}
