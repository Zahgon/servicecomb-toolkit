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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.Generator;

public class MultiContractGenerator extends DefaultGenerator {

    private List<ClientOptInput> optsList = new ArrayList<>();

    public Generator addOpts(ClientOptInput opts) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void generateParentProject(List<File> files, List<Map<String, Object>> modules) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<File> generate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
