package com.spring.cloud.servicedatamanage.bl;

import com.spring.cloud.servicedatamanage.Domain.vo.ResponseVO;
import com.spring.cloud.servicedatamanage.Domain.po.Device;

public interface datamanageService {

    //添加数据
    ResponseVO addData(Device device);

    //删除数据
    ResponseVO deleteData(String device_id);

    //修改数据
    ResponseVO modifyData(Device device);

    //查询数据
    ResponseVO getData();

    //通过id查询设备
    ResponseVO getDataById(String deviceId);
}
