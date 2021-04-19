package com.spring.cloud.servicedatamanage.Dao;

import org.apache.ibatis.annotations.Mapper;
import com.spring.cloud.servicedatamanage.Domain.po.Device;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface datamanageMapper {

    void InsertData(Device device);

    void delete(String device_id);

    void modifyData(Device device);

    List<Device> selectAll();

    Device selectDataById(String deviceId);
}
