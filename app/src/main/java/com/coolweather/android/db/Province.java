package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by shock on 2018/1/15.
 */

public class Province extends DataSupport {
    private int id;
    private String proinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProinceName() {
        return proinceName;
    }

    public void setProinceName(String proinceName) {
        this.proinceName = proinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
