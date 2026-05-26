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
package org.apache.servicecomb.toolkit.codegen;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.openapitools.codegen.SupportingFile;

public class DefaultDirectoryStrategy extends AbstractMultiDirectoryStrategy {

    protected String providerTemplateFolder = "provider";

    private String consumerTemplateFolder = "consumer";

    private String apiConsumerTemplate = consumerTemplateFolder + "/apiConsumer.mustache";

    private String apiConsumerTemplateForPojo = consumerTemplateFolder + "/pojo/apiConsumer.mustache";

    private String apiInterfaceTemplateForPojo = consumerTemplateFolder + "/pojo/apiInterface.mustache";

    @Override
    public String modelDirectory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String providerDirectory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String consumerDirectory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void processSupportingFile(List<SupportingFile> supportingFiles) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void processParentProjectOpts(List<SupportingFile> supportingFiles) {
        supportingFiles.add(new SupportingFile("project/pom.mustache", "", "pom.xml"));
    }

    private void processModel(List<SupportingFile> supportingFiles) {
        propertiesMap.computeIfAbsent(GeneratorExternalConfigConstant.MODEL_ARTIFACT_ID, k -> modelDirectory());
        supportingFiles.add(new SupportingFile("model/pom.mustache", modelDirectory(), "pom.xml"));
    }

    private void processConsumer(List<SupportingFile> supportingFiles) {
        String newConsumerTemplateFolder = consumerTemplateFolder;
        if (ServiceCombCodegen.SPRING_BOOT_LIBRARY.equals(propertiesMap.get("library"))) {
            newConsumerTemplateFolder += "/springboot";
        }
        supportingFiles.add(new SupportingFile(newConsumerTemplateFolder + "/pom.mustache", consumerDirectory(), "pom.xml"));
        supportingFiles.add(new SupportingFile(newConsumerTemplateFolder + "/Application.mustache", mainClassFolder(consumerDirectory()), "Application.java"));
        supportingFiles.add(new SupportingFile("log4j2.mustache", resourcesFolder(consumerDirectory()), "log4j2.xml"));
        supportingFiles.add(new SupportingFile(consumerTemplateFolder + "/microservice.mustache", resourcesFolder(consumerDirectory()), "microservice.yaml"));
        propertiesMap.computeIfAbsent(GeneratorExternalConfigConstant.CONSUMER_ARTIFACT_ID, k -> consumerDirectory());
        //    propertiesMap.put("apiConsumerTemplate", apiConsumerTemplate);
        propertiesMap.put(apiConsumerTemplate, ServiceType.CONSUMER.getValue());
        Map<String, String> apiTemplateFiles = ((Map<String, String>) propertiesMap.get("apiTemplateFiles"));
        if (ServiceCombCodegen.POJO_LIBRARY.equals(propertiesMap.get("library"))) {
            apiTemplateFiles.put(apiConsumerTemplateForPojo, "Consumer.java");
            propertiesMap.put(apiConsumerTemplateForPojo, ServiceType.CONSUMER.getValue());
            apiTemplateFiles.put(apiInterfaceTemplateForPojo, ".java");
            propertiesMap.put(apiInterfaceTemplateForPojo, ServiceType.CONSUMER.getValue());
            propertiesMap.put("isPOJO", true);
        } else {
            apiTemplateFiles.put(apiConsumerTemplate, ".java");
        }
    }

    private void processProvider(List<SupportingFile> supportingFiles) {
        supportingFiles.add(new SupportingFile("pom.mustache", providerDirectory(), "pom.xml"));
        supportingFiles.add(new SupportingFile("Application.mustache", mainClassFolder(providerDirectory()), "Application.java"));
        supportingFiles.add(new SupportingFile("log4j2.mustache", resourcesFolder(providerDirectory()), "log4j2.xml"));
        supportingFiles.add(new SupportingFile(providerTemplateFolder + "/microservice.mustache", resourcesFolder(providerDirectory()), "microservice.yaml"));
        propertiesMap.computeIfAbsent(GeneratorExternalConfigConstant.PROVIDER_ARTIFACT_ID, k -> providerDirectory());
        if (ServiceCombCodegen.POJO_LIBRARY.equals(propertiesMap.get("library"))) {
            //      ((Map<String, String>) propertiesMap.get("apiTemplateFiles")).put(pojoApiImplTemplate, ".java");
            propertiesMap.put("isPOJO", true);
        }
    }
}
