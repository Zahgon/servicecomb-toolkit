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
package org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.responses;

import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.*;
import org.apache.servicecomb.toolkit.oasv.common.OasObjectPropertyLocation;
import org.apache.servicecomb.toolkit.oasv.common.OasObjectType;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static org.apache.servicecomb.toolkit.oasv.diffvalidation.util.OasObjectDiffValidatorUtils.doDiffValidateProperty;

public class ResponsesResponsesDiffValidator extends OasObjectDiffValidatorTemplate<ApiResponses> implements ResponsesDiffValidator {

    private final List<ResponseDiffValidator> responseValidators;

    public ResponsesResponsesDiffValidator(List<ResponseDiffValidator> responseValidators) {
        this.responseValidators = responseValidators;
    }

    @Override
    public List<OasDiffViolation> validateCompare(OasDiffValidationContext context, OasObjectPropertyLocation leftLocation, ApiResponses leftOasObject, OasObjectPropertyLocation rightLocation, ApiResponses rightOasObject) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
