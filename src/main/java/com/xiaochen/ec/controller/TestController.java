package com.xiaochen.ec.controller;

import com.xiaochen.ec.api.TestApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TestApi testApi;

    /**
     * http://localhost:8886/test/demo
     * @return
     */
    @RequestMapping("/demo")
    public Map getInfo(){
        Map map = new HashMap();
        map.put("tips","consumer");
        map.put("curTime",new SimpleDateFormat("yyyy-MM-dd HH:MM:ss").format(new Date()));
        return map;
    }

    /**
     * http://localhost:8886/test/client
     * @return
     */
    @RequestMapping("/client")
    public Map provider(String tips){
        Map map = new HashMap();
        if (StringUtils.isEmpty(tips)){
            tips = "default tips";
        }
        map.put("tips",tips);
        map.put("recv",testApi.demo(tips));
        map.put("curTime",new SimpleDateFormat("yyyy-MM-dd HH:MM:ss").format(new Date()));
        return map;
    }

    /**
     * http:localhost:8886/test/hi
     * @return
     */
    @RequestMapping("/hi")
    public Map hi(){
        Map map = new HashMap();
        map.put("tips","hi");
        map.put("curTime",new SimpleDateFormat("yyyy-MM-dd HH:MM:ss").format(new Date()));
        return map;
    }
}
