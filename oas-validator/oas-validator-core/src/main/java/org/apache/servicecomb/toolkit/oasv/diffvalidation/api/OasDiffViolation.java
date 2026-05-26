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
package org.apache.servicecomb.toolkit.oasv.diffvalidation.api;

import org.apache.servicecomb.toolkit.oasv.common.OasObjectPropertyLocation;
import java.util.Objects;
import java.util.StringJoiner;

public class OasDiffViolation {

    /**
     * left OAS object location
     */
    private final OasObjectPropertyLocation leftLocation;

    /**
     * right OAS object location
     */
    private final OasObjectPropertyLocation rightLocation;

    private final String error;

    public static OasDiffViolation onlyLeft(OasObjectPropertyLocation location, String error) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static OasDiffViolation onlyRight(OasObjectPropertyLocation location, String error) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public OasDiffViolation(OasObjectPropertyLocation leftLocation, OasObjectPropertyLocation rightLocation, String error) {
        this.leftLocation = leftLocation;
        this.rightLocation = rightLocation;
        this.error = error;
    }

    public OasObjectPropertyLocation getLeftLocation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public OasObjectPropertyLocation getRightLocation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getError() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
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
}
