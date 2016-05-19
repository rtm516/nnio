/*
 * Copyright 2016 Lukhnos Liu. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lukhnos.nnio.file;

import java.io.File;
import java.io.IOException;
import java.net.URI;

/**
 * Substitute for java.nio.file.Path.
 */
public interface Path extends Comparable<Path>, Iterable<Path> {
  boolean isAbsolute();
  Path getParent();
  Path resolve(Path other);
  Path resolve(String other);
  Path toAbsolutePath();
  File toFile();
  Path toRealPath(LinkOption... options) throws IOException;
  URI toUri();
}
