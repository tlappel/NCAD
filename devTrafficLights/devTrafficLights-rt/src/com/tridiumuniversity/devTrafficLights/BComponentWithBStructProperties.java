package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

/**
 * Created by R. Derek Otieno on June 30, 2019.
 */

@NiagaraType

@NiagaraProperty
        (
                name="bStructPropertyExample",
                type="BBasicLightNode",
                flags= Flags.SUMMARY | Flags.READONLY,
                defaultValue = "new BBasicLightNode()"
        )

@NiagaraProperty
        (
                name="bCameraNode",
                type="BCameraNode",
                flags= Flags.SUMMARY | Flags.READONLY,
                defaultValue = "new BCameraNode()"
        )


@NiagaraAction
        (
                name="displayValues",
                flags=Flags.SUMMARY
        )

public class BComponentWithBStructProperties extends BComponent {
    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.tridiumuniversity.devTrafficLights.BComponentWithBStructProperties(4198038435)1.0$ @*/
    /* Generated Tue Jul 02 15:45:54 EDT 2019 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "bStructPropertyExample"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code bStructPropertyExample} property.
     * @see #getBStructPropertyExample
     * @see #setBStructPropertyExample
     */
    public static final Property bStructPropertyExample = newProperty(Flags.SUMMARY | Flags.READONLY, new BBasicLightNode(), null);

    /**
     * Get the {@code bStructPropertyExample} property.
     * @see #bStructPropertyExample
     */
    public BBasicLightNode getBStructPropertyExample() { return (BBasicLightNode)get(bStructPropertyExample); }

    /**
     * Set the {@code bStructPropertyExample} property.
     * @see #bStructPropertyExample
     */
    public void setBStructPropertyExample(BBasicLightNode v) { set(bStructPropertyExample, v, null); }

////////////////////////////////////////////////////////////////
// Property "bCameraNode"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code bCameraNode} property.
     * @see #getBCameraNode
     * @see #setBCameraNode
     */
    public static final Property bCameraNode = newProperty(Flags.SUMMARY | Flags.READONLY, new BCameraNode(), null);

    /**
     * Get the {@code bCameraNode} property.
     * @see #bCameraNode
     */
    public BCameraNode getBCameraNode() { return (BCameraNode)get(bCameraNode); }

    /**
     * Set the {@code bCameraNode} property.
     * @see #bCameraNode
     */
    public void setBCameraNode(BCameraNode v) { set(bCameraNode, v, null); }

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
    public static final Type TYPE = Sys.loadType(BComponentWithBStructProperties.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
    public void doDisplayValues()
    {
        System.out.println("default BStruct values via (toString()): " + getBStructPropertyExample().toString());

        System.out.println("New BStructPropertyExample instance - iP Address: " + getBStructPropertyExample().getIpAddress());
        System.out.println("New BStructPropertyExample instance - violation time: " + getBStructPropertyExample().getViolationTime());
        System.out.println("New BStructPropertyExample instance - Traffic Volume: " + getBStructPropertyExample().getTrafficVolume());

        System.out.println("bCameraNode values via (toString()): " + getBCameraNode().toString());
        System.out.println("bCameraNode-->ipAddress values: " + getBCameraNode().getCameraNodeIP_Address());
        System.out.println("bCameraNode-->timeOfCapture values: " + getBCameraNode().getTimeOfCapture());
        System.out.println("bCameraNode-->nameOfPicture values: " + getBCameraNode().getNameOfPicture());
    }
}