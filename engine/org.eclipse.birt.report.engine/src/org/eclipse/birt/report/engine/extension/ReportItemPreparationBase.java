/*******************************************************************************
 * Copyright (c) 2008 Actuate Corporation.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.engine.extension;

import org.eclipse.birt.core.exception.BirtException;
import org.eclipse.birt.report.model.api.DesignElementHandle;

public class ReportItemPreparationBase implements IReportItemPreparation {

	protected IPreparationContext context;

	protected DesignElementHandle handle;

	@Override
	public void init(IReportItemPreparationInfo info) {
		context = info.getPreparationContext();
		handle = info.getModelObject();
	}

	@Override
	public void prepare() throws BirtException {
		context.triggerEvent(handle);
		prepareChildren();
	}

	protected void prepareChildren() throws BirtException {

	}
}
