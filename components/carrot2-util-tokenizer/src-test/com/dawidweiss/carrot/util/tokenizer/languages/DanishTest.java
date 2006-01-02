
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
package com.dawidweiss.carrot.util.tokenizer.languages;

import com.dawidweiss.carrot.core.local.linguistic.Language;
import com.dawidweiss.carrot.util.tokenizer.languages.danish.Danish;

/**
 * Test of the Danish language.
 *  
 * @author Dawid Weiss
 * @version $Revision$
 */
public class DanishTest extends LanguageImplTestBase {

	public DanishTest() {
		super();
	}

	public DanishTest(String arg0) {
		super(arg0);
	}

	protected Language getLanguageInstance() {
        return new Danish();
	}

    protected String [][] getWordsToCompare() {
        return new String [][] {
                /* TODO: Add words here. */
        };
    }
}
