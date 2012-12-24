/*
 * #%L
 * Service Activity Monitoring :: Server
 * %%
 * Copyright (C) 2011 - 2012 Talend Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.talend.esb.sam.server.persistence;

/**
 * The Class JdbcDriverBootstrap initialises Jdbc staff.
 */
public final class JdbcDriverBootstrap {

    /**
     * Instantiates a new jdbc driver bootstrap.
     */
    private JdbcDriverBootstrap() {
    }

    /**
     * Causes the class to be dynamically loaded 
     *
     * @param className the class name
     * @return class
     * @throws ClassNotFoundException the class not found exception
     */
    public static Class<?> forName(String className) throws ClassNotFoundException {
        return Class.forName(className);
    }

}
