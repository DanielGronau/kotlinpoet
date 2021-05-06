/*
 * Copyright (C) 2019 Square, Inc.
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
object versions {
  const val kotlin = "1.5.0"
  const val spotless = "5.12.4"
  const val ktlint = "0.41.0"
  const val mavenPublish = "0.13.0"
  const val dokka = "1.4.32"
}

object deps {
  const val autoCommon = "com.google.auto:auto-common:1.0"
  const val guava = "com.google.guava:guava:30.1.1-jre"
  object kotlin {
    const val reflect = "org.jetbrains.kotlin:kotlin-reflect:${versions.kotlin}"
    const val junit = "org.jetbrains.kotlin:kotlin-test-junit:${versions.kotlin}"
    const val metadata = "org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.3.0"
  }
  object test {
    const val truth = "com.google.truth:truth:1.1.2"
    const val compileTesting = "com.google.testing.compile:compile-testing:0.19"
    const val jimfs = "com.google.jimfs:jimfs:1.1"
    const val ecj = "org.eclipse.jdt.core.compiler:ecj:4.6.1"
    const val kotlinCompileTesting = "com.github.tschuchortdev:kotlin-compile-testing:1.4.0"
  }
}
