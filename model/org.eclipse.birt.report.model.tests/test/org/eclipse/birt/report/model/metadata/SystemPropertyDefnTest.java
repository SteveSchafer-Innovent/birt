/*******************************************************************************
* Copyright (c) 2004 Actuate Corporation.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v2.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-2.0.html
*
* Contributors:
*  Actuate Corporation  - initial API and implementation
*******************************************************************************/
package org.eclipse.birt.report.model.metadata;

import org.eclipse.birt.report.model.util.BaseTestCase;

/**
 * Test case for SystemPropertyDefn.
 *
 */
public class SystemPropertyDefnTest extends BaseTestCase {
	private SystemPropertyDefn property = null;

	/*
	 * @see TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		property = new SystemPropertyDefn();
	}

	/**
	 * test getters and setters.
	 *
	 */
	public void testGetterAndSetter() {
		MetadataTestUtil.setStyleProperty(property, true);
		MetadataTestUtil.setIntrinsic(property, true);

		assertTrue(property.isStyleProperty());
		assertTrue(property.isIntrinsic());
		assertTrue(property.isSystemProperty());
	}
}
