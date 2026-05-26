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
package org.apache.servicecomb.toolkit.oasv.diffvalidation.util;

import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.OasDiffValidationContext;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.OasDiffValidationException;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.OasDiffViolation;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.OasObjectDiffValidator;
import org.apache.servicecomb.toolkit.oasv.common.OasObjectPropertyLocation;
import org.apache.servicecomb.toolkit.oasv.common.OasObjectType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;

public abstract class OasObjectDiffValidatorUtils {

    private OasObjectDiffValidatorUtils() {
        // singleton
    }

    /**
     * assert parameters is not null-malformed
     *
     * @param leftLocation
     * @param leftOasObject
     * @param rightLocation
     * @param rightOasObject
     * @param <T>
     */
    public static <T> void assertNullGood(OasObjectPropertyLocation leftLocation, T leftOasObject, OasObjectPropertyLocation rightLocation, T rightOasObject) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param context
     * @param leftLocation
     * @param leftOasObject  null-safe
     * @param rightLocation
     * @param rightOasObject null-safe
     * @param validators
     * @param <T>
     * @return
     */
    public static <T> List<OasDiffViolation> doDiffValidateProperty(OasDiffValidationContext context, OasObjectPropertyLocation leftLocation, T leftOasObject, OasObjectPropertyLocation rightLocation, T rightOasObject, List<? extends OasObjectDiffValidator<T>> validators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param context
     * @param listPropertyName
     * @param leftOwnerLocation
     * @param leftListProperty   null-safe
     * @param rightOwnerLocation
     * @param rightListProperty  null-safe
     * @param elementType
     * @param elementKeyMapper
     * @param validators
     * @param <T>
     * @return
     */
    public static <T> List<OasDiffViolation> doDiffValidateListProperty(OasDiffValidationContext context, String listPropertyName, OasObjectPropertyLocation leftOwnerLocation, List<T> leftListProperty, OasObjectPropertyLocation rightOwnerLocation, List<T> rightListProperty, OasObjectType elementType, Function<T, ?> elementKeyMapper, List<? extends OasObjectDiffValidator<T>> validators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static <T> int indexOf(List<T> elementList, Object searchKey, Function<T, ?> elementKeyMapper) {
        for (int i = 0; i < elementList.size(); i++) {
            T element = elementList.get(i);
            if (elementKeyMapper.apply(element).equals(searchKey)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param context
     * @param mapPropertyName
     * @param leftOwnerLocation
     * @param leftMapProperty    null-safe
     * @param rightOwnerLocation
     * @param rightMapProperty   null-safe
     * @param valueType
     * @param validators
     * @param <T>
     * @return
     */
    public static <T> List<OasDiffViolation> doDiffValidateMapProperty(OasDiffValidationContext context, String mapPropertyName, OasObjectPropertyLocation leftOwnerLocation, Map<String, T> leftMapProperty, OasObjectPropertyLocation rightOwnerLocation, Map<String, T> rightMapProperty, OasObjectType valueType, List<? extends OasObjectDiffValidator<T>> validators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static void assertOwnerLocationNotNull(OasObjectPropertyLocation leftOwnerLocation, OasObjectPropertyLocation rightOwnerLocation) {
        if (leftOwnerLocation == null) {
            throw new OasDiffValidationException("leftOwnerLocation is null");
        }
        if (rightOwnerLocation == null) {
            throw new OasDiffValidationException("rightOwnerLocation is null");
        }
    }

    private static <T> void assertNullConsistent(OasObjectPropertyLocation leftLocation, T leftOasObject, OasObjectPropertyLocation rightLocation, T rightOasObject) {
        if (leftLocation == null ^ leftOasObject == null) {
            throw new OasDiffValidationException("leftLocation, leftOasObject should be both null or not");
        }
        if (rightLocation == null ^ rightOasObject == null) {
            throw new OasDiffValidationException("rightLocation, rightOasObject should be both null or not");
        }
    }
}
