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
package org.apache.servicecomb.toolkit.oasv.validation.api;

import org.apache.servicecomb.toolkit.oasv.common.OasObjectPropertyLocation;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * OpenAPI v3 validation violation
 */
public class OasViolation {

    /**
     * Object location
     */
    private final OasObjectPropertyLocation location;

    /**
     * Error message
     */
    private final String error;

    public OasViolation(OasObjectPropertyLocation location, String error) {
        this.location = location;
        this.error = error;
    }

    public OasObjectPropertyLocation getLocation() {
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
