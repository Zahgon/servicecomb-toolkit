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

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.apache.servicecomb.toolkit.generator.HttpStatuses;
import org.apache.servicecomb.toolkit.generator.MediaTypes;
import org.apache.servicecomb.toolkit.generator.parser.api.OpenApiAnnotationParser;
import org.apache.servicecomb.toolkit.generator.util.ModelConverter;
import org.apache.servicecomb.toolkit.generator.util.RequestResponse;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.MediaType;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.HeaderParameter;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.parameters.RequestBody;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;

public class OperationContext implements IExtensionsContext {

    private static final RequestBody nullRequestBody = new RequestBody();

    private OasContext parentContext;

    private Method method;

    private Operation operation = new Operation();

    private String operationId;

    private String path;

    private String httpMethod;

    private ApiResponses apiResponses = new ApiResponses();

    private List<ParameterContext> parameterContexts = new ArrayList<>();

    private OpenApiAnnotationParser parser;

    private Boolean deprecated = false;

    private String description = null;

    private String summary;

    private List<String> tags;

    private String[] consumes;

    private String[] produces;

    private String[] headers;

    public OperationContext(Method method, OasContext parentContext) {
        this.parentContext = parentContext;
        this.method = method;
        this.parser = parentContext.getParser();
        this.parentContext.addOperation(this);
    }

    @Override
    public OpenApiAnnotationParser getParser() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean hasOperation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Operation toOperation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void processHeaders() {
        if (getHeaders() == null) {
            return;
        }
        Arrays.stream(headers).forEach(header -> {
            String[] headMap = header.split("=");
            if (headMap.length == 2) {
                HeaderParameter headerParameter = new HeaderParameter();
                headerParameter.setName(headMap[0]);
                StringSchema value = new StringSchema();
                value.setDefault(headMap[1]);
                headerParameter.setSchema(value);
                operation.addParametersItem(headerParameter);
            }
        });
    }

    private void processProduces() {
        if (getProduces() == null) {
            return;
        }
        List<String> produceList = Arrays.stream(produces).filter(s -> !StringUtils.isEmpty(s)).collect(Collectors.toList());
        if (!produceList.isEmpty()) {
            ApiResponse apiResponse = new ApiResponse();
            Content content = new Content();
            MediaType mediaType = new MediaType();
            Schema schema = ModelConverter.getSchema(getMethod().getReturnType(), getComponents(), RequestResponse.RESPONSE);
            mediaType.schema(schema);
            for (String produce : produceList) {
                content.addMediaType(produce, mediaType);
            }
            apiResponse.description("OK");
            apiResponse.setContent(content);
            addResponse(HttpStatuses.OK, apiResponse);
        }
    }

    public void setRequestBody(RequestBody requestBody) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void correctResponse(ApiResponses apiResponses) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Components getComponents() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addResponse(String key, ApiResponse response) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ApiResponses getApiResponses() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setApiResponses(ApiResponses apiResponses) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getOperationId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setOperationId(String operationId) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setPath(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Operation getOperation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public OpenAPI getOpenAPI() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Method getMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public OasContext getOpenApiContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getHttpMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setHttpMethod(String httpMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Boolean getDeprecated() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDeprecated(Boolean deprecated) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDescription(String description) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSummary() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSummary(String summary) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getTags() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTags(List<String> tags) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addTag(String tag) {
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

    public String[] getConsumers() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setConsumers(String[] consumes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addParamCtx(ParameterContext ctx) {
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
