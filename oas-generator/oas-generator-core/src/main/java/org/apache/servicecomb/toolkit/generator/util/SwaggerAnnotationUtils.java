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
package org.apache.servicecomb.toolkit.generator.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import io.swagger.v3.oas.annotations.media.Encoding;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.MediaType;
import io.swagger.v3.oas.models.media.Schema;

public class SwaggerAnnotationUtils {

    public static List<Content> getContentFromAnnotation(io.swagger.v3.oas.annotations.media.Content... contentAnnotations) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Schema getSchemaFromAnnotation(io.swagger.v3.oas.annotations.media.Schema schema) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Map<String, Object> getExtensionsFromAnnotation(Extension... extensions) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
