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

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 * @author Tino Desjardins
 *
 */
@JsType(isNative = true)
public interface RenderOptionsOptions {

    @JsProperty
    public void setBackground(String background);

    @JsProperty
    public void setHasBounds(boolean hasBounds);

    @JsProperty
    public void setPixelRatio(double pixelRatio);

    @JsProperty
    public void setShowCollisions(boolean showCollisions);

    @JsProperty
    public void setShowDebug(boolean showDebug);

    @JsProperty
    public void setShowPositions(boolean showPositions);

    @JsProperty
    public void setShowShadows(boolean showShadows);

    @JsProperty
    public void setWireframes(boolean wireframes);

    @JsProperty
    public void setWidth(int width);

    @JsProperty
    public void setHeight(int height);

}
