package com.tridiumuniversity.devTrafficLights;

import javax.baja.sys.BObject;
import javax.baja.sys.Context;
import java.util.Objects;

/**
 * Created by R. Derek Otieno on October 30, 2021.
 */

public class BFanComponentSchedule extends BObject{
    private String regularSchedule;
    private String holidaySchedule;
    private String summerSchedule;

    public BFanComponentSchedule() {
        this(null, null, null);
    }

    public BFanComponentSchedule(String regularSchedule, String holidaySchedule, String summerSchedule) {
        this.regularSchedule = regularSchedule;
        this.holidaySchedule = holidaySchedule;
        this.summerSchedule = summerSchedule;
    }

    @Override
    public String toString(Context cx) {
        return "BFanComponentSchedule{" +
                "regularSchedule='" + regularSchedule + '\'' +
                ", holidaySchedule='" + holidaySchedule + '\'' +
                ", summerSchedule='" + summerSchedule + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BFanComponentSchedule)) return false;
        BFanComponentSchedule that = (BFanComponentSchedule) o;
        return Objects.equals(getRegularSchedule(), that.getRegularSchedule()) &&
                Objects.equals(getHolidaySchedule(), that.getHolidaySchedule()) &&
                Objects.equals(getSummerSchedule(), that.getSummerSchedule());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getRegularSchedule(), getHolidaySchedule(), getSummerSchedule());
    }

    public String getRegularSchedule() {
        return regularSchedule;
    }

    public void setRegularSchedule(String regularSchedule) {
        this.regularSchedule = regularSchedule;
    }

    public String getHolidaySchedule() {
        return holidaySchedule;
    }

    public void setHolidaySchedule(String holidaySchedule) {
        this.holidaySchedule = holidaySchedule;
    }

    public String getSummerSchedule() {
        return summerSchedule;
    }

    public void setSummerSchedule(String summerSchedule) {
        this.summerSchedule = summerSchedule;
    }
}