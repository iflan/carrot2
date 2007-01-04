
/*
 * Carrot2 project.
 *
 * Copyright (C) 2002-2007, Dawid Weiss, Stanisław Osiński.
 * Portions (C) Contributors listed in "carrot2.CONTRIBUTORS" file.
 * All rights reserved.
 *
 * Refer to the full license file "carrot2.LICENSE"
 * in the root folder of the repository checkout or at:
 * http://www.carrot2.org/carrot2.LICENSE
 */

package org.carrot2.matrix.factorization.seeding;

import cern.colt.matrix.DoubleMatrix2D;

/**
 * Defines the seeding routine to be used as part of a matrix factorisation
 * algorithm.
 * 
 * @author Stanislaw Osinski
 * @version $Revision$
 */
public interface SeedingStrategy
{

    /**
     * Initialises values of the provided U and V matrices. The A matrix is the
     * input matrix to be factorized.
     * 
     * @param A matrix to be factorized
     * @param U
     * @param V
     */
    public void seed(DoubleMatrix2D A, DoubleMatrix2D U, DoubleMatrix2D V);
}