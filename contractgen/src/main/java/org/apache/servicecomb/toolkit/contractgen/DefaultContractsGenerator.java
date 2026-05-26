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
package org.apache.servicecomb.toolkit.contractgen;

import static org.apache.servicecomb.toolkit.common.ContractFileType.YAML;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.ws.rs.Path;
import org.apache.servicecomb.provider.pojo.RpcSchema;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.apache.servicecomb.toolkit.ContractsGenerator;
import org.apache.servicecomb.toolkit.common.ContractFileType;
import org.apache.servicecomb.toolkit.common.ImmediateClassLoader;
import org.apache.servicecomb.toolkit.generator.context.OasGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.core.util.Yaml;
import io.swagger.v3.oas.models.OpenAPI;

public class DefaultContractsGenerator implements ContractsGenerator {

    private static Logger LOGGER = LoggerFactory.getLogger(DefaultContractsGenerator.class);

    private Map<String, Object> config;

    private List<String> classpathUrls;

    private String outputDir = ".";

    private ContractFileType contractfileType = YAML;

    @Override
    public boolean canProcess(String type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    @Override
    public void configure(Map<String, Object> config) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Override
    public void generate() throws RuntimeException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean checkConfig() {
        return config != null && classpathUrls != null;
    }

    private static boolean canProcess(Class<?> loadClass) {
        if (loadClass == null) {
            return false;
        }
        RestSchema restSchema = loadClass.getAnnotation(RestSchema.class);
        if (restSchema != null) {
            return true;
        }
        RestController controller = loadClass.getAnnotation(RestController.class);
        if (controller != null) {
            return true;
        }
        RpcSchema rpcSchema = loadClass.getAnnotation(RpcSchema.class);
        if (rpcSchema != null) {
            return true;
        }
        RequestMapping requestMapping = loadClass.getAnnotation(RequestMapping.class);
        if (requestMapping != null) {
            return true;
        }
        Path pathAnnotation = loadClass.getAnnotation(Path.class);
        if (pathAnnotation != null) {
            return true;
        }
        return false;
    }

    private static Vector getAllClass(ClassLoader classLoader) {
        Field classesField;
        try {
            classesField = ClassLoader.class.getDeclaredField("classes");
            classesField.setAccessible(true);
            if (classesField.get(classLoader) instanceof Vector) {
                return (Vector) classesField.get(classLoader);
            }
        } catch (Exception e) {
            throw new RuntimeException("Cannot get class from ClassLoader " + classLoader.getClass());
        }
        return new Vector<>();
    }
}
