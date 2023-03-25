package com.example.utils;

import com.esotericsoftware.yamlbeans.YamlReader;

import java.io.FileReader;
import java.util.Map;

public class ConfigFileReader {

     Map<String,Object> properties;
    public ConfigFileReader() throws Exception {
    try{
        YamlReader yamlReader=new YamlReader(new FileReader("F:\\demoallpro\\config.yml"));
        properties= (Map<String, Object>) yamlReader.read();
    }catch (Exception e){
    throw new Exception("No yml file found"+e);
    }
    }

    public String getBrowserName(){
      return (String) properties.get("browser");
    }

    public static void main(String[] args) throws Exception {
      ConfigFileReader configFileReader=new ConfigFileReader();
      configFileReader.getBrowserName();
    }
}
