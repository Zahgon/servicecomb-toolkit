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
package org.apache.servicecomb.toolkit.generator.parser;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.servicecomb.toolkit.generator.annotation.AnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.ApiResponseMethodAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.ApiResponsesMethodAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.ClassAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.MethodAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.OpenApiDefinitionClassAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.OperationMethodAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.ParamAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.ParameterAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.RequestBodyParamAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.context.OasContext;
import org.apache.servicecomb.toolkit.generator.context.OperationContext;
import org.apache.servicecomb.toolkit.generator.context.ParameterContext;
import org.apache.servicecomb.toolkit.generator.parser.api.OpenApiAnnotationParser;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public abstract class AbstractAnnotationParser implements OpenApiAnnotationParser {

    private Class<?> cls;

    private OasContext context;

    protected Map<Class<? extends Annotation>, ClassAnnotationProcessor> classAnnotationMap = new HashMap<>();

    protected Map<Class<? extends Annotation>, MethodAnnotationProcessor> methodAnnotationMap = new HashMap<>();

    protected Map<Class<? extends Annotation>, ParamAnnotationProcessor> parameterAnnotationMap = new HashMap<>();

    public AbstractAnnotationParser() {
        initMethodAnnotationProcessor();
        initClassAnnotationProcessor();
        initParameterAnnotationProcessor();
    }

    @Override
    public void parser(Class<?> cls, OasContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void postParseClassAnnotaion(OasContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void postParseMethodAnnotation(OperationContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void postParseParameterAnnotation(ParameterContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void initMethodAnnotationProcessor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void initClassAnnotationProcessor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void initParameterAnnotationProcessor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public ClassAnnotationProcessor findClassAnnotationProcessor(Class<? extends Annotation> annotationType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public MethodAnnotationProcessor findMethodAnnotationProcessor(Class<? extends Annotation> annotationType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public ParamAnnotationProcessor findParameterAnnotationProcessor(Class<? extends Annotation> annotationType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
