
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

package org.carrot2.ant.deps;

import org.apache.tools.ant.Project;
import org.carrot2.ant.tasks.BringToDateTask;


/**
 * Each build trigger stored in {@link BuildElement} 
 * must implement this interface.
 */
interface BuildTask {
	void execute(Project project, String profile, BringToDateTask task);
}
