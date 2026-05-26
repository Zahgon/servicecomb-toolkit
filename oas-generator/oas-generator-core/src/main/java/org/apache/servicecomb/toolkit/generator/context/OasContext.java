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
package org.apache.servicecomb.toolkit.generator.context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.servicecomb.toolkit.generator.parser.api.OpenApiAnnotationParser;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.PathItem.HttpMethod;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

public class OasContext implements IExtensionsContext {

    private OpenAPI openAPI;

    private String basePath;

    private Class<?> cls;

    private List<OperationContext> operationList = new ArrayList<>();

    private OpenApiAnnotationParser parser;

    private List<ISchemaContext> schemaCtxList = new ArrayList<>();

    private String httpMethod;

    private String[] consumes;

    private String[] produces;

    private String[] headers;

    public OasContext(OpenApiAnnotationParser parser) {
        this(new OpenAPI(), parser);
    }

    public OasContext(OpenAPI openAPI, OpenApiAnnotationParser parser) {
        this.openAPI = openAPI;
        this.parser = parser;
    }

    public OpenAPI toOpenAPI() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void correctComponents() {
        Components nullComponents = new Components();
        if (nullComponents.equals(getComponents())) {
            openAPI.setComponents(null);
        }
    }

    private void correctBasepath() {
        if (StringUtils.isEmpty(basePath)) {
            basePath = "/";
        }
        if (!basePath.startsWith("/")) {
            basePath = "/" + basePath;
        }
    }

    public Components getComponents() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void ensurePaths() {
        if (openAPI.getPaths() == null) {
            openAPI.setPaths(new Paths());
        }
    }

    @Override
    public OpenApiAnnotationParser getParser() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setParser(OpenApiAnnotationParser parser) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public OpenAPI getOpenAPI() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getBasePath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Class<?> getCls() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCls(Class<?> cls) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBasePath(String basePath) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addOperation(OperationContext operation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void addExtension(String name, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Map<String, Object> getExtensions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getHttpMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setHttpMethod(String httpMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String[] getConsumers() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setConsumers(String[] consumes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String[] getProduces() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setProduces(String[] produces) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String[] getHeaders() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setHeaders(String[] headers) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
