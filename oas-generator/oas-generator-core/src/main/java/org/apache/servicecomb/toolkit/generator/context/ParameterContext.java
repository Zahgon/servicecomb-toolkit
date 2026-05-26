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

import java.lang.annotation.Annotation;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.servicecomb.toolkit.generator.parser.api.OpenApiAnnotationParser;
import org.apache.servicecomb.toolkit.generator.util.ModelConverter;
import org.apache.servicecomb.toolkit.generator.util.ParamUtils;
import org.apache.servicecomb.toolkit.generator.util.RequestResponse;
import io.swagger.v3.core.util.ParameterProcessor;
import io.swagger.v3.core.util.ReflectionUtils;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.enums.ParameterStyle;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.examples.Example;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.parameters.RequestBody;

public class ParameterContext implements ISchemaContext, IExtensionsContext {

    private final static Schema nullSchema = new Schema();

    private OperationContext parentContext;

    private Parameter parameter;

    private Object defaultValue;

    private io.swagger.v3.oas.models.parameters.Parameter oasParameter = new io.swagger.v3.oas.models.parameters.Parameter();

    private String name = null;

    private InType in = null;

    private String description = null;

    private Boolean required = null;

    private Boolean deprecated = null;

    private Boolean allowEmptyValue = null;

    private ParameterStyle style;

    private Boolean explode = null;

    private Boolean allowReserved = null;

    private Schema schema;

    private Object example = null;

    private Map<String, Example> examples = null;

    private Content content = null;

    private String ref = null;

    private RequestBody requestBody;

    private List<String> consumes;

    public ParameterContext(OperationContext parentContext, Parameter parameter) {
        this.parentContext = parentContext;
        this.parameter = parameter;
        parentContext.addParamCtx(this);
    }

    public io.swagger.v3.oas.models.parameters.Parameter toParameter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isRequestBody() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void applyAnnotations(List<Annotation> annotations) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void ensureName() {
        if (StringUtils.isEmpty(name)) {
            // try get real type
            name = ParamUtils.getParameterName(parentContext.getMethod(), parameter);
        }
        if (StringUtils.isEmpty(name)) {
            name = parameter.getName();
        }
        oasParameter.setName(name);
    }

    public OperationContext getOperationContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object getDefaultValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDefaultValue(Object defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Components getComponents() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public io.swagger.v3.oas.models.parameters.Parameter getOasParameter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Parameter getParameter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setParameter(Parameter parameter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isRequired() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Type getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addConsume(String consume) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getConsumers() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Type getRealType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRequestBody(RequestBody requestBody) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public RequestBody getRequestBody() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Schema getSchema() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setSchema(Schema schema) {
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

    @Override
    public OpenApiAnnotationParser getParser() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public InType getIn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setIn(InType in) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDescription(String description) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Boolean getRequired() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRequired(Boolean required) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Boolean getDeprecated() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDeprecated(Boolean deprecated) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Boolean getAllowEmptyValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowEmptyValue(Boolean allowEmptyValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ParameterStyle getStyle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setStyle(ParameterStyle style) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Boolean getExplode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setExplode(Boolean explode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Boolean getAllowReserved() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowReserved(Boolean allowReserved) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object getExample() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setExample(Object example) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, Example> getExamples() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setExamples(Map<String, Example> examples) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Content getContent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setContent(Content content) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getRef() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRef(String ref) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public enum InType {

        QUERY,
        PATH,
        HEADER,
        COOKIE,
        FORM,
        BODY
    }
}
