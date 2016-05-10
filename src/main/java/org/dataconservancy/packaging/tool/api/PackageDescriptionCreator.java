/*
 * Copyright 2014 Johns Hopkins University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dataconservancy.packaging.tool.api;

import org.dataconservancy.packaging.tool.model.PackageDescription;

import java.io.File;

/**
 * Generates a set of artifacts for a PackageDescription based on the contents
 * of a directory tree.
 */
public interface PackageDescriptionCreator {

    /**
     * Get all Package Description Artifacts implied by the given directory
     * tree.
     */
    public PackageDescription createPackageDescription(String packageOntologyIdentifier, File directoryTreeRoot)
            throws PackageDescriptionCreatorException;
}
