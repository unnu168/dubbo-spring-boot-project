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
package com.alibaba.boot.dubbo.util;

/**
 * The utilities class for Dubbo
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @see
 * @since 1.0.0
 */
public abstract class DubboUtils {

    /**
     * The separator of property name
     */
    public static final String PROPERTY_NAME_SEPARATOR = ".";

    /**
     * The prefix of property name of Dubbo
     */
    public static final String DUBBO_PREFIX = "dubbo";

    /**
     * The prefix of property name for Dubbo scan
     */
    public static final String DUBBO_SCAN_PREFIX = DUBBO_PREFIX + PROPERTY_NAME_SEPARATOR + "scan";

    /**
     * The prefix of property name for Dubbo Config.ØØ
     */
    public static final String DUBBO_CONFIG_PREFIX = DUBBO_PREFIX + PROPERTY_NAME_SEPARATOR + "config";

    /**
     * The property name of base packages to scan
     * <p>
     * The value is "dubbo.scan.packages"
     */
    public static final String BASE_PACKAGES_PROPERTY_NAME = DUBBO_SCAN_PREFIX + PROPERTY_NAME_SEPARATOR + "basePackages";

    /**
     * The property name of Dubbo Config
     * <p>
     * The value is "dubbo.config.multiple"
     */
    public static final String MULTIPLE_CONFIG_PROPERTY_NAME = DUBBO_CONFIG_PREFIX + "." + "multiple";
}
