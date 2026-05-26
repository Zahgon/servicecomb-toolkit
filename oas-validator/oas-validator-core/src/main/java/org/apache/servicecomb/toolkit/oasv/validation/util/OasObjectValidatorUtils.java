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
package org.apache.servicecomb.toolkit.oasv.validation.util;

import org.apache.servicecomb.toolkit.oasv.common.OasObjectPropertyLocation;
import org.apache.servicecomb.toolkit.oasv.common.OasObjectType;
import org.apache.servicecomb.toolkit.oasv.validation.api.*;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import static java.util.Collections.emptyList;

public abstract class OasObjectValidatorUtils {

    private OasObjectValidatorUtils() {
        // singleton
    }

    /**
     * @param context
     * @param propertyLoc
     * @param propertyObject
     * @param validators
     * @param <T>
     * @return
     */
    public static <T> List<OasViolation> doValidateProperty(OasValidationContext context, OasObjectPropertyLocation propertyLoc, T propertyObject, List<? extends OasObjectValidator<T>> validators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param <T>
     * @param context
     * @param ownerLocation    location of owner OAS object who own this listProperty
     * @param listPropertyName listProperty name appears in owner OAS object
     * @param listProperty     null-safe
     * @param elementType      type of elements in listProperty
     * @param validators
     * @return
     */
    public static <T> List<OasViolation> doValidateListProperty(OasValidationContext context, OasObjectPropertyLocation ownerLocation, String listPropertyName, List<T> listProperty, OasObjectType elementType, List<? extends OasObjectValidator<T>> validators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param ownerLocation   location of owner OAS object who own this mapProperty
     * @param mapPropertyName mapProperty name appears in owner OAS object
     * @param mapProperty     null-safe
     * @param keyPredicate
     * @param errorMessage
     * @param <T>
     * @return
     */
    public static <T> List<OasViolation> doValidateMapPropertyKeys(OasObjectPropertyLocation ownerLocation, String mapPropertyName, Map<String, T> mapProperty, Predicate<String> keyPredicate, Function<String, String> errorMessage) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param <T>
     * @param context
     * @param ownerLocation   location of owner OAS object who own this mapProperty
     * @param mapPropertyName mapProperty name appears in owner OAS object
     * @param mapProperty     null-safe
     * @param valueType       type of values in mapProperty
     * @param validators
     * @return
     */
    public static <T> List<OasViolation> doValidateMapPropertyValues(OasValidationContext context, OasObjectPropertyLocation ownerLocation, String mapPropertyName, Map<String, T> mapProperty, OasObjectType valueType, List<? extends OasObjectValidator<T>> validators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
