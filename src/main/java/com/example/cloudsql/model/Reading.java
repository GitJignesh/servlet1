/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.cloudsql.model;

import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Jignesh
 */
public class Reading {
    private int intRecord_ID;
    private String strSchool;
    private int intDevice;
        //@DateTimeFormat(pattern="yyyy-MM-dd") 
        private LocalDateTime dtDateTime;
    private String strDateTime;
        private String strTemperature;
        private String strHumidity;
    private float fltTemperature;
    private float fltHumidity;
    private int intPM25;
    private int intPM10;
    private float fltCO;

    private int intCount;
    
    public Reading(){
    }
    
    public Reading(int intRecord_ID, String strSchool, int intDevice
            , LocalDateTime dtDateTime, String strDateTime
            , String strTemperature, float fltTemperature
            , String strHumidity, float fltHumidity
            , int intPM25, int intPM10, float fltCO
            , int intCount){
        this.intRecord_ID = intRecord_ID;
        this.strSchool = strSchool;
        this.intDevice = intDevice;
            this.dtDateTime = dtDateTime;
        this.strDateTime = strDateTime;
            this.strTemperature = strTemperature;
            this.strHumidity = strHumidity;
        this.fltTemperature = fltTemperature;
        this.fltHumidity = fltHumidity;
        this.intPM25 = intPM25;
        this.intPM10 = intPM10;
        this.fltCO = fltCO;
        this.intCount = intCount;
    }
    
    public Reading(String strSchool, int intDevice){
        this.strSchool = strSchool;
        this.intDevice = intDevice;
    }

    public int getIntRecord_ID() {
        return intRecord_ID;
    }

    public void setIntRecord_ID(int intRecord_ID) {
        this.intRecord_ID = intRecord_ID;
    }

    public String getStrSchool() {
        return strSchool;
    }

    public void setStrSchool(String strSchool) {
        this.strSchool = strSchool;
    }

    public int getIntDevice() {
        return intDevice;
    }

    public void setIntDevice(int intDevice) {
        this.intDevice = intDevice;
    }
    
    public LocalDateTime getDtDateTime() {
        return dtDateTime;
    }

    public void setDtDateTime(LocalDateTime dtDateTime) {
        this.dtDateTime = dtDateTime;
    }

    public String getStrDateTime() {
        return strDateTime;
    }

    public void setStrDateTime(String strDateTime) {
        this.strDateTime = strDateTime;
    }
    
    public String getStrTemperature() {
        return strTemperature;
    }

    public void setStrTemperature(String strTemperature) {
        this.strTemperature = strTemperature;
    }

    public String getStrHumidity() {
        return strHumidity;
    }

    public void setStrHumidity(String strHumidity) {
        this.strHumidity = strHumidity;
    }
    
    public float getFltTemperature() {
        return fltTemperature;
    }

    public void setFltTemperature(float fltTemperature) {
        this.fltTemperature = fltTemperature;
    }

    public float getFltHumidity() {
        return fltHumidity;
    }

    public void setFltHumidity(float fltHumidity) {
        this.fltHumidity = fltHumidity;
    }

    public int getIntPM25() {
        return intPM25;
    }

    public void setIntPM25(int intPM25) {
        this.intPM25 = intPM25;
    }

    public int getIntPM10() {
        return intPM10;
    }

    public void setIntPM10(int intPM10) {
        this.intPM10 = intPM10;
    }

    public float getFltCO() {
        return fltCO;
    }

    public void setFltCO(float fltCO) {
        this.fltCO = fltCO;
    }
    
    public int getIntCount() {
        return intCount;
    }

    public void setIntCount(int intCount) {
        this.intCount = intCount;
    }
}
