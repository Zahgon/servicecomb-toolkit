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
package org.apache.servicecomb.toolkit.oasv.diffvalidation.config;

import java.util.List;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.CallbackDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.ComponentsDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.DefaultOasSpecDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.EncodingDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.HeaderDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.InfoDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.LinkDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.MediaTypeDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.OasSpecDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.OpenApiDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.OperationDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.ParameterDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.PathItemDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.PathsDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.RequestBodyDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.ResponseDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.ResponsesDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.SchemaAddValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.SchemaCompareValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.SchemaDelValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.SchemaDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.ServerDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.TagDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.components.ComponentsCallbacksDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.components.ComponentsHeadersDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.components.ComponentsLinksDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.components.ComponentsParametersDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.components.ComponentsRequestBodiesDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.components.ComponentsResponsesDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.encoding.EncodingHeadersDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.header.HeaderSchemaDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.mediatype.MediaTypeEncodingDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.mediatype.MediaTypeSchemaDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.openapi.OpenApiComponentsDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.openapi.OpenApiInfoDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.openapi.OpenApiPathsDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.openapi.OpenApiServersDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.openapi.OpenApiTagsDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.operation.OperationParametersDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.operation.OperationRequestBodyDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.operation.OperationResponsesDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.parameter.ParameterContentDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.parameter.ParameterSchemaDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.pathitem.PathItemOperationsDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.pathitem.PathItemParametersDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.paths.PathsPathItemsDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.requestbody.RequestBodyContentDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.response.ResponseContentDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.response.ResponseHeadersDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.responses.ResponsesResponsesDiffValidator;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.skeleton.schema.SchemaDiffValidatorEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OasDiffValidatorsSkeletonConfiguration {

    @Bean
    public OasSpecDiffValidator oasSpecDiffValidator(List<OpenApiDiffValidator> openApiDiffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public ComponentsDiffValidator componentsCallbacksDiffValidator(List<CallbackDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public ComponentsDiffValidator componentsHeadersDiffValidator(List<HeaderDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public ComponentsDiffValidator componentsLinksDiffValidator(List<LinkDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public ComponentsDiffValidator componentsParametersDiffValidator(List<ParameterDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public ComponentsDiffValidator componentsRequestBodiesDiffValidator(List<RequestBodyDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public ComponentsDiffValidator componentsResponsesDiffValidator(List<ResponseDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public EncodingDiffValidator encodingHeadersDiffValidator(List<HeaderDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public HeaderDiffValidator headerSchemaDiffValidator(List<SchemaDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public MediaTypeDiffValidator mediaTypeEncodingDiffValidator(List<EncodingDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public MediaTypeDiffValidator mediaTypeSchemaDiffValidator(List<SchemaDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public OpenApiDiffValidator openApiComponentsDiffValidator(List<ComponentsDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public OpenApiDiffValidator openApiInfoDiffValidator(List<InfoDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public OpenApiDiffValidator openApiPathsDiffValidator(List<PathsDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public OpenApiDiffValidator openApiServersDiffValidator(List<ServerDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public OpenApiDiffValidator openApiTagsDiffValidator(List<TagDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public OperationDiffValidator operationParametersDiffValidator(List<ParameterDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public OperationDiffValidator operationRequestBodyDiffValidator(List<RequestBodyDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public OperationDiffValidator operationResponsesDiffValidator(List<ResponsesDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public ParameterDiffValidator parameterContentDiffValidator(List<MediaTypeDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public ParameterDiffValidator parameterSchemaDiffValidator(List<SchemaDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public PathItemDiffValidator pathItemOperationsDiffValidator(List<OperationDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public PathItemDiffValidator pathItemParametersDiffValidator(List<ParameterDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public PathsDiffValidator pathsPathItemsDiffValidator(List<PathItemDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public RequestBodyDiffValidator requestBodyContentDiffValidator(List<MediaTypeDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public ResponseDiffValidator responseContentDiffValidator(List<MediaTypeDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public ResponseDiffValidator responseHeadersDiffValidator(List<HeaderDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public ResponsesDiffValidator responsesResponsesDiffValidator(List<ResponseDiffValidator> diffValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaDiffValidator schemaDiffValidatorEngine(List<SchemaAddValidator> schemaNewValidators, List<SchemaDelValidator> schemaDelValidators, List<SchemaCompareValidator> schemaCompareValidators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
