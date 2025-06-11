package com.stevan222102453.cuaca;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import kotlin.jvm.internal.SerializedIr;

public class RootModel {
    @SerializedName("list")
    private List<ListModel> listModelList;
    @SerializedName("city")
    private CityModel cityModel;

    private RootModel() { }

    public List<ListModel> getListModelList() { return listModelList; }

    public void setListModelList(List<ListModel> listModelList){
        this.listModelList = listModelList;
    }

    public CityModel getCityModel() {
        return cityModel;
    }
    public void setCityModel(CityModel cityModel){ this.cityModel = cityModel; }
}
