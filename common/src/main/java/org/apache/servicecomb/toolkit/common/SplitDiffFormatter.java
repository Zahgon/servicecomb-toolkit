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
package org.apache.servicecomb.toolkit.common;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import org.eclipse.jgit.diff.DiffFormatter;

public class SplitDiffFormatter extends DiffFormatter {

    private int radius = 3;

    private final OutputStream out;

    private static final String noNewLine = "\nthis is end of compare\n";

    private static String outputFormat = "%-20s";

    private static String numberFormat = "%-4s";

    public SplitDiffFormatter(OutputStream out) {
        super(out);
        this.out = out;
    }

    public void format(List<Comparison> comparisons, String source, String dest) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getMaxLineSize(String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private List<String> readStringAsLines(String text) {
        return Arrays.asList(text.split("\\r?\\n"));
    }

    protected void writeReplaceLine(List<String> text, int line, List<String> textB, int bCur) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void writeContextLine(List<String> text, int line, List<String> textB, int bCur) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void writeRemovedLine(List<String> text, int line, List<String> textB, int bCur) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void writeAddedLine(List<String> text, int line, List<String> textB, int bCur) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void writeLine(final String content) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String buildFormatLineLeft(List<String> text, int line, String prefix) {
        return String.format(numberFormat, (line + 1)) + String.format(outputFormat, prefix + text.get(line));
    }

    private String buildFormatLineRight(List<String> text, int line, String prefix) {
        return String.format(numberFormat, (line + 1)) + String.format(getOutputFormat(text.get(line).length()), prefix + text.get(line));
    }

    private String getOutputFormat(int len) {
        return "%-" + len + "s";
    }

    private static boolean end(Comparison edit, int a, int b) {
        return edit.originalPointEnd <= a && edit.destinationPointEnd <= b;
    }

    private int findOutputEndIndex(List<Comparison> edits, int i) {
        int end = i + 1;
        while (end < edits.size() && (isOriginalEnd(edits, end) || isDestinationEnd(edits, end))) {
            end++;
        }
        return end - 1;
    }

    private boolean isOriginalEnd(List<Comparison> e, int i) {
        return e.get(i).originalPointBegin - e.get(i - 1).originalPointEnd <= 2 * radius;
    }

    private boolean isDestinationEnd(List<Comparison> e, int i) {
        return e.get(i).destinationPointBegin - e.get(i - 1).destinationPointEnd <= 2 * radius;
    }
}
