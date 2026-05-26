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

import org.apache.commons.lang3.StringUtils;

public class ServiceConfig {

    private String serviceType = "all";

    private String groupId = "domain.orgnization.project";

    private String artifactId = "sample";

    private String artifactVersion = "0.1.0-SNAPSHOT";

    private String packageName = "domain.orgnization.project.sample";

    private String programmingModel = "SpringMVC";

    private String microServiceFramework = "ServiceComb";

    // only for consumer
    private String providerServiceId;

    private String serviceId;

    private String apiPackage;

    private String modelPackage;

    public String getServiceType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getGroupId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getArtifactId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getArtifactVersion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getPackageName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getProgrammingModel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getMicroServiceFramework() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getProviderServiceId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getServiceId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getApiPackage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getModelPackage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
