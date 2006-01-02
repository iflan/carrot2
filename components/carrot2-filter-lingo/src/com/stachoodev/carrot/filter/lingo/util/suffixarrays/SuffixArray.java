
/*
 * Carrot2 project.
 *
 * Copyright (C) 2002-2006, Dawid Weiss, Stanisław Osiński.
 * Portions (C) Contributors listed in "carrot2.CONTRIBUTORS" file.
 * All rights reserved.
 *
 * Refer to the full license file "carrot2.LICENSE"
 * in the root folder of the repository checkout or at:
 * http://www.cs.put.poznan.pl/dweiss/carrot2.LICENSE
 */
package com.stachoodev.carrot.filter.lingo.util.suffixarrays;


/**
 *
 */
public class SuffixArray {
    /** */

    /** DOCUMENT ME! */
    protected int[] suffixArray;

    /**
     *
     */
    SuffixArray(int[] suffixArray) {
        this.suffixArray = suffixArray;
    }

    /**
     *
     */
    public int[] getSuffixArray() {
        return suffixArray;
    }

    /**
     *
     */
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[ ");

        for (int i = 0; i < suffixArray.length; i++) {
            stringBuffer.append(Integer.toString(suffixArray[i]));
            stringBuffer.append(" ");
        }

        stringBuffer.append("]");

        return stringBuffer.toString();
    }
}
