package com.yonyou.iuap.corp.demo.utils;


import com.yonyou.iuap.corp.demo.entity.yonbip.approve.center.ApproveCenterEntity;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;
import java.util.Date;

/**
 * @program: corp-demo
 * @description: json文件的工具类
 * @author: kw
 * @create: 2020/04/16 15:30
 */
public class JsonUtil {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    private static final String JSON_URL = "yonbip/approve.center/JsonData.json";

    /**
     * @description:  读取json文件
     * @author: kw
     * @date: 2020/4/17
     * @param: [fileName]
     * @return: java.lang.String
     */
    public static String readJsonFile(String fileName) {
        logger.info("————开始读取" + fileName + "文件————");
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            logger.info("————读取" + jsonFile.getPath() + "文件结束!————");
            return jsonStr;
        } catch (IOException e) {
            logger.info("————读取" + fileName + "文件出现异常，读取失败!————");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @description:  根据action获取不同的json数据
     * @author: kw
     * @date: 2020/4/17
     * @param: [action]
     * @return: com.alibaba.fastjson.JSONObject
     */
    public static JSONObject getJSONDataByAction(String action) {
        String path = JsonUtil.class.getClassLoader().getResource(JSON_URL).getPath();
        String json = JsonUtil.readJsonFile(path);
        JSONObject result = JSONObject.fromObject(json).getJSONObject(action);
        logger.info("执行动作:"+action+result.get("desc"));
        logger.info("返回的数据："+result);
        return result;

    }

    public static JSONObject strToJson(String str) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject = JSONObject.fromObject(str);
        } catch (Exception e) {
            if("\"".equals(str.substring(0,1))
                    && "\"".equals(str.substring(str.length()-1,str.length()))) {
                //处理字符串
                str = str.replace("\\","");
                str = str.substring(1,str.length()-1);
                jsonObject = JSONObject.fromObject(str);
            }
        }
        return jsonObject;
    }

    public static void main(String[] args) {
        String path = JsonUtil.class.getClassLoader().getResource(JSON_URL).getPath();
        String json = JsonUtil.readJsonFile(path);
        JSONObject result = JSONObject.fromObject(json).getJSONObject("getTaskList");
        //System.out.println(new Date().getTime());
        System.out.println("返回的数据："+result);
    }
}
