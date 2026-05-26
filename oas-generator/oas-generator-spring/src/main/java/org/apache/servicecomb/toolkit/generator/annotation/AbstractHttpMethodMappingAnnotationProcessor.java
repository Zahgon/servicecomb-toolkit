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
package org.apache.servicecomb.toolkit.generator.annotation;

import org.apache.servicecomb.toolkit.generator.context.OperationContext;
import org.springframework.web.bind.annotation.RequestMethod;

public abstract class AbstractHttpMethodMappingAnnotationProcessor<Annotation, Context> implements MethodAnnotationProcessor<Annotation, Context> {

    protected void processPath(String[] paths, OperationContext operationContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void processMethod(RequestMethod requestMethod, OperationContext operationContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void processConsumes(String[] consumes, OperationContext operationContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void processProduces(String[] produces, OperationContext operationContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void processHeaders(String[] headers, OperationContext operationContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
