package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.Facet;
import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;


/**
 * Created by R. Derek Otieno on June 29, 2019.
 *
 * A @NiagaraAction annotation defines a single Action on a BComplex.
 * A BComplex can have any number of actions, each declared in a separate @NiagaraAction annotation.
 *
 * A @NiagaraAction annotation has the following attributes, in addition to the standard attributes
 * detailed above:
 *
 * parameterType: The type of the action’s single argument, as a String. Optional. If left blank,
 * the action is assumed to take no argument. This can be a Baja typespec, a Class name, or a
 * Java primitive.
 *
 * returnType: The type of the value returned by the action. Optional. If left blank, the action is
 * assumed to return “void”. This can be a Baja typespec, a Class name, or a Java primitive.
 * defaultValue: The default value for the action parameter. Required for actions which take a
 * parameter.
 */

@NiagaraType

@NiagaraAction(
        name="trafficLightColor",
        parameterType="BTrafficLightColor",
        flags = Flags.SUMMARY,  //To be viewable on wiresheet
        defaultValue = "BTrafficLightColor.DEFAULT"
)

@NiagaraAction(
        name="stdColors",
        parameterType="BStdColor",
        flags = Flags.SUMMARY,  //To be viewable on wiresheet
        defaultValue = "BStdColor.DEFAULT"
)

@NiagaraAction(
        name="rgbColor",
        parameterType="BRgbColor",
        flags = Flags.SUMMARY,  //To be viewable on wiresheet
        defaultValue = "BRgbColor.DEFAULT"  //Fix
)

@NiagaraAction(
        name="intType",
        parameterType="BInteger",
        flags = Flags.SUMMARY,  //To be viewable on wiresheet
        defaultValue = "BInteger.make(678)"
)

@NiagaraAction(
        name="stringType",
        parameterType="BString",
        flags = Flags.SUMMARY,  //To be viewable on wire sheet
        defaultValue = "BString.make(\"Niagara\")"
)

//The annotation below caused errors
//@NiagaraAction(
//        name="javaStringType",
//        parameterType="String",
//        flags = Flags.SUMMARY,  //To be viewable on wiresheet
//        defaultValue = ""
//
//The following libe cause the error on the commented line below...investigate
//        defaultValue = "Java String type - Niagara"
//        public static final Action javaStringType = newAction(Flags.SUMMARY, "Java String type - Niagara", null);
//)


@NiagaraAction(
        name="cameraNode",
        parameterType="BCameraNode",
        flags = Flags.SUMMARY,  //To be viewable on wiresheet
        defaultValue = "BCameraNode.DEFAULT"
)

/**
 *  This is my action.  This comment will be included in the slot definition. Please note that this is a javaDoc comment.
 */
@NiagaraAction
        (
                name = "myOnlyAction",                        //REQUIRED Name of the action.
                flags = Flags.SUMMARY,                         //Any flags the action my have. Note that multiple flags are grouped together with the "|" symbol.
                parameterType = "baja:RelTime",               //Parameter type of the action. Supports "Module:Type" typespec format (preferred) or full name.
                // Example: "baja:RelTime" or "BRelTime" are valid.
                defaultValue = "BRelTime.makeSeconds(5)",     //The default value of the action.
                returnType = "baja:RelTime",                  //Return type of the action. Supports "Module:Type" typespec format (preferred) or full name. Example:
                // "baja:RelTime" or "BRelTime" are valid.
                facets =                                      //Any facets that the action may have.  The facet annotation works as a name-value pair.
                        {
                                @Facet(name = "BFacets.MIN", value = "BRelTime.makeSeconds(0)"),
                                @Facet(name = "BFacets.MAX", value = "BRelTime.makeSeconds(60)")
                        }
        )

/**
 * The following error resulted after running slot-o-matic:
 *
 *    * Invoke the {@code things} action.
 *    * This action will cause things to happen. Probably.
 *    * @see #things
 *
 *  public int things(){return(int)invoke(things,null,null);}
 *
 *  I will comment the action annotation for now.
 */

/** This action will cause things to happen. Probably. */
@NiagaraAction(
        name = "things",
        flags = Flags.SUMMARY,  //To be viewable on wiresheet
        parameterType = "BInteger",
        defaultValue = "BInteger.make(123)"
)

public class BComponentToTestActions extends BComponent {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.tridiumuniversity.devTrafficLights.BComponentToTestActions(581917727)1.0$ @*/
/* Generated Sat Dec 24 13:48:16 CST 2022 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Action "trafficLightColor"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code trafficLightColor} action.
   * @see #trafficLightColor(BTrafficLightColor parameter)
   */
  public static final Action trafficLightColor = newAction(Flags.SUMMARY, BTrafficLightColor.DEFAULT, null);
  
