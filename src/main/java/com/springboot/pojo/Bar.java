package com.springboot.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties("classpath:*")
public class Bar {
    @Value("${mybar.name}")
    private String name;

     private String[] arrs;

     private List<Map<String,String>> nameList;

     private List<String> BarNameList;

     private Map<String,String> map;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getArrs() {
        return arrs;
    }

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public List<Map<String, String>> getNameList() {
        return nameList;
    }

    public void setNameList(List<Map<String, String>> nameList) {
        this.nameList = nameList;
    }

    public List<String> getBarNameList() {
        return BarNameList;
    }

    public void setBarNameList(List<String> barNameList) {
        BarNameList = barNameList;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "name='" + name + '\'' +
                ", arrs=" + Arrays.toString(arrs) +
                ", nameList=" + nameList +
                ", BarNameList=" + BarNameList +
                ", map=" + map +
                '}';
    }
}
