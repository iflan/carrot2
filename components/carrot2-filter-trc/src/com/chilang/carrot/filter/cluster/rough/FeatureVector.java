
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
package com.chilang.carrot.filter.cluster.rough;

import cern.colt.bitvector.BitVector;

public interface FeatureVector {


    /**
     * Get weight at given index
     * @param index
     * @return double value at given index
     */
    public double getWeight(int index);

    /**
     * Set weight for given index
     * @param index
     * @param value
     */
    public void setWeight(int index, double value);

    /**
     * Return size of vector
     * @return
     */
    public int size();

    /**
     * Make a copy of  this object
     * @return a copy of this object
     */
    public FeatureVector copy();

    /**
     * Return internal representation of feature as bit vector.
     * Bit is set for non-zero weight.
     *
     * @return BitVector
     */
    public BitVector asBitVector();

    /**
     * Set all weight to zero.
     */
    public void clear();

    /**
     * Return array of non-zero indices
     * @return array of indices which values are non-zero in this vector
     */
    public int[] getNonZeroIndices();

    /**
     * Normalize length vector weights 
     */
    public void normalize();
}
