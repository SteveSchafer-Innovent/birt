/*******************************************************************************
 * Copyright (c) 2013 Actuate Corporation.
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
package org.eclipse.birt.data.oda.pojo.util;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.birt.data.oda.pojo.input.InputFileOpener;
import org.eclipse.birt.data.oda.pojo.querymodel.PojoQuery;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.junit.Test;

/**
 *
 */

public class PojoQueryWriterTest {
	@Test
	public void testWrite() throws IOException, OdaException {
		InputStream in = InputFileOpener.openFile(InputFileOpener.SIMPLE_QUERY_FILE);

		String text = InputFileOpener.fromInputStream(in);

		PojoQuery query = PojoQueryParser.parse(text);

		String result = PojoQueryWriter.write(query);

		System.out.println(result);

		PojoQuery newQuery = PojoQueryParser.parse(result);

		assertEquals(query.getAppContextKey(), newQuery.getAppContextKey());
		assertEquals(query.getVersion(), newQuery.getVersion());
		assertEquals(query.getDataSetClass(), newQuery.getDataSetClass());

		assertEquals(query.getColumnsMappings().length, newQuery.getColumnsMappings().length);

		for (int i = 0; i < query.getColumnsMappings().length; i++) {
			PojoQueryParserTest.assertEqualColumnsMapping(query.getColumnsMappings()[i],
					newQuery.getColumnsMappings()[i]);
		}
	}

}
