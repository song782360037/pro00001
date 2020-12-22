package itcast.service.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import itcast.service.consumer.client.UserClient;
import itcast.service.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/consumer")
//@DefaultProperties(defaultFallback = "fallBackMethod") // 指定一个类的全局熔断方法
public class UserController {

    @Autowired
    private UserClient userClient;

    /*@Autowired
    private RestTemplate restTemplate;
*/
    /*@Autowired
    private DiscoveryClient discoveryClient;*/

    @GetMapping("/user")
    @ResponseBody
    @HystrixCommand   // 标记该方法需要熔断
    public String findById(@RequestParam("id") Integer id){
       /* if(id==2){
            throw new RuntimeException("...");
        }*/
       /* List<ServiceInstance> instances = discoveryClient.getInstances("itcast-provider");
        ServiceInstance instance = instances.get(0);*/
       /* String url = "http://itcast-provider/user/findById/"+id;
        return this.restTemplate.getForObject(url, String.class);*/
       return userClient.findById(id).toString();
    }

    /**
     * 熔断方法
     * 返回值要和被熔断的方法的返回值一致
     * 熔断方法不需要参数
     * @return
     */
   /* public String fallBackMethod(){
        return "连接超时，请稍后再试!";
    }*/
}
