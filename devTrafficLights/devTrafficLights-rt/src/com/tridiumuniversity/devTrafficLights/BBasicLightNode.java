package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

/**
 * Created by R. Derek Otieno on June 29, 2019.
 */

//
// The following property is not permitted for a BStruct. The annotation will
// correctly generate the correct code for creating the property along with the
//associated getter and setter records. It will also correctly build the module, the
//workbench will start with a message to the Workbench console window stating that
//the "Structs may not contain potential component types", but the station will not
// start.
//
//@NiagaraProperty
//        (
//                name="firstComponent",
//                type="BFirstComponent",
//                flags= Flags.READONLY | Flags.SUMMARY,
//                defaultValue="new BFirstComponent ()"
//        )
//

@NiagaraType

@NiagaraProperty
        (
                name="violationTime",
                type="BAbsTime",
                flags= Flags.READONLY | Flags.SUMMARY,
                defaultValue="BAbsTime.now()"
        )
@NiagaraProperty
        (
                name="ipAddress",
                type="String",
                flags=Flags.SUMMARY | Flags.READONLY,
                defaultValue = "172.10.10.46"
        )

@NiagaraProperty
        (
                name="trafficVolume",
                type="int",
                flags=Flags.SUMMARY,
                defaultValue = "100"
        )

public class BBasicLightNode extends BStruct {
    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.tridiumuniversity.devTrafficLights.BBasicLightNode(4164240213)1.0$ @*/
    /* Generated Thu Nov 29 14:31:00 EST 2019 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "violationTime"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code violationTime} property.
     * @see #getViolationTime
     * @see #setViolationTime
     */
    public static final Property violationTime = newProperty(Flags.READONLY | Flags.SUMMARY, BAbsTime.now(), null);

    /**
     * Get the {@code violationTime} property.
     * @see #violationTime
     */
    public BAbsTime getViolationTime() { return (BAbsTime)get(violationTime); }

    /**
     * Set the {@code violationTime} property.
     * @see #violationTime
     */
    public void setViolationTime(BAbsTime v) { set(violationTime, v, null); }

////////////////////////////////////////////////////////////////
// Property "ipAddress"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code ipAddress} property.
     * @see #getIpAddress
     * @see #setIpAddress
     */
    public static final Property ipAddress = newProperty(Flags.SUMMARY | Flags.READONLY, "172.10.10.46", null);

    /**
     * Get the {@code ipAddress} property.
     * @see #ipAddress
     */
    public String getIpAddress() { return getString(ipAddress); }

    /**
     * Set the {@code ipAddress} property.
     * @see #ipAddress
     */
    public void setIpAddress(String v) { setString(ipAddress, v, null); }

////////////////////////////////////////////////////////////////
// Property "trafficVolume"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code trafficVolume} property.
     * @see #getTrafficVolume
     * @see #setTrafficVolume
     */
    public static final Property trafficVolume = newProperty(Flags.SUMMARY, 100, null);

    /**
     * Get the {@code trafficVolume} property.
     * @see #trafficVolume
     */
    public int getTrafficVolume() { return getInt(trafficVolume); }

    /**
     * Set the {@code trafficVolume} property.
     * @see #trafficVolume
     */
    public void setTrafficVolume(int v) { setInt(trafficVolume, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

    @Override
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BBasicLightNode.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    public static final BBasicLightNode DEFAULT = new BBasicLightNode();

    public BBasicLightNode()
    {
        this("000.00.00.000",BAbsTime.now(),1000);
    }

    public BBasicLightNode(String iPAddress,  BAbsTime violationTime, int trafficVolume)
    {
        setIpAddress(iPAddress);
        setViolationTime(violationTime);
        setTrafficVolume(trafficVolume);
    }
}