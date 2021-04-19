package com.spring.cloud.servicedatamanage.controller;

import com.spring.cloud.servicedatamanage.Domain.vo.ResponseVO;
import com.spring.cloud.servicedatamanage.bl.datamanageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spring.cloud.servicedatamanage.Domain.po.Device;

@RestController
@RequestMapping("/data")
public class datamanageController {

    @Autowired
    datamanageService datamanageservice;

    @GetMapping("/")
    public String initSession(){
        return "hello";
    }

    @PostMapping("/add")
    public ResponseVO addData(@RequestBody Device device){
        return datamanageservice.addData(device);
    }

    @PostMapping("/delete")
    public ResponseVO deleteData(@RequestParam String device_id){
        return datamanageservice.deleteData(device_id);
    }

    @PostMapping("/modify")
    public ResponseVO modifyData(@RequestBody Device device){return datamanageservice.modifyData(device);}

    @GetMapping("/search")
    public ResponseVO getData(){
        return datamanageservice.getData();
    }

    @GetMapping("/search/{deviceId}")
    public ResponseVO getDataById(@PathVariable String deviceId){return datamanageservice.getDataById(deviceId);}
}
