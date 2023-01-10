package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import javax.baja.util.BNotification;

/**
 * The Lifecycle test is a simple {@link BComponent} that prints output
 * statements for each callback made over the component's life cycle in
 * a running station.
 *
 * @author		R. Derek Otieno
 * @creation 	June 16, 2019
 *
 */

@NiagaraType

@NiagaraProperty
        (
                name="out",
                type="int",
                flags= Flags.SUMMARY,
                defaultValue="0"
        )

public class BLifeCycleExample
        extends BComponent
{
    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.tridiumuniversity.devTrafficLights.BLifeCycleExample(4200900443)1.0$ @*/
    /* Generated Fri Nov 16 12:15:49 EST 2018 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "out"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code out} property.
     * @see #getOut
     * @see #setOut
     */
    public static final Property out = newProperty(Flags.SUMMARY, 0, null);

    /**
     * Get the {@code out} property.
     * @see #out
     */
    public int getOut() { return getInt(out); }

    /**
     * Set the {@code out} property.
     * @see #out
     */
    public void setOut(int v) { setInt(out, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

    @Override
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BLifeCycleExample.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

////////////////////////////////////////////////////////////////
//  Lifecycle
////////////////////////////////////////////////////////////////

    /**
     * This callback is called by the framework when the component is started.
     * Once this component is started, all child components for this component
     * will be started.
     */
    public void started() throws Exception
    {
        System.out.println("Component started.");
    }

    /**
     * This callback is made by the framework when all child components
     * of this component are started.
     */
    public void descendantsStarted() throws Exception
    {
        System.out.println("All descendants started.");
    }

    /**
     * If this component is being started as part of the station startup routine,
     * the component will receive a station started callback after all components
     * and services in the station are started.
     */
    public void stationStarted() throws Exception
    {
        System.out.println("Station Started.");
    };

    /**
     * If this component is being started as part of the station startup routine,
     * the component will receive the steady state callback when all components
     * in the station have been running for a set period of time as determined
     * by the system.properties file. By default, the time period is 10 seconds.
     */
    public void atSteadyState() throws Exception
    {
        System.out.println("Station is at a Steady State.");
    }

    /**
     * When the component is removed from a running station or the station itself
     * is stopped, the component receives a callback indicating that the component
     * is no longer running.
     */
    public void stopped() throws Exception
    {
        System.out.println("Component stopped.");
    }

    /**
     * When the component is set to a stopped state, all child components of the
     * component are then recursively stopped. When all child components of this
     * component are stopped, the framework notifies the component through this
     * callback.
     */
    public void descendantsStopped() throws Exception
    {
        System.out.println("Descendants Stopped.");
    }

////////////////////////////////////////////////////////////////
//  Property callbacks
////////////////////////////////////////////////////////////////

    /**
     * The changed callback is made whenever the value for a property is modified
     * through the property's <code>set</code> method.
     */
    public void changed(Property prop, Context cx)
    {
        System.out.println("Detected change in Property " + prop.getName());
    }

    /**
     * This method is called whenever a new {@link Property} slot is dynamically
     * added to this BComponent instance.
     */
    public void added(Property prop, Context cx)
    {
        BValue bValue = get(prop);
        System.out.println("\nAdded Property " + prop.getName() +
                " of type " + bValue.getTypeDisplayName(cx));
    }

    /**
     * This method is called whenever a dynamically added {@link Property} slot
     * is removed from this BComponent instance. A Frozen property cannot be
     * removed.
     */
    public void removed(Property prop, BValue val, Context cx)
    {
        String name = prop.getName();
        String strVal = val.toString(null);
        System.out.println("Removed Property " + prop.getName() + " with value " + val.toString());
    }

    /**
     * This method is called whenever the {@link Property} slots of this component
     * instance are reordered on the component.
     */
    public void reordered(Context cx)
    {
        System.out.println("Reordered all properties.");
    }
}