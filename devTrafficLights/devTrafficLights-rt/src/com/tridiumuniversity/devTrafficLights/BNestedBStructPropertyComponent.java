package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

/**
 * Created by R. Derek Otieno on June 13, 2019.
 */

@NiagaraType

@NiagaraProperty
        (
                name="nestedBStructPropertyExample",
                type="BLightNode",
                flags= Flags.SUMMARY | Flags.READONLY,
                defaultValue = "BLightNode.DEFAULT"
        )
@NiagaraProperty
        (
                name="cameraNode",
                type="BCameraNode",
                flags= Flags.SUMMARY | Flags.READONLY,
                defaultValue = "BCameraNode.DEFAULT"
        )


@NiagaraProperty
        (
                name="timeCreated",
                type="BAbsTime",
                flags= Flags.SUMMARY | Flags.READONLY,
                defaultValue = "BAbsTime.DEFAULT"
        )

@NiagaraAction
        (
                name="displayValues",
                flags=Flags.SUMMARY
        )

public class BNestedBStructPropertyComponent extends BComponent {
    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.tridiumuniversity.devTrafficLights.BNestedBStructPropertyComponent(264138771)1.0$ @*/
    /* Generated Tue May 14 14:24:23 EDT 2019 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "nestedBStructPropertyExample"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code nestedBStructPropertyExample} property.
     * @see #getNestedBStructPropertyExample
     * @see #setNestedBStructPropertyExample
     */
    public static final Property nestedBStructPropertyExample = newProperty(Flags.SUMMARY | Flags.READONLY, BLightNode.DEFAULT, null);

    /**
     * Get the {@code nestedBStructPropertyExample} property.
     * @see #nestedBStructPropertyExample
     */
    public BLightNode getNestedBStructPropertyExample() { return (BLightNode)get(nestedBStructPropertyExample); }

    /**
     * Set the {@code nestedBStructPropertyExample} property.
     * @see #nestedBStructPropertyExample
     */
    public void setNestedBStructPropertyExample(BLightNode v) { set(nestedBStructPropertyExample, v, null); }

////////////////////////////////////////////////////////////////
// Property "cameraNode"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code cameraNode} property.
     * @see #getCameraNode
     * @see #setCameraNode
     */
    public static final Property cameraNode = newProperty(Flags.SUMMARY | Flags.READONLY, BCameraNode.DEFAULT, null);

    /**
     * Get the {@code cameraNode} property.
     * @see #cameraNode
     */
    public BCameraNode getCameraNode() { return (BCameraNode)get(cameraNode); }

    /**
     * Set the {@code cameraNode} property.
     * @see #cameraNode
     */
    public void setCameraNode(BCameraNode v) { set(cameraNode, v, null); }

////////////////////////////////////////////////////////////////
// Property "timeCreated"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code timeCreated} property.
     * @see #getTimeCreated
     * @see #setTimeCreated
     */
    public static final Property timeCreated = newProperty(Flags.SUMMARY | Flags.READONLY, BAbsTime.DEFAULT, null);

    /**
     * Get the {@code timeCreated} property.
     * @see #timeCreated
     */
    public BAbsTime getTimeCreated() { return (BAbsTime)get(timeCreated); }

    /**
     * Set the {@code timeCreated} property.
     * @see #timeCreated
     */
    public void setTimeCreated(BAbsTime v) { set(timeCreated, v, null); }

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
    public static final Type TYPE = Sys.loadType(BNestedBStructPropertyComponent.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
    public void doDisplayValues()
    {
        System.out.println("\n\n=================================");
        System.out.println("BStruct Property Values");
        System.out.println("timeCreated: " + getTimeCreated());
        System.out.println("nestedBStructPropertyExample: " + getNestedBStructPropertyExample().toString());
        System.out.println("nestedBStructPropertyExample->LighNode IP Address: " +
                getNestedBStructPropertyExample().getLightNodeIP_Address());
        System.out.println("nestedBStructPropertyExample->LighNode Violation Time: " +
                getNestedBStructPropertyExample().getBLightNode().getViolationTime());
        System.out.println("nestedBStructPropertyExample->BasicLighNode IP Address: " +
                getNestedBStructPropertyExample().getBLightNode().getIpAddress());
        System.out.println("nestedBStructPropertyExample->BasicLighNode Traffic volume: " +
                getNestedBStructPropertyExample().getBLightNode().getTrafficVolume());
        System.out.println("==================Camera Node information===============");
        System.out.println("cameraNode name of picture " + getCameraNode().getNameOfPicture());
        System.out.println("cameraNode time of capture " + getCameraNode().getTimeOfCapture());
        System.out.println("cameraNode IP Address " + getCameraNode().getCameraNodeIP_Address());
        System.out.println("nestedBStructPropertyExample->LightNode IP Address: " +
                getNestedBStructPropertyExample().getBLightNode().getIpAddress());
        System.out.println("nestedBStructPropertyExample->CamerahNode Name of capture: " +
                getNestedBStructPropertyExample().getBCameraNode().getNameOfPicture());
        System.out.println("nestedBStructPropertyExample->CamerahNode Time of Capture: " +
                getNestedBStructPropertyExample().getBCameraNode().getTimeOfCapture());
        System.out.println("=================================");
    }
}