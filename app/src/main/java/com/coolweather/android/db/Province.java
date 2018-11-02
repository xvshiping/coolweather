package com.coolweather.android.db;

/**
 * Created by Administrator on 2018/11/2/002.
 */

public class Province extends DataSupport {
    private int id;                 //记录各省的id
    private String provinceName;    //记录各省的名字
    private int provinceCode;       //记录各省的代号

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
