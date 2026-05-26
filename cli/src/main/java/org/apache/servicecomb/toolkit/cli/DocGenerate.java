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
package org.apache.servicecomb.toolkit.cli;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;
import org.apache.servicecomb.toolkit.DocGenerator;
import org.apache.servicecomb.toolkit.GeneratorFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.airlift.airline.Command;
import io.airlift.airline.Option;
import io.swagger.parser.OpenAPIParser;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.core.models.SwaggerParseResult;

@Command(name = "docgenerate", description = "Generate document by OpenAPI specification file")
public class DocGenerate implements Runnable {

    private final static Logger LOGGER = LoggerFactory.getLogger(CodeGenerate.class);

    @Option(name = { "-i", "--input" }, title = "OpenAPI specification file", required = true, description = "location of the OpenAPI specification file, as URL or file (required)")
    private String specFile;

    @Option(name = { "-f", "--format" }, title = "document format", required = false, description = "format of document, as swagger-ui or asciidoc-html (swagger-ui by default)")
    private String format = "swagger-ui";

    @Option(name = { "-o", "--output" }, title = "output directory", description = "location of the generated document (current dir by default)")
    private String output = "";

    @Override
    public void run() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public OpenAPI parseOpenApi(Path file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
