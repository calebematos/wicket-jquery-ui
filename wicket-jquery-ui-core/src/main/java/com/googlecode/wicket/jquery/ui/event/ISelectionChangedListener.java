/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.wicket.jquery.ui.event;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.form.Form;

import com.googlecode.wicket.jquery.ui.form.slider.AbstractSlider;

/**
 * Specifies that an {@link AbstractSlider} has ajax capabilities
 *
 * @author Sebastien Briquet - sebastien@7thweb.net
 */
public interface ISelectionChangedListener
{
	/**
	 * Triggers when the value has changed
	 * @param target the {@link AjaxRequestTarget}
	 * @param form the {@link Form}
	 */
	void onSelectionChanged(AjaxRequestTarget target, Form<?> form);
}