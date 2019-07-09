package com.learnspring.springcloud;

// 注意，这里的User对象不要调用错了，为防止调用错，可以自定义一个User类名

import com.learnspring.pojo.NikeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    //    Spring提供的 用于访问rest接口的模板对象
    @Autowired
    private RestTemplate restTemplate;
    //    改良方案
    @Value("${user.url}")
    private String url;

    //    这部分有什么问题，就是它的url地址被写死了
    //    注意这个url是生产者提供的地址，也就是provider
//    private String url = "http://localhost:8080/user/";

    @GetMapping("/order/{id}")
    public NikeUser getOrder(@PathVariable int id) {
        /**
         * 访问提供者，获取数据
         * 使用RestTemplate的方法
         *
         * getForObject() 需要两个参数
         * 第一个参数URL地址，第二个参数返回值类型
         *
         * 该方法原理 通过访问rest 获取到json数据
         * 然后转换成User对象
         */
        NikeUser user = restTemplate.getForObject(url + id, NikeUser.class);
        return user;
    }
}
