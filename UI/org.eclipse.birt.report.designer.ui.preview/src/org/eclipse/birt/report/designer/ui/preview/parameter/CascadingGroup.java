/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
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

package org.eclipse.birt.report.designer.ui.preview.parameter;

import org.eclipse.birt.report.model.api.ParameterGroupHandle;

/**
 * Cascading parameter group.
 *
 */
public class CascadingGroup extends AbstractParamGroup implements ICascadingGroup {

	/**
	 * Constructor
	 *
	 * @param handle
	 * @param engineTask
	 */

	public CascadingGroup(ParameterGroupHandle handle) {
		super(handle);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.birt.report.designer.ui.preview.parameter.ICascadingGroup#
	 * getParameter(int)
	 */

	@Override
	public IParameter getParameter(int index) {
		if (index >= 0 && index < childrenList.size()) {
			return (IParameter) childrenList.get(index);
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.birt.report.designer.ui.preview.parameter.ICascadingGroup#
	 * getPostParameter(org.eclipse.birt.report.designer.ui.preview.parameter.
	 * IParameter)
	 */

	@Override
	public IParameter getPostParameter(IParameter parameter) {
		int index = childrenList.indexOf(parameter);
		return getParameter(++index);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.birt.report.designer.ui.preview.parameter.ICascadingGroup#
	 * getPreParameter(org.eclipse.birt.report.designer.ui.preview.parameter.
	 * IParameter)
	 */

	@Override
	public IParameter getPreParameter(IParameter parameter) {
		int index = childrenList.indexOf(parameter);
		return getParameter(--index);
	}

}
