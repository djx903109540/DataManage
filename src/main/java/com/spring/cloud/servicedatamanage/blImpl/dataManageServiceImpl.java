package com.spring.cloud.servicedatamanage.blImpl;

import com.spring.cloud.servicedatamanage.Dao.datamanageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.cloud.servicedatamanage.bl.datamanageService;
import com.spring.cloud.servicedatamanage.Domain.vo.ResponseVO;
import com.spring.cloud.servicedatamanage.Domain.po.Device;


import java.util.List;

@Service
public class dataManageServiceImpl implements datamanageService{

    @Autowired
    datamanageMapper datamanagemapper;


    @Override
    public ResponseVO addData(Device device){
        try{
            if(device == null){
                return ResponseVO.buildFailure("设备信息为空，请完善设备信息");
            }
            datamanagemapper.InsertData(device);
            return ResponseVO.buildSuccess("插入成功！");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseVO.buildFailure("失败");
        }
    }

    @Override
    public ResponseVO deleteData(String device_id){
        try{
            if(device_id == null){
                return ResponseVO.buildFailure("设备id为空");
            }
            datamanagemapper.delete(device_id);
            return ResponseVO.buildSuccess("删除成功！");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseVO.buildFailure("失败");
        }
    }

    @Override
    public ResponseVO modifyData(Device device){
        try{
            datamanagemapper.modifyData(device);
            return ResponseVO.buildSuccess("修改成功！");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseVO.buildFailure("失败");
        }
    }

    @Override
    public ResponseVO getData(){
        try{
            List<Device> deviceList = datamanagemapper.selectAll();
            if(deviceList.size()==0){
                return ResponseVO.buildFailure("暂无设备");
            }
            return ResponseVO.buildSuccess(deviceList);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseVO.buildFailure("失败");
        }
    }

    @Override
    public ResponseVO getDataById(String deviceId){
        try {
            if(deviceId == null){
                return ResponseVO.buildFailure("设备id为空");
            }
            Device device = datamanagemapper.selectDataById(deviceId);
            if(device == null){
                return ResponseVO.buildFailure("查无此设备");
            }
            return ResponseVO.buildSuccess(device);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseVO.buildFailure("失败");
        }
    }
}
