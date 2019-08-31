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
package com.github.tdesjardins.matter.collision;

import com.github.tdesjardins.matter.JsConstants;
import com.github.tdesjardins.matter.body.Body;
import com.github.tdesjardins.matter.geometry.Bounds;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * The Matter.Bounds module contains methods for creating and manipulating axis-aligned bounding boxes (AABB).
 *
 * @author Tino Desjardins
 *
 */
@JsType(isNative = true)
public class Query {

    @JsMethod(namespace = JsConstants.NAMESPACE_QUERY)
    public static native Body[] region(Body[] bodies, Bounds bounds);
 
    @JsMethod(namespace = JsConstants.NAMESPACE_QUERY)
    public static native Body[] region(Body[] bodies, Bounds bounds, boolean outside);

}

