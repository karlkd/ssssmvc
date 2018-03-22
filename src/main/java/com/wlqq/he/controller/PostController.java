package com.wlqq.he.controller;

import com.wlqq.he.common.JsonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 69412 on 2018/3/8.
 */
@Slf4j
@RestController
public class PostController {

    @RequestMapping(value = "/express/query",method = RequestMethod.POST)
    public JsonResponse queryExpressInfo(@RequestParam(required = true) String business,
                                         @RequestParam(required = true) String com,
                                         @RequestParam(required = true) String num,
                                         @RequestParam(required = false) String from,
                                         @RequestParam(required = false) String to,
                                         @RequestParam(required = false) String bizDept) {
        log.info("query trace info business {}, com is {},num is {},bizDept {}", business, com, num, bizDept);
        return null;
    }
}
