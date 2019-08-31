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
package com.github.tdesjardins.matter.composite;

import com.github.tdesjardins.matter.JsConstants;
import com.github.tdesjardins.matter.MatterObject;
import com.github.tdesjardins.matter.body.Body;
import com.github.tdesjardins.matter.geometry.Vector;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Composite implements MatterObject {

    @JsMethod(namespace = JsConstants.NAMESPACE_COMPOSITE)
    public static native Composite create(CompositeOptions compositeOptions);

    @JsMethod(namespace = JsConstants.NAMESPACE_COMPOSITE)
    public static native Body[] allBodies(Composite composite);

    @JsMethod(namespace = JsConstants.NAMESPACE_COMPOSITE)
    public static native void translate(Composite composite, Vector vector);

    @JsOverlay
    public final Body[] allBodies() {
        return Composite.allBodies(this);
    }

}

