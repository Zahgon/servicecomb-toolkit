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
package org.apache.servicecomb.toolkit.plugin;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.apache.maven.artifact.DependencyResolutionRequiredException;
import org.apache.maven.project.MavenProject;
import org.apache.servicecomb.toolkit.CodeGenerator;
import org.apache.servicecomb.toolkit.ContractsGenerator;
import org.apache.servicecomb.toolkit.DocGenerator;
import org.apache.servicecomb.toolkit.GeneratorFactory;
import org.apache.servicecomb.toolkit.codegen.GeneratorExternalConfigConstant;
import org.apache.servicecomb.toolkit.codegen.MicroServiceFramework;
import org.apache.servicecomb.toolkit.codegen.ProjectMetaConstant;
import org.openapitools.codegen.config.CodegenConfigurator;
import io.swagger.parser.OpenAPIParser;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.core.models.SwaggerParseResult;

class GenerateUtil {

    private static String providerProjectNameSuffix = "-provider";

    private static String consumerProjectNameSuffix = "-consumer";

    private static String modelProjectNameSuffix = "-model";

    public static void generateContract(MavenProject project, String contractOutput, String contractFileType, String type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void generateDocument(String contractLocation, String documentOutput, String type) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void generateCode(ServiceConfig service, String contractLocation, String codeOutput, Map<String, Object> externalConfig, String type) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static void commonConfig(CodegenConfigurator configurator, ServiceConfig service) {
        configurator.setGeneratorName(service.getMicroServiceFramework()).setGroupId(service.getGroupId()).setArtifactId(service.getArtifactId()).setModelPackage(service.getPackageName()).addAdditionalProperty("mainClassPackage", Optional.ofNullable(service.getPackageName()).orElse("")).setArtifactVersion(service.getArtifactVersion()).addAdditionalProperty(ProjectMetaConstant.SERVICE_TYPE, Optional.ofNullable(service.getServiceType()).orElse("all")).addAdditionalProperty(ProjectMetaConstant.SERVICE_ID, service.getServiceId());
        Optional.ofNullable(service.getProviderServiceId()).ifPresent(providerServiceId -> configurator.addAdditionalProperty(ProjectMetaConstant.PROVIDER_SERVICE_ID, service.getProviderServiceId()));
        if (MicroServiceFramework.SERVICECOMB.name().equalsIgnoreCase(service.getMicroServiceFramework())) {
            configurator.setLibrary(service.getProgrammingModel());
        }
        configurator.setApiPackage(Optional.ofNullable(service.getApiPackage()).orElse(String.format("%s.api", service.getPackageName())));
        configurator.setModelPackage(Optional.ofNullable(service.getModelPackage()).orElse(String.format("%s.model", service.getPackageName())));
    }
}
