package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import javax.baja.units.BUnit;

/**
 * Created by R. Derek Otieno on June 28, 2019.
 */

@NiagaraType
@NiagaraProperty
        (
                name="play",
                type="String",
                flags= Flags.SUMMARY | Flags.READONLY | Flags.TRANSIENT,
                defaultValue="Invoke 'Play' to start..."
        )

@NiagaraProperty
        (
                name="DynamicSlotCounter",
                type="int",
                flags= Flags.SUMMARY | Flags.READONLY | Flags.TRANSIENT,
                defaultValue="0"
        )
@NiagaraProperty
        (
                name="sumOfAllNumbers",
                type="int",
                flags= Flags.SUMMARY | Flags.READONLY | Flags.TRANSIENT,
                defaultValue="0"
        )
@NiagaraProperty
        (
                name="productOfAllNumbers",
                type="double", flags= Flags.SUMMARY | Flags.READONLY | Flags.TRANSIENT,
                defaultValue="1.0"
        )
@NiagaraAction
        (
                name="startOver",
                flags= Flags.SUMMARY
        )
@NiagaraAction
        (
                name="addNewNumber",
                flags = Flags.SUMMARY
        )
@NiagaraAction
        (
                name="removeExistingNumber",
                flags = Flags.SUMMARY
        )

@NiagaraAction
        (
                name="reorderSlots",
                flags = Flags.SUMMARY
        )

@NiagaraAction
        (
                name="toTopOfSlotList",
                flags = Flags.SUMMARY
        )

@NiagaraAction
        (
                name="toBottomOfSlotList",
                flags = Flags.SUMMARY
        )

@NiagaraAction
        (
                name="renamePropertySlot",
                flags = Flags.SUMMARY
        )

@NiagaraAction
        (
                name="changeDynamicSlotValue",
                flags = Flags.SUMMARY
        )

@NiagaraAction
        (
                name="addDynamicSlotWithNullName",
                flags = Flags.SUMMARY
        )

public class BManipulatingDynamicSlots extends BComponent {
    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.tridiumuniversity.devTrafficLights.BManipulatingDynamicSlots(2027114933)1.0$ @*/
    /* Generated Wed Nov 28 21:14:31 EST 2018 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "play"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code play} property.
     * @see #getPlay
     * @see #setPlay
     */
    public static final Property play = newProperty(Flags.SUMMARY | Flags.READONLY | Flags.TRANSIENT, "Invoke 'Play' to start...", null);

    /**
     * Get the {@code play} property.
     * @see #play
     */
    public String getPlay() { return getString(play); }

    /**
     * Set the {@code play} property.
     * @see #play
     */
    public void setPlay(String v) { setString(play, v, null); }

////////////////////////////////////////////////////////////////
// Property "DynamicSlotCounter"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code DynamicSlotCounter} property.
     * @see #getDynamicSlotCounter
     * @see #setDynamicSlotCounter
     */
    public static final Property DynamicSlotCounter = newProperty(Flags.SUMMARY | Flags.READONLY | Flags.TRANSIENT, 0, null);

    /**
     * Get the {@code DynamicSlotCounter} property.
     * @see #DynamicSlotCounter
     */
    public int getDynamicSlotCounter() { return getInt(DynamicSlotCounter); }

    /**
     * Set the {@code DynamicSlotCounter} property.
     * @see #DynamicSlotCounter
     */
    public void setDynamicSlotCounter(int v) { setInt(DynamicSlotCounter, v, null); }

////////////////////////////////////////////////////////////////
// Property "sumOfAllNumbers"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code sumOfAllNumbers} property.
     * @see #getSumOfAllNumbers
     * @see #setSumOfAllNumbers
     */
    public static final Property sumOfAllNumbers = newProperty(Flags.SUMMARY | Flags.READONLY | Flags.TRANSIENT, 0, null);

    /**
     * Get the {@code sumOfAllNumbers} property.
     * @see #sumOfAllNumbers
     */
    public int getSumOfAllNumbers() { return getInt(sumOfAllNumbers); }

    /**
     * Set the {@code sumOfAllNumbers} property.
     * @see #sumOfAllNumbers
     */
    public void setSumOfAllNumbers(int v) { setInt(sumOfAllNumbers, v, null); }

////////////////////////////////////////////////////////////////
// Property "productOfAllNumbers"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code productOfAllNumbers} property.
     * @see #getProductOfAllNumbers
     * @see #setProductOfAllNumbers
     */
    public static final Property productOfAllNumbers = newProperty(Flags.SUMMARY | Flags.READONLY | Flags.TRANSIENT, 1.0, null);

    /**
     * Get the {@code productOfAllNumbers} property.
     * @see #productOfAllNumbers
     */
    public double getProductOfAllNumbers() { return getDouble(productOfAllNumbers); }

    /**
     * Set the {@code productOfAllNumbers} property.
     * @see #productOfAllNumbers
     */
    public void setProductOfAllNumbers(double v) { setDouble(productOfAllNumbers, v, null); }

////////////////////////////////////////////////////////////////
// Action "startOver"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code startOver} action.
     * @see #startOver()
     */
    public static final Action startOver = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code startOver} action.
     * @see #startOver
     */
    public void startOver() { invoke(startOver, null, null); }

