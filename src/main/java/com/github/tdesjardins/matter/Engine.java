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
package com.github.tdesjardins.matter;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Engine {

    /**
     * Clears the engine including the world, pairs and broadphase.
     * 
     * @param engine
     */
    @JsMethod(namespace = JsConstants.NAMESPACE_ENGINE)
    public static native void clear(Engine engine);

    /**
     * Creates a new engine. The options parameter is an object
     * that specifies any properties you wish to override the defaults.
     * All properties have default values, and many are pre-calculated
     * automatically based on other properties. See the properties section
     * below for detailed information on what you can pass via the options object.
     * 
     * @return engine
     */
    @JsMethod(namespace = JsConstants.NAMESPACE_ENGINE)
    public static native Engine create();

    /**
     * Merges two engines by keeping the configuration of engineA but
     * replacing the world with the one from engineB.
     * 
     * @param engineA
     * @param engineB
     */
    @JsMethod(namespace = JsConstants.NAMESPACE_ENGINE)
    public static native void merge(Engine engineA, Engine engineB);

    @JsMethod(namespace = JsConstants.NAMESPACE_ENGINE)
    public static native void run(Engine engine);

    @JsProperty
    public native World getWorld();

}
