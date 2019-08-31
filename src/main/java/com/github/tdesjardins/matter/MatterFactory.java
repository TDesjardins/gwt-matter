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

public class MatterFactory {

    /**
     * Create generic options.
     *
     * @return options instance
     */
    public static native <T extends Options> T createOptions() /*-{
        return {};
    }-*/;

    public static native void init(Engine quintus) /*-{
        $wnd.Q = quintus;
    }-*/;

}
