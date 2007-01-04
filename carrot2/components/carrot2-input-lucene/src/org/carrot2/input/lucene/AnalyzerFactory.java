
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

package org.carrot2.input.lucene;

import org.apache.lucene.analysis.*;

/**
 * Lucene analyzer factory.
 * 
 * @author Stanislaw Osinski
 * @version $Revision$
 */
public interface AnalyzerFactory
{
    /**
     * Creates an instance of a Lucene Analyzer.
     * 
     */
    public Analyzer getInstance();
}
