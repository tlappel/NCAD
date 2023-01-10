package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

/**
 * Created by R. Derek Otieno on June 13, 2019
 */

@NiagaraType

@NiagaraProperty
        (
                name="componentPropertyExample0",
                type="BComponentWithBStructProperties",
                flags= Flags.SUMMARY,
                defaultValue = "new BComponentWithBStructProperties()"
        )

@NiagaraProperty
        (
                name="componentPropertyExample1",
                type="BFirstComponent",
                flags= Flags.SUMMARY,
                defaultValue = "new BFirstComponent()"
        )

@NiagaraAction
        (
                name="displayValues",
                flags=Flags.SUMMARY
        )

public class BComponentWithBComponentProperties extends BComponent {
    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.tridiumuniversity.devTrafficLights.BComponentWithBComponentProperties(668131863)1.0$ @*/
    /* Generated Mon May 20 16:00:48 EDT 2019 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "componentPropertyExample0"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code componentPropertyExample0} property.
     * @see #getComponentPropertyExample0
     * @see #setComponentPropertyExample0
     */
    public static final Property componentPropertyExample0 = newProperty(Flags.SUMMARY, new BComponentWithBStructProperties(), null);

    /**
     * Get the {@code componentPropertyExample0} property.
     * @see #componentPropertyExample0
     */
    public BComponentWithBStructProperties getComponentPropertyExample0() { return (BComponentWithBStructProperties)get(componentPropertyExample0); }

    /**
     * Set the {@code componentPropertyExample0} property.
     * @see #componentPropertyExample0
     */
    public void setComponentPropertyExample0(BComponentWithBStructProperties v) { set(componentPropertyExample0, v, null); }

////////////////////////////////////////////////////////////////
// Property "componentPropertyExample1"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code componentPropertyExample1} property.
     * @see #getComponentPropertyExample1
     * @see #setComponentPropertyExample1
     */
    public static final Property componentPropertyExample1 = newProperty(Flags.SUMMARY, new BFirstComponent(), null);

    /**
     * Get the {@code componentPropertyExample1} property.
     * @see #componentPropertyExample1
     */
    public BFirstComponent getComponentPropertyExample1() { return (BFirstComponent)get(componentPropertyExample1); }

    /**
     * Set the {@code componentPropertyExample1} property.
     * @see #componentPropertyExample1
     */
    public void setComponentPropertyExample1(BFirstComponent v) { set(componentPropertyExample1, v, null); }

////////////////////////////////////////////////////////////////
// Action "displayValues"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code displayValues} action.
     * @see #displayValues()
     */
    public static final Action displayValues = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code displayValues} action.
     * @see #displayValues
     */
    public void displayValues() { invoke(displayValues, null, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

    @Override
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BComponentWithBComponentProperties.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/



    public void doDisplayValues()
    {
        System.out.println("\n\nWelcome message ComponentWithBComponentProperties: " + getComponentPropertyExample0().toString() + "\n\n");
        System.out.println("ComponentPropertyExample0->BStructPropertyExample->iPAddress " +
                getComponentPropertyExample0().getBStructPropertyExample().getIpAddress());
        System.out.println("ComponentPropertyExample0->BStructPropertyExample->violationTime " +
                getComponentPropertyExample0().getBStructPropertyExample().getViolationTime());
        System.out.println("ComponentPropertyExample0->BStructPropertyExample->trafficVolume " +
                getComponentPropertyExample0().getBStructPropertyExample().getTrafficVolume());
        System.out.println();
        System.out.println("Updated Welcome message - ComponentWithString at: " + BAbsTime.now().toString() + " " + getComponentPropertyExample1().toString());
        System.out.println("\nValues from BFirstComponent Properties - timeExecuted "  +
                getComponentPropertyExample1().getTimeExecuted());
        System.out.println("\nValues from BFirstComponent Properties - alarmType "  +
                getComponentPropertyExample1().getAlarmType());
    }
}