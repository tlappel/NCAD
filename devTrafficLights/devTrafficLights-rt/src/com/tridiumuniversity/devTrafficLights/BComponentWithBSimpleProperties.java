package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.status.BStatus;
import javax.baja.sys.*;

/**
 * Created by R. Derek Otieno on June 30, 2019.
 */

@NiagaraType

@NiagaraProperty
        (
                name="shipped",
                type="BBoolean",
                flags= Flags.SUMMARY,
                defaultValue="BBoolean.DEFAULT"
        )

@NiagaraProperty
        (
                name="qty",
                type="BInteger",
                flags=Flags.SUMMARY,
                defaultValue = "BInteger.DEFAULT"
        )

@NiagaraProperty
        (
                name="shipQuality",
                type="BStatus",
                flags=Flags.SUMMARY,
                defaultValue = "BStatus.DEFAULT"
        )

@NiagaraAction
        (
                name="displayDefaultValues",
                flags= Flags.SUMMARY
        )

@NiagaraAction
        (
                name="assignNewValues",
                flags= Flags.SUMMARY
        )

public class BComponentWithBSimpleProperties extends BComponent {
    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.tridiumuniversity.devTrafficLights.BComponentWithBSimpleProperties(3855245566)1.0$ @*/
    /* Generated Sun May 19 10:19:46 EDT 2019 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "shipped"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code shipped} property.
     * @see #getShipped
     * @see #setShipped
     */
    public static final Property shipped = newProperty(Flags.SUMMARY, ((BBoolean)(BBoolean.DEFAULT)).getBoolean(), null);

    /**
     * Get the {@code shipped} property.
     * @see #shipped
     */
    public boolean getShipped() { return getBoolean(shipped); }

    /**
     * Set the {@code shipped} property.
     * @see #shipped
     */
    public void setShipped(boolean v) { setBoolean(shipped, v, null); }

////////////////////////////////////////////////////////////////
// Property "qty"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code qty} property.
     * @see #getQty
     * @see #setQty
     */
    public static final Property qty = newProperty(Flags.SUMMARY, ((BInteger)(BInteger.DEFAULT)).getInt(), null);

    /**
     * Get the {@code qty} property.
     * @see #qty
     */
    public int getQty() { return getInt(qty); }

    /**
     * Set the {@code qty} property.
     * @see #qty
     */
    public void setQty(int v) { setInt(qty, v, null); }

////////////////////////////////////////////////////////////////
// Property "shipQuality"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code shipQuality} property.
     * @see #getShipQuality
     * @see #setShipQuality
     */
    public static final Property shipQuality = newProperty(Flags.SUMMARY, BStatus.DEFAULT, null);

    /**
     * Get the {@code shipQuality} property.
     * @see #shipQuality
     */
    public BStatus getShipQuality() { return (BStatus)get(shipQuality); }

    /**
     * Set the {@code shipQuality} property.
     * @see #shipQuality
     */
    public void setShipQuality(BStatus v) { set(shipQuality, v, null); }

////////////////////////////////////////////////////////////////
// Action "displayDefaultValues"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code displayDefaultValues} action.
     * @see #displayDefaultValues()
     */
    public static final Action displayDefaultValues = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code displayDefaultValues} action.
     * @see #displayDefaultValues
     */
    public void displayDefaultValues() { invoke(displayDefaultValues, null, null); }

////////////////////////////////////////////////////////////////
// Action "assignNewValues"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code assignNewValues} action.
     * @see #assignNewValues()
     */
    public static final Action assignNewValues = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code assignNewValues} action.
     * @see #assignNewValues
     */
    public void assignNewValues() { invoke(assignNewValues, null, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

    @Override
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BComponentWithBSimpleProperties.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    public void doAssignNewValues(){

        /*
        Notice how simple it is to assign values to BSimples.
         */

        System.out.println("\n\n==== Assign values using mutator or setter methods and the display the new values " + " at " + BAbsTime.now());
        System.out.println();

        setQty(2000);
        System.out.println("Qty value - 2000: " + getQty() + " at " + BAbsTime.now());

        setShipped(true);
        System.out.println("Shipped value - true: " + getShipped() + " at " + BAbsTime.now());

        setShipQuality(BStatus.alarm);
        System.out.println("ship quality value - alarm: " + getShipQuality() + " at " + BAbsTime.now());

        setShipQuality(BStatus.disabled);
        System.out.println("ship quality value - disabled: " + getShipQuality() + " at " + BAbsTime.now());

        setShipQuality(BStatus.down);
        System.out.println("ship quality value - down: " + getShipQuality() + " at " + BAbsTime.now());

        setShipQuality(BStatus.make(255));
        System.out.println("ship quality value make(255) --- turn on every bit: " + getShipQuality() + " at " + BAbsTime.now());
        setShipQuality(BStatus.alarm);
        System.out.println("ship quality value make(255) --- turn on every bit: " + getShipQuality() + " at " + BAbsTime.now());
    }

    public void doDisplayDefaultValues(){
        System.out.println("\n\nDefault values\n");
        System.out.println("shipped value: " + getShipped() + " at " + BAbsTime.now());
        System.out.println("qty value: " + getQty() + " at " + BAbsTime.now());
        System.out.println("ship quality value: " + getShipQuality() + " at " + BAbsTime.now());
    }
}