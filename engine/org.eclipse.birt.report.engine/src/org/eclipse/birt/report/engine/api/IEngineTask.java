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

package org.eclipse.birt.report.engine.api;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.birt.core.archive.IDocArchiveReader;

import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;

/**
 * defines common features for an engine task. A task captures a set of
 * operations that engine performs to get a unit of work done.
 */
public interface IEngineTask {

	int TASK_UNKNOWN = -1;

	int TASK_GETPARAMETERDEFINITION = 0;

	int TASK_RUN = 1;

	int TASK_RENDER = 2;

	int TASK_RUNANDRENDER = 3;

	int TASK_DATAEXTRACTION = 4;

	int TASK_DATASETPREVIEW = 5;

	/**
	 * sets the task locale
	 *
	 * @param locale the task locale
	 */
	void setLocale(Locale locale);

	/**
	 * sets the task locale
	 *
	 * @param locale the task locale
	 */
	void setLocale(ULocale locale);

	/**
	 * Set the time zone information for the task.
	 * <p>
	 * Only following tasks have the meaningful implementations:
	 * <li>RunAndRenderTask</li>
	 * <li>RenderTask</li>
	 * <li>GetParameterDefinitionTask</li>
	 *
	 * @param timeZone the time zone information for the task
	 */
	void setTimeZone(TimeZone timeZone);

	/**
	 * sets the task context.
	 *
	 * this method must be called before the run/render/execute etc.
	 *
	 * @param context - task contexts in a map. The map contains name-value pairs
	 */
	void setAppContext(Map context);

	/**
	 * returns the locale for running the task
	 *
	 * @return the locale for running the task
	 */
	Locale getLocale();

	/**
	 * returns the locale for running the task
	 *
	 * @return the locale for running the task
	 */
	ULocale getULocale();

	/**
	 * returns the context objects for the task.
	 *
	 * The return appContext is read only, the user should never try to modify the
	 * value.
	 *
	 * @return the task contexts
	 */
	Map getAppContext();

	/**
	 * returns the report engine object
	 *
	 * @return the engine object
	 */
	IReportEngine getEngine();

	/**
	 * defines an additional Java object that is exposed to BIRT scripting at a
	 * per-task level
	 *
	 * @param jsName the name that the object is referenced in JavaScript
	 * @param obj    the Java object that is wrapped and scripted
	 * @deprecated user should add it to appContext.
	 */
	@Deprecated
	void addScriptableJavaObject(String jsName, Object obj);

	/**
	 * returns an identifier for the task. The identifier can be used to identify
	 * the task, especially when writing logs in a multi-threaded environment.
	 *
	 * @return an identifier for the task.
	 */
	int getID();

	/**
	 * returns the runnable report design object
	 *
	 * @return the runnable report design object
	 */
	IReportRunnable getReportRunnable();

	/**
	 * set all parameter valuess
	 *
	 * @param params a hash map with all parameters
	 */
	void setParameterValues(Map params);

	/**
	 * sets one parameter value
	 *
	 * @param name  parameter name
	 * @param value parameter value
	 */
	void setParameterValue(String name, Object value);

	/**
	 * sets one parameter values
	 *
	 * @param name   parameter name
	 * @param values parameter values
	 */
	void setParameterValue(String name, Object[] values);

	/**
	 * returns the parameter name/value collection
	 *
	 * @return the parameter names/values in a hash map
	 */
	HashMap getParameterValues();

	/**
	 * returns the value of a parameter.
	 *
	 * @return the parameter value.
	 */
	Object getParameterValue(String name);

	/**
	 * @return whether the parameter validation succeeds <br>
	 */
	boolean validateParameters();

	/**
	 * Sets parameter value and display text.
	 *
	 * @param name        parameter name.
	 * @param value       value.
	 * @param displayText display text.
	 */
	void setParameter(String name, Object value, String displayText);

	/**
	 * Sets parameter value and display text.
	 *
	 * @param name        parameter name.
	 * @param values      values.
	 * @param displayText display text.
	 */
	void setParameter(String name, Object[] values, String[] displayText);

