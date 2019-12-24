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
package com.github.tdesjardins.matter.input;

import com.github.tdesjardins.matter.JsConstants;
import com.github.tdesjardins.matter.geometry.Vector;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Mouse {

    @JsMethod(namespace = JsConstants.NAMESPACE_MOUSE)
    public static native Mouse create(Element element);

    @JsMethod(namespace = JsConstants.NAMESPACE_MOUSE)
    public static native void setOffset(Mouse mouse, Vector offset);

    @JsOverlay
    public final void setOffset(Vector offset) {
        setOffset(this, offset);
    }

}
