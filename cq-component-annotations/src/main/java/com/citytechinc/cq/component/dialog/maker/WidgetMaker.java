/**
 *    Copyright 2013 CITYTECH, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.citytechinc.cq.component.dialog.maker;

import java.lang.reflect.InvocationTargetException;

import javassist.CannotCompileException;
import javassist.NotFoundException;

import com.citytechinc.cq.component.dialog.DialogElement;
import com.citytechinc.cq.component.dialog.exception.InvalidComponentFieldException;

/**
 * A WidgetMaker is a class which is intended to create a single Widget based on
 * an annotated Field in a Component Class. Such a Maker will return an object
 * implementing DialogElement suitable for addition into a Dialog.
 *
 * Widget Makers are tied to concrete widget types by way of a
 * {@link com.citytechinc.cq.component.annotations.config.Widget} annotation.
 */
public interface WidgetMaker {

	/**
	 *
	 * @return A constructed DialogElement Widget
	 *
	 * @throws InvalidComponentFieldException
	 * @throws NotFoundException
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws CannotCompileException
	 * @throws NoSuchFieldException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 */
	public DialogElement make() throws InvalidComponentFieldException, NotFoundException, ClassNotFoundException,
		SecurityException, CannotCompileException, NoSuchFieldException, InstantiationException,
		IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException;
}
