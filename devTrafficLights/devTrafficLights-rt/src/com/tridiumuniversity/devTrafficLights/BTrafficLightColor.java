package com.tridiumuniversity.devTrafficLights;
import javax.baja.sys.*;
import javax.baja.nre.annotations.*;


/**
 * Created by R. Derek Otieno on June 29, 2019.
 */

@NiagaraEnum
        (
                range = {
                        @Range(ordinal=1, value="red"),
                        @Range(ordinal=2, value="yellow"),
                        @Range(ordinal=3, value="green"),
                },
                defaultValue = "red"
        )

@NiagaraType
public final class BTrafficLightColor extends BFrozenEnum
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.tridiumuniversity.devTrafficLights.BTrafficLightColor(118142073)1.0$ @*/
/* Generated Sat Dec 24 13:35:05 CST 2022 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for red. */
  public static final int RED = 1;
  /** Ordinal value for yellow. */
  public static final int YELLOW = 2;
  /** Ordinal value for green. */
  public static final int GREEN = 3;
  
  /** BTrafficLightColor constant for red. */
  public static final BTrafficLightColor red = new BTrafficLightColor(RED);
  /** BTrafficLightColor constant for yellow. */
  public static final BTrafficLightColor yellow = new BTrafficLightColor(YELLOW);
  /** BTrafficLightColor constant for green. */
  public static final BTrafficLightColor green = new BTrafficLightColor(GREEN);
  
  /** Factory method with ordinal. */
  public static BTrafficLightColor make(int ordinal)
  {
    return (BTrafficLightColor)red.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BTrafficLightColor make(String tag)
  {
    return (BTrafficLightColor)red.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BTrafficLightColor(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BTrafficLightColor DEFAULT = red;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrafficLightColor.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}