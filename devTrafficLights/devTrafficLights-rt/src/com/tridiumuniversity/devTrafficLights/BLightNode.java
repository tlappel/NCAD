package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

/**
 * Created by R. Derek Otieno on June 29, 2019.
 */

@NiagaraType

@NiagaraProperty
        (
                name="lightNodeIP_Address",
                type="String",
                flags= Flags.SUMMARY | Flags.READONLY,
                defaultValue = "172.10.10.36"
        )

@NiagaraProperty
        (
                name="bLightNode",
                type="BBasicLightNode",
                flags= Flags.SUMMARY | Flags.READONLY,
                defaultValue = "BBasicLightNode.DEFAULT"
        )

@NiagaraProperty
        (
                name="bCameraNode",
                type="BCameraNode",
                flags= Flags.SUMMARY | Flags.READONLY,
                defaultValue = "BCameraNode.DEFAULT"
        )

public class BLightNode extends BStruct {
    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.tridiumuniversity.devTrafficLights.BLightNode(2106411059)1.0$ @*/
    /* Generated Tue May 14 14:24:23 EDT 2019 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "lightNodeIP_Address"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code lightNodeIP_Address} property.
     * @see #getLightNodeIP_Address
     * @see #setLightNodeIP_Address
     */
    public static final Property lightNodeIP_Address = newProperty(Flags.SUMMARY | Flags.READONLY, "172.10.10.36", null);

    /**
     * Get the {@code lightNodeIP_Address} property.
     * @see #lightNodeIP_Address
     */
    public String getLightNodeIP_Address() { return getString(lightNodeIP_Address); }

    /**
     * Set the {@code lightNodeIP_Address} property.
     * @see #lightNodeIP_Address
     */
    public void setLightNodeIP_Address(String v) { setString(lightNodeIP_Address, v, null); }

////////////////////////////////////////////////////////////////
// Property "bLightNode"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code bLightNode} property.
     * @see #getBLightNode
     * @see #setBLightNode
     */
    public static final Property bLightNode = newProperty(Flags.SUMMARY | Flags.READONLY, BBasicLightNode.DEFAULT, null);

    /**
     * Get the {@code bLightNode} property.
     * @see #bLightNode
     */
    public BBasicLightNode getBLightNode() { return (BBasicLightNode)get(bLightNode); }

    /**
     * Set the {@code bLightNode} property.
     * @see #bLightNode
     */
    public void setBLightNode(BBasicLightNode v) { set(bLightNode, v, null); }

////////////////////////////////////////////////////////////////
// Property "bCameraNode"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code bCameraNode} property.
     * @see #getBCameraNode
     * @see #setBCameraNode
     */
    public static final Property bCameraNode = newProperty(Flags.SUMMARY | Flags.READONLY, BCameraNode.DEFAULT, null);

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
// Type
////////////////////////////////////////////////////////////////

    @Override
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BLightNode.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    public static final BLightNode DEFAULT = new BLightNode();

    public BLightNode()
    {
        this("192.168.1.145",new BBasicLightNode(),new BCameraNode());
    }

    public BLightNode(String ipAddress, BBasicLightNode basicLightNode, BCameraNode cameraNode)
    {
        setLightNodeIP_Address(ipAddress);
        setBLightNode(basicLightNode);
        setBCameraNode(cameraNode);
    }
}