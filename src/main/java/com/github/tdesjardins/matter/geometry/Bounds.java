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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Matter.Bounds module contains methods for creating and manipulating axis-aligned bounding boxes (AABB).
 *
 * @author Tino Desjardins
 *
 */
@JsType(isNative = true)
public class Bounds {

    /**
     * Creates a new axis-aligned bounding box (AABB) for the given vertices.
     * 
     * @param engine
     */
    @JsMethod(namespace = JsConstants.NAMESPACE_BOUNDS)
    public static native Bounds create(Vector[] vertices);

    /**
     * Returns true if the bounds contains the given point.
     * 
     * @param bounds
     * @param point
     * @return true if the bounds contains the given point
     */
    @JsMethod(namespace = JsConstants.NAMESPACE_BOUNDS)
    public static native boolean contains(Bounds bounds, Vector point);

    /**
     * Returns true if the two bounds intersect.
     * 
     * @param boundsA
     * @param boundsB
     * @return true if the two bounds intersect
     */
    @JsMethod(namespace = JsConstants.NAMESPACE_BOUNDS)
    public static native boolean overlaps(Bounds boundsA, Bounds boundsB);

    /**
     * Shifts the bounds to the given position.
     * 
     * @param bounds
     * @param position
     */
    @JsMethod(namespace = JsConstants.NAMESPACE_BOUNDS)
    public static native void shift(Bounds bounds, Vector position);

    /**
     * Translates the bounds by the given vector.
     * 
     * @param bounds
     * @param vector
     */
    @JsMethod(namespace = JsConstants.NAMESPACE_BOUNDS)
    public static native void translate(Bounds bounds, Vector vector);

    @JsOverlay
    public final void translate(Vector vector) {
        Bounds.translate(this, vector);
    }

    @JsOverlay
    public final Vector getCenter() {
        double centerX = this.getWidth() / 2 + this.getMin().getX();
        double centerY = this.getHeight() / 2 + this.getMin().getY();
        return Vector.create(centerX, centerY);
    }

    @JsOverlay
    public final double getHeight() {
        return this.getMax().getY() - this.getMin().getY();
    }

    @JsOverlay
    public final double getWidth() {
        return this.getMax().getX() - this.getMin().getX();
    }

    @JsProperty
    public native Vector getMin();

    @JsProperty
    public native Vector getMax();

}
