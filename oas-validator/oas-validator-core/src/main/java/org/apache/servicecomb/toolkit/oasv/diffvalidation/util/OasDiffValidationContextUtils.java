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

public class OasDiffValidationContextUtils {

    private static final String IN_REQUEST_BODY = OasDiffValidationContextUtils.class.getName() + ".IN_REQUEST_BODY";

    private static final String IN_PARAMETER = OasDiffValidationContextUtils.class.getName() + ".IN_PARAMETER";

    private static final String IN_RESPONSE = OasDiffValidationContextUtils.class.getName() + ".IN_RESPONSE";

    public static void enterRequestBody(OasDiffValidationContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void leaveRequestBody(OasDiffValidationContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void enterResponse(OasDiffValidationContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void leaveResponse(OasDiffValidationContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void enterParameter(OasDiffValidationContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void leaveParameter(OasDiffValidationContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isInRequestBody(OasDiffValidationContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isInResponse(OasDiffValidationContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isInParameter(OasDiffValidationContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
