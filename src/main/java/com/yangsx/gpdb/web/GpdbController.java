package com.yangsx.gpdb.web;

import com.yangsx.gpdb.service.GpdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("gpdb")
public class GpdbController {
    @Autowired
    GpdbService gpdbService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("list")
    @ResponseBody
    public List<Map<String,Object>> list(@RequestParam Map<String,Object> from){
       return gpdbService.regionList(from);
    }


}