////////////////////////////////////////////////////////////////
// Action "addNewNumber"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code addNewNumber} action.
     * @see #addNewNumber()
     */
    public static final Action addNewNumber = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code addNewNumber} action.
     * @see #addNewNumber
     */
    public void addNewNumber() { invoke(addNewNumber, null, null); }

////////////////////////////////////////////////////////////////
// Action "removeExistingNumber"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code removeExistingNumber} action.
     * @see #removeExistingNumber()
     */
    public static final Action removeExistingNumber = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code removeExistingNumber} action.
     * @see #removeExistingNumber
     */
    public void removeExistingNumber() { invoke(removeExistingNumber, null, null); }

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
// Action "toTopOfSlotList"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code toTopOfSlotList} action.
     * @see #toTopOfSlotList()
     */
    public static final Action toTopOfSlotList = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code toTopOfSlotList} action.
     * @see #toTopOfSlotList
     */
    public void toTopOfSlotList() { invoke(toTopOfSlotList, null, null); }

////////////////////////////////////////////////////////////////
// Action "toBottomOfSlotList"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code toBottomOfSlotList} action.
     * @see #toBottomOfSlotList()
     */
    public static final Action toBottomOfSlotList = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code toBottomOfSlotList} action.
     * @see #toBottomOfSlotList
     */
    public void toBottomOfSlotList() { invoke(toBottomOfSlotList, null, null); }

////////////////////////////////////////////////////////////////
// Action "renamePropertySlot"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code renamePropertySlot} action.
     * @see #renamePropertySlot()
     */
    public static final Action renamePropertySlot = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code renamePropertySlot} action.
     * @see #renamePropertySlot
     */
    public void renamePropertySlot() { invoke(renamePropertySlot, null, null); }

////////////////////////////////////////////////////////////////
// Action "changeDynamicSlotValue"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code changeDynamicSlotValue} action.
     * @see #changeDynamicSlotValue()
     */
    public static final Action changeDynamicSlotValue = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code changeDynamicSlotValue} action.
     * @see #changeDynamicSlotValue
     */
    public void changeDynamicSlotValue() { invoke(changeDynamicSlotValue, null, null); }

