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
package org.eclipse.birt.data.oda.pojo.input.pojos;

/**
 *
 */

public class TeacherStudentCourse extends TeacherStudent {
	public TeacherStudentCourse(Teacher teacher, Student student, Course course) {
		super(teacher, student);
		this.course = course;
	}

	public Course course;
}
