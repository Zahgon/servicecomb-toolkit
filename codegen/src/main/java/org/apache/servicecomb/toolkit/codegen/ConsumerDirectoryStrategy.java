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
import org.openapitools.codegen.SupportingFile;

public class ConsumerDirectoryStrategy extends AbstractConsumerDirectoryStrategy {

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
}
