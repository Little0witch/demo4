package com.example.ttt.demo4.controller;

import com.example.ttt.demo4.obj.Obj;
import com.example.ttt.demo4.service.Generate;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/lab1")
public class ExController {
    private final Generate service;

    public ExController(Generate service) {
        this.service = service;
    }

    @GetMapping("/resultOutput")
    public Obj resultOutput(@RequestParam("param1") int param1){
        return service.generateNum(param1);
    }
}
