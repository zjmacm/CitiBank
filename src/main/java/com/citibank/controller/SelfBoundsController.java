package com.citibank.controller;

import com.citibank.dao.Page;
import com.citibank.service.SelfBoundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Nikolas on 2015/7/16.
 */
@Controller
@RequestMapping("/selfBounds")
public class SelfBoundsController {

    @Autowired
    private SelfBoundsService selfBoundsService;

    @RequestMapping(value = "/getSelfBounds.htm", method = RequestMethod.GET)
    public String getSelfBounds(@RequestParam(value = "pageIndex", required = false, defaultValue = "1") int pageIndex,
                                @RequestParam(value = "queryContent", required = false, defaultValue = "") String queryContent,
                                HttpSession session, Map<String, Object> map) {
        String userId = (String) session.getAttribute("userId");
        int userType = (Integer) session.getAttribute("userType");
        Page<Map<String, Object>> page = selfBoundsService.getSelfBounds(userId, pageIndex, queryContent, userType);
        map.put("totalPage", page.getpageCount());
        map.put("data", page.getList());
        return "common/selfBounds";
    }
}
