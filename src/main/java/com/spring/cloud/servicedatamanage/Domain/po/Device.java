package com.spring.cloud.servicedatamanage.Domain.po;

public class Device {

    //设备id
    private String id;

    //设备名
    private String name;

    //设备编码
    private String code;

    //设备类别
    private String type;

    //设备使用部门
    private String department;

    //设备品牌
    private String label;

    //设备型号
    private String model;

    //设备序列号
    private String serialNumber;

    //设备唯一编码
    private String sn;

    //设备状态
    private String status;

    //设备入库时间
    private Integer storageTime;

    //设备注册时间
    private Integer registrationTime;



    public String getId() {
        return id;
    }

    public void setId(String id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getDepartment() { return department; }

    public void setDepartment(String department) { this.department = department; }

    public String getLabel() { return label; }

    public void setLabel(String label) { this.label = label; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getSerialNumber() { return serialNumber; }

    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }

    public String getSn() { return sn; }

    public void setSn(String sn) { this.sn = sn; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public Integer getStorageTime() { return storageTime; }

    public void setStorageTime(Integer storageTime) { this.storageTime = storageTime; }

    public Integer getRegistrationTime() { return registrationTime; }

    public void setRegistrationTime(Integer registrationTime) { this.registrationTime = registrationTime; }
}