////////////////////////////////////////////////////////////////
// Action "addDynamicSlotWithNullName"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code addDynamicSlotWithNullName} action.
     * @see #addDynamicSlotWithNullName()
     */
    public static final Action addDynamicSlotWithNullName = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code addDynamicSlotWithNullName} action.
     * @see #addDynamicSlotWithNullName
     */
    public void addDynamicSlotWithNullName() { invoke(addDynamicSlotWithNullName, null, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

    @Override
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BManipulatingDynamicSlots.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    public void doReorderSlots()
    {
        doAddNewNumber();
        Property[] props = getDynamicPropertiesArray(); //should get all existing dynamic properties
        Property[] reorderedArray = new Property[props.length]; //Exclude wsAnnotation Property

        System.out.println("\n\n==========================");
        for( int i = 0; i < props.length; i++)
        {
            //copy array values from props array into reordered array in desired order
            reorderedArray[i] = props[i];
        }

        System.out.println("List of original unshuffled dynamic properties");
        displaySlots(props);
        reshuffleProperties(reorderedArray);
        reorder(reorderedArray);
        System.out.println("\n==========================");
        System.out.println("List of shuffled dynamic properties");
        displaySlots(reorderedArray);
    }

    public void doRenamePropertySlot()
    {
        Property[] props = getDynamicPropertiesArray(); //should get all existing dynamic properties
        for (int k = 0; k < props.length-1; k++)
        {
            rename(props[k], "renamed_" + k);
        }

        System.out.println("Renamed property slots");
        displaySlots();
        System.out.println("=========================");
    }
    public void displaySlots(Property props [])
    {

        int k = 0;
        for (Property prop : props)
        {
            System.out.println("props[" + k + "] = " + prop.getName() + " = " + get(prop) + " ==> " + prop.toString());
            k++;
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

    public void doToBottomOfSlotList()
    {
        Property[] props = getDynamicPropertiesArray();
        reorderToBottom(props[0]);
    }

    public void doToTopOfSlotList()
    {
        Property[] props = getDynamicPropertiesArray();
        reorderToTop(props[3]);
//        reorderToTop(props[props.length-1]);
    }

    public void doStartOver()
    {
        Property[] props = getDynamicPropertiesArray();
        for (Property prop : props)
            remove(prop);

        setSumOfAllNumbers(0);
        setProductOfAllNumbers(1);
        for (int k = 0; k < 5; k++)
        {
            doAddNewNumber();
        }
        setPlay("Add or Remove?");
    }

    public void doAddNewNumber()
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

        updateCounter(1);
    }

    public void doChangeDynamicSlotValue()
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

        updateCounter(1);
    }

    public void doChangeDynamicSlotValue(Property props [])
    {
        /**
         *             props[0] = add(null, nextRandomNumber(), Flags.SUMMARY | Flags.READONLY| Flags.TRANSIENT);
         *             props[1] = add(null, new BComponentWithBStructProperties(),Flags.SUMMARY);
         *             props[2] = add(null, new BNestedBStructPropertyComponent(),Flags.SUMMARY);
         *             props[3] = add(null,BBoolean.make(true));
         *             props[4] = add(null,BBoolean.make(false));
         *             unitFacets = BFacets.makeNumeric(BUnit.getUnit("fahrenheit"), 2);
         *             props[5] = add(null,BDouble.make(66),unitFacets);
         *             unitFacets = BFacets.makeNumeric(BUnit.getUnit("celsius"), 2);
         *             props[6] = add(null,BInteger.make(40),unitFacets);
         *             props[7] = add(null,BString.make("String slot"));
         * Key
         * props[0] - Integer
         * props[1] - BComponentWithBStructProperties
         * props[2] - BNestedBStructPropertyComponent
         * props[3] - BBoolean
         * props[4] - BBoolean
         * props[5] - BDouble
         * props[6] - Integer
         * props[7] - BString
         */
//        try
//        {
        BComponentWithBStructProperties val1 = new BComponentWithBStructProperties();
        val1.setBStructPropertyExample(new BBasicLightNode("111.11.11.119", BAbsTime.now(), 1000));
        BNestedBStructPropertyComponent val2 = new BNestedBStructPropertyComponent();
        val2.setCameraNode(new BCameraNode("123.22.22.456", BAbsTime.now(),  "Picture Name"));
        val2.setTimeCreated(BAbsTime.now());
        set(props[0], BInteger.make(2345));
        set(props[1], val1);
        set(props[2], val2);
        set(props[3], BBoolean.make(false));
        set(props[4], BBoolean.make(true));
        set(props[5], BDouble.make(2345.98));
        set(props[6], BInteger.make(6689));
        set(props[7], BString.make("The last value"));

        System.out.println("\n\n========================================");
        System.out.println("Dynamic Property slots with null names  changed - check new values");
        displaySlots(props);
        System.out.println("========================================");
//        }
//        catch(NumberFormatException nfe)
//        {
//            System.out.println("Cannot create slot with same name. " + nfe.getLocalizedMessage());
//        }
//        catch(Exception e)
//        {
//            System.out.println("There was an exception. Please, investigate" + e.getLocalizedMessage());
//        }
    }

    public void doAddDynamicSlotWithNullName()
    {
        try
        {
            Property props [] = new Property [8];
            BFacets unitFacets = null;
            props[0] = add(null, nextRandomNumber(), Flags.SUMMARY | Flags.READONLY| Flags.TRANSIENT);
            props[1] = add(null, new BComponentWithBStructProperties(),Flags.SUMMARY);
            props[2] = add(null, new BNestedBStructPropertyComponent(),Flags.SUMMARY);
            props[3] = add(null,BBoolean.make(true));
            props[4] = add(null,BBoolean.make(false));
            unitFacets = BFacets.makeNumeric(BUnit.getUnit("fahrenheit"), 2);
            props[5] = add(null,BDouble.make(66),unitFacets);
            unitFacets = BFacets.makeNumeric(BUnit.getUnit("celsius"), 2);
            props[6] = add(null,BInteger.make(40),unitFacets);
            props[7] = add(null,BString.make("String slot"));

            System.out.println("\n\n========================================");
            System.out.println("Dynamic Property slots created with null names");
            displaySlots(props);
            System.out.println("========================================");

            doChangeDynamicSlotValue(props);
        }
        catch(DuplicateSlotException dse)
        {
            System.out.println("Cannot create slot with same name. " + dse.getLocalizedMessage());
        }
        catch(OutOfMemoryError oome)
        {
            System.out.println("Cannot add another slot - out of memory" + oome.getLocalizedMessage());
        }

        updateCounter(1);
    }

    public BInteger nextRandomNumber(){
        int newNumber = (int)(Math.random() * 20) + 1;
        setSumOfAllNumbers(getSumOfAllNumbers() + newNumber);
        setProductOfAllNumbers(getProductOfAllNumbers() * newNumber);

        BInteger nextNum = BInteger.make(newNumber);
        return nextNum;
    }

    public void doRemoveExistingNumber()
    {
        Property[] props = getDynamicPropertiesArray();
        int num = 0;
        if (props.length > 0)
        {
            num = BInteger.make(get(props[1]).toString()).getInt();
            setSumOfAllNumbers(getSumOfAllNumbers() - num);
            if (num != 0) {
                setProductOfAllNumbers(getProductOfAllNumbers() / num);
            }
            System.out.println("The property value (BInteger) being removed is: " + num);

            try
            {
                remove(props[1]);
            }
            catch(Exception e)//check for exception if slot doesn't exist
            {
                throw new BajaRuntimeException("Slot does not exist: " + props[1]);
            }
        }
        else
        {
            System.out.println("No more numbers to remove");
        }

        updateCounter(-1);
    }

    public void updateCounter(int incDec){
        setDynamicSlotCounter(getDynamicSlotCounter() + incDec);
    }
}