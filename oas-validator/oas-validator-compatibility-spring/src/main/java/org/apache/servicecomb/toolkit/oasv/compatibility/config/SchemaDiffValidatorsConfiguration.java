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
package org.apache.servicecomb.toolkit.oasv.compatibility.config;

import org.apache.servicecomb.toolkit.oasv.compatibility.validators.schema.request.*;
import org.apache.servicecomb.toolkit.oasv.compatibility.validators.schema.response.*;
import org.apache.servicecomb.toolkit.oasv.diffvalidation.api.SchemaCompareValidator;
import org.apache.servicecomb.toolkit.oasv.compatibility.validators.schema.SchemaDiscriminatorChangeValidator;
import org.apache.servicecomb.toolkit.oasv.compatibility.validators.schema.SchemaReadOnlyChangeValidator;
import org.apache.servicecomb.toolkit.oasv.compatibility.validators.schema.SchemaWriteOnlyChangeValidator;
import org.apache.servicecomb.toolkit.oasv.compatibility.validators.schema.SchemaXmlChangeValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchemaDiffValidatorsConfiguration {

    @Bean
    public SchemaCompareValidator schemaTypeFormatInRequestCompareValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaTypeFormatInResponseCompareValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMultipleOfChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMaximumChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMaximumChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaExclusiveMinimumChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaExclusiveMaximumChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaExclusiveMaximumChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaExclusiveMinimumChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMaxItemsChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMaxLengthChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMaxPropertiesChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMinimumChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMinItemsChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMinLengthChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMinPropertiesChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaUniqueItemsChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaRequiredChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaEnumChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaNullableChangeInRequestValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaReadOnlyChangeValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaWriteOnlyChangeValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaXmlChangeValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaDiscriminatorChangeValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMultipleOfChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMaxItemsChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMaxLengthChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMaxPropertiesChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMinimumChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMinItemsChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMinLengthChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaMinPropertiesChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaUniqueItemsChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaRequiredChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaEnumChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SchemaCompareValidator schemaNullableChangeInResponseValidator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
