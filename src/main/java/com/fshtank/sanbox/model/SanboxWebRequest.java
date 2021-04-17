package com.fshtank.sanbox.model;

public class SanboxWebRequest {
    private String locale, language;
    private Integer sampleId;

    private int digitToShift;
    private int shiftOperator;
    private String shiftDirection;

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

    public int getDigitToShift() {
        return digitToShift;
    }

    public void setDigitToShift(int digitToShift) {
        this.digitToShift = digitToShift;
    }

    public int getShiftOperator() {
        return shiftOperator;
    }

    public void setShiftOperator(int shiftOperator) {
        this.shiftOperator = shiftOperator;
    }

    public String getShiftDirection() {
        return shiftDirection;
    }

    public void setShiftDirection(String shiftDirection) {
        this.shiftDirection = shiftDirection;
    }
}
