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

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.apache.servicecomb.toolkit.generator.annotation.GetMappingMethodAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.PathVariableAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.PostMappingMethodAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.PutMappingMethodAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.RequestBodyAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.RequestHeaderAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.RequestMappingClassAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.RequestMappingMethodAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.RequestParamAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.annotation.RequestPartAnnotationProcessor;
import org.apache.servicecomb.toolkit.generator.context.OasContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

public class SpringmvcAnnotationParser extends AbstractAnnotationParser {

    @Override
    public int getOrder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void parser(Class<?> cls, OasContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean canProcess(Class<?> cls) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void initClassAnnotationProcessor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void initMethodAnnotationProcessor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void initParameterAnnotationProcessor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
