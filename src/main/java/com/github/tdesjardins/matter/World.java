package com.github.tdesjardins.matter;

import com.github.tdesjardins.matter.composite.Composite;
import com.github.tdesjardins.matter.geometry.Bounds;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class World extends Composite {

    @JsMethod(namespace = JsConstants.NAMESPACE_WORLD)
    public static native void add(World world, MatterObject object);

    @JsOverlay
    public final void add(MatterObject object) {
        World.add(this, object);
    }

    @JsProperty
    public native Bounds getBounds();

}
