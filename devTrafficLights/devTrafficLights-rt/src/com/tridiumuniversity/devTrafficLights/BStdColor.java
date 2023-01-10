package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraEnum;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.Range;
import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * Created by Derek Otieno on June 29, 2019
 */

@NiagaraEnum
        (
                range = {
                        @Range(ordinal=100, value="red"),
                        @Range(ordinal=200, value="orange"),
                        @Range(ordinal=300, value="green"),
                        @Range(ordinal=400, value="blue"),
                        @Range(ordinal=500, value="indigo"),
                        @Range(ordinal=600, value="yellow"),
                        @Range(ordinal=700, value="violet"),
                },
                defaultValue = "violet"
        )

@NiagaraType

public final class BStdColor extends BFrozenEnum {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.tridiumuniversity.devTrafficLights.BStdColor(2900533102)1.0$ @*/
/* Generated Sat Dec 24 13:35:05 CST 2022 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for red. */
  public static final int RED = 100;
  /** Ordinal value for orange. */
  public static final int ORANGE = 200;
  /** Ordinal value for green. */
  public static final int GREEN = 300;
  /** Ordinal value for blue. */
  public static final int BLUE = 400;
  /** Ordinal value for indigo. */
  public static final int INDIGO = 500;
  /** Ordinal value for yellow. */
  public static final int YELLOW = 600;
  /** Ordinal value for violet. */
  public static final int VIOLET = 700;
  
  /** BStdColor constant for red. */
  public static final BStdColor red = new BStdColor(RED);
  /** BStdColor constant for orange. */
  public static final BStdColor orange = new BStdColor(ORANGE);
  /** BStdColor constant for green. */
  public static final BStdColor green = new BStdColor(GREEN);
  /** BStdColor constant for blue. */
  public static final BStdColor blue = new BStdColor(BLUE);
  /** BStdColor constant for indigo. */
  public static final BStdColor indigo = new BStdColor(INDIGO);
  /** BStdColor constant for yellow. */
  public static final BStdColor yellow = new BStdColor(YELLOW);
  /** BStdColor constant for violet. */
  public static final BStdColor violet = new BStdColor(VIOLET);
  
  /** Factory method with ordinal. */
  public static BStdColor make(int ordinal)
  {
    return (BStdColor)red.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BStdColor make(String tag)
  {
    return (BStdColor)red.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BStdColor(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BStdColor DEFAULT = violet;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BStdColor.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}