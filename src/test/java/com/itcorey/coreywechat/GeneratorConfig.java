package com.itcorey.coreywechat;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by win7 on 2018/5/17.
 */
public class GeneratorConfig {

        public static void main(String[] args) {
            java.net.URL url = GeneratorConfig.class.getProtectionDomain().getCodeSource().getLocation();
            String filePath = null;
            try {
                filePath = java.net.URLDecoder.decode(url.getPath(), "utf-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (filePath.endsWith(".jar")) filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1);
            File file = new File(filePath);
            filePath = file.getAbsolutePath();
            String fileName = filePath+"/mybatis-generator.xml";
            File configFile = new File(fileName);
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            try{
                ConfigurationParser cp = new ConfigurationParser(warnings);
                Configuration config = cp.parseConfiguration(configFile);
                DefaultShellCallback callback = new DefaultShellCallback(overwrite);
                MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
                System.out.println("==============generator start==========");
                myBatisGenerator.generate(null);
                System.out.println("==============generator complete=======================");
            }catch (Exception e) {
                System.out.println("==============generator error=======================");
                e.printStackTrace();
            }

        }

}
