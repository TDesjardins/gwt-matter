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
package com.github.tdesjardins.matter.geometry;

import com.github.tdesjardins.matter.JsConstants;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Vector {

    @JsMethod(namespace = JsConstants.NAMESPACE_VECTOR)
    public static native Vector create(double x, double y);

    @JsMethod(namespace = JsConstants.NAMESPACE_VECTOR)
    public static native Vector sub(Vector vectorA, Vector vectorB);

    @JsProperty
    public native double getX();

    @JsProperty
    public native void setX(double x);

    @JsProperty
    public native double getY();

    @JsProperty
    public native void setY(double y);

}