	/**
	 * Gets parameter display text by parameter name.
	 *
	 * @param name parameter name.
	 * @return display text.
	 */
	Object getParameterDisplayText(String name);

	/**
	 * Sets display text of a parameter with specified name.
	 *
	 * @param name        name of the parameter.
	 * @param displayText display text to set.
	 */
	void setParameterDisplayText(String name, String displayText);

	/**
	 * Sets display text of a parameter with specified name.
	 *
	 * @param name        name of the parameter.
	 * @param displayText display text to set.
	 */
	void setParameterDisplayText(String name, String[] text);

	/**
	 * set the cancel flag if the task is running. the task can re-run if it was
	 * cancelled.
	 */
	void cancel();

	/**
	 * cancels the task by the given reason.
	 */
	void cancel(String reason);

	/**
	 * return a flag if the user called cancel.
	 *
	 * @return true the user has called cancel, false the user doesn't call cancel.
	 */
	boolean getCancelFlag();

	/**
	 * the task is not running yet
	 */
	int STATUS_NOT_STARTED = 0;
	/**
	 * the task is running
	 */
	int STATUS_RUNNING = 1;
	/**
	 * the task is finished with sucessful
	 */
	int STATUS_SUCCEEDED = 2;
	/**
	 * the task is finished with errors
	 */
	int STATUS_FAILED = 3;
	/**
	 * the task is finished by cancled
	 */
	int STATUS_CANCELLED = 4;

	/**
	 * get the status of task
	 *
	 * @return the status
	 */
	int getStatus();

	/**
	 * continue the task execution if there is an error.
	 */
	int CONTINUE_ON_ERROR = 0;
	/**
	 * cancel the task execution if there is an error.
	 */
	int CANCEL_ON_ERROR = 1;

	/**
	 * set the error handling mode for the first error.
	 *
	 * If the options is set to cancel_on_error, the task is cancelled just like the
	 * user calls cancel().
	 *
	 * If the option is set the continue_on_erro, the task will continue and saves
	 * the error into the error list.
	 *
	 * @param option the error handling mode.
	 * @return
	 */
	void setErrorHandlingOption(int option);

	/**
	 * close the task, relese any resources.
	 */
	void close();

	/**
	 * set the data source used by the engine task. The dataSource is closed by this
	 * task.
	 *
	 * @param dataSource data source archive.
	 */
	void setDataSource(IDocArchiveReader dataSource);

	/**
	 * set the data source used by the engine task.
	 *
	 * @param dataSource data source archive.
	 * @param reportlet  the bookmark of the reportlet.
	 */
	void setDataSource(IDocArchiveReader dataSource, String reportlet);

	/**
	 * Gets all exceptions that are thrown out during executing this task. Each
	 * exception is supposed to be an instance of EngineException.
	 *
	 * @return the all the exceptions in a list.
	 */
	List getErrors();

	/**
	 * Gets the type of the engine.
	 *
	 * @return task type including:
	 *         <li><b>0</b> for GetParameterDefinition Task</li>
	 *         <li><b>1</b> for Run Task</li>
	 *         <li><b>2</b> for Render Task</li>
	 *         <li><b>3</b> for Run and Render Task</li>
	 *         <li><b>4</b> for DataExtraction Task</li>
	 *         <li><b>-1</b> default value for unknown task</li>
	 */
	int getTaskType();

	/**
	 * return the logger used by the task.
	 *
	 * @return logger used by the task.
	 */
	Logger getLogger();

	/**
	 * set the logger used by the task.
	 *
	 * @param logger the logger used to output messages.
	 */
	void setLogger(Logger logger);

	/**
	 * set user's ACL.
	 *
	 * @param acl a string array, each element is a single SID.
	 */
	void setUserACL(String[] acl);

	/**
	 * the a progress monitor to keep track of the report progress
	 *
	 * @param monitor a user defined progress monitor
	 */
	void setProgressMonitor(IProgressMonitor monitor);

	/**
	 * set a task-level status handler, this handler will override the engine-level
	 * one
	 *
	 * @param handler a user defined status handler
	 */
	void setStatusHandler(IStatusHandler handler);
}
