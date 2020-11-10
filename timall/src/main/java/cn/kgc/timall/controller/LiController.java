package cn.kgc.timall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李锡良
 * @create 2020-11-08 17:09
 */

@Controller
public class LiController {

    @RequestMapping("/toIndex")
    public String Fore(){
        return "404";
    }



    @RequestMapping("/toAddReviw")
    public String toAddReviw(){
        return "fore/addReview";
    }

}
