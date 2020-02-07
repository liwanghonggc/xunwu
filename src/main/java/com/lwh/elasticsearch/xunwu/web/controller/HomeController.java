package com.lwh.elasticsearch.xunwu.web.controller;

import com.lwh.elasticsearch.xunwu.base.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lwh
 * @date 2020-02-06
 * @desp
 */
@Controller
public class HomeController {

    /**
     * 默认有一个前缀templates,后缀html
     * 所以放在templates目录下面
     */
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name", "慕课");
        return "index";
    }

    @GetMapping("/404")
    public String notFoundPage() {
        return "404";
    }

    @GetMapping("/403")
    public String accessError() {
        return "403";
    }

    @GetMapping("/500")
    public String internalError() {
        return "500";
    }

    @GetMapping("/logout/page")
    public String logoutPage() {
        return "logout";
    }
}
