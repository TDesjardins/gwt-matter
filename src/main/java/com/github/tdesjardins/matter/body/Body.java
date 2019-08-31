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
import com.github.tdesjardins.matter.MatterObject;
import com.github.tdesjardins.matter.geometry.Bounds;
import com.github.tdesjardins.matter.geometry.Vector;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Body implements MatterObject {

    @JsMethod(namespace = JsConstants.NAMESPACE_BODY)
    public static native void applyForce(Body body, Vector position, Vector force);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODY)
    public static native Body create(BodyOptions bodyOptions);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODY)
    public static native void rotate(Body body, double rotation);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODY)
    public static native void scale(Body body, double scaleX, double scaleY);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODY)
    public static native void translate(Body body, Vector translation);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODY)
    public static native void setAngle(Body body, double angle);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODY)
    public static native void setAngularVelocity(Body body, double velocity);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODY)
    public static native void setDensity(Body body, double density);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODY)
    public static native void setInertia(Body body, double inertia);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODY)
    public static native void setMass(Body body, double mass);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODY)
    public static native void setPosition(Body body, Vector vector);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODY)
    public static native void setStatic(Body body, boolean isStatic);

    @JsMethod(namespace = JsConstants.NAMESPACE_BODY)
    public static native void setVelocity(Body body, Vector vector);

    @JsOverlay
    public final void applyForce(Vector position, Vector force) {
        Body.applyForce(this, position, force);
    }

    @JsOverlay
    public final void rotate(double rotation) {
        Body.rotate(this, rotation);
    }

    @JsOverlay
    public final void scale(double scaleX, double scaleY) {
        Body.scale(this, scaleX, scaleY);
    }

    @JsOverlay
    public final void translate(Vector translate) {
        Body.translate(this, translate);
    }

    @JsOverlay
    public final void setAngle(double angle) {
        Body.setAngle(this, angle);
    }

    /**
     * Sets the angular velocity of the body instantly. Position, angle, force etc. are unchanged.
     * See also Body.applyForce.
     *
     * @param velocity angular velocity of the body
     */
    @JsOverlay
    public final void setAngularVelocity(double velocity) {
        Body.setAngularVelocity(this, velocity);
    }

    /**
     * Sets the density of the body. Mass is automatically updated to reflect the change.
     *
     * @param density density of the body
     */
    @JsOverlay
    public final void setDensity(double density) {
        Body.setDensity(this, density);
    }

    /**
     * Sets the moment of inertia (i.e. second moment of area) of the body of the body. Inverse
     * inertia is automatically updated to reflect the change. Mass is not changed.
     *
     * @param inertia moment of inertia
     */
    @JsOverlay
    public final void setInertia(double inertia) {
        Body.setInertia(this, inertia);
    }

    /**
     * Sets the mass of the body. Inverse mass and density are automatically updated to reflect
     * the change.
     *
     * @param mass mass of the body
     */
    @JsOverlay
    public final void setMass(double mass) {
        Body.setMass(this, mass);
    }

    /**
     * Sets the position of the body instantly. Velocity, angle, force etc. are unchanged.
     *
     * @param position position of the body
     */
    @JsOverlay
    public final void setPosition(Vector position) {
        Body.setPosition(this, position);
    }

    /**
     * Sets the body as static, including isStatic flag and setting mass and inertia to Infinity.
     *
     * @param isStatic is the body static
     */
    @JsOverlay
    public final void setStatic(boolean isStatic) {
        Body.setStatic(this, isStatic);
    }

    @JsOverlay
    public final void setVelocity(Vector vector) {
        Body.setVelocity(this, vector);
    }

    @JsProperty
    public native Bounds getBounds();

    @JsProperty
    public native void setFriction(double friction);

    @JsProperty
    public native void setFrictionAir(double frictionAir);

    /**
     * A flag that indicates whether a body is a sensor. Sensor triggers collision events,
     * but doesn't react with colliding body physically.
     *
     * @param isSensor body is a sensor
     */
    @JsProperty
    public native void setIsSensor(boolean isSensor);

    /**
     * A Number that defines the restitution (elasticity) of the body. The value is always positive
     * and is in the range (0, 1). A value of 0 means collisions may be perfectly inelastic and no
     * bouncing may occur. A value of 0.8 means the body may bounce back with approximately 80% of
     * its kinetic energy. Note that collision response is based on pairs of bodies, and that
     * restitution values are combined with the following formula:
     * Math.max(bodyA.restitution, bodyB.restitution)
     *
     * @return Number that defines the restitution (elasticity) of the body
     */
    @JsProperty
    public native double getRestitution();

    @JsProperty
    public native void setRestitution(double restitution);

    /**
     * A Number that defines the number of updates in which this body must have near-zero velocity
     * before it is set as sleeping by the Matter.Sleeping module (if sleeping is enabled by the engine).
     *
     * @return number of updates in which this body must have near-zero velocity
     * before it is set as sleeping by the Matter.Sleeping module
     */
    @JsProperty
    public native int getSleepTreshold();

    /**
     * A Number that defines the number of updates in which this body must have near-zero velocity
     * before it is set as sleeping by the Matter.Sleeping module (if sleeping is enabled by the engine).
     *
     * @param sleepTeshold
     */
    @JsProperty
    public native void setSleepTreshold(int sleepTeshold);

    @JsProperty
    public native double getSlop();

    @JsProperty
    public native void setSlop(double slop);

    @JsProperty
    public native Vector getPosition();

    @JsProperty
    public native double getSpeed();

    @JsProperty
    public native Vector getVelocity();

}
