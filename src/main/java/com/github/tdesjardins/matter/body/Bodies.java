/*******************************************************************************
 * Copyright 2019 gwt-matter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.github.tdesjardins.matter.body;

import com.github.tdesjardins.matter.JsConstants;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Bodies {

    @JsMethod(namespace = JsConstants.NAMESPACE_BODIES)
    public static native Body circle(int x, int y, int radius);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODIES)
    public static native Body circle(int x, int y, int radius, BodyOptions bodyOptions);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODIES)
    public static native Body rectangle(int x, int y, int width, int height);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODIES)
    public static native Body rectangle(int x, int y, int width, int height, BodyOptions bodyOptions);

}
