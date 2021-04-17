package com.fshtank.sanbox.model;

public class SanboxWebResponse {

    private String locale, language;
    private Integer sampleId;
    private String randomValue;

    private String shiftOperation; // String representation to go back to the client of the operation performed

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getSampleId() {
        return sampleId;
    }

    public void setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
    }

    public String getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(String randomValue) {
        this.randomValue = randomValue;
    }

    public void setShiftOperation (int digitToShift, int shiftBitsInt, int shiftResult, String shiftDirection) {
        this.shiftOperation = "digit="+digitToShift + shiftDirection + shiftBitsInt+" = " + shiftResult;
    }

    public String getShiftOperation() {
        return shiftOperation;
    }
}