  /**
   * Invoke the {@code trafficLightColor} action.
   * @see #trafficLightColor
   */
  public void trafficLightColor(BTrafficLightColor parameter) { invoke(trafficLightColor, parameter, null); }

////////////////////////////////////////////////////////////////
// Action "stdColors"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code stdColors} action.
   * @see #stdColors(BStdColor parameter)
   */
  public static final Action stdColors = newAction(Flags.SUMMARY, BStdColor.DEFAULT, null);
  
  /**
   * Invoke the {@code stdColors} action.
   * @see #stdColors
   */
  public void stdColors(BStdColor parameter) { invoke(stdColors, parameter, null); }

////////////////////////////////////////////////////////////////
// Action "rgbColor"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code rgbColor} action.
   * @see #rgbColor(BRgbColor parameter)
   */
  public static final Action rgbColor = newAction(Flags.SUMMARY, BRgbColor.DEFAULT, null);
  
  /**
   * Invoke the {@code rgbColor} action.
   * @see #rgbColor
   */
  public void rgbColor(BRgbColor parameter) { invoke(rgbColor, parameter, null); }

////////////////////////////////////////////////////////////////
// Action "intType"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code intType} action.
   * @see #intType(BInteger parameter)
   */
  public static final Action intType = newAction(Flags.SUMMARY, BInteger.make(678), null);
  
  /**
   * Invoke the {@code intType} action.
   * @see #intType
   */
  public void intType(BInteger parameter) { invoke(intType, parameter, null); }

////////////////////////////////////////////////////////////////
// Action "stringType"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code stringType} action.
   * @see #stringType(BString parameter)
   */
  public static final Action stringType = newAction(Flags.SUMMARY, BString.make("Niagara"), null);
  
  /**
   * Invoke the {@code stringType} action.
   * @see #stringType
   */
  public void stringType(BString parameter) { invoke(stringType, parameter, null); }

////////////////////////////////////////////////////////////////
// Action "cameraNode"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code cameraNode} action.
   * @see #cameraNode(BCameraNode parameter)
   */
  public static final Action cameraNode = newAction(Flags.SUMMARY, BCameraNode.DEFAULT, null);
  
  /**
   * Invoke the {@code cameraNode} action.
   * @see #cameraNode
   */
  public void cameraNode(BCameraNode parameter) { invoke(cameraNode, parameter, null); }

////////////////////////////////////////////////////////////////
// Action "myOnlyAction"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code myOnlyAction} action.
   * This is my action.  This comment will be included in the slot definition. Please note that this is a javaDoc comment.
   * @see #myOnlyAction(BRelTime parameter)
   */
  public static final Action myOnlyAction = newAction(Flags.SUMMARY, BRelTime.makeSeconds(5), BFacets.make(BFacets.make(BFacets.MIN, BRelTime.makeSeconds(0)), BFacets.make(BFacets.MAX, BRelTime.makeSeconds(60))));
  
  /**
   * Invoke the {@code myOnlyAction} action.
   * This is my action.  This comment will be included in the slot definition. Please note that this is a javaDoc comment.
   * @see #myOnlyAction
   */
  public BRelTime myOnlyAction(BRelTime parameter) { return (BRelTime)invoke(myOnlyAction, parameter, null); }

////////////////////////////////////////////////////////////////
// Action "things"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code things} action.
   * This action will cause things to happen. Probably.
   * @see #things(BInteger parameter)
   */
  public static final Action things = newAction(Flags.SUMMARY, BInteger.make(123), null);
  
  /**
   * Invoke the {@code things} action.
   * This action will cause things to happen. Probably.
   * @see #things
   */
  public void things(BInteger parameter) { invoke(things, parameter, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BComponentToTestActions.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/


    public void doStdColors(BStdColor stdColors)
    {
        System.out.println("BStdColor The default value: " + stdColors.toString());
    }

    public void doRgbColor(BRgbColor rgbColor)
    {
        System.out.println("BRgbColor The default value: " + rgbColor.toString());
    }

    public void doIntType(BInteger intType)
    {
        System.out.println("BInteger The default value: " + intType.toString());
    }

    public void doStringType(BString stringType)
    {
        System.out.println("String The default value: " + stringType.toString());
    }

    public void doJavaStringType(String javaStringType)
    {
        System.out.println("String The default value: " + javaStringType);
    }


    public void doCameraNode(BCameraNode cameraNode)
    {
        System.out.println("BCameraNode The default value\nCamera IP Address: " +
                cameraNode.getCameraNodeIP_Address() + "\nTime of capture: " +
                cameraNode.getTimeOfCapture() + "\nName of picture: " +
                cameraNode.getNameOfPicture());
    }

    public BRelTime doMyOnlyAction(BRelTime relTime)
    {
        System.out.println("BRelTime The default value: " + relTime.toString());
        return relTime;
    }

    public void doTrafficLightColor(BTrafficLightColor trafficLightColor)
    {
        System.out.println("BTrafficLightColor The default value: " + trafficLightColor.toString());
    }

    public void doThings(BInteger myThings)
    {
        System.out.println("int The default value: " + myThings);
   }
}
