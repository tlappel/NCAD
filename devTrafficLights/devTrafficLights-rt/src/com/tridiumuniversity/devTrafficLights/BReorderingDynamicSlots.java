package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

/**
 * Created by R. Derek Otieno June 28, 2018.
 */

@NiagaraType

@NiagaraAction
        (
                name="reorderSlots",
                flags = Flags.SUMMARY
        )

public class BReorderingDynamicSlots extends BComponent {
    
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.tridiumuniversity.devTrafficLights.BReorderingDynamicSlots(1882418892)1.0$ @*/
/* Generated Sat Dec 24 11:52:04 CST 2022 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Action "reorderSlots"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code reorderSlots} action.
   * @see #reorderSlots()
   */
  public static final Action reorderSlots = newAction(Flags.SUMMARY, null);
  
  /**
   * Invoke the {@code reorderSlots} action.
   * @see #reorderSlots
   */
  public void reorderSlots() { invoke(reorderSlots, null, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BReorderingDynamicSlots.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    public void doReorderSlots()
    {

        add5DynamicSlots();
        Property[] props = getDynamicPropertiesArray(); //should get all existing dynamic properties
        Property[] reorderedArray = new Property[props.length];

        System.out.println("\n\n==========================");
        for( int i = 0; i < props.length; i++)
        {
            //copy array values from props array into reordered array in desired order
            reorderedArray[i] = props[i];
        }

        System.out.println("List of original unshuffled dynamic properties");
        displaySlots(props);
        reshuffleProperties(reorderedArray);    //Sort by buvvle sort

        System.out.println("\n\n==========================");
        System.out.println("List of shuffled dynamic properties");
        reorder(reorderedArray);
        displaySlots(reorderedArray);
        System.out.println("\n\n==========================");
    }

    public void displaySlots(Property props [])
    {
        for (Property prop : props)
        {
            System.out.println( prop.getName() + " ==> " + get(prop) );
        }
    }

    public void displaySlots()
    {
        Property[] props = getDynamicPropertiesArray(); //should get all existing dynamic properties
        for (Property prop : props)
        {
            System.out.println(get(prop));
        }
    }

    public void add5DynamicSlots()
    {
        Property[] props = getDynamicPropertiesArray();
        for (Property prop : props)
            remove(prop);

        for (int k = 0; k < 5; k++)
        {
            addNewNumber();
        }
    }

    public void addNewNumber()
    {
        try
        {
            add("NewNumber?",
                    nextRandomNumber(), Flags.SUMMARY | Flags.READONLY| Flags.TRANSIENT);
        }
        catch(DuplicateSlotException dse)
        {
            System.out.println("Cannot create slot with same name. " + dse.getLocalizedMessage());
        }
        catch(OutOfMemoryError oome)
        {
            System.out.println("Cannot add another slot - out of memory" + oome.getLocalizedMessage());
        }
    }

    public BInteger nextRandomNumber(){
        int newNumber = (int)(Math.random() * 100) + 1;

        BInteger nextNum = BInteger.make(newNumber);
        return nextNum;
    }

    public void reshuffleProperties(Property props [])
    {
        int currValue = 0;
        int nextValue = 0;
        boolean morePasses = true;

        Property tempProp = null;
        while(morePasses)
        {
            morePasses = false;

            for (int k = 0; k < props.length-2; k++)    //Exclude WsAnnotation
            {
                try
                {
                    //extract from current property
                    currValue = BInteger.make(props[k].getDefaultValue().toString()).getInt();
                    //extract from next property
                    nextValue = BInteger.make(props[k+1].getDefaultValue().toString()).getInt();
                }
                catch(NumberFormatException nfe)
                {
                    System.out.println(" Index is " + k + " error message is: " + nfe.toString());
                }

                if ( currValue > nextValue) //sort into ascending order
                {
                    morePasses = true;
                    tempProp = props[k];
                    props[k] = props[k+1];
                    props[k+1] = tempProp;
                }
            }
        }
        return;
    }

    public void reordered(Property prop, BValue val, Context cx)
    {
        System.out.println("property named: " + prop.getName() + " with a value of: " + get(prop) +
                " has been reordered in your component");
    }

    /**
     * prompt the user that they are about to reorder the named property array.
     * Throw LocalizableRuntimeException to cancel.
     * @param prop
     * @param cx
     */

    public final void checkReorder(Property prop[], Context cx)
    {
        if (!isRunning()) return;

        System.out.println("You are about to reorder property slot array named [prop.toString()]: " + prop.toString());
        System.out.println("You are about to reorder property slot array named [prop]: " + prop);
        System.out.println("You are about to reorder property slot array named [prop[0].getName()]: " + prop[0].getName());

        return;
    }
}