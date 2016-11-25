package scut.csunion.ecshop.Controller.WebApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zijun on 16-11-25.
 */
@RestController
public class HelloApi {

    @RequestMapping("/hello")
    public String getHello(){
        //return pure text data "xixixi" to client
        return "xixixi";
    }
}
