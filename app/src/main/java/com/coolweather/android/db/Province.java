package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by asus on 2017/11/30.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String proviceName) {
        this.provinceName = proviceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProviceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
