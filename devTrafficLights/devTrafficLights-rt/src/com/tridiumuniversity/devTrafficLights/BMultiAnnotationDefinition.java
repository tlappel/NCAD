package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraTopic;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

/**
 * Created by R. Derek Otieno on June 30, 2019.
 * Test input for multiple annotation slot code
 */
@NiagaraType
@NiagaraProperty(
        name = "teamName",
        type = "String",
        defaultValue = "Bulldogs"
)
/** This action requires that a doThings() callback method be defined. **/
@NiagaraAction(
        name = "things"
)
/** This event passes a BString whenever it is fired regardless of the triggering event **/
@NiagaraTopic(
        name = "barChanged",
        eventType = "BString",
        flags = Flags.HIDDEN
)

public class BMultiAnnotationDefinition extends BComponent
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.tridiumuniversity.devTrafficLights.BMultiAnnotationDefinition(678159493)1.0$ @*/
/* Generated Thu Dec 22 07:50:36 CST 2022 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "teamName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code teamName} property.
   * @see #getTeamName
   * @see #setTeamName
   */
  public static final Property teamName = newProperty(0, "Bulldogs", null);
  
  /**
   * Get the {@code teamName} property.
   * @see #teamName
   */
  public String getTeamName() { return getString(teamName); }
  
  /**
   * Set the {@code teamName} property.
   * @see #teamName
   */
  public void setTeamName(String v) { setString(teamName, v, null); }

////////////////////////////////////////////////////////////////
// Action "things"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code things} action.
   * This action requires that a doThings() callback method be defined.
   * @see #things()
   */
  public static final Action things = newAction(0, null);
  
  /**
   * Invoke the {@code things} action.
   * This action requires that a doThings() callback method be defined.
   * @see #things
   */
  public void things() { invoke(things, null, null); }

////////////////////////////////////////////////////////////////
// Topic "barChanged"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code barChanged} topic.
   * This event passes a BString whenever it is fired regardless of the triggering event
   * @see #fireBarChanged
   */
  public static final Topic barChanged = newTopic(Flags.HIDDEN, null);
  
  /**
   * Fire an event for the {@code barChanged} topic.
   * This event passes a BString whenever it is fired regardless of the triggering event
   * @see #barChanged
   */
  public void fireBarChanged(BString event) { fire(barChanged, event, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BMultiAnnotationDefinition.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  public void doThings(){
    System.out.println("Team name: " + getTeamName());
    fireBarChanged(BString.make("This topic was tiggered by the doThings() callback method --> Team Name: " +
            getName()));
  }
}