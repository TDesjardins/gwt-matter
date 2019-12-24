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
package com.github.tdesjardins.matter.render;

import com.github.tdesjardins.matter.JsConstants;
import com.github.tdesjardins.matter.geometry.Bounds;

import elemental2.dom.CanvasRenderingContext2D;
import elemental2.dom.HTMLCanvasElement;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Render {

    @JsMethod(namespace = JsConstants.NAMESPACE_RENDER)
    public static native Render create(RenderOptions renderOptions);

    @JsMethod(namespace = JsConstants.NAMESPACE_RENDER)
    public static native void run(Render render);

    @JsMethod(namespace = JsConstants.NAMESPACE_RENDER)
    public static native void stop(Render render);

    @JsProperty
    public native Bounds getBounds();

    @JsProperty
    public native HTMLCanvasElement getCanvas();

    @JsProperty
    public native CanvasRenderingContext2D getContext();

    @JsProperty
    public native RenderOptionsOptions getOptions();

}
