package com.spring.entity;

import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 测试类
 * @author Schuyler
 */
public class HelloSpring {
    private String word;
    private String prefix;
    private String suffix;
    private Map paramMap;
    private Set paramSet;
    private List paramList;
    private String[] paramArray;
    private Properties paramProperties;
    private Hello hello;

    public Hello getHello() {
        return hello;
    }

    public void setHello(Hello hello) {
        this.hello = hello;
    }

    public Map getParamMap() {
        return paramMap;
    }

    public void setParamMap(Map paramMap) {
        this.paramMap = paramMap;
    }

    public Set getParamSet() {
        return paramSet;
    }

    public void setParamSet(Set paramSet) {
        this.paramSet = paramSet;
    }

    public List getParamList() {
        return paramList;
    }

    public void setParamList(List paramList) {
        this.paramList = paramList;
    }

    public String[] getParamArray() {
        return paramArray;
    }

    public void setParamArray(String[] paramArray) {
        this.paramArray = paramArray;
    }

    public Properties getParamProperties() {
        return paramProperties;
    }

    public void setParamProperties(Properties paramProperties) {
        this.paramProperties = paramProperties;
    }

    public HelloSpring(){}

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public HelloSpring(String str) {
        this.word = str;
    }

    public void sayHello(String newWord) {
        System.out.println(newWord);
    }

    public void sayHello() {
        hello.say();
        ((Hello)paramMap.get("B")).say();
        sayHello(prefix + suffix);
        System.out.println(word);
    }
}
