/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.servicecomb.toolkit.oasv.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.*;
import static java.util.Collections.singletonList;

/**
 * OpenAPI v3 object location
 * <p>本对象immutable</p>
 */
public class OasObjectPropertyLocation {

    /**
     * first element stands for root object
     * last element stands for current object
     * this list stands for the path from root to current object
     */
    private final List<OasObjectProperty> path;

    private OasObjectPropertyLocation(OasObjectProperty path) {
        this(singletonList(path));
    }

    private OasObjectPropertyLocation(List<OasObjectProperty> path) {
        this.path = Collections.unmodifiableList(path);
    }

    /**
     * Create a location for root object
     *
     * @return
     */
    public static OasObjectPropertyLocation root() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Add property to this location and return a new location
     *
     * @param propertyName property name
     * @param propertyType OAS object type of property
     * @return a new {@link OasObjectPropertyLocation}，origin {@link OasObjectPropertyLocation} is untouched
     */
    public OasObjectPropertyLocation property(String propertyName, OasObjectType propertyType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Add a non-object(primitive) type property to this location, and return a new location
     *
     * @param propertyName property name
     * @return a new {@link OasObjectPropertyLocation}，origin {@link OasObjectPropertyLocation} is untouched
     */
    public OasObjectPropertyLocation property(String propertyName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get a path from root to leaf
     *
     * @return
     */
    public List<OasObjectProperty> getPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get parent property
     *
     * @return
     */
    @JsonIgnore
    public OasObjectProperty getParent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String toPathString(OasObjectPropertyLocation location) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
