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
package org.apache.servicecomb.toolkit.generator.util;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.ServiceLoader;
import org.apache.servicecomb.toolkit.generator.annotation.ModelInterceptor;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.swagger.v3.core.converter.AnnotatedType;
import io.swagger.v3.core.converter.ModelConverterContextImpl;
import io.swagger.v3.core.jackson.ModelResolver;
import io.swagger.v3.core.util.PrimitiveType;
import io.swagger.v3.core.util.RefUtils;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.media.ArraySchema;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.Schema;

public class ModelConverter {

    private static final ModelConverterContextImpl context;

    private static final List<ModelInterceptor> interceptorMgr = new ArrayList<>();

    static {
        ServiceLoader.load(ModelInterceptor.class).forEach(ModelConverter::registerInterceptor);
        ArrayModelConverter arrayModelConverter = new ArrayModelConverter(mapper());
        ModelResolver modelResolver = new ModelResolver(mapper());
        context = new ModelConverterContextImpl(Arrays.asList(arrayModelConverter, modelResolver));
    }

    public static void registerInterceptor(ModelInterceptor interceptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void unRegisterInterceptor(ModelInterceptor interceptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Schema getSchema(Type cls) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Schema getSchema(Type cls, Components components, RequestResponse requestResponse) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static void ensureSchemaNameExist(Schema schema) {
        if (schema.getName() != null) {
            return;
        }
        if (schema.get$ref() != null) {
            schema.setName((String) RefUtils.extractSimpleName(schema.get$ref()).getKey());
            return;
        }
    }

    public static boolean shouldExtractRef(Schema schema) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static ObjectMapper mapper() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static List<Type> getRequestBeanTypes(Class cls) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static List<Type> getResponseBeanTypes(Class cls) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
